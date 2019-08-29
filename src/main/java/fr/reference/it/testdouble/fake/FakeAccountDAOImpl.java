package fr.reference.it.testdouble.fake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeAccountDAOImpl implements UserAccountDAO {
    Map<User,Account> users = new HashMap<User, Account>();
    public FakeAccountDAOImpl() {
        users.put(new User("jaouad@mail.com"),new Account());
    }
    @Override
    public String getUserPassword(User user) {
        return users.get(user).getPassword();
    }
}
