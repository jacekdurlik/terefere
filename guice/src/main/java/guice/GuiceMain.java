/**
 * 
 */
package guice;

import com.google.inject.Guice;

/**
 * @author jacekd
 *
 */
public class GuiceMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CircleService csvc1 = Guice.createInjector(new CircleModule(0, 20.0d, "kapitan")).getInstance(
                CircleService.class);

        csvc1.print();

        CircleService csvc2 = Guice.createInjector(new CircleModule(10, 50.0d, "yolo"))
                .getInstance(CircleService.class);

        csvc2.print();
    }

}
