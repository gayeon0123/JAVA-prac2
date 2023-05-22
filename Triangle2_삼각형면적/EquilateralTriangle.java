package 과제.Triangle2_삼각형면적;

public class EquilateralTriangle {

    int x1, x2, y1, y2 = 0;

    public double getDistance() {

        double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double area = Math.sqrt(3) * a * a / 4;
        return area;
    }
}
