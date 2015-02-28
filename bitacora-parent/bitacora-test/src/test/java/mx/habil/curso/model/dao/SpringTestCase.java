package mx.habil.curso.model.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import lombok.extern.apachecommons.CommonsLog;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@CommonsLog
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = {
		"classpath:mx/habil/curso/model/xml/model.application.context.xml",
		"classpath:mx/habil/curso/commons/xml/commons.application.context.xml"
})
public class SpringTestCase {

	@Before
	public void init(){
		log.debug("Inicio");
		log.debug("Fin");
	}
	
	@Test
	public void testSpring(){
		log.debug("Inicio");
		log.debug("Fin");
	}
	
}
