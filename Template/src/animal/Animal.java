package animal;

public abstract class Animal {

    public void eat() {
        System.out.println("eat");
    }

    public void run() {
        System.out.println("run");
    }

    public abstract void name();
}
