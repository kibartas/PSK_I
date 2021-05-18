package lt.vu.UserFixer;

import lt.vu.entities.User;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserNameFixer implements UserFixer {

    public User fixUserName(User user) {
        user.setName(user.getName().replaceAll("\\W", ""));
        return user;
    }
}
