package day4;

public class Shapes {

public double calculateArea(int length,int width) {
	double area = length * width;
	return  area;
	
}
public double calculateArea(int side) {
	double area = side * side;
	return  area;
}
public double calculateArea(double radius) {
	double area = Math.PI*radius*radius;
	return  area;
}
}
