package com.example.firstbase;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ListActivity {

    private TextView selection;
    private static final String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel", "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle); setContentView(R.layout.activity_main); setListAdapter(new ArrayAdapter<String>(this,
                R.layout.row, R.id.label,
                items)); selection=(TextView)findViewById(R.id.selection);
    }
    public void onListItemClick(ListView parent, View v, int position, long id) {
        selection.setText(items[position]); }
}