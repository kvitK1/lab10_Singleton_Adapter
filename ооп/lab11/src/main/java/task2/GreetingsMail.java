package task2;

public class GreetingsMail implements MailCode{
    private static String TEMPLATE = "Talon! %NAME didn't get 60 points in OOP course!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
