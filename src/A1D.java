public class A1D {
    public static void main(String[] args)
    {
        int a[]= new int[5];
       a[0]=4;
       a[1]=14;
       a[2]=24;
       a[3]=34;
       a[4]=44;
       for (int i=0;i<5;i++)
       {
           System.out.println(" ");
           System.out.println("1D array values="+a[i]);
        }
        int b[] = {12,1,2,3,4,22};
        for (int j=0;j<6;j++)
        {
            System.out.println(" ");
            System.out.println("1D array values with second method ="+b[j]);
        }

    }
}
