import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MazeSolver extends JFrame {

    private int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public List<Integer> path = new ArrayList<>();

    public MazeSolver() {
        setTitle("Maze Solver");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.translate(50, 50);

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                Color color;
                switch (maze[i][j]) {
                    case 1: color = Color.BLACK; break; // wall
                }
                g.setColor(color);
                g.fillRect(30 * j, 30 * i, 30, 30);
                g.setColor(Color.RED);
                g.drawRect(30 * j, 30 * i, 30, 30);
            }
        }
    }

    public static void main(String[] args) {
        MazeSolver view = new MazeSolver();
        view.setVisible(true);
    }
}
