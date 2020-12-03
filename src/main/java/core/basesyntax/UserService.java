package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (int i = 0; i < records.length; i++) {
            if (email.equals(records[i].split("\\:", 2)[0])) {
                return Integer.parseInt(records[i].replaceAll("[^0-9]", ""));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
