package com.kilobot.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kilobot.zombiebird.Screen.GameScreen;
import com.kilobot.zombiebird.Screen.SplashScreen;
import com.kilobot.zombiebird.ZBHelpers.AssetLoader;

public class ZBGame extends Game {
	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}