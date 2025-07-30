package com.example.project;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class itemadapter extends BaseAdapter {
    LayoutInflater mInflater;
    ListView myListView;
    String[] items;
    String[] description;


    public itemadapter(Context c, String[] i, String[] d){
        items = i;
        description = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.mylist, null);
        TextView nametextview = (TextView) v.findViewById(R.id.nametextview);
        TextView descriptiontext = (TextView) v.findViewById(R.id.destextview);

        String name = items[i];
        String desc = description[i];

        nametextview.setText(name);
        descriptiontext.setText(desc);

        return v;
    }
}
