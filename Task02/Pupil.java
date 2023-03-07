public abstract class Pupil {
    private String lastname;
    private String firstname;
    private int numClass;
    private char letterClass;

    public Pupil(String lastname, String firstname, int numClass, char letterClass) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.numClass = numClass;
        this.letterClass = letterClass;
    }

    public abstract void study();

    @Override
    public String toString() {
        return " " + lastname + " " + firstname + " " + numClass + "'"
                + letterClass + "'.";
    }
    
}
