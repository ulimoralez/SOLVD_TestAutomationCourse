package homework5.exceptions;

public class TooMuchStudyHours extends RuntimeException {
    @Override
    public String getMessage() {
        return "Wrong StudyHours: Physically and mentally impossible to be tath much";
    }
}
