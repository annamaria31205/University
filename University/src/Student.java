public class Student extends Person {
    String name;
    String lastname;
    int studentAge;
    Address address;

    public Student(String name, String lastname, int age, Address address) {
        this.name=name;
        this.lastname=lastname;
        this.studentAge =age;
        this.address=address;

    } public void setAddress(Address address) {
        this.address=address;
    }

    @Override
    public String toString() {
        return this.name + " "+ this.lastname + " "+ this.studentAge + " "+ this.address.toString();
    }

    public void setName(int countNum) {
    }
}
