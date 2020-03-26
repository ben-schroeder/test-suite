package eu.benschroeder.test.junit4;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import eu.benschroeder.testdata.WithRandomTestData;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Base class for unit tests with Junit4, BDDMockito and AssertJ.
 *
 * @author Benjamin Schröder
 */
@RunWith(MockitoJUnitRunner.class)
public class UnitTest implements WithRandomTestData, WithBDDMockito, WithAssertJForMockito {

}
