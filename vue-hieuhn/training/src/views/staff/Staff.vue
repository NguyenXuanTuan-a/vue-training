<template>
  <div>
    <!-- <v-simple-table>
            <template v-slot:default>
                <thead>
                    <tr>
                        <th>
                            Name
                        </th>
                        <th>
                            Seniority
                        </th>
                        <th>
                            Is working
                        </th>
                        <th>
                            Action
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr 
                        v-for="(item, i) in staffList" 
                        :key="i" 
                        :class="{isWorking: !item.isWorking, seniority: item.seniority >= 5 && item.isWorking}"
                    >
                        <td>
                            {{ item.name }}
                        </td>
                        <td>
                            {{ item.seniority }} years
                        </td>
                        <td v-if="item.isWorking">
                           yes
                        </td>
                        <td v-else>
                            no
                        </td>
                        <td>
                            <router-link class="btn-link" :to="{ name: 'StaffAction', params: { id: item.id, item: item } }">
                                <v-btn small elevation="2" class="btn-detail">
                                    Chi tiết
                                </v-btn>
                            </router-link>
                            <router-link class="btn-link" to="">
                                <v-btn small elevation="2" class="btn-del">
                                    Xoá
                                </v-btn>
                            </router-link>
                        </td>
                    </tr>
                </tbody>
            </template>
        </v-simple-table> -->

    <v-row>
      <v-col md="2" v-for="(item, i) in staffList" :key="i">
        <v-card elevation="4" outlined>
          <h1 class="cart-header" :class="{ disabled: !item.isWorking }">
            <v-avatar
              color="primary"
              size="40"
              class="cart-avatar"
              v-if="item.avatar != ''"
            >
              <img :src="item.avatar" alt="" />
            </v-avatar>
            <v-avatar
              color="primary"
              size="40"
              class="cart-avatar"
              v-if="item.avatar == ''"
            >
              <img
                src="https://thumbs.dreamstime.com/z/default-avatar-profile-icon-vector-social-media-user-image-182145777.jpg"
                alt=""
              />
            </v-avatar>

            <span>{{ item.name }}</span>
          </h1>

          <v-card-text class="text-cart">
            <p>
              Da lam viec <span class="bold">{{ item.seniority }} years</span>
            </p>
            <p>
              Dang lam viec <span class="bold">{{ item.isWorking }}</span>
            </p>
          </v-card-text>

          <div class="cart-action">
            <router-link
              class="cart-button"
              :to="{ name: 'StaffAction', params: { id: item.id, item: item } }"
            >
              <v-btn small class="cart-button-detail"> Chi tiet </v-btn>
            </router-link>
            <router-link class="cart-button" to="">
              <v-btn small @click="deleteStaff(i)"> Xoa </v-btn>
            </router-link>
          </div>
        </v-card>
      </v-col>
    </v-row>
  </div>
</template>

<script lang="ts">
import { Component, Vue, Emit } from "vue-property-decorator";

@Component
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
    { id: 3, name: "Nguyen Thi My", seniority: 7, isWorking: true, avatar: "" },
    {
      id: 4,
      name: "Member asda",
      seniority: 10,
      isWorking: false,
      avatar: "http://ativn.edu.vn/wp-content/uploads/2018/03/user.png",
    },
  ];

  deleteStaff(i: number): void {
    this.staffList.splice(i, 1);
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
</style>
