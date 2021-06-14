<template>
    <div class="add">
        <ValidationObserver v-slot="{ handleSubmit }">
            <form action="" @submit.prevent="handleSubmit(onSubmit)">
                <ValidationProvider rules="required|min" v-slot="{ errors }">
                    <input v-model="data.name" type="text">
                    <div>{{ errors[0] }}</div>
                </ValidationProvider>
                <br><br>
                <ValidationProvider rules="required" v-slot="{ errors }">
                    <select name="" id="" v-model="data.year">
                        <option :value="year" v-for="year in years" :key="year">
                            {{ year }}
                        </option>
                    </select>
                    <input type="hidden" name="value" :value="data.year.value">
                    <div>{{ errors[0] }}</div>
                </ValidationProvider>
                <br><br>
                <ValidationProvider rules="required|min" v-slot="{ errors }">
                    <input v-model="data.avatar" type="text" placeholder="Link ảnh">
                    <div>{{ errors[0] }}</div>
                </ValidationProvider>
                <br><br>
                <v-btn type="submit">
                    Them thanh vien
                </v-btn>
            </form>
        </ValidationObserver>
    </div>
</template>

<script lang="ts">
import { Component, Vue, Emit } from "vue-property-decorator";
import { extend } from 'vee-validate'

extend('required', {
    validate(value) {
        return {
            required: true,
            valid: ['', null, undefined].indexOf(value) === -1
        }
    },
    message: 'Nhap vao ?',
    computesRequired: true
})

extend('min', {
    validate(value: string) {
        return {
            valid: value.length >= 6
        }
    },
    message: 'toi thieu 6 ky tu',
})

@Component
export default class Add extends Vue {
  data: any = {
    name: "",
    avatar: "",
    year: 2021,
    isWorking: true,
  };

  get years() {
      const year = new Date().getFullYear()
      return Array.from({length: year - 1900}, (value, index) => 1901 + index)
  }

  @Emit('data') onSubmit(e: any) {
      return {
          name: this.data.name,
          seniority: this.data.year,
          isWorking: true,
          avatar: this.data.avatar
      }
  }

}
</script>

<style>
input {
  background: #ccc;
  color: white;
  padding: 20px;
  width: 300px;
}
.form-group {
  margin: 10px 0;
}
.year {
    width: 200px;
    background: #CCC;
}
.add {
    margin: 100px 0;
}
select {
    width: 300px;
    background: #CCC;
    padding: 20px;
}
</style>
