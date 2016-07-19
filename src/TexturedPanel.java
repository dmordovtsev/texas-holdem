import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TexturedPanel {
	
	private static Image texture;
	public JFrame frame;
	public ImagePanel panel;
	
	public TexturedPanel(boolean relativePath, String imagePath, int frameWidth, int frameHeight) throws IOException
	{
		String path = "";
		if(relativePath)
		{
			path = new File(".").getCanonicalPath();
		}
		texture = ImageIO.read(new File(path + imagePath));
		panel = new ImagePanel(texture);
		//
		frame = new JFrame();
		//frame.setLayout(new GridLayout(1,3));
		frame.setSize(frameWidth, frameHeight);
		frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
}

@SuppressWarnings("serial")
class ImagePanel extends JPanel {
    private Image image;
    private boolean tile;
    
    ImagePanel(Image image) {
        this.image = image;
        this.tile = true;
    };

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (tile) {
            int iw = image.getWidth(this);
            int ih = image.getHeight(this);
            if (iw > 0 && ih > 0) {
                for (int x = 0; x < getWidth(); x += iw) {
                    for (int y = 0; y < getHeight(); y += ih) {
                        g.drawImage(image, x, y, iw, ih, this);
                    }
                }
            }
        } else {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
        
    }
}
