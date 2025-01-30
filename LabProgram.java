import java.util.Scanner;
public class LabProgram
{
	public static int calcAGI(int num1, int num2, int num3) {
	    return (Math.abs(num1)+Math.abs(num2)+Math.abs(num3));
	}
	public static int getDeduction(int num1) {
	    if (num1 == 2) {
	        return 24000;
	    }
	    else if (num1 == 1) {
	        return 12000;
	    }
	    else {
	        return 6000;
	    }
	}
	public static int calcTaxable(int num1, int num2) {
	    int num3 = num1 - num2;
	    if (num3 < 0) {
	        return 0;
	    }
	    else {
	        return num3;
	    }
	}
	public static int calcTax(int num1, int num2) {
	    double num3 = 0.0;
	    if (num1 == 2){
	        if (num2 > 80000) {
	            num3 = (num2-80000)*0.22;
	            return (int) (9200 + Math.round(num3));
	        }
	        else if (num2 > 20000) {
	            num3 = (num2-20000)*0.12;
	            return (int) (2000 + Math.round(num3));
	        }
	        else {
	            num3 = num2*0.1;
	            return (int) (Math.round(num3));
	        }
	    }
	    else {
	        if (num2 > 85000){
	            num3 = (num2-85000)*0.24;
	            return (int) (14500 + Math.round(num3));
	        }
	        else if (num2 > 40000){
	            num3 = (num2-40000)*0.22;
	            return (int) (4600 + Math.round(num3));
	        }
	        else if (num2 > 10000){
	            num3 = (num2-10000)*0.12;
	            return (int) (1000+Math.round(num3));
	        }
	        else {
	            num3 = num2*0.1;
	            return (int) (Math.round(num3));
	        }
	    }
	}
	public static int calcTaxDue(int num1, int num2){
	    if (num2 < 0){
	        num2 = 0;
	    }
	    return num1-num2;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter wages:");
		int wages = scan.nextInt();
		System.out.print("\nEnter intrest:");
		int intrest = scan.nextInt();
		System.out.print("\nEnter Uneployment rate:");
		int uneployment = scan.nextInt();
		System.out.print("\nEnter stats:");
		int stats = scan.nextInt();
		System.out.print("\nEnter held Tax:");
		int heldTax = scan.nextInt();
		int agi = calcAGI(wages, intrest, uneployment);
		int deduction = getDeduction(stats);
		int taxable = calcTaxable(agi, deduction);
		int tax = calcTax(stats,taxable);
		int taxDue = calcTaxDue(tax,heldTax);
		System.out.printf("AGI: $%,d\n",agi);
		System.out.printf("Deduction: $%,d\n",deduction);
		System.out.printf("Taxable income: $%,d\n",taxable);
		System.out.printf("Federal tax: $%,d\n",tax);
		System.out.printf("Tax due: $%,d\n",taxDue);
	}
}
