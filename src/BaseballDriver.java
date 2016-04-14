import java.util.*;
import java.io.*;

/***
 * Please put identifying information here and indicate it if you did
 * extra credit options.
 ***/


// The driver program for the third project.  You should only modify this code
// if you do some of the extra credits.

public class BaseballDriver {


    public static void main(String[] args) {

        Scanner
                f = null,
                stdIn = new Scanner(System.in);

        League AL = null;

        char command = ' ';

        String
                outputString = null,
                team = null;

        int playerNumber = 0;

        if (args.length == 0) {
            System.out.println("File name must be given on command line.");
            return;
        } else {
            try {
                f = new Scanner(new File(args[0]));
            } catch (Exception e) {
                System.out.println("Could not open the file.");
                return;
            }
            if (!f.hasNext()) {
                System.out.println("No data on file " + args[0]);
                return;
            }

            // create the League object from the file
            // Start here, create a league from
            AL = new League(f);

            System.out.println("Enter your command and any data it requires, or Q to quit.");
            command = stdIn.next().charAt(0);

            // process user commands until Q is entered
            while (command != 'Q') {

                switch (command) {

                    case 'L':   // lookup a player
                        team = stdIn.next();
                        playerNumber = stdIn.nextInt();
                        outputString = AL.lookup(team, playerNumber);
                        break;

                    case 'P':
                        team = stdIn.next();
                        outputString = AL.calcPitchingStats(team);
                        break;

                    case 'H':
                        team = stdIn.next();
                        outputString = AL.calcHittingStats(team);
                        break;

                    /***

                     // take out this comment if you implement the first extra credit

                     case 'U':
                     outputString = AL.update(stdIn);
                     break;

                     ***/

                    /***

                     // take out this comment if you implement the second extra credit

                     case 'A':
                     outputString = AL.calcHandednessStats();
                     break;

                     ***/

                    default:
                        outputString = "Unrecognized command.";
                        break;
                }
                System.out.println("\n" + outputString + "\nNext(Q to quit)?");
                command = stdIn.next().charAt(0);
            }
        }
    }
}



              




              
      

     


