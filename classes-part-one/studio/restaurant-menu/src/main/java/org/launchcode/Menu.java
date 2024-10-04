package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    MenuItem item1 = new MenuItem("Hamburger", 16.99, "Burger on Bun, with pickles and ketchup", "Main Course", false);
    MenuItem item2 = new MenuItem("Chicken with Orzo", 23.98, "Chicken breast, orzo, in a cream reduction with sun-dried tomatoes", "Main Course", true);
    MenuItem item3 = new MenuItem("Pumpkin Cheesecake", 8.99, "Pumpkin cheesecake on a gingersnap crust", "Dessert", true);
    MenuItem item4 = new MenuItem("Cheese Sticks", 10.95, "Breadsticks filled with cheese and garlic flavoring", "Appetizers", false);


    private ArrayList<MenuItem> menuList;

    {
        menuList.add(item1);
        menuList.add(item2);
        menuList.add(item3);
        menuList.add(item4);
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    private void setMenuList(ArrayList<MenuItem>) {
        this.menuList = menuList;
    }
}
