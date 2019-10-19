package Midterm;

public abstract class Business {
    int numEmp;

    public Business(int numEmp) {
        this.numEmp = numEmp;
    }

    abstract int numEmployee();
}
