/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119064.bagusbudiwibowo;

import java.util.Scanner;
import model.Customer;
import model.ServicePrice;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program Customer Service
 */
public class QUIZIF210119064BAGUSBUDIWIBOWO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        Customer customer = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        
        System.out.print("Customer Name : ");
        customer.setName(keyboard.nextLine());
        System.out.print("Customer Email : ");
        customer.setEmail(keyboard.next());
        
        ServicePrice servicePrice = new ServicePrice();
        servicePrice.displayService();
        System.out.print("Choose (1/2/3) : ");
        servicePrice.setPriceService(keyboard.nextInt());
        System.out.print("Are You Member (yes/no) : ");
        servicePrice.checkMemberStatus(keyboard.next());
        
        System.out.println("#****************************#");
        System.out.println("#******CUSTOMER INVOICE******#");
        System.out.println("Date Transaction : " + customer.currentTime());
        System.out.println("Service Price : " + servicePrice.getPriceService());
        System.out.println("Discout : " + servicePrice.getSale(customer.isMember(), servicePrice.getPriceService()));
        System.out.println("Total Pay : " + servicePrice.getTotalPay(servicePrice.getPriceService(), servicePrice.getSale(customer.isMember(), servicePrice.getPriceService())));
    }
    
}
