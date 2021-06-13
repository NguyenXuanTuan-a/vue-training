<template>
  <div>
    <v-row>
      <StaffCon v-for="(item, i) in staffList" :key="i" :item="item" :i="i" @deleteItem="deleteItem($event)"></StaffCon>
    </v-row>

    <Add @data="addStaff($event)"></Add>
  </div>
</template>

<script lang="ts">
import { Component, Vue, Emit } from "vue-property-decorator";
import StaffCon from './StaffCon.vue'
import Add from './Add.vue'

interface staff {
      id: number
      name: string
      seniority: number
      isWorking: boolean
      avatar: string
}

@Component({
  components: {
    StaffCon, Add
  }
})
export default class Staff extends Vue {
  staffList = [
    {
      id: 1,
      name: "Hoang Ngoc Hieu",
      seniority: 10,
      isWorking: true,
      avatar: "http://ativn.edu.vn/wp-content/uploads/2018/03/user.png",
    },
    {
      id: 2,
      name: "Hoang Trong Ha",
      seniority: 3,
      isWorking: true,
      avatar: "http://ativn.edu.vn/wp-content/uploads/2018/03/user.png",
    },
    { id: 3, 
      name: "Nguyen Thi My", 
      seniority: 7, 
      isWorking: true, 
      avatar: "" },
    {
      id: 4,
      name: "Member asda",
      seniority: 10,
      isWorking: false,
      avatar: "http://ativn.edu.vn/wp-content/uploads/2018/03/user.png",
    },
  ];

  staff: staff = {
      id: this.staffList.length + 1,
      name: 'Ten member',
      seniority: Math.floor(Math.random() * 11),
      isWorking: true,
      avatar: '',
  }

  deleteItem(i: number) {
    this.staffList.splice(i, 1);
  }

  addStaff(data: any) {
    this.staffList.push(data)
  }
}
</script>

<style lang="scss">
.isWorking {
  background: #ccc;
}
.seniority {
  background: rgb(253, 253, 93);
}
.btn-detail {
  background: rgb(37, 122, 37) !important;
  color: white !important;
}
.btn-del {
  background: rgb(223, 73, 73) !important;
  color: white !important;
  margin: 0 10px;
}
.btn-link {
  text-decoration: none;
}
.icon-color {
  background: green;
}
.cart-header {
  padding: 10px;
  background: green;
  color: white;
  font-size: 20px;
  display: flex;
  align-items: center;
}
.text-cart {
  text-align: left;
}
.cart-action {
  padding: 10px;
}
.cart-button {
  margin: 0 6px;
  text-decoration: none;
}
.cart-button-detail {
  background: green !important;
  color: white !important;
}
.disabled {
  background: #ccc;
}
.cart-img {
  border-radius: 50%;
  object-fit: cover;
}
.cart-avatar {
  margin-right: 10px;
}
.staff {
  background: white;
  color: black;
}
</style>
