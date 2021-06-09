<template>
    <div class="container">
        <div class="wrapHeader">
            <div class="logo">
                <img :src="Menu.logo">
            </div>
            <div class="wrapTopBar">
                <TopBar :getDataTopBar='Menu.menu'/>
            </div>
        </div>
    </div>
</template>
<style lang="scss">
    .wrapHeader {
        width: 100%;
        display: flex;
        height: 200px;
        .logo {
            width: 200px;
            display: flex;
            justify-content: center;
            align-content: center;
        }
        .wrapTopBar {
            display: block;
            width: 100%;
        }
    }
</style>
<script lang="ts">
    import { Component, Vue, Prop } from 'vue-property-decorator'
    import TopBar from './TopBar.vue'
    interface dataHeader {
        menu: string[]
        logo: string
    }
    @Component({
        components: {
            TopBar
        }
    })
    export default class Header extends Vue{
        Menu: dataHeader = {
            menu: [
                'Our Menu',
                'McCafé',
                'About Our Food',
                'Exclusive Deals',
                'Download App',
                'Locate',
            ],
            logo: '../img/logo.jpg'
        }
    }
</script>