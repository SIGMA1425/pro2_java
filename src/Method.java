public class Method
{
    public static void main(String[] args)
    {
        System.out.println("add(10, 5) -> " + add(10, 5));
        System.out.println("select_bigger(10.01, 5.94) -> " + select_bigger(10.01, 5.94));
    }

    public static int add(int x, int y)
    {
        return x+y;
    }

    public static double select_bigger(double x, double y)
    {
        return x > y? x:y;
    }
}