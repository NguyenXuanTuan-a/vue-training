<template src="./navbar.html">
</template>

<script>
export default {
  name: "navbar",
  data: () => ({
    links: [
      {
        name: 'home',
        url: '/'
      },
      {
        name: 'project',
        url: 'project'
      },{
      name: 'employee',
        url: 'employee'
      }
    ],
  }),
}
</script>

<style src="./navbar.scss" lang="scss" scoped>
</style>
