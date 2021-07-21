class Department {
    private id: number;
    private name: String;

    constructor(id: number, name: String) {
        this.id =  id;
        this.name = name;
    }

    public getname(): String {
        return this.name;
    }
    public setname(v: String) {
        this.name = v;
    }
    public getid(): number {
        return this.id;
    }
    public setid(v: number) {
        this.id = v;
    }
}

function printInfDepartment(department: Department): void {
    console.log("ID: " + department.getid() + "DepartmentName: " + department.getname());
}
export { Department, printInfDepartment}