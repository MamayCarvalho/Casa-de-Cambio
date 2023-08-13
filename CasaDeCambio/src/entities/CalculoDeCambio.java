package entities;

public class CalculoDeCambio {
	
	public static final double euro = 5.38;
	public static final double dolar = 4.91;
	public static final double chineseYuan = 0.68;
	
	public double valor;
	
	public void selecaoMenu (int opcao) {
		switch (opcao) {
		case 1: 
			System.out.printf("O valor a ser pago é de R$%.2f", queroEuro(valor));
			break;
		case 2: 
			System.out.printf("O valor a ser pago é de R$%.2f", queroDolar(valor));
			break;
		case 3: 
			System.out.printf("O valor a ser pago é de R$%.2f", queroYuan(valor));
			break;
			
		case 4: 
			System.out.println("É uma pena que não precisa dos nossos serviços =/ Até a próxima!");
			break;
		
		default: 
			System.out.println("Opção inválida! Selecione uma opção válida.");
			break;
		}
	}
	
	public double queroEuro(double valor) {
		return valor * euro;
	}
	public double queroDolar(double valor) {
		return valor * dolar;
	}
	public double queroYuan(double valor) {
		return valor * chineseYuan;
	}

}
