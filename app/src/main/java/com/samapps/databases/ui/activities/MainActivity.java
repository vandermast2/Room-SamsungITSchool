package com.samapps.databases.ui.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.samapps.databases.AppApplication;
import com.samapps.databases.R;
import com.samapps.databases.db.AppDatabase;
import com.samapps.databases.entities.Employee;
import com.samapps.databases.ui.adapters.EmployesAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnAdd, btnUpdate, btnDelete;
    private EditText etID, etName, etSalary;
    private RecyclerView rvEmployes;
    private EmployesAdapter adapter;
    private AppDatabase db = AppApplication.getInstance().getDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        btnAdd.setOnClickListener(v->{
            Employee employee = new Employee();
            employee.id = Long.parseLong(etID.getText().toString());
            employee.name = etName.getText().toString();
            employee.id = Integer.parseInt(etSalary.getText().toString());
            new Handler().post(()-> db.employeeDao().insert(employee));
            adapter.add(employee);
        });
        etID = findViewById(R.id.etID);
        etName = findViewById(R.id.etName);
        etSalary = findViewById(R.id.etSalary);
        rvEmployes = findViewById(R.id.rvEmployes);
        adapter = new EmployesAdapter();
        adapter.setEmployes(db.employeeDao().getAll());
        rvEmployes.setAdapter(adapter);
    }
}
