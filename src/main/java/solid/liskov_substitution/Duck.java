package solid.liskov_substitution;

public class Duck implements Bird{
    public void fly() {
        System.out.println("Duck is flying");
    }

    public void walk() {
        System.out.println("Duck is walking");
    }
}
