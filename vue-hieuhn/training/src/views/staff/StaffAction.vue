<template>
  <div>
    <v-row>
      <v-col md="3" cols="12">
        <v-card width="100%">
          <v-img
            height="200px"
            src="https://cdn.pixabay.com/photo/2020/07/12/07/47/bee-5396362_1280.jpg"
          >
          </v-img>

          <v-card-text>
            <div class="staff-title">
              {{ item.name }}
            </div>
          </v-card-text>
          <v-list dense>
            <v-subheader>INFORMATION</v-subheader>
            <v-list-item-group color="primary">
              <v-list-item>
                <v-list-item-content>
                  <v-list-item-title class="text-left"
                    >Have worked:
                    <span class="bold"
                      >{{ item.seniority }} years</span
                    ></v-list-item-title
                  >
                </v-list-item-content>
              </v-list-item>
              <v-list-item>
                <v-list-item-content>
                  <v-list-item-title class="text-left"
                    >Working:
                    <span class="bold">{{
                      item.isWorking
                    }}</span></v-list-item-title
                  >
                </v-list-item-content>
              </v-list-item>
            </v-list-item-group>
          </v-list>
        </v-card>
      </v-col>
      <v-col md="9" cols="12">
        <h1 class="detail-title">Cập nhập thông tin</h1>
        <v-form ref="form" lazy-validation>
          <v-text-field
            v-model="formInformation.name"
            label="Name"
            required
          ></v-text-field>

          <v-btn :disabled="!formInformation.valid" class="mr-4" @click="save"
            >Save</v-btn
          >
        </v-form>
      </v-col>
    </v-row>
  </div>
</template>

<script lang="ts">
import { Component, Vue, Watch, Emit } from "vue-property-decorator";

@Component
export default class StaffAction extends Vue {
  item = this.$attrs.item;

  formInformation = {
    valid: false,
    name: "",
  };

  @Watch(`formInformation.name`) onChangeInput() {
    this.formInformation.valid = true;
    if (this.formInformation.name == "") {
      this.formInformation.valid = false;
    }
  }

  save() {
    alert(this.formInformation.name)
  }
}
</script>

<style lang="scss">
.staff-title {
  font-weight: bold;
  font-size: 22px;
}
.text-left {
  text-align: left;
  margin-left: 20px;
  font-size: 18px !important;
  padding: 10px 0;
}
.bold {
  font-weight: bold;
}
</style>
