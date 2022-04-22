package lt.viko.eif.rcepauskas.client;

import lt.viko.eif.rcepauskas.blog.Comment;
import lt.viko.eif.rcepauskas.blog.Post;
import lt.viko.eif.rcepauskas.blog.Rating;
import lt.viko.eif.rcepauskas.blog.User;
import lt.viko.eif.rcepauskas.client.post.*;
import lt.viko.eif.rcepauskas.client.user.*;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost.web_service.post package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost.web_service.post
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPostResponse }
     * 
     */
    public GetPostResponse createGetPostResponse() {
        return new GetPostResponse();
    }

    /**
     * Create an instance of {@link Post }
     * 
     */
    public Post createPost() {
        return new Post();
    }

    /**
     * Create an instance of {@link GetPostsRequest }
     * 
     */
    public GetPostsRequest createGetPostsRequest() {
        return new GetPostsRequest();
    }

    /**
     * Create an instance of {@link UpdatePostResponse }
     * 
     */
    public UpdatePostResponse createUpdatePostResponse() {
        return new UpdatePostResponse();
    }


    /**
     * Create an instance of {@link GetPostsResponse }
     * 
     */
    public GetPostsResponse createGetPostsResponse() {
        return new GetPostsResponse();
    }

    /**
     * Create an instance of {@link GetPostRequest }
     * 
     */
    public GetPostRequest createGetPostRequest() {
        return new GetPostRequest();
    }

    /**
     * Create an instance of {@link UpdatePostRequest }
     * 
     */
    public UpdatePostRequest createUpdatePostRequest() {
        return new UpdatePostRequest();
    }

    /**
     * Create an instance of {@link InsertPostRequest }
     * 
     */
    public InsertPostRequest createInsertPostRequest() {
        return new InsertPostRequest();
    }

    /**
     * Create an instance of {@link InsertPostResponse }
     * 
     */
    public InsertPostResponse createInsertPostResponse() {
        return new InsertPostResponse();
    }

    /**
     * Create an instance of {@link DeletePostResponse }
     * 
     */
    public DeletePostResponse createDeletePostResponse() {
        return new DeletePostResponse();
    }

    /**
     * Create an instance of {@link DeletePostRequest }
     * 
     */
    public DeletePostRequest createDeletePostRequest() {
        return new DeletePostRequest();
    }

    /**
     * Create an instance of {@link Rating }
     * 
     */
    public Rating createRating() {
        return new Rating();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     *
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link User }
     *
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link DeleteUserRequest }
     *
     */
    public DeleteUserRequest createDeleteUserRequest() {
        return new DeleteUserRequest();
    }

    /**
     * Create an instance of {@link InsertUserRequest }
     *
     */
    public InsertUserRequest createInsertUserRequest() {
        return new InsertUserRequest();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     *
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link UpdateUserRequest }
     *
     */
    public UpdateUserRequest createUpdateUserRequest() {
        return new UpdateUserRequest();
    }

    /**
     * Create an instance of {@link GetUsersRequest }
     *
     */
    public GetUsersRequest createGetUsersRequest() {
        return new GetUsersRequest();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     *
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     *
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     *
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     *
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link InsertUserResponse }
     *
     */
    public InsertUserResponse createInsertUserResponse() {
        return new InsertUserResponse();
    }

}
