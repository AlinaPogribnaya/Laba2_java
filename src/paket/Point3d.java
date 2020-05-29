package paket;

public class Point3d {
	
		private double xCoord;
		private double yCoord;
		private double zCoord;
	
		public Point3d( double x, double y, double z) {//����������� �������������
	 xCoord = x;
	 yCoord = y;
	 zCoord = z;
		}
	
		public Point3d() {//����������� �� ���������
			this(0, 0, 0);
		}
	
		public double getX() {//����������� ���������� �
			return xCoord;
		}
	
		public double getY() {//����������� ���������� �
			return yCoord;
		}
	
		public double getZ() {//����������� ���������� Z
			return zCoord;
		}
		
		public void setX(double x) {//��������� �������� ���������� �
			xCoord = x;
		}
	
		public void setY(double y) {//��������� �������� ���������� �
			yCoord = y;
		}
	
		public void setZ(double z) {//��������� �������� ���������� Z
			zCoord = z;
		}
		public double distanceTo(Point3d two) {//����� ��� ���������� ����������� ����� �������
			double x1 = this.getX(), x2 = two.getX();
			double y1 = this.getY(), y2 = two.getY();
			double z1 = this.getZ(), z2 = two.getZ();
			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
			return distance;
		}
	
		public boolean compare(Point3d com) {//�������� �� ���������
			return (this.getX() == com.getX() && this.getY() == com.getY() && this.getZ() == com.getZ());
		}

}
