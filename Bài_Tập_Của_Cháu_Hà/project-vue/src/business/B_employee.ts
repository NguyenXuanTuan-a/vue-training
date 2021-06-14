import http from "@/http"

class B_employee {
    getAll() {
        return http.get("/employee");
    }

    profile(id:number) {
        return http.get(`/employee/edit/${id}`);
    }
}
export default new B_employee();