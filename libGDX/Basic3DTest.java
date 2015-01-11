public class Basic3DTest implements ApplicationListener {
    @Override
    public void create () {
    	//field of view 67 aspect also set to width and height
    	cam = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    	
    	//sets the camera to 10 back 10 right 10 up
    	cam.position.set(10f, 10f, 10f);
    	cam.lookAt(0,0,0);
    	cam.near = 1f;
    	cam.far = 300f;
    	cam.update();
    	
    	//creates models
    	ModelBuilder modelBuilder = new ModelBuilder();
    	
    	//creates a box 5x5x5
        model = modelBuilder.createBox(5f, 5f, 5f, 
            new Material(ColorAttribute.createDiffuse(Color.GREEN)),
            Usage.Position | Usage.Normal); //Normal creates lighting and usage position is needed
        instance = new ModelInstance(model);
    }
 
    @Override
    public void render () {
    	 Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
         Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
  
         modelBatch.begin(cam);
         modelBatch.render(instance);
         modelBatch.end();
    }
     
    @Override
    public void dispose () {
    	modelBatch.dispose();
    	model.dispose();
    }
     
    @Override
    public void resume () {
    }
 
    @Override
    public void resize (int width, int height) {
    }
 
    @Override
    public void pause () {
    }
}