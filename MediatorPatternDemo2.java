import java.util.Date;
class ChatRoom {
 public static void showMessage(User user, String message){
 System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
 }
}
class User {
 private String name;
public String getName() {
 return name;
 }
public void setName(String name) {
 this.name = name;
 }
public User(String name){
 this.name = name;
 }
public void sendMessage(String message){
 ChatRoom.showMessage(this,message);
 }
}
public class MediatorPatternDemo2 {
 public static void main(String[] args) {
 User robert = new User("Robert");
 User john = new User("John");
 robert.sendMessage("Hi! John!");
 john.sendMessage("Hello! Robert!");
 }
}

/*
D:\41lab\sadp\11_prog_MediatorDesignPattern>javac MediatorPatternDemo2.java

D:\41lab\sadp\11_prog_MediatorDesignPattern>java MediatorPatternDemo2
Thu Jan 27 23:53:35 IST 2022 [Robert] : Hi! John!
Thu Jan 27 23:53:35 IST 2022 [John] : Hello! Robert!

D:\41lab\sadp\11_prog_MediatorDesignPattern>
*/
