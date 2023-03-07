public class Junior extends Pupil implements Study, Play, Go {

    public Junior(String lastname, String firstname, int numClass, char letterClass) {
        super(lastname, firstname, numClass, letterClass);
    }

    @Override
    public void study() {
        System.out.println("I like study!");
    }

    @Override
    public void play() {
        System.out.println("I am plaing games.");;
    }
    
    @Override
    public void goExtension(){
        System.out.println("I go for an extension.");
    }

}
