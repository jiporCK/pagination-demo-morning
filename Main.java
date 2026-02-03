package new_features.pagination;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        UserDTO newObject = new UserDTO(
                "Tony Stark", "ironman", LocalDateTime.now());

        System.out.println(newObject.username());

        System.out.println(newObject);

    }

}
