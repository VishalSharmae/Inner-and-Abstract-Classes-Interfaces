public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Trying to fly, but I'm not very good at that!");
    }
}