package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;



public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {

        //player hits monster and decreases his health by power
        while (!isPlayerDefeated() && monster.getHealth() > 0) {
            monster.setHealth(monster.getHealth() - player.getPower());
            if (monster.getHealth() <= 0) {
                break;
            }
            player.setHealth(player.getHealth() - monster.getPower());
        }
        //monster hits player and decreases his health by power

    }

    /**
     * This is asking if the player is defeated then you return true.
     * @return is returning true or false
     */
    public boolean isPlayerDefeated() {
        boolean returnValue = false;
        if (player.getHealth() <= 0) {
            returnValue = true;
        }
        return returnValue;
    }


    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        monster.setHealth(10);
        player.setHealth(10);

    }
}
