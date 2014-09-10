/**
 * 
 */
package guice;

/**
 * @author jacekd
 *
 */
public class Circle {
    private final int pointX;

    private final double radius;

    private final String name;

    public Circle(final int pointX, final double radius, final String name) {
        this.pointX = pointX;
        this.radius = radius;
        this.name = name;
    }

    public int getPointX() {
        return pointX;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Circle [pointX=" + pointX + ", radius=" + radius + ", name=" + name + "]";
    }


}
