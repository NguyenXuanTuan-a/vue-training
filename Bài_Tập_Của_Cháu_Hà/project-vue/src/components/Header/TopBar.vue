<template>
  <div class="topbar">
    <ul class="itemMenu">
      <a v-for="(item, key) in getDataTopBar" :key="key" :href="item.url">
        <li>
          {{ item.name }}
        </li>
      </a>
    </ul>
  </div>
</template>
<style lang="scss">
.topbar {
  width: 100%;
  display: flex;
  .itemMenu {
    width: 100%;
    font-size: 25px;
    display: flex;
    list-style: none;
    a {
      color: black;
      text-decoration: none;
    }
    li {
      padding: 0 25px;
    }
  }
}
</style>

<script lang="ts">
import { Component, Vue, Prop } from "vue-property-decorator";
import Header from "./Header.vue";
@Component({
  components: {
    Header,
  },
})
export default class TopBar extends Vue {
  @Prop() private getDataTopBar?: string[];
}
</script>
