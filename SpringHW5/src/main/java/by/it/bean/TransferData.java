package by.it.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferData {
	private String fromCard;
	private String toCard;
	private Double amount;
	private String firstName;
	private String lastName;
	private String expDate;
	private String cvv;
}
