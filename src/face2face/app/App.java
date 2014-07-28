package face2face.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import face2face.app.modules.local.LocalContext;
import face2face.app.modules.login.Login;

public final class App extends Application {

	private LocalContext context_; // TODO(jr):Ìí¼Ó×¢ÊÍ
	private Login login_; // TODO(jr):Ìí¼Ó×¢ÊÍ
	public Activity currentActivity;

	public App() {
		context_ = new LocalContext(this);
		login_ = new Login(this);
		currentActivity = null;
	}

	public void onCreate() {
		context_.enable();
	}

	public LocalContext getLocalContext() {
		return context_;
	}

	public Login getLogin() {
		return login_;
	}

	public Context getAndroidContext() {
		return this.getAndroidContext();
	}
}
