# Eelbat Genre Platformer


<p>Di sini kami mencoba membuat dalam genre platformer. Karakter 'eelbat' yang bergerak ke kanan, kiri, atas dan bawah
</p>

```
package com.mygdx.eelbat;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;

public class EelbatMain extends ApplicationAdapter {
	private SpriteBatch batch;
	//private GameCanvas canvas;
	private Texture texture;
	private Texture img;
	private TextureRegion karakter;
	private TextureRegion[][] hero;
	private OrthographicCamera camera;

	private float widthscreen ,heightscreen;
	private float pos_x, pos_y;
	private int arah;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//canvas = new GameCanvas();
		texture = new Texture("place1.png");
		img = new Texture("eel.png");
		karakter = new TextureRegion(img);
		hero = karakter.split(80, 80);
		widthscreen =Gdx.graphics.getWidth();
		heightscreen=Gdx.graphics.getHeight();
		pos_x = 50;
		pos_y = 50;
		arah=0;
		camera = new OrthographicCamera(widthscreen, heightscreen);
		batch.begin();
		batch.draw(karakter, pos_x,pos_y);
		batch.draw(texture, 10, 10, widthscreen, heightscreen);
		batch.end();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		float width = 80;
		float height = 80;
		
		// Movement
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			pos_x--;
			arah=1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			pos_x++;
			arah=1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			pos_y--;
			arah=2;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			pos_y++;
			arah=0;
		}
		
		batch.begin();
		batch.draw(texture, 0, 0, widthscreen, heightscreen);
		batch.draw(hero[arah][1], pos_x, pos_y, width, height);
		batch.end();
	}
	
	@Override
	public void dispose () {

	}
}

```

<p>Hasilnya adalah:</p>

<div align="center"><img src="img/cap1.png?raw=true" />
</div>
