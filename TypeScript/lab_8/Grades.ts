class Grades {
  private name: string;
  private grade: number;
  private gender: string;

  constructor(name: string, grade: number, gender: string) {
    this.name = name;
    this.grade = grade;
    this.gender = gender;
  }

  public setname(v: string) {
    this.name = v;
  }
  public getname(): string {
    return this.name;
  }
  public setgrade(v: number) {
    this.grade = v;
  }
  public getgrade(): number {
    return this.grade;
  }
  public setgender(v: string) {
    this.gender = v;
  }
  public getgender(): string {
    return this.gender;
  }
}
export { Grades };
