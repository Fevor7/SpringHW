package by.it.bean;

import java.util.Random;

public class TransferService {
	public int transfer(TransferData data) {
		int code = new Random().nextInt(3);
		StringBuilder sb = new StringBuilder(100);
		sb.append("Transfer amount").append(data.getAmount())
		.append(" from card ").append(data.getFromCard())
		.append(" to card ").append(data.getToCard())
		.append(" was " + Status.getValueByCode(code));
		System.out.println(sb.toString());
		return code;
	}
}
