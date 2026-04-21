public class Administrator extends Person {
    private String role;

    public Administrator() {}

    public Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void displayInfo() {
        System.out.println("Administrator Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("---------------------");
    }
}
