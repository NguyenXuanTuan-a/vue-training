import axios from 'axios'

class TodoService {
  getWorkList() {
    return axios.get('https://60c2fe85917002001739dd39.mockapi.io/api/v1/ListWork')
  }

  getWorkListById(id: any) {
    return axios.get('https://60c2fe85917002001739dd39.mockapi.io/api/v1/ListWork' + id)
  }

  createWorkList(data: any) {
    return axios.post('https://60c2fe85917002001739dd39.mockapi.io/api/v1/ListWork', {
      data: data
    })
  }

  updateWorkList(data: any) {
    return axios.put('https://60c2fe85917002001739dd39.mockapi.io/api/v1/ListWork', {
      data: data
    })
  }
}

export default new TodoService