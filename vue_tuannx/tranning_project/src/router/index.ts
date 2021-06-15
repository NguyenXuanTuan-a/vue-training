import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes: Array<RouteConfig> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
   {
     path: '/project',
     name: 'Project',
     component: () => import(/* webpackChunkName: "Project" */ '../components/project/Project.vue')
   },
   {
     path: '/employee',
     name: 'Empoyee',
     component: () => import(/* webpackChunkName: "Employee" */ '../components/employee/Employee.vue')
   },
   {
     path: '/project-detail/:id',
     name: 'ProjectDetail',
     component: () =>import(/* webpackChunkName: "ProjectDetail" */ '../components/project/ProjectListDetail.vue'),
     props: true
   },
   {
     path: '/staff',
     name: 'Staff',
     component: () => import(/* webpackChunkName: "Work" */ '../components/staff/Staff.vue')
   },
  // {
  //   path: '/addwork',
  //   name: 'AddWork',
  //   component: () => import(/* webpackChunkName: "Work" */ '../components/work/AddWork.vue')
  // },
]

const router = new VueRouter({
  routes
})

export default router
