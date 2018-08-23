package com.gopivotal.bookshop.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.gemfire.GemfireTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.query.SelectResults;
import com.gopivotal.bookshop.domain.BookMaster;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/gemfire/spring-config.xml")
// TODO-04: Open and review basic Spring Test configuration
public class BasicSpringClientTests {
	@Resource(name="BookMaster")
	Region<Integer,BookMaster> books;
	
	// TODO-07: Use the @Autowired annotation to autowire in the GemFire template
	
	// TODO-12: Use the @Autowire annotation to autowire your newly created Repository interface
	
	@Test
	// TODO-05: Run first test to verify basic configuration
	public void simpleClientTest() {
		BookMaster book = (BookMaster) books.get(456);
		assertEquals("Clifford the Big Red Dog", book.getTitle());	
	}

	@Test
	public void testGemFireTemplate() {
		// TODO-08: Implement this test by writing a query to return books having the author 'Daisy Mae West'
		//          Assert you only get one item and that it's title is "A Treatise of Treatises"
	}
	
	@Test
	public void testGemFireRepositories() {
		// TODO-13: Write a test that calls your findBy method. Use the above query as an examle of how to perform the query 
		//          and assert the correct results
		
	}
}
