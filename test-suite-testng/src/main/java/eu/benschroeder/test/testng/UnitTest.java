package eu.benschroeder.test.testng;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import eu.benschroeder.testdata.WithRandomTestData;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Base class for unit tests with TestNG, BDDMockito and AssertJ.
 *
 * @author Benjamin Schröder
 */
@Test
public class UnitTest implements WithRandomTestData, WithBDDMockito, WithAssertJForMockito {

    @BeforeMethod(alwaysRun=true)
    public void initMockito() {
        MockitoAnnotations.initMocks(this);
        beforeMethod();
    }

    /**
     * Can be overridden if needed for setup
     */
    protected void beforeMethod() {
        // empty hook
    }

}
