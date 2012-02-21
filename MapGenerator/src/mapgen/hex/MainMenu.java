package mapgen.hex;

import mapgen.hex.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class MainMenu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(R.id.New_button); 
        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent Generate = new Intent(MainMenu.this, GenMenu.class);
				MainMenu.this.startActivity(Generate);
			}
		});   
      /*final Button button2 = (Button) findViewById(R.id.Back_button); 
        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				MainMenu.this.finish();
			}
		}); */ 
        
    }
    //public void onBackPressed() {return;}
}
