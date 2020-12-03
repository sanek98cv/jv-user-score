package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) throws UserNotFoundException {
        int userScore = 0;

        for (int i = 0; i < records.length; i++) {
            if (email.equals(records[i].substring(0, records[i].indexOf(":")))) {
                userScore = Integer.parseInt(records[i].replaceAll("[^0-9]", ""));
            } else {
                throw new UserNotFoundException("User with given email doesn't exist");
            }
        }
        return userScore;
    }
}
