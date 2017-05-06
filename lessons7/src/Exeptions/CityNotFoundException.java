package Exeptions;

public class CityNotFoundException extends NullPointerException {
    public CityNotFoundException(String s) {
        super(s);
    }
}
