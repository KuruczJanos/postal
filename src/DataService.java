import hu.szit.Client;

public class DataService {
    String url;
    Client client;
    public DataService() {
        url = "https://jsonplaceholder.typicode.com/posts";
        client = new Client();
    }

    public String getPosts() {
        return client.get(url);
    }
    public String addPost(String json) {
        return client.post(url, json);        
    }
}
