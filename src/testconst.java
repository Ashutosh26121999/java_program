class test
{
        test()
        {
        System.out.println("defult constructer");

        }
        test(int a)
        {
        System.out.println("parametriz constructer "+a);
        }
        }
public class testconst extends test
{
    testconst()
    {
        super(5);
        System.out.println("this id child defult constructer");
    }

    public static void main(String[] args) {
        testconst ob1=new testconst();
        test ob2 =new test();
        test ob3 =new test(6);

    }
}
