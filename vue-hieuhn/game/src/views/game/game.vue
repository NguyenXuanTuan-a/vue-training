<template src="./game.html"></template>

<script lang="ts">
import { Vue, Component, Watch } from 'vue-property-decorator'

@Component
export default class Game extends Vue {
    healthHero = 100
    healthMonster = 100
    result = ''

    @Watch(`healthHero`) onChangeHealth() {
        if (this.healthHero <= 0 && this.healthMonster > 0) {
            this.result = 'monster'
            this.healthHero = 0
        } else if (this.healthMonster <= 0) {
            this.result = 'hero'
            this.healthMonster = 0
        }
    }

    start(): void {
        this.result = ''
        this.healthHero = 100
        this.healthMonster = 100
    }

    attack(): void {
        this.healthHero -= this.randomDamage(5, 10)
        this.healthMonster -= this.randomDamage(5, 10)
    }

    powerAttack(): void {
        this.healthHero -= this.randomDamage(8, 14)
        this.healthMonster -= this.randomDamage(8, 14)
    }

    health(): void {
        this.healthHero += this.randomDamage(5, 10)
        this.healthMonster += this.randomDamage(5, 10)

        if (this.healthHero > 100) {
            this.healthHero = 100
        }
        if (this.healthMonster > 100) {
            this.healthMonster = 100
        }
    }

    surrender(): void {
        this.healthHero = 0
    }

    randomDamage(min: number, max: number): number {
        return Math.floor((Math.random() * max) + min);
    }
}
</script>

<style>
@import url('./game.css');
</style>