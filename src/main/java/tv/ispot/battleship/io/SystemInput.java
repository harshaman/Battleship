package tv.ispot.battleship.io;

import org.apache.commons.lang3.StringUtils;
import tv.ispot.battleship.model.TwoDPlane;

import java.util.Random;
import java.util.Scanner;

public class SystemInput {

    /**
     * Takes user input for the current player's turn. The input is in the following format:
     * 'targetPlayerId targetXCoordinate targetYCoordinate'
     *
     * @return
     */
    public InputParams getInputFromSystem() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputParams;
        do{
            inputParams = StringUtils.split(input, " ");
        } while(inputParams.length!=3);

        return new InputParams(Integer.parseInt(inputParams[0]),
                new TwoDPlane(Integer.parseInt(inputParams[1]), Integer.parseInt(inputParams[2])));
    }

    /**
     * Takes a random input for the current player's turn, if the current player is a system bot.
     * The input is in the following format:
     * 'targetPlayerId targetXCoordinate targetYCoordinate'
     *
     * @return
     */
    public InputParams getRandomInput() {
        Random random = new Random();
        int[] inputParams={1, random.nextInt(11), random.nextInt(11)};
        System.out.println(String.format("Player 2 chose: targetPlayerId: %d, x: %d, y: %d",
                inputParams[0], inputParams[1], inputParams[2]));
        return new InputParams(inputParams[0], new TwoDPlane(inputParams[1], inputParams[2]));
    }
}
