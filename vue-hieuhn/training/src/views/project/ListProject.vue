<template>
  <div>
    <h1 class="project-header">Project List</h1>
    <v-row>
      <v-col xl="2" v-for="(item, i) in listProject" :key="i">
        <router-link
          :to="{ name: 'DetailProject', params: { id: item.id, item: item } }"
          class="projectItem"
        >
          <v-card class="mx-auto">
            <v-card-text>
              <h1 class="project-title">
                {{ item.name }}
                <span class="project-important" v-show="item.important">*</span>
              </h1>
              <div class="project-content">
                <h4 class="project-auth">PM: {{ item.pm }}</h4>
                <p class="bold">Teamsize: {{ item.teamSize }}</p>
                <p class="bold">Khach hang: {{ item.customer }}</p>
              </div>
            </v-card-text>
          </v-card>
        </router-link>
      </v-col>
    </v-row>
    <router-link class="home" to="/">
      <v-btn>Trang chu</v-btn>
    </router-link>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from "vue-property-decorator";

@Component
export default class ListProject extends Vue {
  @Prop() private listProject?: any[];
}
</script>

<style lang="scss">
.project-header {
  font-size: 100px;
  padding: 20px;
}
.projectItem {
  text-align: left;
  text-decoration: none;

  .project-title {
    padding: 10px 0;
    text-transform: uppercase;
    text-align: center;
    margin-bottom: 10px;
    color: black;
  }

  .bold {
    font-weight: bold;
  }

  .project-important {
    color: red;
  }
}
.home {
  display: block;
  text-align: right;
  margin: 20px 0;
  text-decoration: none;
}
</style>
