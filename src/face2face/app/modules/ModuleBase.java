package face2face.app.modules;

import face2face.app.App;
import face2face.app.modules.logs.FFLog;

public abstract class ModuleBase {

	protected App app_;

	public ModuleBase(App app) {
		app_ = app;
	}

	public String getName() {

		String clsName = this.getClass().getName();
		FFLog.d("Get Module Name:" + clsName);
		return clsName;
	}

	public abstract boolean enable();

	public abstract void disable();
}
