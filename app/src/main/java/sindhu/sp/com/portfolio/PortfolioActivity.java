package sindhu.sp.com.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class PortfolioActivity extends AppCompatActivity {
    private static final String LAUNCHER_TEXT_FORMAT =  "This button will launch my %s app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        setupPortfolio();
    }

    private void setupPortfolio() {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof Button) {
                    showToast(((Button) v).getText());
                }
            }
        };
        findViewById(R.id.project_1).setOnClickListener(listener);
        findViewById(R.id.project_2).setOnClickListener(listener);
        findViewById(R.id.project_3).setOnClickListener(listener);
        findViewById(R.id.project_4).setOnClickListener(listener);
        findViewById(R.id.project_5).setOnClickListener(listener);
        findViewById(R.id.project_6).setOnClickListener(listener);
        findViewById(R.id.project_7).setOnClickListener(listener);
    }

    private void showToast(CharSequence s) {
        Toast.makeText(this,
                       String.format(Locale.US, LAUNCHER_TEXT_FORMAT, s),
                       Toast.LENGTH_SHORT)
             .show();
    }
}
