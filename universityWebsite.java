package edu.udayton.daytonflyersguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class universityWebsite extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<String> Services =
                Arrays.asList(getResources().getStringArray(R.array.services));
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_university_website, R.id.services, Services));
    }// end of OnCreate method

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        Intent itemIntent;
        switch (position)
        {
            case 0:
                itemIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://udayton.edu/studev/health_wellness/healthcenter/index.php"));
                break;
            case 1:
                itemIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://udayton.edu/artssciences/academics/computerscience/academic/msc.php"));
                break;
            case 2:
                itemIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://udayton.edu/fss/index.php"));
                break;
            case 3:
                itemIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://daytonflyers.com/"));
                break;
            default:
                Toast myToast = Toast.makeText(universityWebsite.this, "Invalid choice made", Toast.LENGTH_LONG);
                myToast.show();
                itemIntent = null;
                break;
        }// end of switch

        if(itemIntent!=null){
            startActivity(itemIntent);
        }
    }
}// end of main class