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
import java.util.Arrays;

/**
 * This class represents the behavior of a category, contains the products
 */
public class Category implements Container{
    public final String name;
    private ArrayList<Product> listP;
    public Category(String name, Product[] products){
        this.name = name;
        this.listP = new ArrayList<>(Arrays.asList(products));
    }
    public Category(String name){
        this.name = name;
        this.listP = new ArrayList<>();
    }

    /**
     * This method show all the products in the category in enumerate way
     */
    public void displayList(){
        int a = 1;
        for (Product i : this.listP){
            System.out.print(a);
            i.display();
            a++;
        }
    }

    /**
     * This method search and display products by the name entered
     * @param name String of product name
     */
    public void searchName(String name){
        System.out.println("Category: " + this.name);
        int a = 0;
        for (Product i : this.listP){
            if (i.compareName(name)){
                System.out.print(" ");
                i.display();
                a++;
            }
        }
        if (a==0){
            System.out.println(" -No match");
        }
    }

    /**
     * This method search and display products by the brand entered
     * @param brand String of product brand
     */
    public void searchBrand(String brand){
        System.out.println("Category: " + this.name);
        int a = 0;
        for (Product i : this.listP){
            if (i.compareBrand(brand)){
                System.out.print(" ");
                i.display();
                a++;
            }
        }
        if (a==0){
            System.out.println(" -No match");
        }
    }

    /**
     * This method return a product by his id in the list
     * @param id Int of product position in the list
     * @return The product in that position
     */
    public Product getProduct(int id){
        return this.listP.get(id);
    }

}
