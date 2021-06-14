<template>
    <v-col md="2">
        <v-card elevation="4" outlined>
          <h1 class="cart-header" :class="{ disabled: !item.isWorking, staff: item.seniority < 5 && item.isWorking }">
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
              Da lam viec <span class="bold">{{ item.year }} years</span>
            </p>
            <p>
              Dang lam viec <span class="bold">{{ item.isWorking }}</span>
            </p>
          </v-card-text>

          <div class="cart-action">
            <router-link
              class="cart-button"
              :to="{ name: 'StaffAction', params: { id: item.id } }"
            >
              <v-btn small class="cart-button-detail"> Chi tiet </v-btn>
            </router-link>
            <router-link class="cart-button" to="">
              <v-btn small @click="deleteStaff(item.id)"> Xoa </v-btn>
            </router-link>
          </div>
        </v-card>
      </v-col>
</template>

<script lang="ts">
import { Component, Vue, Prop, Emit } from 'vue-property-decorator'
import Api from '../../services/Api'

@Component
export default class StaffCon extends Vue {
    @Prop() private item?: any
    @Prop() private i?: string
  
    @Emit('deleteItem') deleteStaff(i: number) {
        return i
    }
}
</script>