package com.mygdx.eelbat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Affine2;

/**
 * Created by Amelia Apriliani on 10/10/2017.
 */

public class GameCanvas {
    private SpriteBatch spriteBatch;
    private int width;
    private int height;

    public GameCanvas() {
        this.width  = Gdx.graphics.getWidth();
        this.height = Gdx.graphics.getHeight();

        spriteBatch = new SpriteBatch();
    }

    public GameCanvas(int width, int height) {
        this(width,height,false);
    }

    protected GameCanvas(int width, int height, boolean fullscreen) {
        this.width  = width;
        this.height = height;
        if (fullscreen) {
            Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode());
        } else {
            Gdx.graphics.setWindowedMode(width, height);

        }

        spriteBatch = new SpriteBatch();

        spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, getWidth(), getHeight());
    }

    public void dispose() {
        spriteBatch.dispose();
        spriteBatch = null;
    }

    public int getWidth() {
        return Gdx.graphics.getWidth();
    }

    public int getHeight() {
        return Gdx.graphics.getHeight();
    }
}
