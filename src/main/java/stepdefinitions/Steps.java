package stepdefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import pageobjects.NavigationBarPage;
import pageobjects.ResetPasswordPage;

import java.time.Duration;

public class Steps {
    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ResetPasswordPage resetPasswordPage;
    NavigationBarPage navigationBarPage;

    @Given("open the browser")
    public void open_the_browser() {
        // 1. Open browser
        String browser = "chrome";

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "msedge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;

            default:
                driver = new EdgeDriver();
                break;
        }
        driver.manage().window().maximize();
        // Implicit time - global timeout
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // Creating Objects to access page objects
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        resetPasswordPage = new ResetPasswordPage(driver);
        navigationBarPage = new NavigationBarPage(driver);

    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }

    @Given("navigate to OrangeHRM application")
    public void navigate_to_orange_hrm_application() {
        loginPage.openApplication();
    }

    @When("enter the username as {string}")
    public void enter_the_username_as(String username) {
        loginPage.enterUsername(username);
    }

    @When("enter the password as {string}")
    public void enter_the_password_as(String password) {
        loginPage.enterPassword(password);
    }

    @When("click the Login button")
    public void click_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("should be navigate to dashboard page")
    public void should_be_navigate_to_dashboard_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        dashboardPage.validateDashboard();
    }


    // Feature hooks
    @BeforeAll
    public static void beforeAll() {
        System.out.println("*** Before All ***");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("*** After All ***");
    }


    // Scenario hooks
    @Before
    public void before() {
        System.out.println("*** Before ***");
    }

    @After
    public void after() {
        System.out.println("*** After ***");
    }


    // Steps hook
    @BeforeStep
    public void beforeStep() {
        System.out.println("*** Before Each Step ***");
    }
    @AfterStep
    public void afterStep() {
        System.out.println("*** After Each Step ***");
    }


}
