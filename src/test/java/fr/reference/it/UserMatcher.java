package fr.reference.it;

import fr.reference.it.testdouble.fake.User;
import org.mockito.ArgumentMatcher;

public class UserMatcher extends ArgumentMatcher<User> {
    private static final String REGEX ="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
    @Override
    public boolean matches(Object user) {
        User userMatcher = (User)user;
        return userMatcher.getEmail().matches(REGEX);
    }
}


