public class Convert {

    public static final double MM_IN_INCH = 25.4;
    public static final double MM_IN_FOOT = 304.8;
    public static final double MM_IN_YARD = 914.4;
    public static final double MM_IN_MILE = 1609344;

    public static double cm2inches(double cm) {

        return cm * 0.393;
    }

    public static double m2feet(double m) {

        return m * 3.281;
    }

    public static double m2inch(double m) {

        return m * 1.094;
    }

    public static double km2miles(double km) {

        return km * 0.621;

    }
}

