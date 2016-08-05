package previousTeams;

public class TestMain {
    public static void main(String[] args) {
        Rack r = new Rack ("AWQER T");
        //Word w = new Word ("awesome");
        //System.out.println (w.computePoints());
        System.out.println (r.getBestLegalWord());
    }
}
