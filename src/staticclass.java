public class staticclass {
    static int s=0;


    static void m1()
    {
        System.out.println("this is m1 static method");

    }
    void count(int size)
    {

        int ns=0;
        int i=0;
        while (i<size)
        {
            System.out.println("s IS STATIC VARIBEL=="+s);
            s=s+1;
            System.out.println("ns IS STATIC VARIBEL=="+ns);
            ns=ns+1;
            i++;

        }
        System.out.println(s);
        System.out.println(ns);

    }

    public static void main(String[] args)
    {
        staticclass onb1= new staticclass();
        onb1.count(7);
        onb1.m1();
    }


}
