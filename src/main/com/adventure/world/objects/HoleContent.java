package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered = true;

    /**
     * this is adding a key to HC.
     * yes
     * @param key is the setting
     */
    public HoleContent(Key key) {
        this.content = key;
    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }
    public boolean isCovered() {
        return this.isCovered;
    }

    public Key getKey() {
        return this.content;
    }
}
