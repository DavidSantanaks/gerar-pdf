package br.com.gerarPdf.pdf;

import java.io.FileOutputStream;
import java.util.Iterator;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//criacao do documento
    	Document document = new Document();
    	
    	try {
			PdfWriter.getInstance(document, new FileOutputStream("/home/davidks/GERARPDF/pdf/local/TesteGerar.pdf"));
			document.open();
			
						
				document.add(new Paragraph("Gerando pdf - java" ));
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	document.close();
    }
}
