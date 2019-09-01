package fr.reference.it.testdouble.fake.testdouble.dummy;

@FunctionalInterface
public interface Authorizer {
    public Boolean authorize(String username, String password);
}



