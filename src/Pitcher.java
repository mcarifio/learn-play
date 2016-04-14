/***
 * A class to represent the pitchers on a team.
 * <p>
 * <p>
 * You must
 * <p>
 * 1. define private data members for the additional
 * attributes that are specific to pitchers,
 * essentially a few additional statistics
 * 2. define a public constructor to take values for all the
 * inherited and local data members, which sets their
 * data members' values to the parameter values
 * 3. define public getters for the count data members to be
 * used in calculating aggregate statistics for the the team's
 * pitching
 * 4. define a public toString method that produces a
 * String in the format needed for the lookup method of
 * Team
 * <p>
 * Player number n is a h-handed pitcher named nm and has statistics
 * PA: k BB: m SO: p H: q IP: r ER: s ERA: x WHIP: y
 * <p>
 * as discussed in the program assignment.  For examples,
 * <p>
 * Player number 51 is a left-handed pitcher named Edwin and has statistics
 * PA: 392 BB: 32 SO: 64 H: 82 IP: 73 1/3 ER: 36 ERA: 4.19 WHIP: 1.47
 * <p>
 * Player number 11 is a right-handed pitcher named Clay and has statistics
 * PA: 418 BB: 32 SO: 63 H: 105 IP: 80 ER: 37 ERA: 4.15 WHIP: 1.71
 * <p>
 * If you do extra credits, you may need to define more methods, but
 * all data members must be private, so only object instances can
 * directly access them.
 ***/
public class Pitcher extends Player {

    private String name;
    private int innings_pitched;
    private int earned_runs;
    double earned_run_average;
    double whip;

    public Pitcher(String name, int innings_pitched, int earned_run_average) {
        this.name = name;
        this.innings_pitched = innings_pitched;
        this.earned_run_average = earned_run_average;
    }
    // method to convert thirds of an inning to a string
// showing the integer and thirds, for example,  20
// would become "6 2/3"
    private static String convertIPtoStr(int thirds) {

        int
                ipQuo = thirds / 3,
                ipRem = thirds % 3;

        String ipS;

        if (ipQuo == 0)
            if (ipRem == 0)
                ipS = "0";
            else
                ipS = "" + ipRem + "/3";
        else if (ipRem == 0)
            ipS = "" + ipQuo;
        else
            ipS = "" + ipQuo + ' ' + ipRem + "/3";

        return ipS;
    }

/// so you need to declare the additional data members; you don't have to 
/// include ERA and WHIP, since they can be calculated on the fly, but you 
/// need innings pitched and earned runs, minimally;

/// you need a constructor that takes all the values for a pitcher; it will
/// have to call the Player constructor; you should have models of this from
/// the earlier labs that had Poem, Novel, etc.

/// the class will inherit the getters for the Player class data members,
/// but you will need some for the innings pitched and earned runs;

/// it's not hard to calculate the values for the toString method, but you
/// will need to format the doubles to control the number of digits after 
/// the decimal point. define the toString method

/// these aren't terribly complicated algorithms; you do need to be careful 
/// NOT to divide by 0 for the ERA and WHIP.  And don't forget that the
/// innings pitched count values are actually third of an inning.

    public static void main(String[] args) {

        System.out.println("20 thirds becomes " + convertIPtoStr(20) +
                "\n21 thirds becomes " + convertIPtoStr(21) +
                "\n22 thirds becomes " + convertIPtoStr(22) +
                "\n2 thirds becomes " + convertIPtoStr(2) +
                "\n0 thirds becomes " + convertIPtoStr(0));

    }


    public int getInnings_pitched() {
        return innings_pitched;
    }

    public int getEarned_runs() {
        return earned_runs;
    }


    public double getEarned_run_average() {
        return earned_run_average;
    }

    public void setEarned_run_average(double earned_run_average) {
        this.earned_run_average = earned_run_average;
    }

    public double getWhip() {
        return whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }


}