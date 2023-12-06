package demo;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class LectureTexte {
	
	public static void readTexte(String cheminImage) {
		Tesseract  tesseract = new Tesseract();
		try {
			tesseract.setDatapath("E:\\Recognize\\Tess4J\\tessdata");
			String text = tesseract.doOCR(new File(cheminImage));
			System.out.println(text);
			
		}
		catch (TesseractException e ) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
