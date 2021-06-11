<template>
    <div>
      <Product />
      <ListEmployee/>
    </div>
</template>


<script lang="ts">
  import { Component, Vue, Prop } from 'vue-property-decorator'
  import Product from "../Product/index.vue"
  import ListEmployee from "../Employee/index.vue"
  @Component({
    components: {
      Product,
      ListEmployee
    }
  })
  export default class information extends Vue {

  }
</script>