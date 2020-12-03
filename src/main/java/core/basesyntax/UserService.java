package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String[] result = record.split(":");
            for (int i = 0; i < result.length; i++) {
                if (result[0].equals(email)) {
                    return Integer.parseInt(result[1]);
                }
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
