<template>
    <div class="staff-list">
        <StaffDetail />
    </div>
</template>
<script>
// @ is an alias to /src
import StaffDetail from '@/components/StaffDetail.vue'

export default {
  name: 'staff-detail',
  components: {
    StaffDetail
  }
}
</script>