public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("o1",15,100,85,30);
        Fighter f2 = new Fighter("o2",20,100,95,30);

        Match match = new Match(f1,f2,85,100);
        match.run();

    }
}