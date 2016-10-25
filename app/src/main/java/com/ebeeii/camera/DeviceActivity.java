package com.ebeeii.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeviceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);

        Button skip = (Button)findViewById(R.id.deviceSkip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(DeviceActivity.this, MainActivity.class);
                DeviceActivity.this.startActivity(mainIntent);
                DeviceActivity.this.finish();
            }
        });
    }
}
