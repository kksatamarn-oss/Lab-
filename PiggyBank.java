package com.learning;

public class PiggyBank {
    // Fields
    private String ownerName;
    private double money;
    
    // Constructor
    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0; // กระปุกใหม่เริ่มต้นที่ 0 บาท
    }
    
    // Methods
    public void addMoney(double amount) {
        this.money += amount;
        System.out.println("หยอดเงินใส่กระปุกของ " + ownerName + " จำนวน " + amount + " บาท");
    }
    
    public void showMoney() {
        System.out.println("กระปุกของ " + ownerName + " มีเงินทั้งหมด " + money + " บาท");
    }
}
