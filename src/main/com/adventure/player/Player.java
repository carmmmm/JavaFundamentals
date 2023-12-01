package main.com.adventure.player;

import main.com.adventure.settings.AppSettings;
import main.com.adventure.world.objects.Shovel;
import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.Weapon;
import main.com.adventure.world.objects.keys.Key;




public class Player {

    public int level = 5;
    private int currentLocationIndex = AppSettings.getStartingLocation();
    //private Key key;
    //private Shovel shovel;
    private Backpack backpack = new Backpack();
    private int power = 1;
    private int health = 10;
    private String name;

    /**
     * Sprint 2 Module 1
     * Saves the player's name. This file should store the name so it can be referenced later. After setting the name,
     * inform the user that the name has been changed by saying "Your name is now {name}".
     * @param newName - the player's name that will be saved
     */
    public void setName(String newName) {
        name = newName;
        System.out.println("Your name is now " + name);
    }

    /**
     * Sprint 2 Module 1
     * Retrieves the name of this player. The name of the player should be stored in this file, so we should reference
     * that value here.
     * @return The name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sprint 2 Module 1
     * The canOpenDoor is calculated by taking the player's level and dividing it by 2.
     * If the result is greater than 2, the player can open doors.
     * @return true if the player's level is enough to open the door.
     */
    public boolean canOpenDoor() {
        boolean ifCanOpenDoor = (Math.round((float) level / 2)) > 2;
        return ifCanOpenDoor;
    }





    /**
     * Sprint 2 Module 2
     * The move function takes two parameters: a direction string and an isValidDirection boolean.
     * The boolean isValidDirection tells us if that direction is valid at this point in the game.
     * It will be up to this function to determine if the direction should be processed.
     *
     * If the direction should be processed, the currentLocationIndex will increment by 1 if the direction is EAST,
     * or decrement by 1 if the direction is WEST.
     *
     * If the direction is invalid for any reason, the program should print "{DIRECTION} is not a valid direction" to
     * the console.
     *
     * You should return true if the move is executed. Otherwise, return false.
     *
     * @param direction - the direction the player wishes to go
     * @param isValidDirection - true if the player can move that direction in the game. Otherwise, false.
     * @return true if the move is executed. Otherwise, false.
     */
    public boolean move(String direction, boolean isValidDirection) {
        if (isValidDirection && direction.equalsIgnoreCase("East")) {
            currentLocationIndex++;
            return true;
        } else if (isValidDirection && direction.equalsIgnoreCase("West")) {
            currentLocationIndex--;
            return true;
        } else {
            System.out.println(direction + " is not a valid direction");
            return false;
        }
    }

    /**
     * Sprint 3 Module 2
     * Will increase the players power to the power of the item that is passed in.
     * For example, if the player's power is 1 and the weapon is 5, the player's power is now 5.
     * @param item - the weapon that will be used to adjust the player's power.
     */
    public void setWeapon(Weapon item) {
        //TODO Complete this function in Sprint 3 Module 2
        this.power = (int) Math.pow(getPower(), item.getPower());
    }

    /**
     * Sprint 3 Module 3
     * Retrieves the item in the backpack.
     * @param itemName - the name af the item, given by the user
     * @return the item or null if the item does not exist
     */
    public Tangible getItem(String itemName) {
        //TODO Complete this function in Sprint 3 Module 3
        return backpack.getItem(itemName);
    }

    /**
     * Sprint 3 Module 3
     * Removes the item from the backpack and returns that item.
     * @param item - the item you want to remove
     * @return the removed item
     */
    public Tangible removeItem(Tangible item) {
        //TODO Complete this function in Sprint 3 Module 3
        backpack.removeItem(item);
        return item;
    }

    /**
     * Sprint 3 Module 3
     * Prints the backpack's inventory.
     */
    public void printItems() {
        //TODO Complete this function in Sprint 3 Module 3
        backpack.printItems();
    }

    /**
     * Sprint 3 Module 3.
     * Stores an item into the backpack.this
     * @param item - item to add.
     */
    public void addItem(Tangible item) {
        backpack.addItem(item);
    }

    /**
     * this sets the key in the backpack class.
     * @param item is the key that is being added to the backpack
     */
    public void setKey(Key item) {
        backpack.addItem(item);
    }

    /**
     * This should return the key.
     * @return is returning the key or null
     */
    public Tangible getKey() {
        backpack.getItem("Shovel");
        return backpack.getItem("Shovel");
    }

    /**
     * This adds the shovel to the backpack.
     * @param item is the shovel being added
     */
    public void setShovel(Shovel item) {
        backpack.addItem(item);
    }

    /**
     * This is showing the shovel is in the backpack.
     * @return should return the shovel or null
     */
    public Tangible getShovel() {
        backpack.getItem("Shovel");
        return backpack.getItem("Shovel");
    }

    //////// DON'T CHANGE THE CODE BELOW. ///////////

    public int getCurrentLocation() {
        return currentLocationIndex;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }
}
