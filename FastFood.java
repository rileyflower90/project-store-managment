public class fastFood {
    // Instance Variables
    private String name;
    private double price;
    private boolean isMainDish;

    // Constructor Methods
    // No-Argument
    public fastFood() {
        name = "No name";
        price = 0.0;
        isMainDish = false;
    }

    // Parameterized
    public fastFood(String name, double price, boolean isMainDish) {
        this.name = name;
        this.price = price;
        this.isMainDish = isMainDish;
    }

    // Accessor and Mutator Methods
    // Accessor Methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsMainDish() { 
        return isMainDish;
    }

    // Mutator Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setIsMainDish(boolean isMainDish) {
        this.isMainDish = isMainDish;
    }

    // toString Method Override
    public String toString() {
        String text;
        if (isMainDish) {
            text = "Main Dish";
        } else {
            text = "Side Dish";
        }
        return "\nName: " + name + "\nPrice: " + price + "\nIs it a main dish? " + text; 
    }
}
