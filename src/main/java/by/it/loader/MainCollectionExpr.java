package by.it.loader;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.beanexpression.CollectionBeanExp;
import by.it.beanexpression.ExpressionBean;

public class MainCollectionExpr {
	private static Logger logger;
	static {
		logger = Logger.getRootLogger();
		logger.setLevel(Level.ALL);
		PatternLayout layout = new PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n");
		logger.addAppender(new ConsoleAppender(layout));
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("expresCollectContext.xml");
		CollectionBeanExp collectionBean = (CollectionBeanExp) context.getBean("collectionBeanExp");
		ExpressionBean expressionBean = (ExpressionBean) context.getBean("expressionBean");
		logger.info(collectionBean);
		logger.info(expressionBean);
		((ClassPathXmlApplicationContext) context).close();
	}
}
