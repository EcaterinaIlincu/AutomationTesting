package lesson8;

public class QAAutomation extends Employee {
    public static void main(String[] args) {
        QAAutomation Lucia = new QAAutomation();
        Lucia.name = "Lucia";
        Lucia.lastname = "L";
        Lucia.gender = 'F';
        Lucia.position = "QA Automation";
        Lucia.maritalStatus= "Married";
        Lucia.phoneNumber = 603447477474l;
        Lucia.setSalary(45543244l);
        Lucia.setIdnp(343323442234l);

        System.out.println("Name: " + Lucia.name +" "+ "Last name: " + Lucia.lastname + " " + "Gender: " + Lucia.gender + " "
                + "Position:" + " " + Lucia.position + " Marital status: " + Lucia.maritalStatus + " Phone number: " +
                Lucia.phoneNumber + " Salary: " + Lucia.getSalary() + " IDNP: " + Lucia.getIdnp());


      Lucia.writeCode("Java");

      QAAutomation Grigore = new QAAutomation();
      Grigore.name = "Grigore";
      Grigore.lastname = "G";
      Grigore.gender = 'M';
      Grigore.position = "Developer";
      Grigore.maritalStatus = "Divorced";
      Grigore.phoneNumber = 564745665676l;
      Grigore.setSalary(65667456645l);
      Grigore.setIdnp(434553345345l);

      //to display all values for object Grigore using toString
        System.out.println(Grigore);

      if (Grigore.getSalary() > Lucia.getSalary()){
          System.out.println("Salary of Grigore: " + Grigore.getSalary() + " is bigger than salary of Lucia: " + Lucia.getSalary());
      }
      else{
          System.out.println("Salary of Lucia: " + Lucia.getSalary() + " is bigger than salary of Grigore: " + Grigore.getSalary());
      }

    }



}
