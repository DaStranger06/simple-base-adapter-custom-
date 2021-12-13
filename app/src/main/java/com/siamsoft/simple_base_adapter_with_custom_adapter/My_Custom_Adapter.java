package com.siamsoft.simple_base_adapter_with_custom_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.siamsoft.simple_base_adapter_with_custom_adapter.R;

public class My_Custom_Adapter extends BaseAdapter {




    private final Activity context;
    private final String[] district;
    private final Integer[] imageId;
    private final String[] sub;

    public My_Custom_Adapter(Activity context, String[] district, Integer[] imageId, String[] sub) {
        this.context = context;
        this.district = district;
        this.imageId = imageId;
        this.sub = sub;


    }

    @Override
    public int getCount() {
        return district.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /*@Override
    public View getView(int position, View convertView, ViewGroup parent) {


       *//* LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.img_and_txt,null,true);*//*


        TextView tt = rowview.findViewById(R.id.txtv);
        TextView tt2 = rowview.findViewById(R.id.txtv2);

        ImageView iv = rowview.findViewById(R.id.img);

        tt.setText(district[position]);
        iv.setImageResource(imageId[position]);
        tt2.setText(sub[position]);

        return rowview;*/

    //70% increase

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)

        {

            LayoutInflater inflater = context.getLayoutInflater();
            convertView = inflater.inflate(R.layout.img_and_txt,null,true);

        }
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.img_and_txt,null,true);


            TextView tt = convertView.findViewById(R.id.txtv);
        TextView tt2 = convertView.findViewById(R.id.txtv2);

        ImageView iv = convertView.findViewById(R.id.img);

        tt.setText(district[position]);
        iv.setImageResource(imageId[position]);
        tt2.setText(sub[position]);

        return convertView;
    }


    //90% increase
/*
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vH;

        if (convertView == null) {

           convertView = LayoutInflater.from(context).inflate(R.layout.img_and_txt,parent,false);
           vH = new ViewHolder(convertView);
           convertView.setTag(convertView);

        }
       else
        {
            vH = (ViewHolder)convertView.getTag();

        }
       vH.textTitle.setText(district[position]);
       vH.imageView.setImageResource(imageId[position]);
       return convertView;


    }*/


    /*private class ViewHolder
    {
        TextView textTitle;
        ImageView imageView;

        public ViewHolder (View view)

        {
            textTitle = view.findViewById(R.id.txtv);
            imageView = view.findViewById(R.id.img);

        }

    }*/
}
