/*
 * The board foot program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-24
 */

import java.util.Scanner;

public final class Main {
    private Main() {

    }

    /**
     * The function for the board foot program
     * @param width
     * @param height
     */
    static float BoardLength(final float width, final float height) {

        final int volume = 144;
        float length = volume / (width * height);
        return length;
    }

    /**
     * User Input
     * @param args
     */
    public static void main(final String[] args) {
        try {
            // Input for the width
            Scanner widthInput = new Scanner(System.in);
            System.out.println("Enter the width (inch): ");
            float userWidth = widthInput.nextFloat();

            // Input for the height
            Scanner heightInput = new Scanner(System.in);
            System.out.println("Enter the height (inch): ");
            float userHeight = heightInput.nextFloat();

            // Process
            float heightOfBoard = BoardLength(userWidth, userHeight);

            // Output
            System.out.println("The wood should be " +
                heightOfBoard + " inch(es) long.");

            // Invaild Input
        } catch (Exception e) {
            System.out.println("Invaild Input.");
        }
    }
}
