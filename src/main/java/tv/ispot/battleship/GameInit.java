package tv.ispot.battleship;

import lombok.Getter;
import org.apache.log4j.Logger;
import tv.ispot.battleship.constants.BattleshipConstants;
import tv.ispot.battleship.io.DefaultConsoleLogger;
import tv.ispot.battleship.io.SystemInput;
import tv.ispot.battleship.model.*;
import tv.ispot.battleship.strategy.DefaultChanceGenerationStrategy;
import tv.ispot.battleship.strategy.DefaultTurnStrategy;
import tv.ispot.battleship.strategy.DefaultWinnerStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Getter
public class GameInit {
    private static int gameMode;

    private static final Logger LOG = Logger.getLogger(GameInit.class);

    public static void main(String[] args) {

        final SystemInput inputParams = new SystemInput();
        List<Player> players = new ArrayList<>();
        Game game = new Game(
                players,
                new DefaultConsoleLogger(),
                new DefaultTurnStrategy(),
                new DefaultWinnerStrategy());
        System.out.println("Welcome to Battleship. Choose a game mode and type 'START' to play:");

        String start ="";
        boolean ready=false;
        Scanner scanner = new Scanner(System.in);

        do {
            if(!ready){
                System.out.println("MAIN MENU:");
                System.out.println("1. Play with Computer");
                System.out.println("2. Play with a human opponent");

                gameMode  = Integer.parseInt(scanner.nextLine());
                switch(gameMode) {
                    case 1: players.add(getPlayer(inputParams, 1));
                        System.out.println("Player 1: Ready");
                        players.add(getSysPlayer(inputParams, 2));
                        System.out.println("Bot: Ready");
                        ready=true;
                        System.out.println("Type 'START' and hit enter to start the game!");
                        start = scanner.nextLine();
                        break;
                    case 2: players.add(getPlayer(inputParams, 1));
                        System.out.println("Player 1: Ready");
                        players.add(getPlayer(inputParams, 2));
                        System.out.println("Player 2: Ready");
                        ready=true;
                        System.out.println("Type 'START' and hit enter to start the game!");
                        start = scanner.nextLine();
                        break;
                    default: System.out.println("You entered an invalid choice. Please try again!");
                }
            }

        } while(!start.equalsIgnoreCase("START"));
        game.startGame(gameMode);

    }

    /**
     *  Places ships on a bot player's board in a random order.
     *  Limitation/TODO: since the ships are placed randomly, there are chances that 2 ships' position may overlap.
     * @param inputParams
     * @param id
     * @return
     */
    private static Player getSysPlayer(SystemInput inputParams, int id) {
        System.out.println("Bot is laying out its ships...");

        final Boundary boardBoundary = new BoundaryImpl(new TwoDPlane(0, 10), new TwoDPlane(10, 0));
        ArrayList<Ship> ships = new ArrayList<>();

        for(int shipLen =2; shipLen<=5;shipLen++) {
            int shipLayout = getRandomInteger(BattleshipConstants.GameInitConstants.HORIZONTAL,
                    BattleshipConstants.GameInitConstants.VERTICAL+1);
            int x1,y1,y2,x2;
            switch (shipLayout) {
                case BattleshipConstants.GameInitConstants.HORIZONTAL:
                    y1 = getRandomInteger(1,11);
                    y2=y1-1;
                    do{
                        x1= getRandomInteger(1, 11);
                    }while(10-x1<shipLen);
                    x2 = (x1+ shipLen);
                    ships.add(new Ship(shipLen, new BoundaryImpl(new TwoDPlane(x1, y1), new TwoDPlane(x2,y2))));
                    break;

                case BattleshipConstants.GameInitConstants.VERTICAL:
                    x1= getRandomInteger(1, 11);
                    x2=x1+1;
                    y1 = getRandomInteger(1+shipLen,11);
                    y2 = y1- shipLen;
                    ships.add(new Ship(shipLen, new BoundaryImpl(new TwoDPlane(x1, y1), new TwoDPlane(x2,y2))));
                    break;
            }
        }

        //Prints the location of all the ships of the bot.
        for(Ship ship: ships){
            if(LOG.isDebugEnabled())
                LOG.debug(ship.getBoundary() + " " + ship.getLength());
        }
        Board board = new Board(ships, boardBoundary);

        return new Player( id, board, new DefaultChanceGenerationStrategy(inputParams));
    }

    /**
     * Returns a random integer value in the specified range.
     * @param low
     * @param high
     * @return
     */
    private static int getRandomInteger(int low, int high) {
        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return result;
    }

    /**
     *  Places ships on a user's player's board.
     *  Limitation/TODO: since the ships are placed randomly, there are chances that 2 ships' position may overlap.
     * @param inputParams
     * @param id
     * @return
     */
    private static Player getPlayer(SystemInput inputParams, int id) {
        final Boundary boardBoundary = new BoundaryImpl(new TwoDPlane(0, 10), new TwoDPlane(10, 0));
        ArrayList<Ship> ships = new ArrayList<>();

//        Scanner scanner = new Scanner(System.in);
//        int len=2;
//        for(int ship = 1;ship<=4;ship++) {
//            System.out.println(String.format("Coordinates [Topleft(x1,y1) and BottomRight(x2,y2)] for ship%d of length %d", ship, len));
//            int x1= scanner.nextInt();
//            int y1= scanner.nextInt();
//
//            int x2= scanner.nextInt();
//            int y2=scanner.nextInt();
//            ships.add(new Ship(len++, new BoundaryImpl(new TwoDPlane(x1, y1), new TwoDPlane(x2,y2))));
//
//        }
        //comment the lines 143-154 and uncomment the following lines of code to use the predefined values
        //predefined values for ships' position
        Ship ship1 = new Ship(4, new BoundaryImpl(new TwoDPlane(0, 7), new TwoDPlane(4,7)));
        Ship ship2 = new Ship( 3,new BoundaryImpl(new TwoDPlane(4, 1), new TwoDPlane(4,4)));
        Ship ship3 = new Ship(2,new BoundaryImpl(new TwoDPlane(7, 3), new TwoDPlane(7, 5)));
        Ship ship4 = new Ship(5, new BoundaryImpl(new TwoDPlane(4, 9), new TwoDPlane(9,9)));


        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);
        ships.add(ship4);

        Board board = new Board(ships, boardBoundary);

        return new Player( id, board, new DefaultChanceGenerationStrategy(inputParams));
    }
}
