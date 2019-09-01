package fr.reference.it.testdouble.fake;

public class ApplicationMain {

    UserAccountDAO userAccountDAO;

    public String getUserPassword(User user)
    {
        String pass = getUserAccountDAO().getUserPassword(user);
        userAccountDAO.showPassword(pass);
        return pass;
    }


    public UserAccountDAO getUserAccountDAO() {
        return userAccountDAO;
    }


}
