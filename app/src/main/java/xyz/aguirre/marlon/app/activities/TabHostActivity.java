package xyz.aguirre.marlon.app.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.aguirre.marlon.app.R;

public class TabHostActivity extends AppCompatActivity {
    @BindView(R.id.btnSigueCalle)
    Button btnSigueCalle;
    @BindView(R.id.btnCruzaCalle)
    Button btnCruzaCalle;
    @BindView(R.id.tvCalleSigue)
    TextView tvCalleSigue;
    @BindView(R.id.tvCalleCruza)
    TextView tvCalleCruza;
    @BindView(R.id.btnSigueAve)
    Button btnSigueAve;
    @BindView(R.id.btnCruzaAve)
    Button btnCruzaAve;
    @BindView(R.id.tvAveSigue)
    TextView tvAveSigue;
    @BindView(R.id.tvAveCruza)
    TextView tvAveCruza;
    private TabHost tabHost;
    private int sA =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);
        ButterKnife.bind(this);
        tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();
        TabHost.TabSpec tsCalle = tabHost.newTabSpec("Tab1");
        tsCalle.setIndicator("Calle");
        tsCalle.setContent(R.id.linearLayoutCalle);

        TabHost.TabSpec tsAvenida = tabHost.newTabSpec("Tab2");
        tsAvenida.setIndicator("Avenida");
        tsAvenida.setContent(R.id.linearLayoutAvenida);
        tabHost.addTab(tsCalle);
        tabHost.addTab(tsAvenida);
    }
    @OnClick(R.id.btnSigueAve)
    public void handleSigueAve(){
        sA++;
        Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
        System.out.println(sA);
        tvAveSigue.setText(String.valueOf(sA));
    }
}
