class Product {
  private name: string;
  private price: number;

  constructor(name: string, price: number) {
    this.name = name;
    this.price = price;
  }

  public getname(): string {
    return this.name;
  }

  public setname(v: string) {
    this.name = v;
  }

  public getprice(): number {
    return this.price;
  }

  public setprice(v: number) {
    this.price = v;
  }
}
export { Product };
