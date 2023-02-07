/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package app.Model;
import app.Model.Abstract.Shipping;

public class DocumentShipping extends Shipping{
   

    public DocumentShipping(int id, String senderName, String senderAddress, String sendingTime, String receiverName, String receiverAddress, String receivingTime, String category, String km, String kg, String cost) {
        super(id, senderName, senderAddress, sendingTime, receiverName, receiverAddress, receivingTime, category, km, kg, cost);
    }
     
    @Override
    public void setCost(String km, String kg) {
        this.cost = String.valueOf(12000 + 2000*Integer.parseInt(km));
    }

}
