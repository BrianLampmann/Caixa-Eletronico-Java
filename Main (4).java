import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);

    System.out.println("");
    System.out.println("--------------------------------------------------------------");
    System.out.println("");
    
    System.out.println("Valor mínimo para o saque: R$ 10,00");
    System.out.println("Valor máximo para o saque: R$ 600,00");
    System.out.println("Digite o valor que você deseja sacar: R$ ");
	  int valor = ler.nextInt();

    //Declarando as variaveis do tipo inteiro
    //Atribuindo uma constante conforme as cedulas correspondentes
	  int nota_100 = 100;
	  int nota_50 = 50;
	  int nota_10 = 10;
	  int nota_5 = 5;
	  int nota_1 = 1;	

	  if(valor >= 10 && valor <= 600) { //Se o valor ser entre R$ 10,00 e R$ 600,00
    
		  if(nota_100 > 0) {
			nota_100 = valor / 100; //Divide o valor de saque por 100
			valor = valor % 100;   
			System.out.println(nota_100 + " notas de R$ 100,00");
		  } 
    
		  if(nota_50 > 0) {
			nota_50 = valor / 50;//Divide o valor de saque por 50
			valor = valor % 50;
			System.out.println(nota_50 + " notas de R$ 50,00");
      }
    
		  if(nota_10 > 0) {
			nota_10 = valor / 10;//Divide o valor de saque por 10
			valor = valor % 10;
			System.out.println(nota_10 + " notas de R$ 10,00");
	  	}
    
      if(nota_5 > 0) {
			nota_5 = valor / 5;//Divide o valor de saque por 5
			valor = valor % 5;
			System.out.println(nota_5 + " notas de R$ 5,00");
		  }
    
      if(nota_1 > 0) {
			nota_1 = valor / 1;//Divide o valor de saque por 1
			valor = valor % 1;
			System.out.println(nota_1 + " notas de R$ 1,00");
		  }
	    }else { //Se o valor não estar entre R$ 10,00 e R$ 600,00
		  System.out.println("Não é possível realizar o saque");
	    }	    
  }
}