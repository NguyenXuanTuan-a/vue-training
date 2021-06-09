import Vue from 'vue'
import VueRouter, { RouteConfig } from 'vue-router'
import SampleView from '@/views/sample/SampleView.vue'

Vue.use(VueRouter)

const routes: Array<RouteConfig> = [
  {
    path: '/',
    name: 'Sample',
    component: SampleView
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
