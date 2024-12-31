package Users;

import java.io.File;
import java.util.Scanner;
import java.util.UUID;

public class UserFileDataAccessService implements UserDao {

    @Override
    public User[] getUsers() {
        File file = new File("users.csv");
        // read the file and return the users
        User[] users = new User[4];

        try{
            int index = 0;
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String[] split = scanner.nextLine().split(",");
                users[index] = new User(UUID.fromString(split[0]), split[1]);
                index++;
            }
            return users;
        } catch (Exception e){
           throw new IllegalStateException(e);
        }
    }



}
