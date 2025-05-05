/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.IOException;


/**
 *
 * @author ANALISTA_SISTEMA
 */
public class TesteExcel {
    
    public static void main(String[] args) throws IOException{
//        try{
//        FileInputStream file = new FileInputStream("src/main/java/resources/Liquidações 10-04.xlsx");
//        
//        Workbook wb = new XSSFWorkbook(file);
//        
//        Sheet sheet = wb.getSheetAt(0);
//        
//        for(Row row: sheet){
//            
//            for(Cell cell: row){
//                System.out.println(cell.toString()+"\t"); 
//            }
//            System.out.println();
//        }
//        
//        wb.close();
//        file.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        


    

    ReadExcel readExcel = new ReadExcel();
    
    String path = "src/main/java/resources/Liquidações 10-04.xlsx";
    
    readExcel.readExcelDataForSingleRow(path);
    }
}
