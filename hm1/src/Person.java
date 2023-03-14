public class Person {
    public String fullName;
    public Sex sex;

    public Person(String fullName) {
        this.fullName = fullName;
        this.sex = Sex.none;
    }

    public Person(String fullName, Sex sex) {
        this.fullName = fullName;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

}
