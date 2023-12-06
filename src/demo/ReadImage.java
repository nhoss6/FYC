package demo;


import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {

	public static void main(String[] args)
	{
		Tesseract  tesseract = new Tesseract();
		try {
			tesseract.setDatapath("E:\\Recognize\\Tess4J\\tessdata");
			String text = tesseract.doOCR(new File("E:\\Science U - ESGI\\Rond.png"));
			System.out.println(text);
			
		}
		catch (TesseractException e ) {
			e.printStackTrace();
		}
	}
	
}
