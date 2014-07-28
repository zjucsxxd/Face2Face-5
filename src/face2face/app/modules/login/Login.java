package face2face.app.modules.login;

import face2face.app.App;
import face2face.app.modules.ModuleBase;

public class Login extends ModuleBase {

	public Login(App app) {
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
