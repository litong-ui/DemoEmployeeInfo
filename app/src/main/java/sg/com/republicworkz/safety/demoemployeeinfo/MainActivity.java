package sg.com.republicworkz.safety.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployeeInfo;
    ArrayList<employeeInfo> alEmployeeInfo;
    CustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeInfo = findViewById(R.id.listView);
        alEmployeeInfo = new ArrayList<>();
        alEmployeeInfo.add(new employeeInfo("John", "Software Technical Leader",3400));
        alEmployeeInfo.add(new employeeInfo("May", "Programmer", 2200));

        adapter = new CustomerAdapter(this,R.layout.row, alEmployeeInfo);
        lvEmployeeInfo.setAdapter(adapter);
    }
}
