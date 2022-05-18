package classObjectSample;

 

abstract class AbstractEg{
    abstract void Class1();
    abstract void Class2();
}

class Class3 extends AbstractEg{
    void Class1(){
        System.out.println("Class 1");
    }
    void Class2(){
        System.out.println("Class 2");
    }
    void Class3()
     {
        System.out.println(" Class 3");
    }
    class AbstractPen {
    public static void main(String args[])
    {
    	 Class3  c1 = new Class3();
    	  c1.Class1();
    	  c1.Class2();
    	  c1.Class3();
    	  
    	
    }
}
}
