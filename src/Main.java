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
     *it takes as parameters an array of string in order to receive the arguments during execution
     */
    public static void main(String[] args) {

        /**
         *Calling the "Hello()" method of the "HelloWorld" class
         */
        HelloWorld.Hello();

        /**
        * variable declaration with its type and an initial value set to 1
        */
        int journey = 1 ;

        /*
        instanciation of a Scanner called "console" that reads the users prompts from the "System.in" which is here the keyboard input
        */

        Scanner console = new Scanner(System.in);

        /*
        Printing in the console the question to the user
         */
        System.out.print("Saisir Le nombre de cartons : ");
        /**
         * condition to stop the process and send a message to the user if he don't type an int
         * using the Scanner method "hasNextInt()" witch verified if the input is an int in an opoose way with the "!"
         * */
        if(!console.hasNextInt()){
            System.out.println("Veuillez entrer un nombre entier");
            /**
             * the "return" kills the process
             * */
            console.next();
        }
        /**
         * Calling the method "nextInt()" of our instance of Scanner; this method takes the user input as an int
        *The result is stored in the int variable "totalBoxes"
         * */
        int totalBoxes = console.nextInt();

        System.out.print("Saisir la capacité du camion : ");
        if(console.hasNextInt()){
            System.out.println("Veuillez entrer un nombre entier");
            console.next();
        }
        int truckCapacity = console.nextInt();


        /*
         *"while" loop that goes from the value of "totalBoxes" until 0
         */
        while(totalBoxes > 0){
            /**
             * Calling the "Math.min()" method with our two variables as parameters in order to compare and keep the tiniest value
            *the tiniest value is stored in "boxesPerJourney
             */
            int boxesPerJourney = Math.min(totalBoxes, truckCapacity);
            /*printing the variable dynamically into the message*/
            System.out.println("un voyage de " + boxesPerJourney + " cartons");
            /*decreasing the value of totalBoxes by the boxesPerJourney at each loop*/
            totalBoxes -= boxesPerJourney;
            /*increasing the value of journey at each loop*/
            journey++;
        }
        /*
        printing at the end of the loop the final value of "journey"
        */
        System.out.println("il y a " + journey + " voyages");
    }

}
