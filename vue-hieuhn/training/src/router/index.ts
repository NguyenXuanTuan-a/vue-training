import Vue from "vue";
import VueRouter, { RouteConfig } from "vue-router";
import Home from "../views/Home.vue";
import Project from "../views/project/Project.vue";
import DetailProject from "../views/project/DetailProject.vue";
import Staff from "../views/staff/Staff.vue";
import StaffAction from "../views/staff/StaffAction.vue";

Vue.use(VueRouter);

const routes: Array<RouteConfig> = [
  {
    path: "/project",
    name: "Project",
    component: Project,
  },
  {
    path: "/project/detail/:id",
    name: "DetailProject",
    component: DetailProject,
    props: true,
  },
  {
    path: "/staff",
    name: "Staff",
    component: Staff,
  },
  {
    path: "/staff/:id",
    name: "StaffAction",
    component: StaffAction,
    props: true,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
