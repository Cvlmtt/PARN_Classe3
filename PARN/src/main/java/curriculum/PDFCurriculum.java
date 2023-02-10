package curriculum;

import Storage.Entity.Curriculum;
import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;

import java.io.File;
import java.io.IOException;

public class PDFCurriculum implements PDFCurriculumInterface{

    public static final String REGULAR = "./font/arialn.ttf";

    public String downloadCurriculum(Curriculum curriculum) throws IOException {
        String filename = "./pdf/";
        filename = filename +
                curriculum.getPersona().getCognome() +
                curriculum.getPersona().getNome() +
                curriculum.getPersona().getDataDiNascita() +
                ".pdf";
        File file = new File(filename); //aggiungere destinazione
        PdfWriter writer = new PdfWriter(""); //aggiungere destinazione
        PdfDocument pdf = new PdfDocument(writer);
        Document doc = new Document(pdf);

        FontProgram fontProgram = FontProgramFactory.createFont(REGULAR);
        PdfFont font = PdfFontFactory.createFont(fontProgram, PdfEncodings.WINANSI, PdfFontFactory.EmbeddingStrategy.PREFER_EMBEDDED);

        Table table = new Table(4).useAllAvailableWidth().setFixedLayout();

        StrutturaCurriculum struttura = new StrutturaCurriculum(font, table);
        struttura.aggiungiIntestazione(curriculum.getPersona().getFoto());
        struttura.aggiungiInformazioniPersonali(curriculum.getPersona());
        struttura.aggiungiEsperienzaLavorativa(curriculum.getEsperienze());
        struttura.aggiungiIstruzione(curriculum.getIstruzioni());
        struttura.aggiungiCompetenzeLinguistiche(curriculum.getLingue());
        doc.add(struttura.getTable());

        int numberOfPages = pdf.getNumberOfPages();
        for (int i = 1; i <= numberOfPages; i++) {
            doc.showTextAligned(new Paragraph(String.format("Pagina %s di %s", i, numberOfPages)).setFont(font).setFontSize(10),
                    550,
                    15,
                    i,
                    TextAlignment.RIGHT,
                    VerticalAlignment.BOTTOM,
                    0);
        }

        doc.close();
        return ""; //path al pdf
    }
}
