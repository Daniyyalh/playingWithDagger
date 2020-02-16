public class Rims {

    private final String rimType;

    public Rims(String rimType) {
        this.rimType = rimType;
    }

    public String getRimType() {
        return rimType;
    }

    @Override
    public String toString() {
        return "Rims{" +
                "rimType='" + rimType + '\'' +
                '}';
    }
}
