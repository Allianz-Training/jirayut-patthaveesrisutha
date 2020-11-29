package projectecommerce;

import java.util.ArrayList;

public class PageManage extends Page{

    State state = State.getInstance();

    @Override
    public void show() {
        boolean isRemove = false;


        System.out.println("=====Product List Management=====");
        for (Product p : state.getpList().getProducts()) {
            System.out.println(p);
        }
        System.out.println();
        System.out.println("Type Product ID to remove product from cart.");
        System.out.println("Type a to add a product");
        System.out.println("Type B to Back");


        System.out.print("Please Input: ");

        String inputString = state.scanner.nextLine();

        switch (inputString.toLowerCase()) {
            case "a": {
                state.getStack().push(this);
                PageAddProduct page = new PageAddProduct();
                page.show();
                break;
            }
            case "b": {
                state.getStack().pop().show();
                break;
            }
            default: {
                for (Product p : state.getpList().getProducts()) {
                    if (p.getId().equals(inputString)) {
                        System.out.println("Removed " + p.getTitle() + " from cart");
                        state.getpList().removeProduct(p);
                        isRemove = true;
                        break;
                    }
                }
                if(!isRemove) {
                    System.out.println("Invalid Input");
                }
                show();
                break;
            }
        }
    }
}
