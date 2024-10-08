public class Burger extends fastFood {

    // Instance Variables
    private int burgerPatties; 
    private boolean hasCheese; 

    // No-Argument Constructor
    public Burger() {
        super("No name", 0.0, false);
        burgerPatties = 1;
        hasCheese = true;
    }

    // Parameterized Constructor
    public Burger(String name, double price, boolean isMainDish, int burgerPatties, boolean hasCheese) {
        super(name, price, isMainDish);
        this.burgerPatties = burgerPatties;
        this.hasCheese = hasCheese;
    }

    // Accessor and Mutator Methods
    public int getBurgerPatties() {
        return burgerPatties;
    }

    public boolean getHasCheese() { 
        return hasCheese;
    }

    // Mutator Methods
    public void setBurgerPatties(int burgerPatties) {
        this.burgerPatties = burgerPatties;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese; 
    }

    // toString Method Override
    public String toString() {
        String cheese;
        if (hasCheese) {
            cheese = "With cheese";
        } else {
            cheese = "No cheese";
        }
        return super.toString() + "\nDoes it have cheese? " + cheese + "\nHow many burger patties? " + burgerPatties; 
    }
}
