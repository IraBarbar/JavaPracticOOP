public class Senior extends Pupil implements Study, Smoke, Love {

    public Senior(String lastname, String firstname, int numClass, char letterClass) {
        super(lastname, firstname, numClass, letterClass);
    }

    @Override
    public void study() {
        System.out.println("I must learn.");
        
    }

    @Override
    public void smoke() {
        System.out.println("I am quitting smoking.");
        
    }

    @Override
    public void love() {
        System.out.println("I am looking for love.");

    }
    
}
