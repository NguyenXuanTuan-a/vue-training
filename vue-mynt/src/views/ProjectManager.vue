<template>
  <!-- <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App"/>
  </div> -->
  <div>
    <b-button @click="showProject1 = !showProject1">Project 1 </b-button>

    <b-button variant="danger" @click="showProject2 = !showProject1"
      >Project 2
    </b-button>

    <b-button variant="success" @click="showProject3 = !showProject3"
      >Project 3</b-button
    >
    <b-button variant="outline-primary" @click="showProject4 = !showProject4"
      >Project 4</b-button
    >

    <!-- Modal project 1 -->
    <b-modal v-model="showProject1">
      <p><b style="red">Tên dự án:</b> Phát triển dự án Health care</p>
      <p><b style="red">PM dự án:</b> Phạm Thị Kim Liên</p>
      <p><b style="red">Team size:</b> 10 người</p>
      <p><b style="red">Tên khách hàng:</b> JaPan</p>
    </b-modal>

    <!-- Modal project 2 -->
    <b-modal v-model="showProject2">
      <p><b style="red">Tên dự án:</b> Phát triển web bán hàng</p>
      <p><b style="red">PM dự án:</b> Nguyễn Mạnh Tiến</p>
      <p><b style="red">Team size:</b> 20 người</p>
      <p><b style="red">Tên khách hàng:</b> JaPan</p>
    </b-modal>

    <!-- Modal project 3 -->
    <b-modal v-model="showProject3">
      <p><b style="red">Tên dự án:</b> Phát triển Web Đất Xanh Miền Bắc</p>
      <p><b style="red">PM dự án:</b> Lê Tuấn Anh</p>
      <p><b style="red">Team size:</b> 12 người</p>
      <p><b style="red">Tên khách hàng:</b> Việt Nam</p>
    </b-modal>

    <!-- Modal project 4 -->
    <b-modal v-model="showProject4">
      <p><b style="red">Tên dự án:</b> Phát triển ứng dụng mobile</p>
      <p><b style="red">PM dự án:</b> Nguyễn Mạnh Tiến</p>
      <p><b style="red">Team size:</b> 11 người</p>
      <p><b style="red">Tên khách hàng:</b> Anh</p>
    </b-modal>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
//import HelloWorld from "@/components/HelloWorld.vue"; // @ is an alias to /src

@Component({
  components: {
    //HelloWorld,
  },
})
export default class ProjectManager extends Vue {
  public showProject1: boolean = false;
  public showProject2: boolean = false;
  public showProject3: boolean = false;
  public showProject4: boolean = false;
}
</script>
