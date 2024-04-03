class B2GuessingGame extends ConsoleProgram {

    /**
     * Writes a program that lets the computer generate a secret number
     * to guess.
     * 
     * @author: NJudd
     */

    public void run() {
        // initializes varibles
        int intSecretNum = (int) (Math.random() * 100 + 1);

        while (true) 
        {
            // receive input
            int intGuess = readInt("Input your guess: ");

            // calculate output
            if (intGuess == intSecretNum) {
                break;
            } else if (intGuess < intSecretNum) {
                System.out.println("Too low, guess again");
            } else {
                System.out.println("Too high, guess again");
            }
        }
        // output
        System.out.println("Congradulations!");
    }
}
