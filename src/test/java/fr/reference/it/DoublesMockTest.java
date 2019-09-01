package fr.reference.it;

import fr.reference.it.testdouble.fake.ApplicationMain;
import fr.reference.it.testdouble.fake.User;
import fr.reference.it.testdouble.fake.UserAccountDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DoublesMockTest {
    @InjectMocks
    ApplicationMain applicationMain;
    @Mock
    UserAccountDAO userAccountDAO;
    @Test
    public void verfierMockTest()
    {
        User user1 = new User();
        user1.setEmail("jaouad@gmail.com");

        when(userAccountDAO.getUserPassword(argThat(new UserMatcher()))).thenReturn("ThisIsPassword");

        System.out.println(applicationMain.getUserPassword(user1));
        System.out.println(applicationMain.getUserPassword(user1));

        verify(userAccountDAO,times(2)).showPassword("ThisIsPassword");
    }
}
