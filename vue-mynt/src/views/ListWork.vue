<template>
  <div>
    <b-row>
      <b-col></b-col>
      
      <b-col cols="8">
        <b-col lg="4" class="pb-2">
          <b-input-group size="sm" class="mb-2">
            <b-input-group-prepend is-text>
              <b-icon icon="search"></b-icon>
            </b-input-group-prepend>
            <b-form-input
              type="search"
              placeholder="Search terms"
            ></b-form-input>

            <b-button style="margin" v-b-modal.modal-1 variant="success">Create</b-button>
          </b-input-group>

          <!-- Button Create -->
          

          <b-modal id="modal-1" title="Create New Task">
            <!-- Work name -->
            <div class="form-group">
              <label for="workName">Work Name</label>
              <input
                type="text"
                class="form-control"
                id="workName"
                placeholder="Input Work Name"
                v-model="workName"
              />
              <!-- aria-describedby="emailHelp" -->
            </div>
            <br />
            <!-- Leader -->
            <div class="form-group">
              <label for="leader">Leader</label>
              <input
                type="text"
                class="form-control"
                id="leader"
                placeholder="Input Leader Name"
                v-model="leader"
              />
            </div>
            <br />
            <!-- Start date -->
            <div class="form-group">
              <label for="startDate">Start Date</label>
              <input
                type="date"
                class="form-control"
                id="startDate"
                v-model="startDate"
              />
            </div>
            <br />

            <!-- End date -->
            <div class="form-group">
              <label for="endDate">End Date</label>
              <input
                type="date"
                class="form-control"
                id="endDate"
                v-model="endDate"
              />
            </div>

            <br />

            <button type="submit" class="btn btn-primary" @click="createWork()">
              Submit
            </button>
          </b-modal>
        </b-col>
        <b-table striped hover :items="items"></b-table>
      </b-col>
      <b-col></b-col>
    </b-row>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import WorkServirce from "@/services/WorkServices";

@Component({
  components: {},
})
export default class ListWork extends Vue {
  public items: Array<any> = [];
  private workName: string = "";
  private leader: string = "";
  private startDate: Date = new Date();
  private endDate: Date = new Date();

  created() {
    this.getWorkList();
  }

  public getWorkList() {
    WorkServirce.getWorkList().then((res: any) => {
      this.items = res.data;
    });
  }

  public createWork() {
    let dataToAdd = {
      workName: this.workName,
      leader: this.leader,
      startDate: this.startDate,
      endDate: this.endDate,
    };

    WorkServirce.createWorkList(dataToAdd).then((res: any) => {
      this.items = res.data;
    });
    alert("Chúc mừng bạn đã tạo thành công!");
  }
}
</script>
