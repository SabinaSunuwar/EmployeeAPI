package com.softwarica.employeeapi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softwarica.employeeapi.Models.Employee;
import com.softwarica.employeeapi.R;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {
    Context context;
    List<Employee> employeeList;

    public EmployeeAdapter(Context context, List<Employee> employeeList){
        this.context = context;
        this.employeeList = employeeList;
    }


    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.employee,parent,false);

        return new EmployeeViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        final Employee emp = employeeList.get(position);

        holder.tvID.setText(emp.getId());
        holder.tvName.setText(emp.getEmployee_name());
        holder.tvAge.setText(emp.getEmployee_age());
        holder.tvSalary.setText(emp.getEmployee_salary());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProfile;
        TextView tvID, tvName, tvAge, tvSalary;
        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvID = itemView.findViewById(R.id.tvID);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvSalary = itemView.findViewById(R.id.tvSalary);

        }
    }
}
