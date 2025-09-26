package com.learning;

public class Main {
    public static void main(String[] args) {
        // สร้างกระปุกใบแรก
        PiggyBank piggyBank = new PiggyBank("น้องพอใจ");
        
        // ดูเงินครั้งแรก
        System.out.println("=== ดูเงินครั้งแรก ===");
        piggyBank.showMoney();
        
        // หยอดเงิน
        System.out.println("\n=== หยอดเงิน ===");
        piggyBank.addMoney(20.0);
        piggyBank.addMoney(50.0);
        piggyBank.addMoney(30.0);
        
        // ดูเงินอีกครั้ง
        System.out.println("\n=== ดูเงินหลังจากหยอดแล้ว ===");
        piggyBank.showMoney();
    }
}
