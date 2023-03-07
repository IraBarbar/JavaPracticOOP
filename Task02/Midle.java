public class Midle extends Pupil implements Study, Play, Smoke  {
    /**
     * 
     * @param lastname
     * @param firstname
     * @param numClass
     * @param letterClass
     */
    public Midle(String lastname, String firstname, int numClass, char letterClass) {
        super(lastname, firstname, numClass, letterClass);
    }

    @Override
    public void study() {
        System.out.println("I hate to study!");
        
    }

    @Override
    public void play() {
        System.out.println("I play minecraft.");
        
    }

    @Override
    public void smoke() {
        System.out.println("I start smoking!");
        
    }
    
}
