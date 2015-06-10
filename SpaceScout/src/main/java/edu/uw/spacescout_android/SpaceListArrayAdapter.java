package edu.uw.spacescout_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ajay alfred on 11/6/13.
 *
 * Adapter for SpaceListFragment.
 */

public class SpaceListArrayAdapter extends ArrayAdapter {

    //define variables
    private final Context context;
    private final String[] values;

    public SpaceListArrayAdapter(Context context, String[] values) {
        super(context, R.layout.custom_space_list_row, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //get LayoutInflater to inflate space list row XML
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //get space list row view group
        // TODO: Should use view holder pattern
        View rowView = inflater.inflate(R.layout.custom_space_list_row, parent, false);

        //get the different views inside the view group
        //spaceThumb
        ImageView imgSpaceThumb = (ImageView) rowView.findViewById(R.id.spaceThumb);

        //spaceTitle & spaceDesc
        TextView txtSpaceTitle = (TextView) rowView.findViewById(R.id.spaceTitle);
        TextView txtSpaceDesc = (TextView) rowView.findViewById(R.id.spaceDesc);

        //spaceLocation & spaceSeatCount
        TextView txtSpaceLoc = (TextView) rowView.findViewById(R.id.spaceLocation);
        TextView txtSpaceSeatCount = (TextView) rowView.findViewById(R.id.spaceSeatCount);

        //this is where all the changing is supposed to happen

        txtSpaceTitle.setText(values[position]);

        return rowView;
    }

}