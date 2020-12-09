package eu.benschroeder.test.junit4;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import eu.benschroeder.testdata.WithRandomTestData;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Base class for integration tests with Junit4, BDDMockito and AssertJ.
 *
 * @author Benjamin Schröder
 */
@RunWith(MockitoJUnitRunner.class)
@Category(IntegrationTest.class)
public class IntegrationTest implements WithRandomTestData, WithBDDMockito, WithAssertJForMockito {

}
