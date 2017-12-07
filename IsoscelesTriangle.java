/*
 This class forms an isosceles triangle by letting user input the length of equal sides and the inequal side.
 */

public class IsoscelesTriangle {
    
    private double equalSide, inequalSide, perimeter, equalAngle, area;
    
    /*
     Class Constructor
     @param equalSide The length of the equal sides.
     @param inequalSide The length of the inequal side.
     */
    public IsoscelesTriangle(double equalSide, double inequalSide) {
        this.equalSide = equalSide;
        this.inequalSide = inequalSide;
        perimeter = 2 * equalSide + inequalSide;
        equalAngle = Math.toDegrees(Math.acos(Math.pow(inequalSide, 2) / (2 * equalSide * inequalSide)));
        area = Math.sin(Math.toRadians(equalAngle)) * equalSide * inequalSide / 2;
    }
    
    /*
     This method returns the perimeter of the triangle.
     @return Return the perimeter.
     */
    public double getPerimeter() {
        return perimeter;
    }
    
    /*
     This method returns the equal angle of the triangle.
     @return Return the equal angle.
     */
    public double getEqualAngles() {
        return equalAngle;
    }
    
    /*
     This method returns the area of the triangle.
     @return Return the area.
     */
    public double getArea() {
        return area;
    }
    
}
