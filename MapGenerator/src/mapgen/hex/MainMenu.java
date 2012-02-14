package mapgen.hex;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainMenu extends Activity {
    	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(R.id.generate);
        button.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v) {
        		Intent Generate = new Intent(MainMenu.this, GenMenu.class);
        		MainMenu.this.startActivity(Generate);
        	}
        });
    
    
        
    }
}