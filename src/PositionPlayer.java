/***
 * A class to represent non-pitcher position players.
 * <p>
 * You must
 * <p>
 * 1. define private data members for the additional
 * attributes that are specific to non-Pitcher players,
 * essentially additional hitting statistics
 * 2. define a public constructor to take values for all the
 * inherited and local data members, which sets their
 * data members' values to the parameter values
 * 3. define public getters for the count data members to be
 * used in calculating aggregate statistics for the
 * team's hitting
 * 4. define a public toString method that produces a
 * String in the format needed for the lookup method of
 * Team
 * <p>
 * Player number n is a h-handed pos named nm and has statistics
 * PA: k BB: m SO: p H: q AB: r BI: s HR: t HBP: u BA: x OBP: y
 * <p>
 * as discussed in the program assignment. Do not divide by 0!
 * <p>
 * For examples,
 * <p>
 * Player number 25 is a right-handed left fielder named Jackie and has statistics
 * PA: 608 BB: 53 SO: 92 H: 161 AB: 528 BI: 69 HR: 1 HBP: 5 BA: 0.305 OBP: 0.360
 * <p>
 * Player number 10 is a right-handed catcher named Ryan and has statistics
 * PA: 0 BB: 0 SO: 0 H: 0 AB: 0 BI: 0 HR: 0 HBP: 0 BA: n/a OBP: n/a
 * <p>
 * <p>
 * If you do extra credits, you may need to define more methods, but
 * all data members must be private, so only object instances can
 * directly access them.
 ***/


public class PositionPlayer extends Player {
    private String name;
    private int at_bats;
    private int runs_batted_in;
    private int home_runs;
    private int hit_by_pitch;
    private double batting_average;
    private double on_base_percentage;

    public PositionPlayer(String name, int at_bats, int runs_batted_in, int home_runs, int hit_by_pitch) {
        this.name = name;
        this.at_bats = at_bats;
        this.runs_batted_in = runs_batted_in;
        this.home_runs = home_runs;
        this.hit_by_pitch = hit_by_pitch;
    }

    public int getAt_bats() {
        return at_bats;
    }

    public int getRuns_batted_in() {
        return runs_batted_in;
    }

    public int getHome_runs() {
        return home_runs;
    }

    public int getHit_by_pitch() {
        return hit_by_pitch;
    }

    public double getBatting_average() {
        return batting_average;
    }

    public double getOn_base_percentage() {
        return on_base_percentage;
    }

    public void setBatting_average(double batting_average) {
        this.batting_average = batting_average;
    }

    public void setOn_base_percentage(double on_base_percentage) {
        this.on_base_percentage = on_base_percentage;
    }
}