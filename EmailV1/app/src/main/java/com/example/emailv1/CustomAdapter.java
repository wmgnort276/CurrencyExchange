package com.example.emailv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<CustomItemModel> items;
    public CustomAdapter(List<CustomItemModel> items){
        this.items = items;
    };

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.listview_item,null);
            viewHolder = new ViewHolder();
            viewHolder.userName = view.findViewById(R.id.user_name);
            viewHolder.title = view.findViewById(R.id.title);
            viewHolder.desc = view.findViewById(R.id.desc);
            viewHolder.time = view.findViewById(R.id.time);
            viewHolder.checked = view.findViewById(R.id.checked);
            view.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) view.getTag();
        }

        CustomItemModel item = items.get(i);
        viewHolder.userName.setText(item.getUserName());
        viewHolder.title.setText(item.getTitle());
        viewHolder.desc.setText(item.getDesc());
        viewHolder.time.setText(item.getTime());
        viewHolder.checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setSelected(viewHolder.checked.isChecked());
                notifyDataSetChanged();
            }
        });

        return view;
    }

    public class ViewHolder {
        public TextView userName;
        public TextView title;
        public TextView desc;
        public TextView time;
        public CheckBox checked;
    }

}
