package blastview.kunal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    Blastview blastview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btn);
        blastview = Blastview.attach2Window(this);



        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        blastview.explode(button);

    }
}
