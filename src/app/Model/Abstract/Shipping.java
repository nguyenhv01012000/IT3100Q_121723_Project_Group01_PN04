/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Model.Abstract;

public class Shipping {
    int id;
    String senderName, senderAddress, sendingTime, receiverName, receiverAddress, receivingTime, category;
	int km, kg, cost;

    public Shipping(int id, String senderName, String senderAddress, String sendingTime, String receiverName, String receiverAddress, String receivingTime, String category, int km, int kg, int cost) {
        this.id = id;
        this.km = km;
        this.kg = kg;
        this.cost = cost;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.sendingTime = sendingTime;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.receivingTime = receivingTime;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public int getKm() {
        return km;
    }

    public int getKg() {
        return kg;
    }

    public int getCost() {
        return cost;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public String getSendingTime() {
        return sendingTime;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public String getReceivingTime() {
        return receivingTime;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setSendingTime(String sendingTime) {
        this.sendingTime = sendingTime;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public void setReceivingTime(String receivingTime) {
        this.receivingTime = receivingTime;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}


