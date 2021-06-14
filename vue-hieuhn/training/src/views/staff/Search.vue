<template>
    <div class="search">
        <ValidationObserver v-slot="{ handleSubmit }">
            <v-form ref="form" lazy-validation @submit.prevent="handleSubmit(onSubmit)" >
              <ValidationProvider v-slot="{ errors }">
                <v-text-field
                  v-model="searchText"
                  label="Search"
                  required
                ></v-text-field>
                <span>{{ errors[0] }}</span>
              </ValidationProvider>
              <router-link :to="{ name: 'Search', query: { key: searchText }, params: { text: searchText } }">
                  <v-btn class="mr-4"
                    >Tim kiem</v-btn
                  >
              </router-link>
          </v-form>
          </ValidationObserver>
    </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import Api from '../../services/Api'

@Component
export default class Search extends Vue {
    searchText: any = ''
    text = this.$attrs.text

    onSubmit() {
        console.log(true)
    }

    created() {
        Api.search(this.text).then((response: any) => {
            console.log(true)
        })
    }
}
</script>