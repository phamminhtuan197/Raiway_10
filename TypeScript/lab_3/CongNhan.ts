import {CanBo} from "./CanBo";

class CongNhan extends CanBo{ 
    private rank: number;

    public getrank(): number {
        return this.rank;
    }
    public setrank(rank: number) {
        this.rank = rank;
    }

    constructor (name: String, age: number, gender: String, address: String, rank: number) {
        super(name, age, gender, address);
        this.rank = rank;
    }

    public printInfCongNhan() {
        console.log("Thong tin cong nhan");
        super.printInfCanBo();
        console.log("Rank: " + this.rank);
    }
}
export{CongNhan};
