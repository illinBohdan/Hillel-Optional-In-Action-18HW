package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepository {
    User user;

    List<User> userList = Arrays.asList(
            new User(1, "Vasya", "vasya@com"),
            new User(2, "Kolya", "kolya@com"),
            new User(3, "Roman", "roman@com"),
            new User(4, "Anton", "anton@com")
    );

    public User findUserById(int id) {
        for (User user: userList){
            if(user.getId() == id)
                return user;
        }
        return null;
    }

    public User findUserByEmail(String email){
        for (User user: userList){
            if(user.getEmail() == email)
                return user;
        }
        return null;
    }

}
