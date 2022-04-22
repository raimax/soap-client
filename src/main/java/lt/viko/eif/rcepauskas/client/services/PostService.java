package lt.viko.eif.rcepauskas.client.services;

import lt.viko.eif.rcepauskas.blog.Post;
import lt.viko.eif.rcepauskas.client.ServiceStatus;
import lt.viko.eif.rcepauskas.client.post.*;

import java.util.List;

/**
 * A class used to request post data from server
 */
public class PostService implements IService<Post> {
    protected PostsPortService usersPortService = new PostsPortService();
    protected PostsPort port = usersPortService.getPostsPortSoap11();

    /**
     * gets a single post that matches provided id
     * @param id post id
     * @return {@link Post} object
     */
    @Override
    public Post get(Integer id) {
        GetPostRequest request = new GetPostRequest();
        request.setId(id);
        GetPostResponse response = port.getPost(request);

        return response.getPost();
    }

    /**
     * gets all posts
     * @return list of posts
     */
    @Override
    public List<Post> getAll() {
        GetPostsRequest request = new GetPostsRequest();
        GetPostsResponse response = port.getPosts(request);

        return response.getPosts();
    }

    /**
     * adds a new post
     * @param post post to add
     * @return {@link ServiceStatus} with status code and message
     * indicating whether a request was successful or not
     */
    @Override
    public ServiceStatus insert(Post post) {
        InsertPostRequest request = new InsertPostRequest();
        request.setPost(post);
        InsertPostResponse response = port.insertPost(request);

        return  response.getServiceStatus();
    }

    /**
     * updates post with new data
     * @param post post to update
     * @return {@link ServiceStatus} with status code and message
     * indicating whether a request was successful or not
     */
    @Override
    public ServiceStatus update(Post post) {
        UpdatePostRequest request = new UpdatePostRequest();
        request.setPost(post);
        UpdatePostResponse response = port.updatePost(request);

        return response.getServiceStatus();
    }

    /**
     * deletes post that matches provided id
     * @param id post id
     * @return {@link ServiceStatus} with status code and message
     * indicating whether a request was successful or not
     */
    @Override
    public ServiceStatus delete(Integer id) {
        DeletePostRequest request = new DeletePostRequest();
        request.setId(id);
        DeletePostResponse response = port.deletePost(request);

        return response.getServiceStatus();
    }
}
