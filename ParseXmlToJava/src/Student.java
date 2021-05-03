public class Student {

    private String id;
    private String firstname;
    private String surname;
    private String subject;
    private String marks;

    public Student() {
    }

    public Student(String id, String firstname, String surname, String subject, String marks) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.subject = subject;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", subject='" + subject + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
