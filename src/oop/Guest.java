public class Guest extends Person {

    public Guest(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Guest Name: " + getName() + ", Age: " + getAge());
    }
}
