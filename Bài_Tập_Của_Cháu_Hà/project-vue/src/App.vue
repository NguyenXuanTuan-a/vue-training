<template>
  <v-app>
    <Header/>
    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>
<script lang="ts">
    import Header from '@/components/Header/Header.vue'
    import { Component, Vue, Prop } from 'vue-property-decorator'
    @Component({
      components: {
        Header
      }
    })
    export default class App extends Vue{

    }
</script>
