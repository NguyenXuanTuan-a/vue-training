<template>
  <!-- <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App"/>
  </div> -->
  <div>
    <div>
      <th>Tên dự án</th>
      <td>Dự án 1</td>
 
      <span class="material-icons">Tên dự án: Dự án 1</span>
    </div>

    <div>PM: Nguyễn Văn A</div>
    <div>Team size: 20</div>
    <div>Khách hàng: JP</div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import HelloWorld from "@/components/HelloWorld.vue"; // @ is an alias to /src

@Component({
  components: {},
})
export default class Project1 extends Vue {
  
}
</script>
