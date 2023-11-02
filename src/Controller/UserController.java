package Controller;
import Model.User;
import java.util.ArrayList;

public class UserController {
    public static ArrayList<User> getUsers(Boolean onlyAvailable){
        return User.getUsers(onlyAvailable);
    }
    
    public static boolean createUser(String email, String password, String name, String surnames, String dni){
        return User.createUser(email, password, name, surnames, dni);
    }
    
    public static void updateUserIsActive(User user){
        user.updateUserIsActive();
    }
}
