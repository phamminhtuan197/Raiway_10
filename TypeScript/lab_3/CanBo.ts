
class CanBo {
     name: String;
     age: number;
     gender: String;
     address: String;

    public getname(): String {
        return this.name; 
    }
    public setname(name: String) {
        this.name = name;
    }
    public getage(): number {
        return this.age;
    }
    public setage(age: number) {
        this.age = age;
    }
    public getgender(): String {
        return this.gender;
    }
    public setgender(gender: String) {
        this.gender = gender;
    }
    public getaddress(): String {
        return this.address;
    }
    public setaddress(address: String) {
        this.address = address;
    }

    constructor (name: String, age: number, gender: String, address: String) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public printInfCanBo() {
        console.log("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender + ", Address: " + this.address);
    }
}

export{CanBo}