<template>
  <div class="project">
    <ListProject :listProject="project.listProject"></ListProject>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import ListProject from "./ListProject.vue";

interface project {
  listProject: any[];
}

@Component({
  components: {
    ListProject,
  },
})
export default class Project extends Vue {
  project: project = {
    listProject: [
      {
        id: 1,
        name: "Karate",
        pm: "Hoang Ngoc Hieu",
        teamSize: 40,
        customer: "Japan",
        important: false,
      },
      {
        id: 2,
        name: "Tay Quan Do",
        pm: "Nguyen Cong Phuong",
        teamSize: 400,
        customer: "Korea",
        important: true,
      },
      {
        id: 3,
        name: "Bong Da",
        pm: "Le Cong Vinh",
        teamSize: 20,
        customer: "Vietnam",
        important: false,
      },
      {
        id: 4,
        name: "Bang Chu Cai",
        pm: "ABC",
        teamSize: 4,
        customer: "China",
        important: true,
      },
      {
        id: 5,
        name: "Banh cuon",
        pm: "Tran Duy Hung",
        teamSize: 90,
        customer: "Campuchia",
        important: true,
      },
      {
        id: 6,
        name: "Banh dau",
        pm: "Tran Duy Hung",
        teamSize: 90,
        customer: "Campuchia",
        important: true,
      },
      {
        id: 7,
        name: "Banh beo",
        pm: "Tran Duy Hung",
        teamSize: 90,
        customer: "Campuchia",
        important: true,
      },
      {
        id: 8,
        name: "Banh chuoi",
        pm: "Tran Duy Hung",
        teamSize: 90,
        customer: "Campuchia",
        important: true,
      },
    ],
  };
}
</script>
