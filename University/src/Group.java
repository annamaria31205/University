import java.util.List;

public class Group {

    String groupName;
    int course;
    List<Student> st;
    Teacher teacher;
    int yearOfGraduate;
    int yearOfStart;

    public Group(String groupName, int course, List<Student> st, Teacher teacher, int yearOfGraduate, int yearOfStart) {
        this.groupName = groupName;
        this.course = course;
        this.st = st;
        this.teacher = teacher;
        this.yearOfGraduate=yearOfGraduate;
        this.yearOfStart=yearOfStart;
    }

    @Override
    public String toString() {
        return this.groupName + " " + this.course + " " +this.st+" " + this.teacher.toString()+ this.yearOfGraduate+" "+ this.yearOfStart;
    }

    public void delete(Student student) {
        st.remove(student);
    }
    public void add(Student student) {
        st.add(student);

    }


}


