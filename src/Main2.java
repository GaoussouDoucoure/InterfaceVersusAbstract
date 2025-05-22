// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A
{
    //	public abstract void show();
    //	public abstract void config();
    int age=44;            // final and static
    String area="Mumbai";  // final and static

    void show();
    void config();
}

interface X
{
    void run();
}
interface Y extends X  // an interface can extend another interface, so no Y has void run() as well
{

}

class B implements A,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }
    public void run()
    {
        System.out.println("running...");
    }
}

public class Main2 {
    public static void main(String[] args) {

        A obj;
        obj=new B();

        obj.show();
        obj.config();

        X obj1=new B();
        obj1.run();

        // obj1.show(); // this won't work because obj1 is made of X type and run() is in A interface not in X


        //   	A.area="Hyderabad";  // this will not work because all variables defined in interface are final

        System.out.println(A.area);

    }
}