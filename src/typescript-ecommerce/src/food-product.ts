import { Product } from "./product";

export class FoodProduct extends Product {

	private expDate:Date | undefined;

	constructor(id: string, title: string, price: number) {
		super(id, title, price);
	}
}