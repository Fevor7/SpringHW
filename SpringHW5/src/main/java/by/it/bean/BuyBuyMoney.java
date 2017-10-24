package by.it.bean;

import org.springframework.aop.framework.ProxyFactory;

public class BuyBuyMoney {
	private static TransferService target;
	private static TransferService proxy;

	public static void init() {
		target = new TransferService();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addAdvice(new CredsSniffer());
		proxyFactory.setTarget(target);
		proxy = (TransferService) proxyFactory.getProxy();
	}
	
	public static void main(String[] args) {
		init();
		process(new TransferData("3242-1254", "0989-9584", 101.99, "WONG", "LEE", "09-2020", "111"));
		System.out.println("-----BACK DOOR----");
		processProxy(new TransferData("3242-1244", "0985-9584", 101.99, "WONG2", "LEE2", "07-2020", "161"));
		processProxy(new TransferData("3242-1254", "0989-9585", 101.99, "WONG3", "LEE3", "06-2020", "1161"));
		processProxy(new TransferData("3242-1554", "0985-9584", 101.99, "WONG4", "LEE4", "05-2020", "116"));
	}

	private static void processProxy(TransferData transferData) {
		target.transfer(transferData);
		
	}

	private static void process(TransferData transferData) {
		proxy.transfer(transferData);
		
	}
}
