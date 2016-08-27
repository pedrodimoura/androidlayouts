package br.edu.unifavip.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import static br.edu.unifavip.layouts.R.id.buttonFrameLayout;
import static br.edu.unifavip.layouts.R.id.buttonLinearLayout;
import static br.edu.unifavip.layouts.R.id.buttonRelativeLayout;
import static br.edu.unifavip.layouts.R.id.buttonScrollView;
import static br.edu.unifavip.layouts.R.id.floatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton mFloatingActionButton;
    private Button mButtonLinearLayout;
    private Button mButtonRelativeLayout;
    private Button mButtonFrameLayout;
    private Button mButtonScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        mButtonLinearLayout = (Button) findViewById(buttonLinearLayout);
        mButtonRelativeLayout = (Button) findViewById(buttonRelativeLayout);
        mButtonFrameLayout = (Button) findViewById(buttonFrameLayout);
        mButtonScrollView = (Button) findViewById(buttonScrollView);

        mFloatingActionButton.setOnClickListener(this);
        mButtonLinearLayout.setOnClickListener(this);
        mButtonRelativeLayout.setOnClickListener(this);
        mButtonFrameLayout.setOnClickListener(this);
        mButtonScrollView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case floatingActionButton:
                Snackbar.make(view, R.string.snackbar_message, Snackbar.LENGTH_LONG).show();
                break;
            case buttonLinearLayout:
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
                break;
            case buttonRelativeLayout:
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
                break;
            case buttonFrameLayout:
                startActivity(new Intent(MainActivity.this, FrameLayoutActivity.class));
                break;
            case buttonScrollView:
                startActivity(new Intent(MainActivity.this, ScrollViewActivity.class));
                break;
        }
    }
}
