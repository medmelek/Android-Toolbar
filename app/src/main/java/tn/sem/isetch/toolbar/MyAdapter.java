package tn.sem.isetch.toolbar;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Med Melek on 25/04/2016.
 */

public class MyAdapter extends BaseAdapter {

    private ArrayList<mymoddel> mList;
    private Activity activity;
    private static LayoutInflater inflater = null;

    public MyAdapter(Activity activity, ArrayList<mymoddel> mList){
        this.activity = activity;
        this.mList = mList;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public mymoddel getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView = inflater.inflate(R.layout.my_view,null);
        }


        TextView name = (TextView) convertView.findViewById(R.id.name);
        ImageView pic = (ImageView) convertView.findViewById(R.id.pic);

        mymoddel obj = mList.get(position);

        name.setText(obj.name);


        return convertView;
    }
}
