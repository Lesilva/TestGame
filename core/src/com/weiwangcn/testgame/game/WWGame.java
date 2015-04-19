package com.weiwangcn.testgame.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.weiwangcn.testgame.helpers.AssetLoader;
import com.weiwangcn.testgame.screens.GameScreen;

public class WWGame extends Game {

    @Override
    public void create() {
        Gdx.app.log("WWGame", "created");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
