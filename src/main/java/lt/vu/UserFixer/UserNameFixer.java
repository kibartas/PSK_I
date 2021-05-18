package lt.vu.UserFixer;

import lt.vu.entities.User;

public class UserNameFixer implements UserFixer {

    public void fixUserName(User user) {
        user.setName(user.getName().replaceAll("\\W", ""));
    }
}
