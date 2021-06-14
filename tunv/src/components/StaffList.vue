<template>
  <div class="staffs">
        <h1 id="title">Staffs list</h1>
        <div class="staffs-list">
            <div class="staff-overview" :key="index" v-for="(staff, index) in staffsList">
                    <!-- <b-card
                        header="Staff information"
                        header-tag="header"
                        footer-tag="footer"
                        title=""
                        class="background"
                        v-bind:class="{out: !staff.stillWorking, exprience: staff.exprience >= 5 }"
                    >
                        <b-card-text>Name: {{ staff.name }}</b-card-text>
                        <b-card-text>Age: {{ staff.age }}</b-card-text>
                        <b-card-text v-if="staff.stillWorking">State: Still working</b-card-text>
                        <b-card-text v-else>State: Not work anymore</b-card-text>
                        <b-card-text>Exprience: {{ staff.exprience }}</b-card-text>
                        <b-button href="" variant="primary"><router-link :to="{name: 'staff-detail', params: {name: staff.name, items: staff}}">Detail</router-link></b-button>
                    </b-card> -->

                    <div class="header">
                        <h3>Staff information</h3>
                        <hr>
                    </div>
                    
                    <div class="staff-content">
                        <div class="staff-img">
                            <img id="staff-avatar" :src="staff.avatar" alt="">
                        </div>
                        <div class="staff-information">
                            <h4>Name: {{ staff.name }}</h4>
                            <h4>Age: {{ staff.age }}</h4>
                            <h4 v-if="staff.stillWorking">State: Still working.</h4>
                            <h4 v-else>State: No longer working here!</h4>
                            <h4>Exprience: {{ staff.exprience }} years</h4>
                        </div>
                        
                    </div>
                    <button id="staff-detail-btn"><router-link :to="{name: 'staff-detail', params: {name: staff.name, items: staff}}">Detail -></router-link></button>
                    <button id="staff-delete-btn" @click="deleteStaff(index)"><a>Delete</a></button>
            </div>
        </div>
  </div>
</template>

<script lang="ts">
  import { Component, Prop, Vue } from 'vue-property-decorator';
  @Component
  export default class StaffList extends Vue {
    @Prop()
    staffsList = [
        {
            name: 'Harry Osborn',
            age: '19',
            stillWorking: true,
            exprience: 2,
            avatar: './avatar.jpg',
            todos: [
                {
                    name: 'eat',
                    completed: false,
                    edit: false
                },
                {
                    name: 'sleep',
                    completed: false,
                    edit: false
                },
                {
                    name: 'game',
                    completed: false,
                    edit: false
                },
            ]
        },
        {
            name: 'Oscar',
            age: '25',
            stillWorking: true,
            exprience: 5,
            avatar: './avatar-2.jpg'
        },
        {
            name: 'John Wane',
            age: '30',
            stillWorking: false,
            exprience: 4,
            avatar: './avatar-3.jpg'
        },
    ]

    deleteStaff(index: number) {
        this.staffsList.splice(index, 1)
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    .staffs-list {
        display: flex;
        justify-content: space-around;
        align-items: center;
        flex-wrap: wrap;
        margin-top: 4%;
    }

    .staff-overview {
        width: 20%;
        border-radius: 5%;
        background: rgb(225, 217, 217);
        position: relative;
    }

    .staff-overview > button {
        border-radius: 10%;
        position: absolute;
    }

    .staff-overview > button > a {
        color: white;
    }

    .staff-img {
        width: 30%;
        border-radius: 50%;
    }

    .staff-img > img#staff-avatar {
        width: 100%;
        border-radius: 50%;
    }

    .header {
        width: 100%;
        border-radius: 5%;
        background: rgb(121, 214, 121);
        text-align: center;
    }

    .staff-content {
        width: 100%;
        height: 270px;
        display: flex;
        justify-content: space-around;
    }

    .staff-information {
        width: 58%;
        height: 70%;
        border: 2px solid;
    }

    .background {
        background: lightblue;
    }

    .out {
        background: gray;
    }

    .exprience {
        background: yellow;
    }

    h1#title {
        text-align: center;
    }

    #staff-detail-btn {
        background: gray;
        bottom: 11%;
        right: 20%;
    }

    #staff-delete-btn {
        bottom: 11%;
        right: 3%;
        background: red;
    }

</style>