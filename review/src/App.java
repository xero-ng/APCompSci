public class App {
    public static void main(String[] args) throws Exception {
        String alpha = new String("APCS");

String beta = new String("APCS");

String delta = alpha;

System.out.println(alpha.equals(beta));

System.out.println(alpha == beta);

System.out.println(alpha == delta);
    }
}
