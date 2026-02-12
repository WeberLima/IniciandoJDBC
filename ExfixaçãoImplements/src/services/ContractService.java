package services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	
	private OnlinePaymentService onlinePaymentService;
	
	

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double divided = contract.getTotalValue() / months;

		for(int i=1; i<= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(divided, i);
			double fee = onlinePaymentService.paymentFee(divided+interest);
			double quota = fee + interest + divided;
			
			contract.getInstallments().add(new Installment(dueDate, quota));	
			
		}
	}
	
}
