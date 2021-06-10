<template>
  <div>
    <h1>Ten du an: {{ item.name }}</h1>
    <h1>PM: {{ item.pm }}</h1>
    <h1>TeamSize: {{ item.teamSize }}</h1>
    <h1>Khach hang: {{ item.customer }}</h1>
    <h1>Quan Trong: {{ item.important }}</h1>
    <br />
    <hr />
    <br />
    <h3>
      F5 lại sẽ mất ( hướng xử lý: chỉ truyền id qua component rồi request lên
      server để lấy dữ liệu chi tiết )
    </h3>
  </div>
</template>

<script lang="ts">
import { Component, Vue, Prop } from "vue-property-decorator";

@Component
export default class DetailProject extends Vue {
  item = this.$attrs.item;
}
</script>
