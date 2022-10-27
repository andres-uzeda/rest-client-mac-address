import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class ClientRestApproach {
    private static HttpURLConnection connection;
    public static String RequestMacAddress(String mac){
        try {
            String urlToSearch = "https://api.macaddress.io/v1?apiKey=at_efCbcyWPO2pw2klWoXaegDDBqpbNb&output=json&search=" + mac;
            URL url = new URL(urlToSearch);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            return String.valueOf(ResponseToStringBuffer(new InputStreamReader(connection.getInputStream())));
        } catch (MalformedURLException error) {
            return error.getMessage();
        } catch (ProtocolException error) {
            return error.getMessage();
        } catch (IOException error) {
            return error.getMessage();
        }
    }

    private static StringBuffer ResponseToStringBuffer(InputStreamReader inputStream) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        reader = new BufferedReader(inputStream);
        while((line = reader.readLine()) != null) {
            responseContent.append(line);
        };
        return responseContent;
    }
}
