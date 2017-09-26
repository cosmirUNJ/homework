# Image, Audio, ParticleEffect

#### Image

```code```
    import com.badlogic.gdx.ApplicationAdapter;
    import com.badlogic.gdx.Gdx;
    import com.badlogic.gdx.audio.Sound;
    import com.badlogic.gdx.graphics.GL20;
    import com.badlogic.gdx.graphics.Texture;
    import com.badlogic.gdx.graphics.g2d.ParticleEffect;
    import com.badlogic.gdx.graphics.g2d.SpriteBatch;

    public class MyGdxGame extends ApplicationAdapter {
       SpriteBatch batch;
       Texture img;

       @Override
       public void create () {
          batch = new SpriteBatch();
          img = new Texture("badlogic.jpg");
       }

       @Override
       public void render () {
          Gdx.gl.glClearColor(1, 0, 0, 1);
          Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

          batch.begin();
          batch.draw(img, 0, 0);

          batch.end();
       }

       @Override
       public void dispose () {
          batch.dispose();
          img.dispose();
       }
    }
```code```

#### Audio

```code```
  import com.badlogic.gdx.ApplicationAdapter;
  import com.badlogic.gdx.Gdx;
  import com.badlogic.gdx.audio.Sound;
  import com.badlogic.gdx.graphics.GL20;
  import com.badlogic.gdx.graphics.Texture;
  import com.badlogic.gdx.graphics.g2d.ParticleEffect;
  import com.badlogic.gdx.graphics.g2d.SpriteBatch;

  public class MyGdxGame extends ApplicationAdapter {
     SpriteBatch batch;
     Sound mp3Sound;
     
     @Override
     public void create () {
        batch = new SpriteBatch();
        mp3Sound = Gdx.audio.newSound(Gdx.files.internal("reason.mp3"));
     }

     @Override
     public void render () {
        batch.begin();
        mp3Sound.play();
        batch.end();

     }

     @Override
     public void dispose () {
        batch.dispose();
        mp3Sound.dispose();
     }
  }
```code```


#### ParticleEffect

```code```
  import com.badlogic.gdx.ApplicationAdapter;
  import com.badlogic.gdx.Gdx;
  import com.badlogic.gdx.audio.Sound;
  import com.badlogic.gdx.graphics.GL20;
  import com.badlogic.gdx.graphics.Texture;
  import com.badlogic.gdx.graphics.g2d.ParticleEffect;
  import com.badlogic.gdx.graphics.g2d.SpriteBatch;

  public class MyGdxGame extends ApplicationAdapter {
     SpriteBatch batch;
     ParticleEffect pe;

     @Override
     public void create () {
        batch = new SpriteBatch();
        pe = new ParticleEffect();
        pe.load(Gdx.files.internal("api.party"),Gdx.files.internal(""));
        pe.getEmitters().first().setPosition(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        pe.start();
     }

     @Override
     public void render () {
        pe.update(Gdx.graphics.getDeltaTime());
        batch.begin();
        pe.draw(batch);
        
        batch.end();
        if (pe.isComplete())
           pe.reset();

     }

     @Override
     public void dispose () {
        batch.dispose();
     }
  }
```code```
