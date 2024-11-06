
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();
        
        service.add(new Message("test", "123"));
        
        System.out.println(service.getMessages());
    }
}
