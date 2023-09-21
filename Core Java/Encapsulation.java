class Human{

    /*
     * Binding member variable and member functions in a class
     * is called encapsulation
     * 
     */
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
    }
}
