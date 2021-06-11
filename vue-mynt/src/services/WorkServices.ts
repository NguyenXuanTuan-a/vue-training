import axios from 'axios'

class TodoService {
  getWorkList() {
    return axios.get('https://60c2fe85917002001739dd39.mockapi.io/api/v1/ListWork')
  }

  createWorkList(data: any) {
    return axios.post('https://60c2fe85917002001739dd39.mockapi.io/api/v1/ListWork', {
      data: data
    })
  }
}

export default new TodoService