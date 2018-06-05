//
// HelloWorld.java
// HelloWorld
//

package at.davidwalter;

public class Main {

    private String message;

    Main(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        Main main = new Main("Hello World!");
        main.print();
    }
}
