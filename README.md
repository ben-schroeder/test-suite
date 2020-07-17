# test-suite
[![Build Status](https://travis-ci.com/ben-schroeder/test-suite.svg?branch=master)](https://travis-ci.com/ben-schroeder/test-suite)
[![License](https://img.shields.io/github/license/ben-schroeder/test-suite)](https://raw.githubusercontent.com/ben-schroeder/test-suite/master/LICENSE)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/test-suite-parent/badge.svg)](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/test-suite-parent)

Opinionated package of testing tools.

Combines one of
* [junit5](https://github.com/junit-team/junit5)
* [junit4](https://github.com/junit-team/junit4)
* [testng](https://github.com/cbeust/testng)

with all of

* [mockito](https://github.com/mockito/mockito)
* [mockito-extension](https://github.com/ben-schroeder/mockito-extension)
* [assertj-core](https://github.com/joel-costigliola/assertj-core)
* [assertj-extension](https://github.com/ben-schroeder/assertj-extension)
* [random-test-data](https://github.com/ben-schroeder/random-test-data)

## Requirements
* Java >= 8

## Artifacts
### Junit5
```
<dependency>
  <groupId>eu.benschroeder</groupId>
  <artifactId>test-suite-junit5</artifactId>
  <version>0.4</version>
</dependency>
```
### Junit4
```
<dependency>
  <groupId>eu.benschroeder</groupId>
  <artifactId>test-suite-junit4</artifactId>
  <version>0.4</version>
</dependency>
```
### TestNG
```
<dependency>
  <groupId>eu.benschroeder</groupId>
  <artifactId>test-suite-testng</artifactId>
  <version>0.4</version>
</dependency>
```

## Usage
### Junit5
```
import eu.benschroeder.test.junit5.UnitTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;

// No static imports needed

// No @ExtendWith(MockitoExtension.class) needed
public class MyServiceTest extends UnitTest {

    @InjectMocks
    private MyService myService;

    @Mock
    private MyMockedService myMockedService;

    @Test
    void testMyMethod() {

        // use random test data
        final long anyId = randomLong();
        final String anyName = randomAlphabetic();
        final LocalDateTime anyLocalDateTime = randomPastLocalDateTime();

        ...

        // Use BDDMockito/Mockito without static imports        
        given(myMockedService.method()).willReturn(anyName);

        ...

        // Use AssertJ without static imports
        assertThat("string").isNotNull();

    }

}
```
