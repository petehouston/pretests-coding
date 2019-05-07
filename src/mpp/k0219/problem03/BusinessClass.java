package mpp.k0219.problem03;


public class BusinessClass implements BoardingTime {
    Status status;

    public BusinessClass(Status status) {
        super();
        this.status = status;
    }

    @Override
    public double computeBoardingTime() {
        switch (status) {
            case GOLD:
                return 10;
            case SILVER:
                return 20;
            default:
                return 30;
        }
    }

}
