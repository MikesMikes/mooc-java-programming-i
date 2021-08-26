
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        
        String sender = "John";
        String msg = "A message";
        
        MessagingService sv = new MessagingService();
        Message message = new Message(sender, msg);
        
        sv.add(message);
        System.out.println(sv.getMessages());
        
    }
}
