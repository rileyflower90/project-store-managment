import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

/*
* Instantiates Burger Object
*/ 
Burger newBurger = new Burger();

//Get Size Input with Scanner Objects
System.out.println("What Burger would you like? (Hamburger/CheeseBurger");
String userName = input.next();
newBurger.setName(userName);

//Get Price Input with Scanner Object
System.out.println("How much is the burger? ($)");
double userPrice = input.nextDouble();
newBurger.setPrice(userPrice);

//Get isMainDish Input with Scanner Object
System.out.println("Is the burger the main dish? (true/false)");
boolean userIsMainDish = input.nextBoolean();
newBurger.setIsMainDish(userIsMainDish);

//Get hasCheese Input with Scanner Object
System.out.println("Does the burger have cheese? (true/false)");
boolean userHasCheese = input.nextBoolean();
newBurger.setHasCheese(userHasCheese);

//Get burgerPatties Input with Scanner Object
System.out.println("How many patties does the burger have?");
int userburgerPatties = input.nextInt();
newBurger.setBurgerPatties(userBurgerPatties);

//Burger Stats
System.out.println();
System.out.println("Burger Order");
System.out.println("Name: " + newBurger.getName());
System.out.println("Price: $" + newBurger.getPrice());
System.out.println("Is it the main dish?" + newBurger.getIsMainDish());
System.out.println("Does it have cheese?" + newBurger.getHasCheese());
System.out.println("How many burger patties?" + newBurger.getBurgerPatties());
System.out.println();



    
    
    
    
    
    
    
    
    
/*
* Instantiates Fries Object
*/
Fries newFries = new Fries();

//Get size Input with Scanner Object
System.out.println("What fries would you like? (Plain/Animal Style");
String friesName = input.next();
newFries.setName(friesName);

//Get Price Input with Scanner Object
System.out.println("How much are the fries? ($)");
double friesPrice = input.nextDouble();
newFries.setPrice(friesPrice);
  
//Get isMainDish Input with Scanner Object
System.out.println("Are the fries a main dish? (true/false)");
boolean friesIsMainDish = input.nextBoolean();
newFries.setIsMainDish(friesIsMainDish);

//Get isAnimalStyle Input with Scanner Object
System.out.println("Are the fries animal style? (true/false)");
boolean userIsAnimalStyle = input.nextBoolean();
newFries.setIsAnimalStyle(userisAnimalStyle);

//Get fryScoops Input with Scanner Object
System.out.println("How many fry scoops does the dish have?");
int userFryScoops = input.nextInt();
newFries.setFryScoops(userFryScoops);

//Matcha Stats   
System.out.println();
System.out.println("Fries Order");
System.out.println("Name: " + newFries.getName());
System.out.println("Price: $" + newFries.getPrice());
System.out.println("Is it the main dish?" + newFries.getIsMainDish());
System.out.println("Is it animal style?" + newFries.getIsAnimalStyle());
System.out.println("How many fry scoops?" + newFries.getFryScoops());
System.out.println();


//Original Values
System.out.println("Default Fast Foods");
fastFood f1= new fastFood();
System.out.println(f1);
fastFood f2 = new fastFood("Hamburger", 4.20, true);
System.out.println(f2);

Burger b1 = new Burger("Cheeseburger", 4.75, true, true, 1);
System.out.println(b1);

Fries r1 = new Fries("Plain", 3.25, false, false, 1);
System.out.println(r1);



//Closes the Scanner Object
input.close();

  }
}