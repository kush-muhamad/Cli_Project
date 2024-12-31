package Users;

import java.util.UUID;

public class UserArrayDataAccessService implements UserDao {

    private static User[] users ;

    static {
        users = new User[]{
                new User(UUID.fromString("f7f1b6e3-4e6b-4b3b-8b3e-1b0b3b3b3b3b"), "John"),
                new User(UUID.fromString("f7f1b6e3-4e6b-4b3b-8b3e-1b0b3b3b3b3c"), "Jane")
        };
    }

    @Override
    public User[] getUsers() {
        return users;
    }
}
