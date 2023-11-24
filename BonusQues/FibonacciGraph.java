package BonusQues;


    import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

    public class FibonacciGraph extends JPanel {
        private List<Integer> fibonacciNumbers;

        public FibonacciGraph() {
            fibonacciNumbers = generateFibonacciSeries(15); // Change the number of terms as needed
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int x = 10;
            int y = getHeight() - 10;

            for (int i = 0; i < fibonacciNumbers.size(); i++) {
                int fibNum = fibonacciNumbers.get(i);
                g.drawString(String.valueOf(fibNum), x, y - fibNum * 10);
                g.fillRect(x, y - fibNum * 10, 20, 20); // Draw a rectangle for each Fibonacci number
                x += 30; // Increase the horizontal spacing
            }
        }

        private List<Integer> generateFibonacciSeries(int n) {
            List<Integer> series = new ArrayList<>();
            int a = 0;
            int b = 1;
            series.add(a);
            series.add(b);

            for (int i = 2; i < n; i++) {
                int next = a + b;
                series.add(next);
                a = b;
                b = next;
            }

            return series;
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Fibonacci Sequence Graph");
            FibonacciGraph graph = new FibonacciGraph();
            frame.add(graph);

            frame.setSize(800, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }

}
