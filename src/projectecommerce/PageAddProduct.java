package projectecommerce;

public class PageAddProduct extends Page {

    State state = State.getInstance();

    public void show() {

        System.out.println("Type B to Back");

        System.out.print("Product name: ");
        String inputString = state.scanner.nextLine();


        switch (inputString.toLowerCase()) {
            case "b": {
                state.getStack().pop().show();
                break;
            }
            default:
                System.out.print("Product Price: ");
                int inputInt = state.scanner.nextInt();
                Product p = new Product(state.getpList().getNextId(), inputString, inputInt);
                state.getpList().addProduct(p);
                state.getStack().pop().show();
                break;
        }

    }
}
