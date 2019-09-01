package fr.reference.it.testdouble.fake.testdouble.dummy;

public class System {
    Authorizer authorizer;
    public System(Authorizer pAuthorizer)
    {
        this.authorizer = pAuthorizer;
    }

    public int getLoginCount()
    {
        return 0;
    }

}
