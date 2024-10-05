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
 * This class represents the behavior of a catalog, contains the categories
 */
public class Catalog implements Container{
    private ArrayList<Category> listC;
    public Catalog(Category[] categories){
        this.listC = new ArrayList<>(Arrays.asList(categories));
    }
    public Catalog(){
        this.listC = new ArrayList<>();
    }

    /**
     * This method show the categiry list
     */
    public void displayList(){
        int n = 1;
        for (Category i : listC){
            System.out.printf("%d-%s\n",n,i.name);
            n++;
        }
    }

    /**
     * This method search and display products by the name entered
     * @param name String of product name
     */
    public void searchName(String name){
        for(Category i : this.listC){
            i.searchName(name);
        }
    }

    /**
     * This method search and display products by the brand entered
     * @param brand String of product brand
     */
    public void searchBrand(String brand){
        for(Category i : this.listC){
            i.searchBrand(brand);
        }
    }

    /**
     * This method return a category by his id in the list
     * @param id Int of category position in the list
     * @return The category in that position
     */
    public Category getCategory(int id){
        return this.listC.get(id);
    }

}
