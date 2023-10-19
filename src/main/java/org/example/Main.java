package org.example;
import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;
//C:/Users/Admin/Downloads/input.xlsx
public class Main {
    public static void main(String[] args){
//Create a Workbook instance and load an Excel file
        Workbook workbook = new Workbook();
        workbook.loadFromFile("input.xlsx");

        //Set worksheets to fit to width when converting
        workbook.getConverterSetting().setSheetFitToWidth(true);

        //Get the first worksheet
        Worksheet worksheet = workbook.getWorksheets().get(0);

        //Convert to PDF and save the resulting document to a specified path
        worksheet.saveToPdf("output/WorksheetToPdf.pdf");
    }

}