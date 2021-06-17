<template>
    <v-dialog max-width="700px"  v-model="dialog">
        <template v-slot:activator="{ on, attrs }">
        <v-btn
          color="primary"
          dark
          v-bind="attrs"
          v-on="on"
        >
          Add Staff
        </v-btn>
      </template>
      <v-card>
        <v-card-title>
          <span class="text-h5">Add New Staff</span>
        </v-card-title>
        <v-card-text>
          <v-container>
            <v-row>
              <v-col cols="12">
                <v-text-field
                  label="Name*"
                  v-model="item.name"
                ></v-text-field>
              </v-col>
              <v-col cols="12">
                <v-text-field
                  label="Age*"
                  v-model="item.age"
                ></v-text-field>
              </v-col>
              <v-col cols="12">
                <v-text-field
                  label="Experience*"
                  v-model="item.experience"
                  required
                ></v-text-field>
              </v-col>
              <v-col cols="12">
                <v-text-field
                  label="Role*"
                  v-model="item.role"
                  required
                ></v-text-field>
              </v-col>
            </v-row>
          </v-container>
          <small>*indicates required field</small>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn
            color="blue darken-1"
            text
            @click="dialog = false"
          >
            Close
          </v-btn>
          <v-btn
            color="blue darken-1"
            text
            @click="addNewStaff"
          >
            Save
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
</template>
<script>
import StaffService from '@/service/StaffService';
import { Vue,Component } from "vue-property-decorator";
import { validationMixin } from 'vuelidate'
import { required} from 'vuelidate/lib/validators'
@Component
export default class StaffDialogs extends Vue{
  item ={};
  dialog=false;
  mixins= [validationMixin];
  validations={
    name:{required},
    experience:{required}
  };
    addNewStaff() {
      StaffService.create(this.item).then((response) => {
        this.item = response.data;
      })
      .catch((errors) => {
        console.log(errors);
      });
       alert("Thêm thành công")
      this.dialog=false;
    }
} 
</script>