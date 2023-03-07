package question3;
interface interface1 {
    default void display(){
        System.out.println("in the first interface");
    }
}
    interface interface2 extends interface1{
       default void display(){
            System.out.println("in the second interface");
        }
    }
interface interface3 extends interface1{
    default void display(){
        System.out.println("in the third interface");
    }
}


public class DefaultMethods implements interface2,interface3{
    public void display(){
        System.out.println("inside default method");
    }

    public static void main(String[] args) {
        DefaultMethods de=new DefaultMethods();
        de.display();
    }
}
