import java.util.ArrayList;

import hu.szit.Client;
import hu.szit.Convert;

public class Postal {
    
    DataService dataService;

    public Postal() {
        dataService = new DataService();
        // getPosts();
        addPost();
    }

    public void getPosts() {        
        String posts = dataService.getPosts();        
        ArrayList<Post> postList = Convert.toListObject(posts, Post.class);
        for(Post post: postList) {
            System.out.println(post.id);
        }
    }

    //Post felvétele
    public void addPost() {
        Post post = new Post(1, 101, "Cím", "Body");
        String json = Convert.toJson(post);

        String result = dataService.addPost(json);
        System.out.println(result);
    }
}
