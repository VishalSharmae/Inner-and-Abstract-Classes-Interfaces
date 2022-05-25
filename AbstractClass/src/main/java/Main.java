
//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

//The abstract keyword is a non-access modifier, used for classes and methods:

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

//Difference Between Abstract class and Interface class

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Mango");
        dog.breathe();
        dog.eat();
        System.out.println();

        Parrot parrot = new Parrot("Green Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        System.out.println();

        Penguin penguin = new Penguin("Atlantic Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }

}
