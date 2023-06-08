/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionReporte;

/**
 *
 * @author Brahiam
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import static java.lang.Double.parseDouble;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Brahiam
 */
public class ReporteVentas {
    private static ArrayList<String[]>Ventas = new ArrayList<>();
    
    public ReporteVentas(ArrayList<String[]> ventas){
        this.Ventas = ventas;
        int ANCHOPAGINA = 595;
        Font fontTitulo = new Font(Font.FontFamily.TIMES_ROMAN,18,Font.BOLD);
        Font fontparrafo = new Font(Font.FontFamily.TIMES_ROMAN,14,Font.ITALIC);
        
        Document documento = new Document(PageSize.A4);
        documento.setMargins(0,0,0,0);
        try{
            PdfWriter.getInstance(documento, new FileOutputStream("src/main/java/Reportes/Reporte_"+getHora()+".pdf"));
            
            documento.open();
            
            Image foto = Image.getInstance("src/main/java/resources/encabezado.png");
            foto.scaleAbsoluteWidth(ANCHOPAGINA);
            float escala = (float) ANCHOPAGINA / foto.getScaledWidth();
            foto.scaleAbsoluteHeight(125);
            foto.setAlignment(Image.ALIGN_CENTER);
            
            documento.add(foto);
            
            Paragraph titulo = new Paragraph("Reporte de ventas: "+ getHora(),fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            
            Paragraph parrafo = new Paragraph("\n \n A continuación se adjunta una tabla "
                    + "con el reporte de ventas a la fecha y hora indicadas en el "
                    + "documento.\n",fontparrafo);
            parrafo.setAlignment(Element.ALIGN_CENTER);
            documento.add(parrafo);
            
            //tabla de reporte
            PdfPTable reporte = new PdfPTable(5);
            reporte.setWidthPercentage(100); // La tabla ocupa el ancho completo de la página
            reporte.setSpacingBefore(10f); // Espacio antes de la tabla
            reporte.setSpacingAfter(10f); // Espacio después de la tabla 
            
            PdfPCell cell1 = new PdfPCell(new Paragraph("Tipo de plan"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("cantidad"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Valor individual"));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Descuento por puntos"));
            PdfPCell cell5 = new PdfPCell(new Paragraph("Total de venta"));
            
            reporte.addCell(cell1);
            reporte.addCell(cell2);
            reporte.addCell(cell3);
            reporte.addCell(cell4);
            reporte.addCell(cell5);
            
            int suma = crearCeldas(Ventas,reporte);
            
            //añadir celdas de espaciado y el total de ventas
            reporte.addCell("");
            reporte.addCell("");
            reporte.addCell("");
            reporte.addCell("Total ventas: ");
            reporte.addCell(""+suma);
            
            documento.add(reporte);
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            documento.close();
        }
    }
    
    
    public static String getHora(){
        String dateTime = DateTimeFormatter.ofPattern("MMM_dd_yyy_hh_mm")
                .format(LocalDateTime.now());
        return dateTime;
    }
    
    public static int crearCeldas(ArrayList<String[]> array, PdfPTable pdf){
        int sumatoria=0;
        for(int i=0; i<array.size();i++){
            double descuento;
            double cantidad = parseDouble(array.get(i)[1]);
            double precio = parseDouble(array.get(i)[2]);
            double total = (Double)(cantidad*precio);
            
            pdf.addCell(array.get(i)[0]);
            pdf.addCell(array.get(i)[1]);
            pdf.addCell(array.get(i)[2]);
            if(array.get(i)[3] == "true"){
                descuento = (total*0.1);
            }
            else{
                descuento = 0;
            }   
            pdf.addCell(""+descuento);
            pdf.addCell(""+(total-descuento));
            sumatoria +=(total-descuento);
        }
        return sumatoria;
    }
}
