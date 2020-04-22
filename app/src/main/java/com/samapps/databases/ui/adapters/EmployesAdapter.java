package com.samapps.databases.ui.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samapps.databases.R;
import com.samapps.databases.entities.Employee;

import java.util.List;

public class EmployesAdapter extends RecyclerView.Adapter<EmployesViewHolder> {
    private List<Employee> employes;

    @NonNull
    @Override
    public EmployesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EmployesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_lay, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EmployesViewHolder holder, int position) {
        holder.onBind(employes.get(position));
    }

    @Override
    public int getItemCount() {
        return employes.size();
    }

    public void add(Employee employee) {
        employes.add(employee);
        notifyItemInserted(employes.size() - 1);
    }

    public void update(int id, Employee employee){
        employes.add(id,employee);//TODO HOMEWORK
    }

    public void delete(int id){
        employes.remove(id);//TODO HOMEWORK
        notifyItemRemoved(id);
    }

    public void setEmployes(List<Employee> employes) {
        this.employes = employes;
        notifyDataSetChanged();
    }
}
