package fr.reference.it;

import fr.reference.it.testdouble.fake.testdouble.dummy.Authorizer;
import fr.reference.it.testdouble.fake.testdouble.dummy.AuthorizerDummy;
import fr.reference.it.testdouble.fake.testdouble.dummy.System;
import org.junit.Assert;
import org.junit.Test;

public class DoubleDummyTest {

    @Test
    public void dummyTest()
    {
        Authorizer authorizer = (String username, String password)->{
          return true;
        };
        System system = new System(authorizer);
        Assert.assertEquals(0,system.getLoginCount());
    }

}
