package by.it.bean;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
	OK(0, "Success"), NOT_ENOUGH_FUNDS(1, "Error. Not enough funds."), ERROR(2, "Error");
	int code;
	String value;

	public static String getValueByCode(int code) {
		for (Status status : Status.values()) {
			if(status.code == code) {
				return status.value;
			}
		}
		return "UNKOWN STATUS";
	}
}
