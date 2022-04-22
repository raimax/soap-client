package lt.viko.eif.rcepauskas.client.services;

import lt.viko.eif.rcepauskas.blog.User;
import lt.viko.eif.rcepauskas.client.ServiceStatus;
import lt.viko.eif.rcepauskas.client.user.*;

import java.util.List;

/**
 * A class used to request user data from server
 */
public class UserService implements IService<User> {
    protected UsersPortService usersPortService = new UsersPortService();
    protected UsersPort port = usersPortService.getUsersPortSoap11();

    /**
     * gets a single user that matches provided id
     * @param id user id
     * @return {@link User} object
     */
    @Override
    public User get(Integer id) {
        GetUserRequest request = new GetUserRequest();
        request.setId(id);
        GetUserResponse response = port.getUser(request);

        return response.getUser();
    }

    /**
     * gets all users
     * @return list of users
     */
    @Override
    public List<User> getAll() {
        GetUsersRequest request = new GetUsersRequest();
        GetUsersResponse response = port.getUsers(request);

        return response.getUsers();
    }

    /**
     * ads a new user
     * @param user user to add
     * @return {@link ServiceStatus} with status code and message
     * indicating whether a request was successful or not
     */
    @Override
    public ServiceStatus insert(User user) {
        InsertUserRequest request = new InsertUserRequest();
        request.setUser(user);
        InsertUserResponse response = port.insertUser(request);

        return  response.getServiceStatus();
    }

    /**
     * user with new data
     * @param user user to update
     * @return {@link ServiceStatus} with status code and message
     * indicating whether a request was successful or not
     */
    @Override
    public ServiceStatus update(User user) {
        UpdateUserRequest request = new UpdateUserRequest();
        request.setUser(user);
        UpdateUserResponse response = port.updateUser(request);

        return response.getServiceStatus();
    }

    /**
     * deletes user that matches provided id
     * @param id user id
     * @return {@link ServiceStatus} with status code and message
     * indicating whether a request was successful or not
     */
    @Override
    public ServiceStatus delete(Integer id) {
        DeleteUserRequest request = new DeleteUserRequest();
        request.setId(id);
        DeleteUserResponse response = port.deleteUser(request);

        return response.getServiceStatus();
    }
}
