package Clases;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/*Librerías para trabajar con archivos excel*/
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Felipe
 */
public class Excel {
    
    public Excel(){
        
    }
    
    public void exportar(ArrayList<String> horario) throws FileNotFoundException, IOException{
        /*La ruta donde se creará el archivo*/
        String rutaArchivo = System.getProperty("user.home")+"/ejemploExcelJava.xls";
        /*Se crea el objeto de tipo File con la ruta del archivo*/
        File archivoXLS = new File(rutaArchivo);
        /*Si el archivo existe se elimina*/
        if(archivoXLS.exists()) archivoXLS.delete();
        /*Se crea el archivo*/
        archivoXLS.createNewFile();
        
        /*Se crea el libro de excel usando el objeto de tipo Workbook*/
        Workbook libro = new HSSFWorkbook();
        /*Se inicializa el flujo de datos con el archivo xls*/
        FileOutputStream archivo = new FileOutputStream(archivoXLS);
        
        /*Utilizamos la clase Sheet para crear una nueva hoja de trabajo dentro del libro que creamos anteriormente*/
        Sheet hoja = libro.createSheet("Mi Horario");
        
        int cont = 0;
        
        /*Hacemos un ciclo para inicializar los valores de 10 filas de celdas*/
        for(int f = 0; f < 12; f++){
            /*La clase Row nos permitirá crear las filas*/
            Row fila = hoja.createRow(f);
            
            /*Cada fila tendrá 7 celdas de datos*/
            for(int c =0; c < 6; c++){
                /*Creamos la celda a partir de la fila actual*/
                Cell celda = fila.createCell(c);
                
                /*Si la fila es la número 0, estableceremos los encabezados*/
                if(f==0 && cont ==0){
                    celda.setCellValue("Periodo");
                    cont++;                   
                }else if(f==0 && cont ==1){
                    celda.setCellValue("Lunes");
                    cont++;
                }else if(f==0 && cont ==2){
                    celda.setCellValue("Martes");
                    cont++;
                }else if(f==0 && cont ==3){
                    celda.setCellValue("Miercoles");
                    cont++;
                }else if(f==0 && cont ==4){
                    celda.setCellValue("Jueves");
                    cont++;
                }else if(f==0 && cont ==5){
                    celda.setCellValue("Viernes");
                    cont++;
                }else if(f==0 && cont ==6){
                    celda.setCellValue("Sabado");
                    cont++;
                }
                if(f!=0 && (cont ==0 || cont ==1 || cont ==2 || cont ==3 || cont ==4 || cont ==5 || cont ==6)){
                    /*Si no es la primera fila establecemos un valor*/
                    
                    celda.setCellValue(horario.get(c));
                }
            }
        }
        
        
        /*Si no es la primera fila establecemos un valor*/
        //celda.setCellValue("Valor celda "+c+","+f);
        
        /*Escribimos en el libro*/
        libro.write(archivo);
        /*Cerramos el flujo de datos*/
        archivo.close();
        /*Y abrimos el archivo con la clase Desktop*/
        Desktop.getDesktop().open(archivoXLS);
    }
        
}
