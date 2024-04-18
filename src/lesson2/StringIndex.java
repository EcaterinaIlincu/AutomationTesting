package lesson2;

public class StringIndex {
    public StringIndex() {
    }

    public static void main(String[] args) {
        String phrase = "I love Java";
        System.out.println("The letter under index 4 is: " + phrase.charAt(4));
        System.out.println("The letter under index 4 is: " + phrase.indexOf(74));
        phrase = phrase.concat(" and QA Automation");
        boolean isString = phrase instanceof String;
        System.out.println(isString);
    }
}