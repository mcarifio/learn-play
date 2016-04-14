import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * A class to represent a team and its roster.  It needs data members
 * for the name of the team, which will be String w/o embedded blanks,
 * for example, RedSox, BlueJay, Yankees, and WhiteSox, and a Java
 * Collection class for the players on the team.
 * <p>
 * You may use either a List member or a Map member for the
 * players.  You can set up the Map to lookup players by number,
 * which is more efficient than iterating over a list of players,
 * but the lists are not long, so either can work.
 * <p>
 * <p>
 * You must define
 * <p>
 * 1. a public constructor that takes a name and a list of
 * Player objects(which will be invoked by the League class constructor).
 * <p>
 * public Team(String tname, List<Player> roster)
 * <p>
 * and creates an instance for that team.  You could use some collection other
 * than alist, even a Map object if you wish, but the League will accumulate
 * the player data from the file it reads into the collection to hand to the
 * Team constructor.
 * <p>
 * We recommend that you define also the following methods.
 * <p>
 * 2. a public method
 * <p>
 * String  lookupPlayer(int n)
 * <p>
 * that returns the appropriate one of the following two results
 * (assuming t is the name of this team)
 * <p>
 * No player with number n is on the roster for the t.
 * <p>
 * The t's Player n is a ...
 * <p>
 * as discussed in the assignment.  You can use the toString method of
 * the player.
 * <p>
 * 3. a public method
 * <p>
 * String calcPitchingStats()
 * <p>
 * that returns the appropriate choice from the following two
 * results(assuming t is the name of the team)
 * <p>
 * The t appear to have no pitchers at this time.
 * <p>
 * There are c pitchers on the t ...
 * <p>
 * as described in the assignment, with c the actual count.
 * <p>
 * <p>
 * 4. code a public method
 * <p>
 * String calcHittingStats()
 * <p>
 * that returns the appropriate choice from the following two
 * results(assuming t is the name of the team)
 * <p>
 * The t appear to have no hitters at this time.
 * <p>
 * There are c hitters on the t ...
 * <p>
 * as described in the assignment, with c the actual count.
 * <p>
 * <p>
 * If you do the extra credits, you will need to define additional methods.
 * Note, all data members should be private, so only the Team object instance
 * can directly access them.
 ***/

public class Team {

    private List<Player> roster = new ArrayList<Player>();

    public Team(Scanner s) {
        while(s.hasNext()) {
            // read a pair of lines
            int number = s.nextInt();
            if (number == -1) return; // roster complete
            String name = s.next();
            int position = s.nextInt();
            boolean throwsRightHanded = s.next() == "t"; // isn't a boolean
            int plate_appearance = s.nextInt();
            int walks = s.nextInt();
            int strikeouts = s.nextInt();
            int hits = s.nextInt();

            if (position == 1) {
                int innings_pitched = s.nextInt();
                int earned_runs = s.nextInt();
                Pitcher p = new Pitcher(name, innings_pitched, earned_runs);
                this.roster.add(p);
            } else if (position > 1 && position < 10) {
                int at_bats = s.nextInt();
                int runs_batted_in = s.nextInt();
                int home_runs = s.nextInt();
                int hit_by_pitch = s.nextInt();
                PositionPlayer p = new PositionPlayer(name, at_bats,runs_batted_in, home_runs, hit_by_pitch);
                this.roster.add(p);
            } else {
                throw new Error("Position " + position + " unknown.");
            }
        }
    }

}