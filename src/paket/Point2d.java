package paket;

public class Point2d {
	private double xCoord;
    private double yCoord;
    public Point2d(double x,double y){//конструктор инициализации
        xCoord = x;
        yCoord = y;
    }
    public Point2d(){//конструктор по умолчанию
        this(0,0);
    }
    public double getX(){//возвращение координаты ’
    	return xCoord;}
    public double getY(){//возвращение координаты ”
    	return yCoord;}
    public void setX(double val){//установка значени€ координаты ’
        xCoord = val;
    }
    public void setY(double val){//установка значени€ координаты ”
        yCoord = val;
}

}
