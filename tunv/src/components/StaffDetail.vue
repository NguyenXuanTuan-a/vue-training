<template>
  <div class="staff">
    <div class="staff-form">
      <h3>{{ staff.name }}' todos list</h3>
      <div class="add-todo">
        <input type="text" @keyup.enter="addNewTodo()" id="new-todo" v-model="newTodo">
        <button id="add-todo-btn" @click="addNewTodo()">Add</button>
      </div>
    
      <div class="todos-list">
        <div class="todo" :key="index" v-for="(todo, index) in staff.todos">
          <div class="todo-detail">
            <h4 @click="editTodo(todo)" v-if="!todo.edit">{{ todo.name }}</h4>
            <input @keyup.enter="doneEditTodo(todo)" v-else type="text" v-model="todo.name">
          </div>
          
          <div class="delete-todo" @click="deleteTodo(index)">
            &times;
          </div>
          
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
  import { Component, Prop, Vue } from 'vue-property-decorator';
  @Component
  export default class StaffDetail extends Vue {

    newTodo = '' ;  
    @Prop()
    staff = this.$route.params.items;

    addNewTodo() {
      if (this.newTodo.length) {
        let newTodo = {
          name: this.newTodo,
          completed: false,
          edit: false
        }
        this.staff.todos.push(newTodo);
        this.newTodo = '';
      }
    }

    deleteTodo(index: number) {
      this.staff.todos.splice(index, 1);
    }

    editTodo(todo) {
      todo.edit = true;
    }

    doneEditTodo(todo) {
      todo.edit = false;
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .staff-form {
    width: 50%;
    margin: auto;
  }

  .todo input {
    margin: 2%;
  }

  .add-todo {
    width: 80%;
    padding-left: 1%;
    margin-bottom: 2%;
  }

  #add-todo-btn {
    margin-left: 2%;
    background: white;
    border: 1px solid gray;
  }

  .staff {
    width: 37%;
    border: 2px solid;
    margin: auto;
    padding: 2%
  }

  .delete-todo {
    cursor: pointer;
    padding-left: 4%;
    position: absolute;
    right: 0;
  }

  .delete-todo:hover {
    color: red;
  }

  .todo {
    display: flex;
    align-items: center;
    width: 80%;
    position: relative;
  }

</style>