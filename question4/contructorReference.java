package question4;
interface messages{
    Message getMessage(String msg);
}
class Message{
    Message(String str){
        System.out.print(str);
    }
}
public class contructorReference {
    public static void main(String[] args) {
        messages hello = Message::new;
        hello.getMessage("Tarundeep");
    }
}
