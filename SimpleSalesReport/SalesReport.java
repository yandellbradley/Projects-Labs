package salesreport;

import java.text.NumberFormat;

/**
 *
 * @author Bradley
 */
public class SalesReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int j = 1;
        int quarter = 1;
        double salesTotal = 0;
        double regionSalesTotal = 0;
        double quarterSalesTotal = 0;
       
            
        
        // create and initialze our array
        double [][]salesTable = {{1540, 2010, 2450, 1845}, {1130, 1168, 1847, 1491}, {1580, 2305, 2710, 1284}, {1105, 4102, 2391, 1576}};
        
        // print salesTable array
        System.out.println("Welcome to the Sales Report");
        System.out.println();
        System.out.println("Region " + "    Q1 " + "        Q2 " + "        Q3 " + "        Q4 ");
        for (double[] row : salesTable) {
            System.out.print(i + "          ");
            i = i + 1;
         
            for (double column : row) {
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                String priceFormatted = currency.format(column);
                System.out.print(priceFormatted + "  ");
               
            }
            System.out.println("");
            }
        //calculate and print sales by region
        System.out.println();
        System.out.println("Sales by region");
       
          
        for (double[] row : salesTable) {
            System.out.print("Region " + j + ":" + "   ");
            j = j + 1;
            for (double column : row) {
                regionSalesTotal = regionSalesTotal + column;
                //System.out.print(column + "     ");
            }
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String priceFormatted = currency.format(regionSalesTotal);
            
            System.out.print(priceFormatted);
            salesTotal = salesTotal + regionSalesTotal;
            regionSalesTotal = 0;
            //System.out.print(regionSalesTotal + "     ");
            System.out.println("");
            }
        
         //calculate and print sales by region
        
        System.out.println();
        System.out.println("Sales by quarter");
        
        
        for (int n = 0; n < salesTable.length; n ++) {
            
            for (int k = 0; k < salesTable.length; k ++) {
                //System.out.print("Q" + k + ":" + "   ");
                quarterSalesTotal =  quarterSalesTotal + salesTable[k][n];
            }
         quarter = quarter + n;
         
         NumberFormat currency = NumberFormat.getCurrencyInstance();
         String priceFormatted = currency.format(quarterSalesTotal);
         System.out.printf("Q" + (n + 1 + ":  "));
         System.out.printf(priceFormatted);
        
         quarterSalesTotal = 0;
         System.out.println("");   
            
        }
        //print total annual sales for all regions
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(salesTotal);
        System.out.println();
        System.out.println("Total annual sales, all regions:  " + priceFormatted);
     }
       
      }
        
      
        
            
