import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class calcolatrice {
public static void main(String[] args) throws IOException {
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera = new BufferedReader(input);
		int risultato=0;
		System.out.println("Decidi operazione da svolgere");
		String operazione;
		operazione=tastiera.readLine();
		System.out.println(operazione);
		System.out.println("inserisci i 2 numeri con i quali effettuare le operazioni");
		Scanner n;
		n=new Scanner(System.in);
		int num1=n.nextInt();
		int num2=n.nextInt();
		
		//somma
		if(operazione.equals("somma")){
		
		System.out.println(num1+num2);
		
		}
		
		//divione
		if(operazione.equals("divisione")){
			int c=num1/num2;
			System.out.println(num1/num2);
			
			}
		
		//moltiplicazione
		if(operazione.equals("moltiplicazione")){
			int c=num1/num2;
			System.out.println(num1*num2);
			
			}
		
		if(operazione.equals("sottrazione")){
			int c=num1/num2;
			System.out.println(num1-num2);
			
			}
				
		
		//aggiunta operazione del logaritmo per la calcolatrice
		if(operazione.equals("logaritmo")){
			System.out.println("risulato logaritmo:"+Math.log(num1));
			System.out.println("risulato logaritmo:"+Math.log(num2));
			}
	}
}
