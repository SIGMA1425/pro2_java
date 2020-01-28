public class Ndarray
{
    public static void main(String[] args)
    {
        int two[][] = new int[4][];
        for(int i = 0; i<two.length; i++)
        {
            two[i] = new int[2];
            for(int j=0; j<two[i].length; j++)
            {
                two[i][j] = 2*i+j;
            }
        }

        for(int i=0; i<two.length; i++)
        {
            for(int j=0; j<two[i].length; j++)
            {
                System.out.print(two[i][j] + ", ");
            }
            System.out.println();
        }
    }
}