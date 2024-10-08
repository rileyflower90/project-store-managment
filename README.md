# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

![alt text](<Screenshot 2024-10-07 at 10.10.02 PM.png>)


## Description

For my project, I decided to make a fast food restaurant business. The items that I am selling are burgers and fries. I chose to do this topic because I love cheeseburgers and french fries, and they are one of my favorite foods. In my project, in order to represent the item from my store was inheritance, constructor, user input, boolean, integer, and String. The inheritance allowed me to create new classes (subclass) that can inherit behaviors from an already exisitng class called a superclass. For example, my subclass was the Fast Food, whereas the burgers were the superclasses. Constructing helped me initialize my objects, and they were either a no-argument or parameterized constructor. For instance, the name, price, and whether it's a main dish were my constructor of the burger and fries. And for my instance variables, there were boolean, integer, and string. The boolean was used for things like whether or not it was a main dish (isMainDish), the integer was used for the price of things (price), and the String was used for the name of the item like "Hamburger", or "Cheeseburger". Because my project had user input, some of the interactions included: 

#### Q: "What Burger would you like? (Hamburger/CheeseBurger)"

R: The name of the burger.

#### Q: "How much is the burger? ($)"

R: A double representing the price.

#### Q: "Is the burger the main dish? (true/false)"

R: A boolean indicating if it's the main dish.

#### Q: "How many patties does the burger have?"

R: An integer for the number of patties.

This user input is used to output information from my store in the console by the toString methods for both the Burger and Fries classes. This makes sures that the display is clear based on the user's choices.
