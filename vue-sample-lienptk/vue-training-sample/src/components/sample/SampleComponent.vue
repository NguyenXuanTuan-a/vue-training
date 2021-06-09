<template src="./SampleComponent.html"></template>

<script lang="ts">
import { Component, Vue, Prop } from 'vue-property-decorator'

@Component
export default class SampleComponent extends Vue {
  // Prop
  @Prop() private employeeName!: string

  // Variable
  private checkRefVariable?: string;

  private created () {
    this.checkRefVariable = 'checkRefVariable'
  }

  private emitEventToParent () {
    // emit event to parent component
    this.$emit('emitFunction')
  }

  private checkReference () {
    alert('Cha đã gọi được con')
  }
}
</script>
