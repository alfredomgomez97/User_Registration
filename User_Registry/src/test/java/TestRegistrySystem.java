import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import userRegistration.Person;

public class TestRegistrySystem {
	Person person;
	FactoryCustomer factoryCustomer;
	

	@Before
	public void setUp() throws Exception {
		person = new Person();
		factoryCustomer = new factoryCustomer();
	}

	@Test
	public void TestFactoryCustomer() {
		
	}

}
