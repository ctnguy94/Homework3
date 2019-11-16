public class demoDepartmentBilling {
    public static void main(String[] args){
        Grocery g1 = new Grocery(11, "Bread", 1.50, 2, 0, 0);
        Grocery g2 = new Grocery(12, "Apple", 0.75, 6, 1, 0);
        g1.displayGrocery();
        g2.displayGrocery();

        Clothing c1 = new Clothing(21, "Jeans", "Levis", 35, 1, 0);
        Clothing c2 = new Clothing(22, "Dress Shirt", "Izod", 25, 2, 10);
        c1.displayClothing();
        c2.displayClothing();

        double grocery1 = g1.computeTotalPrice();
        double grocery2 = g2.computeTotalPrice();
        double clothing1 = c1.computeTotalPrice();
        double clothing2 = c2.computeTotalPrice();

        System.out.println("The whole bill with all Grocery and Clothing spending is : $"
                + (grocery1 + grocery2 + clothing1 + clothing2));

    }
}
