public class EnhanceNew {
    public static void main(String[] args) {
        System.out.println("20 Metres is " + EnhanceConvert.m2feet(20,true)+ " Feet.");
        System.out.println("4 Miles is " + EnhanceConvert.MM_IN_MILE * 4+ " Millimetres.");
        System.out.println("7 Cm is " + EnhanceConvert.cm2inches(7,false) + " Inches");
        System.out.println("10 Meters is " + EnhanceConvert.MM_IN_YARD / 1000 + " Yards");
    }
}