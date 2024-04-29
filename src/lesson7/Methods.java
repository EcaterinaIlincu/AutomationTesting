package lesson7;

public class Methods {
    public static void main(String[] args) {

       checkBalanceOfCustomer("135679876543", 0);
    }


    static void checkBalanceOfCustomer(String idnp, double balance){
       if (balance>5000){
           System.out.println("For this idnp: " + idnp + "credit is approved");
       }
       else {
           System.out.println("For this idnp: " + idnp + "credit is not approved");
       }

    }
}
