/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
    public void displayService(){
        System.out.println("#*******************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List*******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash : IDR 55K");
        System.out.println("1. Hairwash Only : IDR 15K");
        System.out.println("#*******************************#");
        
    }

    @Override
    public float getPrice(int ServiceItem) {
        switch(ServiceItem){
            case 1:
                return 45000;
            case 2:
                return 55000;
            default:
                return 15000;
        }
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember.equals("yes")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember = true){
            return (float) ((parServicePrice * 0.1) + parServicePrice);
        }else{
            return (parServicePrice * 0) + parServicePrice;
        }
    }
    
    public float getTotalPay(float priceService, float discount){
        return priceService - discount;
    }
    
}
