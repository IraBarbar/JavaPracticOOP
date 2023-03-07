public class Program {
    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[3];
        Pupil junior = new Junior("Ivanov", "Alex", 1, 'A');
        Pupil midle = new Midle("Petrova", "Irina", 6, 'C');
        Pupil senior = new Senior("Pushkin", "Mike", 10, 'B');
        pupils[0] = junior;
        pupils[1] = midle;
        pupils[2] = senior;
        getInfo(pupils);
    }

    public static void getInfo(Pupil[] pupils) {
        for (Pupil pupil : pupils) {
            System.out.printf(pupil.getClass().getSimpleName());
            System.out.println(pupil.toString());
            pupil.study();
            if (pupil instanceof Play)
                ((Play) pupil).play();
            if (pupil instanceof Smoke)
                ((Smoke) pupil).smoke();
            if (pupil instanceof Love) 
                ((Love)pupil).love();
            if (pupil instanceof Go) 
                ((Go)pupil).goExtension();
            System.out.println();
        }
    }
}