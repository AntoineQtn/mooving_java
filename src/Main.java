//Le sujet est le suivant :
//Votre entreprise déménage dans de nouveaux locaux. Les cartons sont faits (34 cartons au total)
//et le camion de l’entreprise de déménagement arrive. Les déménageurs remplissent leur camion
//avec vos cartons. Le camion a une capacité de 9 cartons. Une fois le camion plein, ils rejoignent le
//nouveau local où ils déchargent vos cartons. Ils effectuent autant de voyages que nécessaire pour
//vider votre ancien local.
//Ce programme ne contiendra qu’une seule classe dont le seul but est l’exécution du point
//d’entrée (main).
//
//PRÉCISIONS
//Le nombre total de cartons et la contenance de chaque camion seront donnés comme valeurs « en
//dur »
// L’objectif du programme est d’afficher (dans la console) pour chaque voyage effectué le message :
//        “un voyage de x cartons”.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {

    public static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, world!");
        }
    }

    public static void main(String[] args) {
        int totalBoxes = 34;
        int truckCapacity = 9;

        int remainingBoxes = totalBoxes;
        int journey = 1 ;

        while(remainingBoxes > 0){
            int boxesPerJourney = Math.min(remainingBoxes, truckCapacity);
            System.out.println("un voyage de " + boxesPerJourney + " cartons");
            remainingBoxes -= boxesPerJourney;
            journey++;
        }

        System.out.println("il y a " + journey + " voyages");
    }

}