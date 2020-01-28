public class Method
{
    public static void main(String[] args)
    {
        System.out.println("add(10, 5) -> " + add(10, 5));
        System.out.println("select_bigger(10.01, 5.94) -> " + select_bigger(10.01, 5.94));
        System.out.println();
        
        double[] ary = {4, 6, 3, 7, 5};
        System.out.println("double[] ary = {4, 6, 3, 7, 5};");
        System.out.println("aryAve(ary) -> " + aryAve(ary));
        System.out.println();

        boolean[] maintf = makeBoolArray(5);
        System.out.println("boolean[] maintf = makeBoolArray(5);");
        System.out.println("maintf.length -> " + maintf.length);
        
    }

    public static int add(int x, int y)
    {
        return x+y;
    }

    public static double select_bigger(double x, double y)
    {
        return x > y? x:y;
    }

    public static double aryAve(double[] dAry)
    {
        double sum=0;
        for(int i=0; i<dAry.length; i++)
        {
            sum += dAry[i];
        }

        return sum/dAry.length;
    }

    public static boolean[] makeBoolArray(int size)
    {
        boolean[] tf = new boolean[size];
        return tf;
    } 
}