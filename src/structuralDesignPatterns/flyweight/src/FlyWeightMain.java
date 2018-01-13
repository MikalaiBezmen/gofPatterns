package structuralDesignPatterns.flyweight.src;

import structuralDesignPatterns.flyweight.src.api.Shape;
import structuralDesignPatterns.flyweight.src.impl.ShapeFactory;

import javax.swing.*;
import java.awt.*;


/**
 * FlyWeightMain.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class FlyWeightMain extends JFrame {

    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;
    private static final ShapeFactory.ShapeType shapes[] = {ShapeFactory.ShapeType.LINE,
            ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOFILL};
    private static final Color colors[] = {Color.RED, Color.GREEN,
            Color.YELLOW};

    public FlyWeightMain(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();
        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        startButton.addActionListener(event -> {
            Graphics g = panel.getGraphics();
            for (int i = 0; i < 20; ++i) {
                Shape shape = ShapeFactory.getShape(getRandomShape());
                shape.draw(g, getRandomX(), getRandomY(),
                        getRandomWidth(),
                        getRandomHeight(), getRandomColor());
            }
        });
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        FlyWeightMain drawing = new FlyWeightMain(500, 600);
    }
}
