import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
				int sum = 0;
				int leap;
				System.out.print("���������ڣ���ʽΪ2016-1-1��\n");
				Scanner sc = new Scanner(System.in);
				String date=sc.next();
				String[] dates=date.split("-");
				int year=Integer.parseInt(dates[0]);
				int month=Integer.parseInt(dates[1]);
				int day=Integer.parseInt(dates[2]);

				switch (month) /* �ȼ���ĳ����ǰ�·ݵ������� */
				{
				case 12:sum+=30;
				case 11:sum+=31;
				case 10:sum+=30;
				case 9:sum+=31;
				case 8:sum+=31;
				case 7:sum+=30;
				case 6:sum+=31;
				case 5:sum+=30;
				case 4:sum+=31;
				case 3:sum+=28;
				case 2:sum+=31;
				}
				sum = sum + day; /* �ټ���ĳ������� */
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))/* �ж��ǲ������� */
					leap = 1;
				else
					leap = 0;
				if (leap == 1 && month > 2)/* ������������·ݴ���2,������Ӧ�ü�һ�� */
					sum++;
				System.out.println("�����������Ϊ����ĵ�" + sum+"��");
			}

}
