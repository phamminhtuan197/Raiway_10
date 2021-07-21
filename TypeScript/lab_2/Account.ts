
import { Department } from "./Department";
import { Position } from "./Position";

class Account {
    private id: number;
    private email: String;
    private userName: String;
    private fullName: String;
    private department: Department;
    private position: Position;
    private createDate: Date;

    constructor(id: number, email: String, userName: String, fullName: String, department: Department, position: Position, createDate: Date) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }

    public getid(): number {
        return this.id;
    }
    public setid(v: number) {
        this.id = v;
    }
    public getemail(): String {
        return this.email;
    }
    public setemail(v: String) {
        this.email = v;
    }
    public getfullName(): String {
        return this.fullName;
    }
    public setfullName(v: String) {
        this.fullName = v;
    }
    public getuserName(): String {
        return this.userName;
    }
    public setuserName(v: String) {
        this.userName = v;
    }
    public getdepartment(): Department {
        return this.department;
    }
    public setdepartment(v: Department) {
        this.department = v;
    }
    public getposition(): Position {
        return this.position;
    }
    public setposition(v: Position) {
        this.position = v;
    }
    public getcreateDate(): Date {
        return this.createDate;
    }
    public setcreateDate(v: Date) {
        this.createDate = v;
    }

}

function printInfAccount(account: Account): void {
    console.log("ID: " + account.getid() + ", Email: " + account.getemail() + ", UserName: " + account.getuserName() + ", FullName: " + account.getfullName() + ", Department: " + account.getdepartment().getname() + ", Position: " + account.getposition().getname() + ", CreateDate: " + account.getcreateDate());
}

export { Account, printInfAccount}