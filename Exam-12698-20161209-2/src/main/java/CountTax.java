import java.util.Scanner;


public class CountTax {

	private static double tax;

	public static void main(String[] args) {
		System.out.println("�����빤�ʣ�");
		Scanner sc=new Scanner(System.in);
		double sal= sc.nextDouble();
		double tax=countTax(sal);
		System.out.println("��Ҫ���ɵ�˰��Ϊ��"+tax);
		}

	/**
	 * ����˰��
	 * @param sal
	 * @return
	 */
	private static double countTax(double sal) {
		//��������
		double taxbase = sal - 3500;
		//˰��
		double taxrate=0;
	    if(taxbase<0){
	    	return sal;
	    }else if(taxbase<=1500){
	    	taxrate=0.03;
	    }else if(taxbase<=4500){
	    	taxrate=0.10;
	    }else if(taxbase<=9000){
	    	taxrate=0.20;
	    }else if(taxbase<=350000){
	    	taxrate=0.25;
	    }else if(taxbase<=9000){
	    	taxrate=0.30;
	    }else if(taxbase<=55000){
	    	taxrate=0.35;
	    }else if(taxbase<=80000){
	    	taxrate=0.45;
	    }
		return (sal - 3500) * taxrate;
	}
}
