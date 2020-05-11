[![](https://jitpack.io/v/vtechsevi/SetAtCursorLocation.svg)](https://jitpack.io/#vtechsevi/SetAtCursorLocation)



   #Installing
     allprojects {
  		repositories {
  			...
  			maven { url 'https://jitpack.io' }
  		}
  	}
  	
  	dependencies {
    	        implementation 'com.github.vtechsevi:SetAtCursorLocation:Tag'
    	}
    	
   #Example
    	
    	public class MainActivity extends AppCompatActivity {
            EditText editText;
        
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                editText = findViewById(R.id.edittext);
        
        
            }
        
            public void setTextAtCursor(View view) {
                String text = "Some Text";
                EditTextCursor.setText(editText, text);
            }
        }
