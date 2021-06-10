<template>
    <div>
      <span>{{getData.product}}</span>
            <span>{{getData.teamsize}}</span>

      <span>{{getData.pm}}</span>

      <span>{{getData.customer}}</span>
  Đã lấy dk data thông qua id nhưng chưa có cách nào xử lý dk phần f5
    </div>
</template>

<script lang="ts">
import { Component, Vue, Prop } from 'vue-property-decorator'

 interface ProjectItem {
      projectItem: any[]
  }
  @Component
  export default class detail extends Vue { 
      getData = this.$attrs.items
  }
</script>