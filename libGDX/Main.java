

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] argv) {
	      LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	      LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	      cfg.title = "my-gdx-game";
	      cfg.useGL30 = false;
	      cfg.width = 480;
	      cfg.height = 320;
	      new LwjglApplication(new Basic3DTest(), config);
	   }
}