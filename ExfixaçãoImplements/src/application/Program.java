package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import services.ContractService;
import services.PaypalService;



public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine(); 
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Entre o numero de parcelas: ");
		int n = sc.nextInt();
		Contract obj = new Contract(number, date, valor);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, n);

		System.out.println("Parcelas: ");
		for(Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		sc.close();
	}
}