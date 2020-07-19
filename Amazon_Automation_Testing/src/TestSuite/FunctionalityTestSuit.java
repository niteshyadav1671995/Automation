package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestClasses.HomePageTest;
import TestClasses.SignInPageTest;

@RunWith(Suite.class)
@SuiteClasses({HomePageTest.class,SignInPageTest.class})
public class FunctionalityTestSuit {
	
}
