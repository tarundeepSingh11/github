package question2;
interface MyInterface{
    public void operation(int x,int y);
}

public class question2 {
    public void addSubtract(int x,int y){
        System.out.println("Addition: "+(x+y));
        System.out.println("Subtraction: "+(x-y));
    }
    public static void multiply(int x,int y){
        System.out.println("Multiply: "+ (x*y));
    }

    public static void main(String[] args) {
        MyInterface obj1=question2::multiply;
        obj1.operation(45,64);
        MyInterface myInt2=new question2()::addSubtract;
        myInt2.operation(87,45);
    }
}
