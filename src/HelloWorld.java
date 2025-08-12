/**
 * the "Hello" method is
 *"public" which means that it's accessible from anywhere ( scope definition)
 *"static" which means that it don't need instanciation to be used
 *"void" is the typing return
 */
class HelloWorld {

    public static void Hello() {
        //Use of Main's displayMessage method that use the System.out.println() method
        Main.displayMessage("Hello, world!");
    }
}