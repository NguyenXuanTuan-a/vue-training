<template>
  <v-app>
    <Header :listMenu="menu.listMenu" />
    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script lang="ts">
import Vue from "vue";
import Component from "vue-class-component";
import Header from "./components/Header.vue";
interface menu {
  listMenu: any[];
}
@Component({
  components: { Header },
})
export default class App extends Vue {
  menu: menu = {
    listMenu: [
      {
        id: 1,
        name: "Home",
        url: "/",
      },
      {
        id: 2,
        name: "Project",
        url: "/project",
      },
      {
        id: 3,
        name: "Employee",
        url: "/employee",
      },
      {
        id: 4,
        name: "Staff",
        url: "/staff",
      },
    ],
  };
}
</script>
