package homework5.exceptions;

public class InvalidYearsOfExperience extends RuntimeException {
    @Override
    public String getMessage() {
        return "Wrong years of experience: Impossible years of experience";
    }
}
