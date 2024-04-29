package lesson8;

public class Employee {

    public String name;
    public String lastname;
    public String position;
    private long salary;
    public String maritalStatus;
    private long idnp;
    public long phoneNumber;
    public char gender;

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setIdnp(long idnp) {
        this.idnp = idnp;
    }

    public long getIdnp() {
        return idnp;
    }

    public void writeCode(String programmingLanguage){
        System.out.println(programmingLanguage);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", idnp=" + idnp +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}';
    }
}
