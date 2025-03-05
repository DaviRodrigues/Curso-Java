package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		double valuePerInstallment = contract.getTotalValue() / months;
		
		for (int i=1; i <= months; i++) {
			LocalDate nextMonth = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(valuePerInstallment, i);
			double fee = onlinePaymentService.paymentFee(valuePerInstallment + interest);
			double quota = valuePerInstallment + interest + fee;
			
			contract.getInstallments().add(new Installment(nextMonth, quota));
		}
	}
	
}
