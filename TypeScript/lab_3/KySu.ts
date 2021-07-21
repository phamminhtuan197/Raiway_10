import { CanBo } from "./CanBo";

class KySu extends CanBo {
    private majors: String;

    public getmajors(): String {
        return this.majors;
    }
    public setmajors(majors: String) {
        this.majors = majors;
    }

    constructor(name: String, age: number, gender: String, address: String, majors: String) {
        super(name, age, gender, address);
        this.majors = majors;
    }

    public printInfKySu() {
        console.log("Thong tin Ky Su");
        super.printInfCanBo();
        console.log("Majors: " + this.majors);
    }
}
export{KySu}