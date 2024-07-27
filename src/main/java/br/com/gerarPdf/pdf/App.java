package br.com.gerarPdf.pdf;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	try {
    		File directory = new File("/home/davidks/GERARPDF/pdf");
			File docPDF = File.createTempFile("david", ".pdf", directory);
			
			if(!docPDF.exists()) {
				docPDF.createNewFile();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
