package group5GitHub;

public class Fatma {
    public static void main(String[] args) {
        System.out.println("We will be good in GitHub ");


    }
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;
}}
