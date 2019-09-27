public class EnhanceConvert {

    public static final double MM_IN_INCH = 25.4;
    public static final double MM_IN_FOOT = 304.8;
    public static final double MM_IN_YARD = 914.4;
    public static final double MM_IN_MILE = 1609344;
    public static final double rounding = 10;

    public static double cm2inches(double cm) {
        return Math.round(cm * 0.393 * Math.pow(rounding,2))/(Math.pow(rounding,2));
    }
    public static double cm2inches(double cm, boolean addUnit) {
        if (addUnit){
            return Math.round(cm * 0.393 * Math.pow(rounding,2))/(Math.pow(rounding,2));
        }else{
            return Math.round(cm * 0.393 * Math.pow(rounding,2))/(Math.pow(rounding,2));
        }
    }

    public static double m2feet(double m, boolean addUnit) {
        //return Math.round(m * 3.281*100.0)/100.0;
        //return Math.pow(rounding,2);
        return Math.round((m * 3.281) * Math.pow(rounding,2))/(Math.pow(rounding,2));
    }

    public static double m2inch(double m, boolean addUnit) {
        return Math.round(m * 1.094 * Math.pow(rounding,2))/(Math.pow(rounding,2));
    }

    public static double km2miles(double km, boolean addUnit) {
        return Math.round(km * 0.621 * Math.pow(rounding,2))/(Math.pow(rounding,2));

    }
}
