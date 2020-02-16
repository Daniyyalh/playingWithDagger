import javax.inject.Inject;

public class Wheels {

    private Rims rims;

    @Inject
    public Wheels(Rims rims) {
        this.rims = rims;
    }


}
