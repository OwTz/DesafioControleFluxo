import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.RuntimeException;
public class Contador {
    public static void main(String[] args) {
        
		Scanner terminal = new Scanner(System.in);
		
		try {
			//chamando o método contendo a lógica de contage

			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			
			contar(parametroUm, parametroDois);

		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			 System.out.println(exception.getMessage());

		} catch(InputMismatchException e){
			
			System.out.println("tente colocar um valor numérico");
	
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("erro parâmetro inválido");
		} 

		int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for(int i = 1; i < contagem ; i++){
				int var = parametroUm + parametroDois;
				System.out.println("interação n° "+i+ " valor escolhido pelo usuário "+parametroUm);
				System.out.println("interação n° "+i+ " 2° valor escolhido pelo usuário "+parametroDois);
				System.out.println("a soma dos dois número são: "+var);
			}
		
	}

}
