<template>
  <div>
    <v-container>
      <div class="wrapProfile">
        <h1>View Profile</h1>
        <div class="wrapAvatar">
          <v-avatar size="300">
            <img v-if="getData.avatar != ''" :src="getData.avatar" />
            <img
              v-else
              src="https://previews.123rf.com/images/metelsky/metelsky1904/metelsky190400020/121859822-male-avatar-icon-or-portrait-handsome-young-man-face-businessman-in-suit-and-necktie-vector-illustra.jpg"
            />
          </v-avatar>
        </div>
        <div class="wrapInfoProfile">
          <v-text-field
            :value="getData.name"
            label="Full Name"
            outlined
          ></v-text-field>
        </div>
        <v-row>
          <v-col cols="12" md="3">
            <v-text-field
              :value="getData.age"
              label="AGE"
              outlined
            ></v-text-field>
          </v-col>
          <v-col cols="12" md="3">
            <v-text-field
              :value="getData.part"
              label="Part"
              outlined
            ></v-text-field>
          </v-col>
          <v-col cols="12" md="3">
            <v-select
              :items="itemsStatus"
              :value="getData.status"
              label="Status"
              outlined
            ></v-select>
          </v-col>
          <v-col cols="12" md="3">
            <v-select
              :items="itemsPosition"
              :value="getData.postion"
              label="Postion"
              outlined
            ></v-select>
          </v-col>
          <div class="wrapButton">
            <v-btn elevation="8"> Update Profile </v-btn>
          </div>
        </v-row>
      </div>
    </v-container>
  </div>
</template>

<style lang="scss">
.wrapProfile {
  margin: 30px auto;
  width: 50%;
  .wrapAvatar {
    width: 30%;
    margin: 0 auto;
    display: flex;
    justify-content: center;
  }
  .wrapInfoProfile {
    margin: 20px 0 0 0;
  }
  .wrapButton {
    width: 100%;
    display: flex;
    justify-content: center;
    button {
      background: #d1ecfc !important;
    }
  }
}
</style>

<script lang="ts">
import { Component, Vue, Prop } from "vue-property-decorator";
@Component
export default class profile extends Vue {
  getData = this.$attrs.items;
  itemsStatus = ["Working", "not_working"];
  itemsPosition = [
    "Develop",
    "PM",
    "HR",
    "BRSE",
    "Leader",
    "Chủ Tịt",
    "Giám Đốc",
  ];
}
</script>
