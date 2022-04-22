package lt.viko.eif.rcepauskas.client;

import lt.viko.eif.rcepauskas.blog.User;
import lt.viko.eif.rcepauskas.client.user.GetUserRequest;
import lt.viko.eif.rcepauskas.client.user.GetUserResponse;
import lt.viko.eif.rcepauskas.client.user.UsersPort;
import lt.viko.eif.rcepauskas.client.user.UsersPortService;

public class Main {
    public static void main(String[] args) {
        UsersPortService usersPortService = new UsersPortService();
        UsersPort port = usersPortService.getUsersPortSoap11();

        GetUserRequest getUserRequest = new GetUserRequest();
        getUserRequest.setId(1);
        GetUserResponse getUserResponse = port.getUser(getUserRequest);

        User user = getUserResponse.getUser();

        System.out.println(user);
    }
}
