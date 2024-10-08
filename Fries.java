public class Fries extends fastFood {

    // Instance Variables
    private boolean isAnimalStyle;
    private int fryScoops;

    // No-Argument Constructor
    public Fries() {
        this("No name", 0.0, false, false, 1); 
    }

    // Parameterized Constructor
    public Fries(String name, double price, boolean isMainDish, boolean isAnimalStyle, int fryScoops) {
        super(name, price, isMainDish);
        this.isAnimalStyle = isAnimalStyle;
        this.fryScoops = fryScoops;
    }

    // Accessor Methods
    public boolean getIsAnimalStyle() {
        return isAnimalStyle;
    }

    public int getFryScoops() {
        return fryScoops;
    }

    // Mutator Methods
    public void setIsAnimalStyle(boolean isAnimalStyle) { 
        this.isAnimalStyle = isAnimalStyle; 
    }

    public void setFryScoops(int fryScoops) {
        this.fryScoops = fryScoops;
    }

    // toString Method Override
    public String toString() {
        String animalFries;
        if (isAnimalStyle) { 
            animalFries = "Animal Fries";
        } else {
            animalFries = "Not Animal Fries";
        }
        return super.toString() + "\nIs it Animal Fries? " + animalFries + "\nHow many Fry Scoops? " + fryScoops; 
    }
}
