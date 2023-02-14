package firstapp.ualr.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.helloworld.R;
import com.ualr.helloworld.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button cleanBtn;
    TextView textView;
    EditText userInputET;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mBinding.getRoot();
        setContentView(rootView);
        //allows clear button to clear EditText
        userInputET = findViewById(R.id.userInputET);
        cleanBtn = findViewById(R.id.cleanBtn);
        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInputET.getText().clear();
            }
        });
    }

    // TODO 06. Avoid updating the text label (userMsgTV) when the text field (userInputET) is empty
    public void showTextMessage(View view) {
        mBinding.userMsgTV.setText(mBinding.userInputET.getText().toString());
    }
    //^^^Solutions is above^^^
    // TODO 07. Create a new method called cleanTextField to delete the text inside the text field
}
