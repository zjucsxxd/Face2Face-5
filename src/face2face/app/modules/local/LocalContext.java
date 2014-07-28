package face2face.app.modules.local;

import face2face.app.App;
import face2face.app.modules.ModuleBase;

public class LocalContext extends ModuleBase {

	public LocalContext(App app) {
		super(app);
	}

	@Override
	public boolean enable() {
		return false;
	}

	@Override
	public void disable() {

	}

}
