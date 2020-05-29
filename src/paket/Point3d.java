package paket;

public class Point3d {
	
		private double xCoord;
		private double yCoord;
		private double zCoord;
	
		public Point3d( double x, double y, double z) {//конструктор инициализации
	 xCoord = x;
	 yCoord = y;
	 zCoord = z;
		}
	
		public Point3d() {//конструктор по умолчанию
			this(0, 0, 0);
		}
	
		public double getX() {//возвращение координаты Х
			return xCoord;
		}
	
		public double getY() {//возвращение координаты У
			return yCoord;
		}
	
		public double getZ() {//возвращение координаты Z
			return zCoord;
		}
		
		public void setX(double x) {//установка значения координаты Х
			xCoord = x;
		}
	
		public void setY(double y) {//установка значения координаты У
			yCoord = y;
		}
	
		public void setZ(double z) {//установка значения координаты Z
			zCoord = z;
		}
		public double distanceTo(Point3d two) {//метод для нахождения расстрояния между точками
			double x1 = this.getX(), x2 = two.getX();
			double y1 = this.getY(), y2 = two.getY();
			double z1 = this.getZ(), z2 = two.getZ();
			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
			return distance;
		}
	
		public boolean compare(Point3d com) {//проверка на равенство
			return (this.getX() == com.getX() && this.getY() == com.getY() && this.getZ() == com.getZ());
		}

}
