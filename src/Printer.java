public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <=100){
            this.tonerLevel =  tonerLevel;
        }
        if(pagesPrinted >0  && pagesPrinted < 1000){
            this.pagesPrinted = pagesPrinted;
        }

        this.isDuplexPrinter = isDuplexPrinter;
    }



    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }


//    public void fillToner(int toner){
//        this.tonerLevel += toner;
//        if(this.tonerLevel >0 && this.tonerLevel <=100){
//            System.out.println("Percentage of toner level is: "+ this.tonerLevel);
//        }else{
//            System.out.println("Toner Level is out of range!!!");
//        }
//
//    }
    public int fillToner(int toner){
        if(toner >0 && toner <=100){
            if(this.tonerLevel + toner > 100){
                return -1;
            }
            this.tonerLevel += toner;
            return this.tonerLevel;
        }else{
            return -1;
        }

    }


//    public void printPage(int printPages){
//        if (printPages > 0){
//            this.pagesPrinted += printPages;
//        }
//        System.out.println("Pages Printed: " + this.pagesPrinted);
//    }


    public int printPages(int pages){
        int pagesToPrint= pages;
        if(isDuplexPrinter){
            pagesToPrint =(pages /2) + (pages %2);
            System.out.println("Printing in Duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }


}
