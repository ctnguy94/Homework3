public class Clothing extends Item implements Discount, Tax{
    private String brand;
    private double price;
    private double units;
    private double discount;
    private final double taxp = 8.5;
    private double taxcost;
    private double decidiscount;

    public Clothing(int i, String n, String br, double pr, double un, double dc){
        super (i, n);
        brand = br;
        price = pr;
        units = un;
        discount = dc;

    }
    public double computeDiscount(){
        decidiscount = (discount/100);
        discount = (decidiscount*(price*units));
        System.out.println("Discount: $" + discount);
        return discount;
    }

    public double computeTax(){
        double decitax = (taxp/100);
        taxcost = (((price*units) - discount)*decitax);
        System.out.println("Tax: $" + taxcost);
        return taxcost;
    }

    public double computeTotalPrice(){
        double totalprice = ((price*units) - discount) + taxcost;
        return totalprice;
    }
    public void displayClothing(){
        System.out.println("=Clothing=");
        display();
        System.out.println("Brand: " + brand);
        System.out.println("Units: " + units);
        System.out.println("Price: $"+ price);
        computeDiscount();
        computeTax();
        System.out.println("The total bill amount: $" + computeTotalPrice() + "\n");
    }
}
