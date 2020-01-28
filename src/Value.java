public class Value
{
    public static void main(String[] args)
    {
        String hello = "Hello World";
        System.out.println(hello);
        
        int x = 10;
        int y = 20;
        System.out.println(x + y);

        int ary[] = new int[5];
        System.out.println(ary.length);

        for(int i=0; i<ary.length; i++)
        {
            ary[i] = i;
        }

        int i = 0;
        while(i < 5)
        {
            System.out.println(ary[i]);
            i++;
        }
    }
}