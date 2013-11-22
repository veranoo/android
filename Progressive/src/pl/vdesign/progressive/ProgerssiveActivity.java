package pl.vdesign.progressive;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProgerssiveActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progerssive);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.progerssive, menu);
		return true;
	}

}
