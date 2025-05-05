/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



/**
 *
 * @author ANALISTA_SISTEMA
 */



public class ReadExcel {
    
    public void readExcelDataForSingleRow(String path) throws EncryptedDocumentException, IOException{
        
        
        File f = new File(path);
        FileInputStream fs = new FileInputStream(f);
        
        Workbook workbook = WorkbookFactory.create(fs);
        
        // get sheet
        Sheet sheet = workbook.getSheetAt(0);
        
        // get row
        Row row = sheet.getRow(0);
        
        // get cell
        Cell cell = row.getCell(0);
        
     
        System.out.println(cell.getStringCellValue());
        
        
        
    }
    
    public void readExcelDataForEntirySheet(String path){
        
        /*  Get workbook objetc from input stream
        *   create sheet iterator from workbook
        *   create Row iterator from sheet
        *   create cell iterator from row
        *   find the type of cell
        */
        
    }
    
}
