package org.example;


import com.spire.xls.FileFormat;
import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;

import java.awt.*;
import java.io.File;
import java.io.IOException;


//C:/Users/Admin/Downloads/input.xlsx
public class Main {
    public static void main(String[] args) throws IOException {


        //Create a Workbook instance and load an Excel file
        Workbook workbook = new Workbook();
        workbook.loadFromFile("input.xlsx");

        //Set worksheets to fit to page when converting
        workbook.getConverterSetting().setSheetFitToPage(true);
        workbook.getConverterSetting().setYDpi(500);
        //Save the resulting document to a specified path
        workbook.saveToFile("output/test.pdf", FileFormat.PDF);

    }



}