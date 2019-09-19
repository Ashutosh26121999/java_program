public class error3
{
    public static void main(String[] args) {
        try {
            int data=50/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        int invalid=0;
        int num,count=0;
        for (int i =0;i<args.length;i++)
        {
            try{
                num=Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e)
            {
                invalid = invalid+1;
                System.out.println("invalid number:"+args[i]);
                continue;
            }
            count=count+1;
        }
        System.out.println("Valid number="+count);
        System.out.println("INvalid number="+invalid);
    }
}
