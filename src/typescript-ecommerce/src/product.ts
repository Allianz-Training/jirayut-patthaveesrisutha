
export class Product {
    private id: string;
    private title: string;
    private price: number;

    constructor(id: string, title: string, price: number) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    getId(): string {
        return this.id;
    }

    getTitle(): string {
        return this.title;
    }

    getPrice(): number {
        return this.price;
    }

    toString(): string {
        return `Product [id=${this.id}, title=${this.title}, price=${this.price}]`;
    }

}
