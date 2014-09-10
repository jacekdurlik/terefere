/**
 * 
 */
package guice;

import com.google.inject.Inject;

/**
 * @author jacekd
 *
 */
public class CircleService {
    @Inject
    Circle circle;

    public void print() {
        System.out.println(circle);
    }
}
