public class Main {
    
    public static void main(String args[]) {
        Show s = new Show();
        new Thread1(s);
        new Thread2(s);
        new Thread3(s);
        new Thread4(s);
    }
}
