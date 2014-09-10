/**
 * 
 */
package guice;

import com.google.inject.AbstractModule;

/**
 * @author jacekd
 *
 */
public class CircleModule extends AbstractModule {
    private final Circle circle;

    public CircleModule(final int pointX, final double radius, final String name) {
        circle = new Circle(pointX, radius, name);
    }

    @Override
    protected void configure() {
        bind(Circle.class).toInstance(circle);
    }

}
