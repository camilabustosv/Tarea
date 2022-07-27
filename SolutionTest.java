import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

        @Test
        public void drawLines() {
            Canvas c = new Canvas(5, 5);
            c.draw(0, 2, 4, 2).draw(2, 0, 2, 4);
            assertEquals("-------\n|  x  |\n|  x  |\n|xxxxx|\n|  x  |\n|  x  |\n-------", c.drawCanvas());
        }

        @Test
        public void drawRectangle() {
            Canvas c = new Canvas(7, 7);
            c.draw(1, 1, 5, 4);
            assertEquals("---------\n|       |\n| xxxxx |\n| x   x |\n| x   x |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
        }

    }

