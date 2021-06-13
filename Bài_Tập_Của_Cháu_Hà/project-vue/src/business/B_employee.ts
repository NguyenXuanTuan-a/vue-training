import http from "@/http"

class B_employee {
    getAll() {
        return http.get("/employee");
    }
}
export default new B_employee();