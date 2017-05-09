import com.maxsoft.restapitestautomator.ExecuteSoapUIAnyTestCase;
import com.thoughtworks.gauge.Step;

/**
 * Created by Osanda on 5/1/2017.
 */
public class Test {
    @Step("Execute <TestCase> <TestSuite>")
    public void testm(String TestCase, String TestSuite){
        ExecuteSoapUIAnyTestCase executeSoapUIAnyTestCase = new ExecuteSoapUIAnyTestCase();
        try {
            executeSoapUIAnyTestCase.executeSpecificTestCase(TestCase,TestSuite);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
