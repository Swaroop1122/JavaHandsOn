/**
 * 
 */
package com.swaroop.MiscellaneousTasks;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author Swaroop
 *
 */
public class printDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getDifference outImg = new getDifference();
		BufferedImage img1 = null;
		try {
		    img1 = ImageIO.read(new File("C:\\Swaroop\\Test\\Image1.jpeg"));
		} catch (IOException e) {
		}
		BufferedImage img2 = null;
		try {
		    img2 = ImageIO.read(new File("C:\\Swaroop\\Test\\Image2	.jpeg"));
		} catch (IOException e) {
		}
		
		outImg.getDifferenceImage(img1, img2);	

	}

}
