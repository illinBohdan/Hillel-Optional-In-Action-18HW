package app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> userList = Arrays.asList(
            new User(1, "Vasya", "vasya@com"),
            new User(2, "Kolya", "kolya@com"),
            new User(3, "Roman", "roman@com"),
            new User(4, "Anton", "anton@com")
    );

    public Optional<User> findUserById(int id) {
        return userList.stream()
                .filter(user -> user.getId() == id )
                .findFirst();
    }

    public Optional<User> findUserByEmail(String email){
        return userList.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public Optional<List<User>> findAllUsers(){
        return userList == null || userList.isEmpty()
                ? Optional.empty()
                : Optional.of(userList);
    }
}
