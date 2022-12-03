import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MyClass {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("9bc9fde89de26f925321fa7f2032d17b", "49a96edbf5e3dd3fb7ab0a8c10566890", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "kvitoslava.kolodii@ucu.edu.ua")
                                        .put("Name", "Kvita"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "kateryna.koval@ucu.edu.ua")
                                                .put("Name", "Katia")))
                                .put(Emailv31.Message.SUBJECT, "Greetings from Kvitoslava.")
                                .put(Emailv31.Message.TEXTPART, "Katiaa")
                                .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger Kateryna, How are you?</h3><br />May the delivery force be with you!")
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}