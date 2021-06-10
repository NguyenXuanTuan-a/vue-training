<template>
    <v-app-bar app>
        <v-container>
            <div id="header">
                <img @click="showDialog" class="logo" :src="logo" alt="">
                <ul class="header-list">
                    <li class="header-item" v-for="(item, i) in lists" :key="i">
                        <a :href="item.url" class="header-link">{{ item.name }}</a>
                    </li>
                </ul>
            </div>
        </v-container>
    </v-app-bar>
</template>

<script lang="ts">
import { Component, Emit, Prop, Vue } from 'vue-property-decorator'

@Component
export default class Header extends Vue {
  @Prop() private lists?: string[]
  @Prop() private logo?: string


  showDialog = () => {
      this.$emit("emitName")
  }
}
</script>

<style lang="scss">
    #header {
        display: flex;
        justify-content: space-between;
        align-items: center;

        h1 {
            text-align: left;
        }

        .header-list {
            display: flex;
            list-style: none;

            .header-link {
                text-decoration: none;
                display: inline-block;
                margin-left: 20px;
                color: black;
            }
        }

        .logo {
            width: 60px;
            cursor: pointer;
        }
    }
</style>