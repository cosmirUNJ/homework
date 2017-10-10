# Eelbat Genre Adventure


<p>Kemudan kami mencoba memodifikasi genre platformer yang sebelumnya telah dibuat agar menjadi seperti genre adventure, view karakter dari sebelah atas world/map. 
</p>

```
package com.mygdx.game;

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

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	//private GameCanvas canvas;
	private Texture texture;
	private Texture img;
	private TextureRegion karakter;
	private TextureRegion[][] hero;
	private Texture img2;
	private TextureRegion karakter2;
	private TextureRegion[][] hero2;
	private OrthographicCamera camera;

	private float widthscreen ,heightscreen;
	private float pos_x, pos_y;
	private int arah;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//canvas = new GameCanvas();
		//texture = new Texture("place1.png");
		texture = new Texture("place2.png");
		//texture = new Texture("adventure.png");
		img = new Texture("eel.png");
		karakter = new TextureRegion(img);
		hero = karakter.split(80, 80);
		img2 = new Texture("eel2.png");
		karakter2 = new TextureRegion(img2);
		hero2 = karakter2.split(80, 80);
//		img = new Texture("belut.png");
//		karakter = new TextureRegion(img);
//		hero = karakter.split(32, 32);
		widthscreen =Gdx.graphics.getWidth();
		heightscreen=Gdx.graphics.getHeight();
		pos_x = 50;
		pos_y = 50;
		//arah=2+4;
		arah=2;
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
		/*
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			pos_x--;
			arah=1+4;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			pos_x++;
			arah=2+4;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			pos_y--;
			arah=0+4;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			pos_y++;
			arah=3+4;
		}*/
		// Movement

		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			pos_x--;
			arah=1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			pos_x++;
			arah=4;
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
//		if(pos_x % 2 == 0 && pos_y % 2 == 0){
//			batch.draw(hero[arah][3], pos_x, pos_y, width, height);
//		}else if(pos_x % 2 == 1 && pos_y % 2 == 0){
//			batch.draw(hero[arah][4], pos_x, pos_y, width, height);
//		}else if(pos_x % 2 == 0 && pos_y % 2 == 1){
//			batch.draw(hero[arah][4], pos_x, pos_y, width, height);
//		}else if(pos_x % 2 == 1 && pos_y % 2 == 1){
//			batch.draw(hero[arah][3], pos_x, pos_y, width, height);
//		}

		if(arah == 4){
			//batch.draw(hero2[arah-3][1], pos_x, pos_y, width, height);
			if(pos_x % 3 == 0){
				batch.draw(hero2[arah-3][0], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 1){
				batch.draw(hero2[arah-3][1], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 2){
				batch.draw(hero2[arah-3][2], pos_x, pos_y, width, height);
			}
		}
		else{
			if(pos_x % 3 == 0 && pos_y % 3 == 0){
				batch.draw(hero[arah][0], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 1 && pos_y % 3 == 0){
				batch.draw(hero[arah][1], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 2 && pos_y % 3 == 0){
				batch.draw(hero[arah][2], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 0 && pos_y % 3 == 1){
				batch.draw(hero[arah][1], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 1 && pos_y % 3 == 1){
				batch.draw(hero[arah][2], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 2 && pos_y % 3 == 1){
				batch.draw(hero[arah][0], pos_x, pos_y, width, height);
			}else if(pos_x % 3 == 0 && pos_y % 3 == 2){
                batch.draw(hero[arah][2], pos_x, pos_y, width, height);
            }else if(pos_x % 3 == 1 && pos_y % 3 == 2){
                batch.draw(hero[arah][0], pos_x, pos_y, width, height);
            }else if(pos_x % 3 == 2 && pos_y % 3 == 2){
                batch.draw(hero[arah][1], pos_x, pos_y, width, height);
            }
		}
		batch.end();
	}

	@Override
	public void dispose () {

	}
}

```

<p>Hasilnya adalah:</p>

<div align="center"><img src="assets/cap2.png?raw=true" />
<div align="center"><img src="assets/cap3.png?raw=true" />
</div>
