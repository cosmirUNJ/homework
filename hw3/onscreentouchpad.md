# On screen TouchPad

Merupakan sebuah on-screen joystick. Area gerakan joystick melingkar, berpusat pada touchpad, dan ukurannya ditentukan oleh dimensi touchpad yang lebih kecil. Ukuran touchpad yang ditentukan. Ini diperlukan karena karakter pada permainan yang akan dibuat akan digunakna on screen toichpad ini.

#### Persiapan

* Sebelum memulai, asset yang harus disiapkan berupa gambar area joystick, touchpad, dan kotak yang sementara dijadikan sebagai object yang bergerak.

![Alt](/img/block.png)

![Alt](/img/touchBackground.png)

![Alt](/img/touchKnob.png)

* Ketiga gambar tersebut diletakkan di folder nama-project-android/assets/data

#### Memulai

* Kemudian, file java di bagian nama-project-core/scr/nama-game.java diganti dengan code ini :

```java
	
	public class MyGdxGame extends ApplicationAdapter {
	
	private Stage stage;
	private Touchpad touchpad;
	private TouchpadStyle touchpadStyle;
	private Skin touchpadSkin;
	private Drawable touchpadBackground;
	private Drawable touchKnob;
	private SpriteBatch batch;
	private Texture blockTexture;
	private OrthographicCamera camera;
	private Sprite blockSprite;
	private float blockSpeed;
	
	@Override
	public void create () {
		
		batch = new SpriteBatch();
		
		float aspectRatio = (float) Gdx.graphics.getWidth()/(float) Gdx.graphics.getHeight();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 10f*aspectRatio, 10f);
		
		touchpadSkin = new Skin();
		
		touchpadSkin.add("touchBackground", new Texture("data/touchBackground.png"));
		
		touchpadSkin.add("touchKnob", new Texture("data/touchKnob.png"));
		
		touchpadStyle = new TouchpadStyle();
		
		touchpadBackground = touchpadSkin.getDrawable("touchBackground");
		touchKnob = touchpadSkin.getDrawable("touchKnob");
		
		touchpadStyle.background = touchpadBackground;
		touchpadStyle.knob = touchKnob;
		
		touchpad = new Touchpad(10, touchpadStyle);
		
		touchpad.setBounds(15, 15, 200, 200);
		
		int w = Gdx.graphics.getWidth();
		int h = Gdx.graphics.getHeight();
		
		stage = new Stage();
		stage.addActor(touchpad);
		Gdx.input.setInputProcessor(stage);
		
		blockTexture = new Texture(Gdx.files.internal("data/block.png"));
		blockSprite = new Sprite(blockTexture);
		
		blockSprite.setPosition(w/2-blockSprite.getWidth()/2, h/2-blockSprite.getHeight()/2);
		
		blockSpeed = 5;
	}
	
	@Override
	public void dispose() {
		
	}
	
	@Override
	public void render () {
		Gdx.gl.glClearColor(0.294f, 0.294f, 0.294f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		
		blockSprite.setX(blockSprite.getX()+touchpad.getKnobPercentX()*blockSpeed);
		blockSprite.setY(blockSprite.getY()+touchpad.getKnobPercentX()*blockSpeed);
		
		batch.begin();
		blockSprite.draw(batch);
		batch.end();
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}
	
	@Override
	public void pause() {
		
	}
	
	@Override
	public void resume() {
		
	}
	
	@Override
	public void resize(int width, int height) {
		
	}
}
```

* Setelah mengetik code diatas, kita coba jalankan code tersebut, disini saya menggunakan eclipse dan dijalankan di desktop

![](/img/pertamax.gif)

#### Hasil Akhir

Setelah menjalankan code diatas, hasil akhir berupa :

![](/img/keduax.gif)

#### Referensi

[LibGDX Touchpad Example](http://www.bigerstaff.com/libgdx-touchpad-example/