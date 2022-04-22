package lt.viko.eif.rcepauskas.client;

import lt.viko.eif.rcepauskas.blog.Post;
import lt.viko.eif.rcepauskas.blog.User;
import lt.viko.eif.rcepauskas.client.services.PostService;
import lt.viko.eif.rcepauskas.client.services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostService postService = new PostService();
        UserService userService = new UserService();

        List<Post> postList = postService.getAll();
        List<User> userList = userService.getAll();

        postList.forEach(post -> {
            System.out.println(post);
        });

        userList.forEach(user -> {
            System.out.println(user);
        });
    }
}
