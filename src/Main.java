/*

abstract class Computer
{
//	public void code()
//	{
//
//	}
	public abstract void code();
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer comp)
	{
		comp.code();
	}
}

public class Main {
    public static void main(String[] args) {
//        Laptop lap = new Laptop();
//        Desktop desk = new Desktop();

        Computer lap = new Laptop();
        Computer desk=new Desktop();

        Developer gaoussou = new Developer();
        gaoussou.devApp(lap);

    }
}
*/



interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }

}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, faster");
    }
}
class Developer
{
    //	public void devApp(Laptop lap)
    public void devApp(Computer comp)
    {
        comp.code();
    }
}

public class Main {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer gaoussou = new Developer();
        gaoussou.devApp(lap);
        System.out.println();
        gaoussou.devApp(desk);

    }
}