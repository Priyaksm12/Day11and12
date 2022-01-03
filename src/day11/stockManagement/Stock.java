package day11.stockManagement;
import StockProtfolio.StockPortfolio;
import java.util.ArrayList;
import java.util.Scanner;
public class Stock {

    public void enterStockDetails(StockPortfolio spf){
        ArrayList <String> shar_nam = new ArrayList<>();
        ArrayList <Double> shar_nos = new ArrayList<>();
        ArrayList <Double> shar_pric = new ArrayList<>();

        System.out.println("Enter the number of companies whose stocks you want to enter");
        Scanner sc0 = new Scanner(System.in);
        int no_stocks = sc0.nextInt();

        for (int i=0;i<no_stocks;i++){
            System.out.println("Enter the name of share: ");
            Scanner sc1 = new Scanner(System.in);
            String share_name = sc1.next();
            shar_nam.add(share_name);
            spf.setShare_name(share_name);
            spf.setShar_nam(shar_nam);

            System.out.println("Enter the number of share: ");
            Scanner sc2 = new Scanner(System.in);
            double no_of_shares = sc2.nextInt();
            shar_nos.add(no_of_shares);
            spf.setNo_of_shares(no_of_shares);
            spf.setShar_nos(shar_nos);

            System.out.println("Enter the price of share: ");
            Scanner sc3 = new Scanner(System.in);
            double share_price = sc3.nextInt();
            shar_pric.add(share_price);
            spf.setShare_price(share_price);
            spf.setShar_pric(shar_pric);
        }
    }

    public void stockValue(StockPortfolio spf){
        enterStockDetails(spf);
        double stock_tot_val = 0;
        System.out.println("StockName           StockValue");

        for (int i=0;i<spf.getShar_pric().size();i++){
            double share_num =(double) spf.getShar_nos().get(i);
            double share_price = (double) spf.getShar_pric().get(i);
            String share_name = (String) spf.getShar_nam().get(i);

            stock_tot_val += share_num*share_price;
            System.out.println(share_name + "           " + share_num*share_price);
        }
        System.out.println("The total value of all the stocks = "+ stock_tot_val);
    }

    public static void main(String []args){

        StockPortfolio stokporfol = new StockPortfolio();
        Stock stok = new Stock();
        stok.stockValue(stokporfol);
    }
}