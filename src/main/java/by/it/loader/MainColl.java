package by.it.loader;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.beancollect.CollectionBean;
import by.it.beancollect.MapBean;
import by.it.beancollect.NullValueBean;
import by.it.beancollect.Person;
import by.it.beancollect.PropsBean;

public class MainColl {
	private static Logger logger;
	static {
		logger = Logger.getRootLogger();
		logger.setLevel(Level.ALL);
		PatternLayout layout = new PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n");
		logger.addAppender(new ConsoleAppender(layout));
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("personCollContext.xml");
		Person person = (Person)context.getBean("person", Person.class);
		CollectionBean bean = (CollectionBean)context.getBean("collectionBean");
		MapBean mapBean = (MapBean)context.getBean("mapBean");
		PropsBean propsBean = (PropsBean)context.getBean("propsBean");
		NullValueBean nullValueBean = (NullValueBean)context.getBean("nullValueBean");
		for (String flat: person.getAddress().getFlats()) {
			logger.info(flat);
		}
		logger.info(bean);
		logger.info(mapBean);
		logger.info(propsBean);
		logger.info(nullValueBean);
		((ClassPathXmlApplicationContext)context).close();
	}

}
