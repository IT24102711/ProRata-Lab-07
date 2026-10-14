public class IT24102711Lab7Q2B {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // Loop for numbers 1 to 5
            System.out.print(i + " - ");  // Print the number
            for (int j = 1; j <= i; j++) {  // Loop to print stars
                System.out.print("* ");
            }
            System.out.println();  // Move to next line
        }
    }
}
