package texas;

public class Compare extends CardType{
	public static String compare(String st1,String st2) {
		String stmax = null;
		int i=cardType(st1);
		int j=cardType(st2);
		if(i>j)
			stmax="Black";
		else if(i<j)
			stmax="White";
		else {
			int st1max=0;
			int st2max=0;
			int number1[] = new int[13];
			int number2[] = new int[13];
			for (int k = 0; k < st1.length(); k++) {
				switch (st1.substring(k,k+1)) {
				case "2":
					number1[0]++;
					break;
				case "3":
					number1[1]++;
					break;
				case "4":
					number1[2]++;
					break;
				case "5":
					number1[3]++;
					break;
				case "6":
					number1[4]++;
					break;
				case "7":
					number1[5]++;
					break;
				case "8":
					number1[6]++;
					break;
				case "9":
					number1[7]++;
					break;
				case "T":
					number1[8]++;
					break;
				case "J":
					number1[9]++;
					break;
				case "Q":
					number1[10]++;
					break;
				case "K":
					number1[11]++;
					break;
				case "A":
					number1[12]++;
					break;
				default:
					break;
				}
			}
			for (int k = 0; k < st2.length(); k++) {
				switch (st2.substring(k,k+1)) {
				case "2":
					number2[0]++;
					break;
				case "3":
					number2[1]++;
					break;
				case "4":
					number2[2]++;
					break;
				case "5":
					number2[3]++;
					break;
				case "6":
					number2[4]++;
					break;
				case "7":
					number2[5]++;
					break;
				case "8":
					number2[6]++;
					break;
				case "9":
					number2[7]++;
					break;
				case "T":
					number2[8]++;
					break;
				case "J":
					number2[9]++;
					break;
				case "Q":
					number2[10]++;
					break;
				case "K":
					number2[11]++;
					break;
				case "A":
					number2[12]++;
					break;
				default:
					break;
				}
			}
			for (int k = 0; k < number1.length; k++) {
				if(number1[k]!=0)
					st1max=k;
			}
			for (int k = 0; k < number2.length; k++) {
				if(number2[k]!=0)
					st2max=k;
			}
			if(st1max>st2max) {
				stmax="Black";
			}
			else if(st1max<st2max){
				stmax="White";
			}
			else {
				stmax="No One";
			}
		}
		return stmax;
	}
}
