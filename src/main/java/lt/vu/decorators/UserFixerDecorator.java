package lt.vu.decorators;

import javax.decorator.Delegate;
import lt.vu.UserFixer.UserFixer;
import lt.vu.entities.User;

import javax.decorator.Decorator;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class UserFixerDecorator implements UserFixer {

    @Inject @Delegate @Any
    UserFixer userFixer;

    @Override
    public void fixUserName(User user) {
        userFixer.fixUserName(user);
    }
}
