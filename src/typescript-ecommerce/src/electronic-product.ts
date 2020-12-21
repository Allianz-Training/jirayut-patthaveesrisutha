import { Product } from "./product";

export class ElectronicProduct extends Product {

	private watt: number | undefined;

	constructor(id: string, title: string, price: number) {
		super(id, title, price)
	}
}