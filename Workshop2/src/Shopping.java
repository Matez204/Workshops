/**
 * This module is an example of an abstract class to define a calculator operations.
 *<p>
 * Copyright (C) 2024  Mathew Zahav Rodriguez Clavijo <mzclavijor1204@gmail.com>
 *<p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *<p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *<p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package src;

import java.util.ArrayList;

/**
 * This class represents the behavior of a shopping cart,
 * contains the products to be purchased
 */
public class Shopping {
    ArrayList<Product> cart;
    public Shopping(){
        this.cart = new ArrayList<>();
    }

    /**
     * This method add a product to the cart
     * @param prod The Product to add
     */
    public void addProduct(Product prod){
        this.cart.add(prod);
    }

    /**
     * This method show all the products in the category in enumerate way
     */
    public void display(){
        int a = 1;
        if (!this.cart.isEmpty()) {
            for (Product i : this.cart) {
                System.out.print(a);
                i.display();
                a++;
            }
        }else{
            System.out.println("The shopping cart is empty");
        }
    }

    /**
     * This method delete a product of the cart by his list number
     * @param a The product index
     */
    public void deleteProduct(int a){
        this.cart.remove(a);
    }

    /**
     * This method clear the entire cart
     */
    public void cleanCart(){
        this.cart.clear();
    }

    /**
     * This method return an int with the total pric of the products
     * @return Int with total price
     */
    public int total(){
        int n = 0 ;
        for (Product i : this.cart){
            n +=i.price;
        }
        return n;
    }
}
