package task2;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "Happy Birthday, %NAME! We have a present for you!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
