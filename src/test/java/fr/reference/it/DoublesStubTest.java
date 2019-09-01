package fr.reference.it;

import fr.reference.it.testdouble.fake.ApplicationMain;
import fr.reference.it.testdouble.fake.User;
import fr.reference.it.testdouble.fake.UserAccountDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DoublesStubTest {
    @InjectMocks
    ApplicationMain applicationMain ;

    @Mock
    UserAccountDAO userAccountDAO;

    /**
     * Responder test
     */
    @Test
    public void getUserPasswordTest()
    {
        Mockito.when(userAccountDAO.getUserPassword(Mockito.any(User.class))).thenReturn("thisIsYourP@ssword");
        System.out.println(applicationMain.getUserPassword(Mockito.any(User.class)));
    }
}
