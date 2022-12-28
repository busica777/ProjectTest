package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeJobDetailsPage extends CommonMethods {
    @FindBy(xpath = "//*[@id='menu_pim_viewPimModule']")
    public WebElement pimOption;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr[1]/td[2]")
    public WebElement Employee1;

    @FindBy(xpath = "//*[@id='sidenav']/li[6]/a")
    public WebElement JobBtn;

    @FindBy (xpath = "//input[@id='btnSave']")
    public WebElement EditBtn;

    @FindBy (xpath = "//select[@id='job_job_title']")
    public WebElement JobTitleDropdown;

    @FindBy (xpath = "//select[@id='job_emp_status']")
     public WebElement EmpStatusDropDown;

    @FindBy(xpath = "//select[@id='job_eeo_category']")
    public WebElement JobCategoryDropDown;

    @FindBy (xpath = "//input[@id='job_joined_date']")
    public WebElement JoinDateCalendar;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/div/div/select[1]")
    public WebElement JoinMonthDropDown;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/div/div/select[2]")
    public WebElement JoinYearDropDown;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]")
    public WebElement JoinDayTable;

    @FindBy (xpath = "//select[@id='job_sub_unit']")
    public WebElement SubUnitDropDown;

    @FindBy (xpath = "//select[@id='job_location']")
    public WebElement LocationDropDown;

    @FindBy (xpath = "//*[@id='job_contract_start_date']")
    public WebElement StarDateCalendar;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div/div/select[1]")
    public WebElement StartMonthDropDown;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div/div/select[2]")
    public WebElement StartYearDropDown;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[2]")
    public WebElement StartDayTable;

    @FindBy (xpath = "//*[@id='job_contract_end_date']")
    public WebElement EndDateCalendar;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/div/div/select[1]")
    public WebElement EndMonthDropDown;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/div/div/select[2]")
    public WebElement EndYearDropDown;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[2]")
    public WebElement EndDayTable;

    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement SaveBtn;

public EmployeeJobDetailsPage(){
    PageFactory.initElements(driver,this);
}
}


