package mpp.k0219.problem03;


public class FirstClass implements BoardingTime {

    Status status;

    public FirstClass(Status status) {
        super();
        this.status = status;
    }

    @Override
    public double computeBoardingTime() {
        switch (status) {
            case GOLD:
                return 1;
            case SILVER:
                return 5;
            default:
                return 10;
        }
    }
}
