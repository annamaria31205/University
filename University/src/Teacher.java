public class Teacher extends Person implements Comparable<Teacher> {
    String name;
    String lastname;
    int age;
    Address address;
    double money;

    public Teacher(String name, String lastname, int age, Address address, double money) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.money= money;
    }

    double salary = money+ 78.9;

    public void setSalary(double money) {
        double salary = money+ 78.9;
    }


    @Override
    public String toString() {
        return this.name + " " + this.lastname + " " + this.age + " " + this.address.toString() + " " + salary +" ";
    }


    @Override
    public int compareTo(Teacher o) {
        return this.lastname.compareTo(o.lastname);
    }
}
