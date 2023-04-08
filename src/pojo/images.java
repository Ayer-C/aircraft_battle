package pojo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Class Name pojo.images
 *
 * @Date 2023/4/8 10:41
 * @Author Ayer C
 * @Description
 */
public class images {
    public static BufferedImage sky;
    public static BufferedImage bullet;
    public static BufferedImage[] heros;
    public static BufferedImage[] airs;
    public static BufferedImage[] bairs;
    public static BufferedImage[] bbaits;

    public static BufferedImage start;
    public static BufferedImage pause;
    public static BufferedImage gameover;

    static {
        sky = readImage("background.png");
        bullet = readImage("bullet1.png");
        heros = new BufferedImage[2];
        heros[0] = readImage("hero1.png");
        heros[1] = readImage("hero2.png");
        airs = new BufferedImage[5];
        bairs = new BufferedImage[5];
        bbaits = new BufferedImage[5];
        airs[0] = readImage("enemy1.png");
        bairs[0] = readImage("enemy2.png");
        bbaits[0] = readImage("enemy3.png");
        start = readImage("start.png");
        pause = readImage("");
        gameover = readImage("");

        for (int i=1;i<5;i++){
            airs[i]=readImage("enemy1_down3.png");
            bairs[i]=readImage("enemy2_down3.png");
            bbaits[i]=readImage("enemy3_down5.png");
        }
    }

    public static BufferedImage readImage(String fileName){
        try{
            BufferedImage img = ImageIO.read(images.class.getResource(fileName));
            return img;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
