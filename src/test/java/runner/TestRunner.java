package runner;

import io.cucumber.testng.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRunner {

    TestNGCucumberRunner testNGCucumberRunner;
    @BeforeSuite
    public void beforeSuite(){

    }

    @Test(dataProvider = "transferAmount")
    public void testTransferAmount(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public Object[][] transferAmount() {
        testNGCucumberRunner = new TestNGCucumberRunner(TransferAmount.class);
        return testNGCucumberRunner.provideScenarios();
    }
}

@CucumberOptions(
        features = "src/test/resources/features/transfer.feature",
        glue = "stepdefinitions",
        plugin = {}
)
class TransferAmount extends AbstractTestNGCucumberTests {

}
