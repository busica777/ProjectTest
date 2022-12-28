package steps;

import Pages.EmployeeJobDetailsPage;
import Pages.LoginPage;

public class PageInitializer {

public static LoginPage login;
public static EmployeeJobDetailsPage EmployeeJobDetails;
public static void initializePageObjects(){

    login=new LoginPage();

    EmployeeJobDetails= new EmployeeJobDetailsPage();
}
    }


