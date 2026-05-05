package cse_sjc;

import java.util.ResourceBundle;

public class App {

    public int userLogin(String in_user, String in_pwd) {
        ResourceBundle rb = ResourceBundle.getBundle("Config");

        String UserName = rb.getString("username");
        String Password = rb.getString("Password");

        if (UserName.equals(in_user) && Password.equals(in_pwd)) {
            return 1; // valid login
        } else {
            return 0; // invalid login
        }
    }
}