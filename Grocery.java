public class Grocery extends Item implements Discount, Tax{
    private double price;
    private double units;
    private double discount;
    private double Tax;

    public Grocery(int i, String n, double p, double u, double d, double t){
        super (i, n);
        price = p;
        units = u;
        discount = d;
        Tax = t;
    }
    public double computeDiscount(){
        double decidiscount = (discount/100);

        discount = (decidiscount*(price*units));
        System.out.println("Discount: $" + discount);
        return discount;
    }

    public double computeTax(){
        Tax = 0;
        System.out.println("Tax: $" + Tax);
        return Tax;
    }
    public double computeTotalPrice(){
        double totalprice = ((price* units) - discount) + Tax;
        return totalprice;
    }
    public void displayGrocery(){
        System.out.println("=Grocery=");
        display();
        System.out.println("Units: " +units);
        System.out.println("Price: $" +price);
        computeDiscount();
        computeTax();
        System.out.println("The total bill amount: $" + computeTotalPrice() + "\n");

    }
}
