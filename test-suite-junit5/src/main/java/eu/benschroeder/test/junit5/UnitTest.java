package eu.benschroeder.test.junit5;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import eu.benschroeder.testdata.WithRandomTestData;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Base class for unit tests with Junit5, BDDMockito and AssertJ.
 *
 * @author Benjamin Schröder
 */
@Tag("UnitTest")
@ExtendWith(MockitoExtension.class)
public class UnitTest implements WithRandomTestData, WithBDDMockito, WithAssertJForMockito {

}
