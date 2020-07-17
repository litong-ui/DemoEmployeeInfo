package sg.com.republicworkz.safety.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.com.republicworkz.safety.demoemployeeinfo.employeeInfo;

public class CustomerAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<employeeInfo> list;

    public CustomerAdapter(Context context, int resource,
                           ArrayList<employeeInfo> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        list = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        // Obtain the Android Version information based on the position
        employeeInfo currentEmp = list.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(currentEmp.getTitle());
        tvName.setText(currentEmp.getName());
        tvSalary.setText(currentEmp.toString());

        return rowView;
    }


}
