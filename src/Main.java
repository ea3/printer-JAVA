public class Main {

   public static void main(String [] args){

       Printer printer = new Printer(50, 250, false);
       System.out.println("Initial page count: " + printer.getPagesPrinted());
       int pagesPrinted= printer.printPages(25);
       System.out.println("Pages printed was : " + pagesPrinted + " and new total print count is: "+ printer.getPagesPrinted());
       pagesPrinted = printer.printPages(3);
       System.out.println("Pages printed was : " + pagesPrinted + " and new total print count is: "+ printer.getPagesPrinted());


//       System.out.println("Printing : "+ printer.printPages(201));
//       printer.fillToner(35);
//       printer.printPages(300);
//       printer.fillToner(25);



   }

}
