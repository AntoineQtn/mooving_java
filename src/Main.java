/**
 * import of the Scanner class in order to read console prompts
 */

import java.util.Scanner;

/**
 * The main class of the program in Java
 */
public class Main {

    /**
     * the main function of the program, its entry point
     *
     * @param args it takes as parameters an array of string in order to receive the arguments during execution
     */
    public static void main(String[] args) {

        // Calling the "Hello()" method of the "HelloWorld" class
        HelloWorld.Hello();

        // instanciation of a Scanner called "console" that reads the users prompts from the "System.in" which is here the keyboard input
        Scanner console = new Scanner(System.in);

        // Use of the getInt method in order to process the two user's inputs and store them in two different variables
        int totalBoxes = getInt(console, "Saisir le nombre de cartons : ");
        int truckCapacity = getInt(console, "Saisir la capacité du camion : ");

        //variable declaration with its type and an initial value set to 1
        int journey = 1;

        // "while" loop that goes from the value of "totalBoxes" until 0
        while (totalBoxes > 0) {
            //Calling the "Math.min()" method with our two variables as parameters in order to compare and keep the tiniest value
            //the tiniest value is stored in "boxesPerJourney
            int boxesPerJourney = Math.min(totalBoxes, truckCapacity);
            //printing the variable dynamically into the message using the displayMessage method
            displayMessage("Un voyage de " + boxesPerJourney + " cartons");
            //decreasing the value of totalBoxes by the boxesPerJourney at each loop
            totalBoxes -= boxesPerJourney;
            //increasing the value of journey at each loop
            journey++;
        }

        // printing at the end of the loop the final value of "journey"
        displayMessage("Il y a " + journey + " voyages");
    }

    /**
     * Ask the user to type an int into the console.
     * If the input is not an int, the user is asked again by throwing a message.
     *
     * @param console Scanner use to read the user input.
     * @param message Message sent to the user.
     * @return the int typed by the user.
     */
    private static int getInt(Scanner console, String message) {
        //infinite for loop
        for (; ; ) {
            //the message to the user is repeated as long as he does not enter an int
            displayMessage(message);
            //using the Scanner method "hasNextInt()" witch verified if the input is an int
            if (console.hasNextInt()) {
                //return of the method "nextInt()" of our instance of Scanner; this method takes the user input as an int
                //the return makes the loop stop if the input is correct
                return console.nextInt();
            } else {
                //if the intput is not an int, the message is print
                displayMessage("Veuillez entrer un nombre entier !");
                //the wrong answer is ignore and the loop started again
                console.next();
            }
        }
    }

    /**
     * Method use to centralize printing message
     * @param message string to print.
     */
    public static void displayMessage(String message) {
        System.out.println(message);
    }

}
