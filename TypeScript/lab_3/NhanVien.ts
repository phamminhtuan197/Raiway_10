import { CanBo } from "./CanBo";

class NhanVien extends CanBo {
    private job: String;

    public getjob(): String {
        return this.job;
    }
    public setjob(job: String) {
        this.job = job;
    }

    constructor (name: String, age: number, gender: String, address: String, job: String) {
        super(name, age, gender, address);
        this.job = job;
    }

    public printInfNhanVien() {
        console.log("Thong tin Nhan Vien");
        super.printInfCanBo();
        console.log("Job: " + this.job);
    }

    
}
let printInfEmployees = nhanvien => console.log("Name: " + nhanvien.getname() + ", Age: " + nhanvien.getage() + ", Gender: " + nhanvien.getgender() + ", Address: " + nhanvien.getaddress() + ", Task: " + nhanvien.getjob());
export{NhanVien, printInfEmployees };