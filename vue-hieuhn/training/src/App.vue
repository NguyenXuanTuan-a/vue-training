<template>
  <v-app>
    <Header 
      :lists="menus.lists"
      :logo="menus.logo"
      @emitName="emitFunc"
      >
    </Header>

    <v-main>
      <h1 class="title">
          Welcome to VueJs
      </h1>
    </v-main>

  </v-app>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator'
import Header from './components/header/Header.vue'

interface menu {
  lists: any[],
  logo: string
}

@Component({
  components: {
    Header
  }
})


export default class App extends Vue {
  menus: menu = {
    lists: [
      { name: 'Menu 1', url: '/menu1' },
      { name: 'Menu 2', url: '/menu2' },
      { name: 'Menu 3', url: '/menu3' },
      { name: 'Menu 4', url: '/menu4' },
    ],
    logo: './assets/images/logo.png'
  }

  emitFunc = () => {
    console.log(true)
  }
}
</script>

<style lang="scss">
  .v-application .title {
    text-align: center;
    font-size: 100px !important;
    margin: 100px 0;
  }
</style>
