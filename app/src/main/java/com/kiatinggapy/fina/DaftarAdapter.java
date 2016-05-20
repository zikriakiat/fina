package com.kiatinggapy.fina;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mila on 20/05/2016.
 */
public class DaftarAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<DaftarItem> daftar;


    @Override
    public int getCount() {
        return daftar.size();
    }

    @Override
    public Object getItem(int position) {
        return daftar.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater==null)inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView==null)convertView = inflater.inflate(R.layout.item_daftar,null);

        TextView name = (TextView)convertView.findViewById(R.id.txtNamaSalon);
        TextView alamat = (TextView)convertView.findViewById(R.id.txtAlamatSalon);
        TextView jarak = (TextView)convertView.findViewById(R.id.txtJarak);

        DaftarItem item = daftar.get(position);

        name.setText(item.getName());
        alamat.setText(item.getAlamat());
        jarak.setText(item.getJarak());

        return convertView;
    }
}
