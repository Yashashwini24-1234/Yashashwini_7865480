interface Playable {

    // Abstract method
    void play();
}

class Guitar implements Playable {

    // Implementing play method
    @Override
    public void play() {

        System.out.println("Guitar is playing");
    }
}

class Piano implements Playable {

    // Implementing play method
    @Override
    public void play() {

        System.out.println("Piano is playing");
    }
}

public class InterfaceImplementation {

    public static void main(String[] args) {

        // Creating objects
        Guitar guitar = new Guitar();

        Piano piano = new Piano();

        // Calling methods
        guitar.play();

        piano.play();
    }
}