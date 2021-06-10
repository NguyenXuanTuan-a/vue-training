import Vue from "vue";
import VueRouter, { RouteConfig } from "vue-router";
import Home from "../views/Home.vue";
import Information from "@/components/information/index.vue"
import ProductDetail from "@/components/Product/detail.vue"
import ProfileUser from "@/components/Employee/profile.vue"
Vue.use(VueRouter);

const routes: Array<RouteConfig> = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/information",
    name: "Information",
    component: Information,
  },
  {
    path: "/product/:id",
    name: "productdesc",
    component: ProductDetail,
    props: true
  },
  {
    path: "/information_user/:id",
    name: "user_information",
    component: ProfileUser,
    props: true
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
