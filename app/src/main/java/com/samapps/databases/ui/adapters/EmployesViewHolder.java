package com.samapps.databases.ui.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samapps.databases.R;
import com.samapps.databases.entities.Employee;

class EmployesViewHolder extends RecyclerView.ViewHolder {
    private TextView txtID, txtName, txtSalary;

    public EmployesViewHolder(@NonNull View itemView) {
        super(itemView);
        txtID = itemView.findViewById(R.id.txtId);
        txtName = itemView.findViewById(R.id.txtName);
        txtSalary = itemView.findViewById(R.id.txtSalary);
    }

    public void onBind(Employee employee) {
        txtID.setText(employee.id + "");
        txtName.setText(employee.name);
        txtSalary.setText(employee.salary + "");
    }
}
