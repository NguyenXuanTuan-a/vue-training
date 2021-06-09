<template src="./SampleView.html"></template>

<script lang="ts">
import { Component, Vue, Watch } from 'vue-property-decorator'

// Component
import SampleComponent from '@/components/sample/SampleComponent.vue'

@Component({
  components: {
    SampleComponent
  }
})
export default class SampleView extends Vue {
  private employeeLst: string[] = [
    'Liên',
    'Dũng',
    'Tùng'
  ]

  private msg!: string;

  created () {
    this.msg = 'LienPTK'
  }

  private callToChildComponent () {
    (this.$refs['sample-component'] as any).checkReference()
  }

  private emitDemo () {
    alert('Vào')
  }

  // computed data
  // computed getter
  get msgComputed () {
    return this.msg + 'test computed'
  }

  // computed setter
  set msgComputed (msg: string) {
    this.msg = this.msg.trim()
  }

  @Watch('msg')
  msgWatched (oldValue: string, newValue: string) {
    // xử lý theo dõi thay đổi đối tượng msg
  }
}
</script>
