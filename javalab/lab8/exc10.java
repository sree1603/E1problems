import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class exc10{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DisplayImage <image-file-path>");
            return;
        }

        String imagePath = args[0];

        try (FileInputStream fileInputStream = new FileInputStream(imagePath)) {
            BufferedImage image = ImageIO.read(fileInputStream);

            System.out.println("Image width: " + image.getWidth() + " pixels");
            System.out.println("Image height: " + image.getHeight() + " pixels");

            JFrame frame = new JFrame("Display Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JLabel(new ImageIcon(image)));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (IOException e) {
            System.err.println("Error reading the image file: " + e.getMessage());
        }
    }
}
