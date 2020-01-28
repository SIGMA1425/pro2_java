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

        int three[][][] = new int [5][][];
        for(int i = 0; i<three.length;i++)
        {
            three[i] = new int[4][];
            for(int j=0; j<three[i].length; j++)
            {
                three[i][j] = new int [3];
                for(int k=0; k<three[i][j].length; k++)
                {
                    three[i][j][k] = 3*i+2*j+k;
                }
            }
        }

        for(int i=0; i<three.length; i++)
        {
            for(int j=0; j<three[i].length; j++)
            {
                for(int k=0; k<three[i][j].length; k++)
                {
                    System.out.print(three[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}