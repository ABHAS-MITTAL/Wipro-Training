package day3_programs;


class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
 
 void sleep() {
     System.out.println("This animal sleeps.");
 }
}

class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}


public class InheritanceExample {
 public static void main(String[] args) {
     Dog myDog = new Dog();

     myDog.eat();
     myDog.sleep();

     myDog.bark();
 }
}
