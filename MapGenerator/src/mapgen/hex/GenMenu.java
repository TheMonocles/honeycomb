package mapgen.hex;

import mapgen.hex.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class GenMenu extends MainMenu {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gen);
        
        final Button button = (Button) findViewById(R.id.Back_button); 
        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {return;}
		}); 
    }
    //public void onBackPressed() {return;}
}
