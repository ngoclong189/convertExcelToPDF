package org.example;

import com.groupdocs.conversion.Converter;
import com.groupdocs.conversion.options.convert.PdfConvertOptions;

import java.io.File;
import java.io.IOException;
//C:/Users/Admin/Downloads/input.xlsx
public class Main {
    public static void main(String[] args) throws IOException {
        Converter converter = new Converter("input.xlsx");
        PdfConvertOptions options = new PdfConvertOptions();

        converter.convert("converted.pdf", options);

    }

}