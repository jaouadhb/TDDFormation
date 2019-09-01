package fr.reference.it.testdouble.fake.testdouble.dummy;

public class AuthorizerDummy implements Authorizer {
    @Override
    public Boolean authorize(String username, String password) {
        return null;
    }
}
