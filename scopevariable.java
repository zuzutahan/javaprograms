public class ScopeOfVariables {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        {
            System.out.print(x + ", " + y);
        }
        {
            x = 18;
            System.out.print(" - " + x + ", " + y);
        }
        System.out.print(" - " + x + ", " + y);
    }
}
