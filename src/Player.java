/***
 * The super class for the Pitcher and PositionPlayer classes that unifies them.
 * It implements the Comparable interface so that a Team's players can be sorted
 * by number.
 * <p>
 * You must
 * <p>
 * 1. define data members for the common data(always make data members private)
 * 2. define a constructor that initializes all data members to values given by
 * the constructor's parameters
 * 3. define getters for the data members that you need to produce the program
 * output
 * 4. IF YOU DO THE FIRST EXTRA CREDIT
 * define protected setters for the updateable data members(that is, for counts that
 * can change; you can assume no players are traded, so name and number and
 * position, and throwsRightHanded data members will not change)
 * <p>
 * <p>
 * All constructors and methods should be declared protected(or private, if they
 * are auxiliary).
 * <p>
 * IMPORTANT NOTE: ANY METHODS THAT YOU WANT TO BE PUBLIC IN BOTH PostionPlayer
 * and Pitcher, BUT WHICH REFERENCE DATA MEMBERS NOT PRESENT HERE SHOULD BE DEFINED
 * AS ABSTRACT METHODS.  You can give the code in the subclasses, and dynamic
 * dispatch will do the rest.  toString is an exception in that it is inherited
 * from Object, so it needs no declaration here.
 ***/
public abstract class Player implements Comparable<Player> {

    // useful to produce the string for the position
    protected static String[] numbersToPositions = {"", "pitcher",
            "catcher", "first baseman", "second baseman", "third baseman",
            "shortstop", "left fielder", "center fielder", "right fielder"};

    private int number;  // player's jersey number
    // this will distinguish players on the same
    // team

    // compares to Players by number
    public int compareTo(Player other) {
        return this.number - other.number;
    }

    // implement equals consistently with compareTo
    public boolean equals(Object other) {
        if (!(other instanceof Player))
            return false;
        else
            return number == ((Player) other).number;
    }

}
