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
/**
 * This class represents the information that makes up a product
 */
public class Product {
    private final String name;
    private final String brand;
    public final int price;
    public Product(String name, String brand, int price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    /**
     * This method display the information that makes up the product
     * <p>
     * This method the attributes of the Product are display in console
     */
    public void display(){
        System.out.printf("-%s  $%d\n  Brand: %s\n",this.name,this.price,this.brand);
    }

    /**
     *This method compare the product's name with the string
     * @param name String to compare
     * @return Boolean with the result of the comparation
     */
    public boolean compareName(String name){
        return this.name.toLowerCase().contains(name.toLowerCase());
    }
    /**
     *This method compare the product's brand with the string
     * @param brand String to compare
     * @return Boolean with the result of the comparation
     */
    public boolean compareBrand(String brand){
        return this.brand.toLowerCase().contains(brand.toLowerCase());
    }
}