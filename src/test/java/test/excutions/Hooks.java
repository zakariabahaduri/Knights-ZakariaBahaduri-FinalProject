package test.excutions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {
@Before
public void setupTests(){
    openBrowser();
}

@After
public void cleanUpTests() {
    closeBrwoser();
}
}
