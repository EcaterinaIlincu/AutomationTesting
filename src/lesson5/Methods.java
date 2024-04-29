package lesson5;

public class Methods {
    public static void main(String[] args) {
        getText("QA", 1);
        Methods test = new Methods();
        test.test();

    }


    static void getText(String position, int ani){
        System.out.println("I am " + position + " cu experienta " + ani + " ani");
    }

    void test(){
        System.out.println("Test");
    }



}
