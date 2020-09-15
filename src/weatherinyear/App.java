/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherinyear;



import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author pupil
 */

   class App {
    public void run(){
       //Создаем зубчатый массив для хранения дней года
       byte n = 0, max = 0,min = 0;
         
       
       
       Random random = new Random();
        int[][] tempInYear = new int[12][];
       for(int i=0;i<tempInYear.length;i++){
           switch (i) {                      
              case 0: n = 31; min = -25; max = 0;break;                   
              case 1: n = 28; min = -20; max = 5;break;                   
              case 2: n = 31; min = -10; max = 10;break;                   
              case 3: n = 30; min = -5; max = 15;break;                   
              case 4: n = 31; min = 0; max = 15;break;                   
              case 5: n = 30; min = 10; max = 20;break;                   
              case 6: n = 31; min = 5; max = 15;break;                   
              case 7: n = 30; min = 0; max = 5;break;                  
              case 8: n = 31; min = -10; max = 5;break;                   
              case 9: n = 31; min = 0; max = 15;break;                   
              case 10: n = 30; min = -10; max = 10;break;                  
              case 11: n = 31; min = -20; max = 0;break;                                                             
           }
          
         tempInYear[i] = new int[n];
         for(byte j = 0; j <tempInYear[i].length;j++){
             tempInYear[i][j] = random.nextInt(max-min +1)+min;
             
         }
       }
       //вывод температуры
        System.out.print("   ");
       for(int i =1; i<32;i++){
            System.out.printf("%4d",i);
       }
       System.out.println();
       System.out.print("   ");
       for(int i = 1;i < 32;i++){
           System.out.printf("%s","===");
           
           }
           System.out.println();
           int minT = 50;
           int maxT = -50;
           for(byte i=0;i < tempInYear.length;i++){
               System.out.printf("%2d ",i+1);
               for(byte j=0;j < tempInYear.length;j++){
               System.out.printf("%4d ",tempInYear[i][j]);
               if(tempInYear[i][j]< minT)maxT = tempInYear[i][j]; 
               if(tempInYear[i][j]< maxT)minT = tempInYear[i][j]; 
       }
       
       System.out.println();
       
    }
        System.out.println("Минимальная температура в году:"+minT);
        System.out.println("Максимальная температура в году"+maxT);
        System.out.println("Температура в конкретный день года.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц");int month = scanner.nextInt();
        System.out.print("Введите день");int day = scanner.nextInt();
        
    }
   }
