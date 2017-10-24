package by.it.loader;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.beanexpression.ExpressionBean;
import by.it.beanexpression.Person;

public class MainExpr {
	private static Logger logger;
	static {
		logger = Logger.getRootLogger();
		logger.setLevel(Level.ALL);
		PatternLayout layout = new PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n");
		logger.addAppender(new ConsoleAppender(layout));
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("expressionContext.xml");
		ExpressionBean expressionBean = (ExpressionBean) context.getBean("expressionBean");
		Person person = (Person) context.getBean("person");
		logger.info(expressionBean);
		logger.info(person);
		((ClassPathXmlApplicationContext) context).close();
	}

}
