package edu.harbour.space.university.mall;

import java.util.UUID;

public class ShoppingCart {
        private UUID uuid;
        private double balance;
        public ShoppingCart( UUID uuid,double balance){
            this.balance=balance;
            this.uuid=uuid;
        }
        void increaseValue(double value){
            this.balance+=value;
        }
     void decreaseValue(double value){
        this.balance-=value;
     }

    public UUID getUuid() {
        return uuid;
    }

    public double getBalance() {
        return balance;
    }
}
