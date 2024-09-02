import java.util.Scanner;

class GettingGreater {
    public static void main(String[] args) {
        System.out.println("Getting the Greater Value");
        Scanner myObj = new Scanner (System.in);

        char char1, char2;
        System.out.print("Enter the first character: ");
        char1 = myObj.next().charAt(0);
        System.out.print("Enter the second character: ");
        char2 = myObj.next().charAt(0);

        myObj.close();

        char greaterChar;
        if (char1 > char2) {
            greaterChar = char1;
        } else {
            greaterChar = char2;
        }

        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println("-------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + " : " + (int) char1);
        System.out.println(char2 + " : " + (int) char2);
    }
}