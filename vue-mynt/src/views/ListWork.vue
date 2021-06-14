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
            <b-form-input type="search" placeholder="Search...."></b-form-input>

            <b-button style="margin" v-b-modal.modal-1 variant="success"
              >Create</b-button
            >
          </b-input-group>

          <!-- Modal Create -->
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

 <!-- Modal update -->
          <b-modal id="modal-2" title="Update New Task" v-bind="items">
            <!-- Work name -->
            <div class="form-group" >
              <label for="workName">Work Name</label>
              <input
                type="text"
                class="form-control"
                id="workName"
             
                v-model="items.workName"
              />
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
                v-model="items.leader"
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
                v-model="items.startDate"
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
                v-model="items.endDate"
              />
            </div>

            <br />

            <button type="submit" class="btn btn-primary" @click="createWork()">
              Submit
            </button>
          </b-modal>

        <b-table striped hover :fields="fields" :items="items"> 

      <template #cell(Edit)="">
      <b-icon icon="pencil" scale="1" variant="danger"  v-b-modal.modal-2  ></b-icon>
      <b-icon style="margin-left : 10" icon="trash" @click="popupDelete(row.id)" scale="1" variant="danger"></b-icon>

      
      </template>
        </b-table>



        <!-- <table class="table">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">{{ items.workName }}</th>
              <th scope="col">Last</th>
              <th scope="col">Handle</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>
              <td>Mark</td>
              <td>Otto</td>
              <td>@mdo</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>Jacob</td>
              <td>Thornton</td>
              <td>@fat</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
          </tbody>
        </table> -->
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
  private openPopupEdit : boolean = false;
  public fields: Array<any> = [
  
  
    {key:'ID', label: 'ID work'},
     {key:'WorkName', label:'tên cv'},
     {key:'Leader', label:'tên leader'},
{key:'StartDate', label:'StartDate'},
{key:'EndDate', label:'EndDate'},
{key:'Edit', label:'edit here'},

  
];


  created() {
    this.getWorkList();
  }

  public getWorkList() {
    WorkServirce.getWorkList().then((res: any) => {
      this.items = res.data;
    });
  }

  public createWork() {
    debugger
    let dataToAdd = {
      WorkName: this.workName,
      Leader: this.leader,
      StartDate: this.startDate,
      EndDate: this.endDate,
    };

    WorkServirce.createWorkList(dataToAdd).then((res: any) => {
      this.items = res.data;
    });
    alert("Chúc mừng bạn đã tạo thành công!");
  }

  public popupEdit(){
  this.openPopupEdit = true
  }
}
</script>
