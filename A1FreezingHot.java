class A1FreezingHot extends ConsoleProgram {

    /**
     * Given two temperatures via user input, this code outputs true if one is less
     * than 0 and
     * the other is greater than 100.
     * 
     * @author: NJudd
     */

    public void run() {
        // initialize variables
        boolean blnOutput = false;

        // receive input
        int intTempA = readInt("Input a temperature: ");
        int intTempB = readInt("Input a second temperature: ");

        // calculate output
        if ((intTempA < 0) && (intTempB > 100)) {
            blnOutput = true;
        } else {
            blnOutput = false;
        }

        // output
        System.out.println(blnOutput);
    }
}
