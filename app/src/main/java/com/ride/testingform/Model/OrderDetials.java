package com.ride.testingform.Model;

/**
 * Created by Admin on 1/30/2017.
 */

public class OrderDetials extends BaseModel {
    public int Quantity;
    public Order Orders;
    public Menu Menus;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Order getOrders() {
        return Orders;
    }

    public void setOrders(Order orders) {
        Orders = orders;
    }

    public Menu getMenus() {
        return Menus;
    }

    public void setMenus(Menu menus) {
        Menus = menus;
    }
}
