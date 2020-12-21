import { Product } from "./product";

export class ShoppingCart {

	private cart: Map<Product, number> = new Map() 
	addProduct(p:Product) {
        let count: number = this.cart.get(p) || 1
		if (this.cart.has(p)) {
            count += 1
			this.cart.set(p, count);
		} else {
			this.cart.set(p, 1);
		}
	}

	removeProduct(p: Product) {
        let count: number = this.cart.get(p) || 0
		if (count > 1) {
            count -= 1
			this.cart.set(p, count);
		} else {
			this.cart.delete(p);
		}
	}

	clearCart() {
		this.cart.clear();
	}

	getTotalPrice(): number {
		let total:number = 0;
        this.cart.forEach((v, k) => total += k.getPrice() * v)
		return total
    }

	showShoppingCartList() {
        this.cart.forEach((v,k) => console.log(k + ' ' + v))
	}

	// public Set<Product> getProducts() {
	// 	return cart.keySet();
	// }
}
