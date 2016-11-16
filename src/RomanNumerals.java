
public class RomanNumerals {
	
	
	/*
	 * Di solito basta ordinare le lettere romane in un vettore in ordine di grandezza numerica
	 *  e poi controllare il valore della cifra romana successiva nella stringa letta per sapere 
	 *  se sommare o sotrarre. In genere quando il valore della cifra successiva è maggiore bisogna sottrarre
	 *	es. 2009 = MMIX -> 
	 *	1) leggo M (successiva M) e sommo 1000 
	 *	2) leggo M (successiva M) e sommo 1000 
	 *	3) leggo I (successiva X) sottraggo 1 
	 *	4) leggo X (fine stringa) e sommo 10 
	 *	es 1982 = MCMLXXXII -> 
	 *	1) leggo M (successiva C) e sommo 1000
	 *	2) leggo C (successiva M) e sottraggo 100
	 *	3) leggo M (successiva L) e sommo 1000
	 */
	
	
	char[] letters;
	int onvertedNumber;
	
	public int convertToInteger(String romanNum) throws VLD_CantBeRepetedException {
		
		int numeroConvertito = 0;
		letters = romanNum.toCharArray();
		
		for(int i = 1; i < letters.length; i++){
			
			if(convertiLettera(letters[i-1]) >= convertiLettera(letters[i])){
				
				// VLD non possono essere ripetuti
				if(letters[i-1] == letters[i] && (letters[i] == 'V'||letters[i] == 'L' || letters[i] == 'D')){
					throw new VLD_CantBeRepetedException();
				}
				
				
				numeroConvertito += convertiLettera(letters[i-1]);
			}else{
				numeroConvertito -= convertiLettera(letters[i-1]);
			}
			if(i == letters.length-1){
				numeroConvertito += convertiLettera(letters[i]);
			}
			
		}
		
		
		return numeroConvertito;
		
	}
	
	int convertiLettera(char romanNumber){
		int num = 0;
		switch(romanNumber){
		case 'M':
			num = 1000;
			break;
		case 'D':
			num = 500;
			break;
		case 'C':
			num = 100;
			break;
		case 'L':
			num = 50;
			break;
		case 'X':
			num = 10;
			break;
		case 'I':
			num = 1;
			break;
		}
		
		
		return num;
		
	}
	
}
