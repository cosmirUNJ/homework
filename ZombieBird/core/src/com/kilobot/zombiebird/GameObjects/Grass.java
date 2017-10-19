package com.kilobot.zombiebird.GameObjects;

import com.kilobot.zombiebird.GameObjects.Scrollable;

/**
 * Created by Amelia Apriliani on 17/10/2017.
 */

public class Grass extends Scrollable {
    public Grass(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);
    }

    public void onRestart(float x, float scrollSpeed) {
        position.x = x;
        velocity.x = scrollSpeed;
    }
}