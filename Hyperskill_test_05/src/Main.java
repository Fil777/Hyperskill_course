public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (int i = 0; i < args.length; i+=2) {
            System.out.println(args[i]+"="+args[i+1]);
        }
    }
}