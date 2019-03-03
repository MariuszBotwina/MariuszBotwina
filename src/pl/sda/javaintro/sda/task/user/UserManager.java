package pl.sda.javaintro.sda.task.user;

import pl.sda.javaintro.sda.task.user.UserManager;

public class UserManager {
    private UserModel user;

    public void createUser(String firstName, String lastName, int age) {

        user = new UserModel(firstName, lastName, age);
    }

    public UserModel getUser() {
        return user;
    }
}
