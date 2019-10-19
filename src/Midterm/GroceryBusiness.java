package Midterm;

public class GroceryBusiness extends Business implements Coke, Onion {
    private double groceryIncome;
    private Coke coke;
    private Onion onion;

    public GroceryBusiness(int numEmp, double groceryIncome){
        super(numEmp);

        this.groceryIncome = groceryIncome;
    }

    void yearEstablished(int year){
        System.out.println("You established your business in year: "+ year);
    }


    @Override
    public void cokePrice(double cokePrice) {
        System.out.println("The price of coke is "+ cokePrice);
    }

    @Override
    public void onionPrice(double onionPrice) {
        System.out.println("The price of onion is "+ onionPrice);
    }

    @Override
    public String toString() {
        String result = "Number of Employees in your Business: " + this.numEmployee()+"\n";
        result += "Grocery Income: " + this.groceryIncome + "\n";
        return result;
    }

    @Override
    int numEmployee() {
        return numEmp;
    }
}
