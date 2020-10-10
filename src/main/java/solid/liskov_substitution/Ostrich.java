package solid.liskov_substitution;

public class Ostrich implements Bird{
    public void fly() {
        throw new AssertionError("Ostriches dont fly");
    }

    public void walk() {
        System.out.println("Ostrich is walking");
    }
}
