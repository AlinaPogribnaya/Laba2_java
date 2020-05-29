package paket;

public class Lab1 {
	public static double computeArea(Point3d a,Point3d b,Point3d c){//����� ��� ���������� ������� 
		double ab=(a.distanceTo(b));
		double bc=(b.distanceTo(c));
		double ac=(a.distanceTo(c));
		double p=(ab+bc+ac)/2;
		return (Math.sqrt(p*(p-ab)*(p-bc)*(p-ac)));

	}
	public static void main(String[] args){
		Point3d a = new Point3d();//�������� 1�� ����� 
		Point3d b = new Point3d(2,4,10);//�������� 2�� ����� 
		Point3d c = new Point3d(4,10,7);//�������� 3�� �����
		if (a.compare(b) ||  a.compare(c) ||  c.compare(b))
			System.out.println("Incorrect coordinates");
		else{
			System.out.print("������� ������������ = ");
			System.out.printf("%.2f", computeArea(a, b, c));//����� ������� ������������
		}
		
	}
	

}
