package steps;

import Pages.EmployeeJobDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class EmployeeJobDetailsSteps extends CommonMethods{
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
      click(EmployeeJobDetails.pimOption);
    }

    @Then("user selects employee")
    public void user_selects_employee() {
       click(EmployeeJobDetails.Employee1);
    }
    @Then("user clicks on job button")
    public void user_clicks_on_job_button() {
       click(EmployeeJobDetails.JobBtn);
    }
    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        click(EmployeeJobDetails.EditBtn);
    }
    @Then("Job Title dropdown field is displayed and user can select values from there")
    public void job_title_dropdown_field_is_displayed_and_user_can_select_values_from_there() {
        Select select=new Select(EmployeeJobDetails.JobTitleDropdown);
        select.selectByVisibleText("QA Engeneer");

    }
    @Then("Employment Status dropdown field is displayed and user can select values from there")
    public void employment_status_dropdown_field_is_displayed_and_user_can_select_values_from_there() {
        Select select= new Select(EmployeeJobDetails.EmpStatusDropDown);
        select.selectByVisibleText("active-active");
    }
    @Then("Job Category dropdown field is displayed and user can select values from there")
    public void job_category_dropdown_field_is_displayed_and_user_can_select_values_from_there() {
       Select select = new Select(EmployeeJobDetails.JobCategoryDropDown);
       select.selectByVisibleText("Professionals");
    }
    @Then("Joined Date calendar is displayed and user can pick values from there")
    public void joined_date_calendar_is_displayed_and_user_can_pick_values_from_there() {
        click(EmployeeJobDetails.JoinDateCalendar);
        Select select= new Select(EmployeeJobDetails.JoinMonthDropDown);
        select.selectByVisibleText("Aug");

        Select select1= new Select(EmployeeJobDetails.JoinYearDropDown);
        select1.selectByVisibleText("2020");
        click(EmployeeJobDetails.JoinDayTable);

    }
    @Then("Sub Unit dropdown field is displayed and user can select values from there")
    public void sub_unit_dropdown_field_is_displayed_and_user_can_select_values_from_there() {
     Select select= new Select(EmployeeJobDetails.SubUnitDropDown);
     select.selectByVisibleText("IT Support");
    }
    @Then("Location dropdown field is displayed and user can select values from there")
    public void location_dropdown_field_is_displayed_and_user_can_select_values_from_there() {
       Select select= new Select(EmployeeJobDetails.LocationDropDown);
       select.selectByVisibleText("Cool Office");
    }
    @Then("Start Date calendar is displayed and user can pick values from there")
    public void start_date_calendar_is_displayed_and_user_can_pick_values_from_there() {
        click(EmployeeJobDetails.StarDateCalendar);
        Select select=new Select(EmployeeJobDetails.StartMonthDropDown);
        select.selectByVisibleText("Feb");
        Select select1=new Select(EmployeeJobDetails.StartYearDropDown);
        select1.selectByVisibleText("2021");
        click(EmployeeJobDetails.StartDayTable);

    }
    @Then("End Date calendar is displayed and user can pick values from there")
    public void end_date_calendar_is_displayed_and_user_can_pick_values_from_there() {
        click(EmployeeJobDetails.EndDateCalendar);
        Select select=new Select(EmployeeJobDetails.EndMonthDropDown);
        select.selectByVisibleText("Jul");
        Select select1=new Select(EmployeeJobDetails.EndYearDropDown);
        select1.selectByVisibleText("2024");
        click(EmployeeJobDetails.EndDayTable);
    }
    @Then("Contract Details file upload that accepts file up to 1MB")
    public void contract_details_file_upload_that_accepts_file_up_to_1mb() {
        System.out.println("Employee provides file path for contract");
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(EmployeeJobDetails.SaveBtn);

    }

    @Then("employees current job details are added sucessfully")
    public void employees_current_job_details_are_added_sucessfully() {
        System.out.println(" Employee's job details were added sucessfully");
    }

}
