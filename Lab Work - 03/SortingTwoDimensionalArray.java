public class SortingTwoDimensionalArray
{
    public static int[][] sort(int[][] m)
    {
        for(int i =0; i<m.length; i++)
        {
            for(int j =0; j<m.length-1; j++)
            {
                if(m[j][0] >m[j+1][0])
                {
                    int temp = m[j][0];
                    int temp1 = m[j][1];
                    m[j][0]= m[j+1][0];
                    m[j][1]= m[j+1][1];
                    m[j+1][0] = temp;
                    m[j+1][1] = temp1;
                }
                if(m[j][0] == m[j+1][0])
                {
                    if(m[j][1] >m[j+1][1])
                    {
                        int temp3 = m[j][1];
                        m[j][1] = m[j+1][1];
                        m[j+1][1] = temp3;
                    }
                }
            }
        }
        return m;
    }
    //Just a test
    public static void main(String[] args)
    {
        int[][] m = { {4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
        sort(m);
        System.out.printf("{ ");
        for(int i =0; i<m.length; i++)
        {
            System.out.printf("{");
            for(int j =0; j<m[i].length; j++)
            {
                System.out.printf("%d",m[i][j]);
                if(j!=m[i].length-1) System.out.printf(",");
            }
            System.out.printf("}");
            if(i!=m.length-1) System.out.printf(",");
        }
        System.out.printf(" }");
    }
}