<template>
    <v-content class="wrapLogin">
      <v-container fill-height="fill-height">
        <v-layout align-center="align-center" justify-center="justify-center">
          <v-flex class="login-form text-xs-center"> 
            <div class="display-1 mb-3">
            Login
            </div>
            <v-card light="light">
              <v-card-text>
                <Form
                    @submit="onSubmit"
                >
                  <v-text-field 
                    light="light" 
                    label="Email" 
                    type="email"
                    name="email"
                    :rules="validateEmail"
                  ></v-text-field>
                  <ErrorMessage name="email" />
                  <v-text-field 
                    light="light" 
                    label="Password" 
                    type="password"
                  >
                  </v-text-field>
                  <v-btn 
                    block="block" 
                    class="button-submit"
                    >Sign in</v-btn>
                    <v-btn 
                    block="block" 
                    type="button"
                  >Register
                  </v-btn>
                </Form>
              </v-card-text>
            </v-card>
          </v-flex>
        </v-layout>
      </v-container>
    </v-content>
</template>

<style lang="scss">
.wrapLogin {
    margin: 50px 0 0 0;
    .display-1 {
        text-align: center;
    }
    .login-form {
        max-width: 500px;
        .button-submit {
            background: #00bcd4;
            color: white;
            margin: 10px 0 30px 0;
        }
    }
}
</style>

<script lang="ts">
import {Vue,Component} from 'vue-property-decorator'
interface user {
    email: string
    name: string
    password: string
}
@Component
export default class Login extends Vue{
    user: user= {
        email:'test1@gmail.com',
        name:'Hoang Ha',
        password:'1234'
    }
    onSubmit(values:any) {
      alert(JSON.stringify(values, null, 2));
    }
    validateEmail(value:any) {
      // if the field is empty
      if (!value) {
        return 'This field is required';
      }

      // if the field is not a valid email
      if (!/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(value)) {
        return 'This field must be a valid email';
      }
      return true;
    }
}
</script>