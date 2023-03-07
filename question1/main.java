package question1;
interface Compare{
    boolean parameter(int a,int b);
}
interface increment{
    int paramenter(int a);
}
interface concat{
    String parameter(String str1,String str2);
}
interface upperCase{
    String parameter(String str);
}
public class main {
    public static void main(String[] args) {
        Compare p=(a,b)->{
            if(a>b) return true;
            else return false;
        };
        System.out.println(p.parameter(6,4));

        increment l=(a)->{
            int c = a+1;
            return c;
        };
        System.out.println(l.paramenter(7));
        concat c=(str1,str2)->{
            String str3=str1+str2;
            return str3;
        };
        System.out.println(c.parameter("tarundeep","singh"));
        upperCase b=(str1)->{
            String str2= str1.toUpperCase();
            return str2;
        };
        System.out.println(b.parameter("tarundeep"));

    }
}
