package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.doors.OmniDoor;

import java.util.Arrays;

public class OmniKey implements Tangible {

    private static final int pinLength = 5;
    public boolean[] pins = new boolean[pinLength];
    public OmniDoor omniDoor = new OmniDoor();

    /**
     * A key that can be used with the OmniDoor.
     */
    public OmniKey() {
        Arrays.fill(pins, false);
    }

    /**
     * The only item the OmniKey can be used with is an OmniDoor. When the OmniKey receives an OmniDoor, this method
     * needs to configure the key to the OmniDoor, making the OmniKey become a valid key for the door.
     * Note that this does NOT unlock the door; it merely configures the key so it can unlock the door in the future.
     * @param door - If it's an OmniDoor, this key will configure itself to it. Otherwise, inform the user
     *             that this key can only be used with OmniDoors and do nothing more.
     */
    @Override
    public void useItem(Tangible door) {
        if (door instanceof OmniDoor) {
            //omni keys can only go to omni doors
            //need to check is door is an omni door, does not unlock!
            //if omni door, configure key to door
            //if not omni door, inform user the this key can ony be used with omni door
            OmniDoor omnidoor = (OmniDoor) door;
            for (int i = 0; i < omnidoor.getPins().length; i++) {
                this.pins[i] = omnidoor.getPins()[i];
            }
        } else {
            System.out.println("This key can only be used with OmniDoors");
        }
    }



    @Override
    public String getName() {
        return "OmniKey";
    }

    @Override
    public String getDescription() {
        return "A key with adjustable pins for teeth";
    }

    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return item instanceof OmniDoor;
    }

    @Override
    public void use() {

    }



}


