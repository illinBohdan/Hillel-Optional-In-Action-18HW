package app;

import java.util.Scanner;

public class View {

    Scanner scanner = new Scanner(System.in);
    UserRepository userRepository = new UserRepository();

    public void findByIdWithIsPresentAndGetMethods() {
        System.out.print("Введіть id користувача, дані якого ви б хотіли знайти:");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (userRepository.findUserById(id).isPresent())
            System.out.println(userRepository.findUserById(id).get());
        else
            System.out.println("Користувач з даним id " + id + " відсутній");
    }

    public void findByEmailWithOrElseGetMethod() {
        System.out.print("Введіть email користувача, дані якого ви б хотіли знайти:");
        String email = scanner.nextLine();

        User user = userRepository.findUserByEmail(email).orElseGet(() -> new User());

        if (user.getId() == 0 && user.getEmail() == null)
            System.out.println("Користувач з даним email " + email + " відсутній");
        else
            System.out.println(user);
    }

    public void findAllUserWithIfPresentMethods(){
        userRepository.findAllUsers()
                .ifPresent(users -> System.out.println("Кількість користувачів -> " +users.size() + "\n"));
    }


}
