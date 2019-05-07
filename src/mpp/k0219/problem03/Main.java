package mpp.k0219.problem03;


public class Main {

    public static void main(String[] args) {

        FirstClass fc = new FirstClass(Status.SILVER);
        BusinessClass bc = new BusinessClass(Status.GOLD);
        EconomyClass ec = new EconomyClass(441);
        BoardingTime[] objs = { fc, bc, ec };
        //expected output: 26.7
        System.out.println(Main.computeAverageBoardingTime(objs));

    }

    //Modify this code
    public static double computeAverageBoardingTime(BoardingTime[] objs) {
        double sum = 0;
        for (BoardingTime bc : objs) {
            sum += bc.computeBoardingTime();
        }
        return sum / objs.length;
    }
}
