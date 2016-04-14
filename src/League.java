/***
 * A class to hold a number of team rosters for the teams of a league.
 * <p>
 * You must use a Map data member to hold the Team objects, either a HashMap
 * or a TreeMap may be used.
 * <p>
 * You must
 * <p>
 * 1. code a constructor that takes a Scanner object and which loads
 * the Map data member with the collection of Team objects from the file given
 * by the Scanner.  File format is discussed in the assignment.
 * <p>
 * 2. code a public method
 * <p>
 * String lookupPlayer(String t, int n)
 * <p>
 * that returns the appropriate choice from the following three results
 * <p>
 * No team named t is in the league.
 * <p>
 * No player with number n is on the roster for the t.
 * <p>
 * <player stats for player n of team t>
 * <p>
 * where the format of the last is given in the program assignment.
 * <p>
 * 3. code a public method
 * <p>
 * String calcPitchingStats(String t)
 * <p>
 * that returns the appropriate choice from the following three results
 * <p>
 * No team named t is in the league.
 * <p>
 * The t appear to have no pitchers at this time.
 * <p>
 * <pitching stats for t>
 * <p>
 * where the format of the last is given in the program assignment.
 * <p>
 * 4. code a public method
 * <p>
 * String calcHittingStats(String t)
 * <p>
 * that returns the appropriate choice from the following three results
 * <p>
 * No team named t is in the league.
 * <p>
 * The t appear to have no hitters at this time.
 * <p>
 * <hitting stats for t>
 * <p>
 * where the format of the last is given in the program assignment.
 * <p>
 * <p>
 * The other two methods are extra credit options that you may do if
 * you wish.  Consult the program assignment for their headers and
 * specifications.
 ***/

import java.util.*;

public class League {

    // a league is composed of named teams
    private Map<String, Team> league = new HashMap<String, Team>();

    public League(Scanner s) {
        // for each team, read its name, e.g. 'RedSox' and its Team (sequence of players)
        while (s.hasNext()) {
            String name = s.next();
            Team team = new Team(s);
            if (this.league.containsKey(name)) {
                throw new Error(name + " appears multiple times.");
            } else {
                this.league.put(name, team);
            }
        }
    }


    public String lookup(String t, int pn) {
        return "lookup stub";
    }

    public String calcPitchingStats(String t) {

        return "pitching stub";
    }

    public String calcHittingStats(String t) {

        return "hitting stub";
    }

    // the first extra credit option
    public String update(Scanner sin) {

        return "update stub";
    }

    // the second extra credit option
    public String calcHandedness() {

        return "handedness stub";
    }

}