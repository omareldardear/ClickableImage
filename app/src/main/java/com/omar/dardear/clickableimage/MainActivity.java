package com.omar.dardear.clickableimage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView img=(ImageView) findViewById(R.id.imageView);
        img.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View v, MotionEvent event)
            {
                //if(event.getAction()==MotionEvent.ACTION_UP)
                // {
                int imageId = getImageId((int)event.getX(), (int)event.getY());
                if (imageId >= 0)
                    Toast.makeText(getApplicationContext(), "pressed ", Toast.LENGTH_SHORT).show();
                return false;

                // }
                //return false;
            }
        });


        ImageView One=(ImageView) findViewById(R.id.One);
        One.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View v, MotionEvent event)
            {

                int imageId = getImageId1((int)event.getX(), (int)event.getY());
                if (imageId >= 0)
                    Toast.makeText(getApplicationContext(), "Events ", Toast.LENGTH_SHORT).show();
                return false;


            }
        });


        ImageView Two=(ImageView) findViewById(R.id.Two);
        Two.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View v, MotionEvent event)
            {

                int imageId = getImageId2((int)event.getX(), (int)event.getY());
                if (imageId >= 0)
                    Toast.makeText(getApplicationContext(), "News", Toast.LENGTH_SHORT).show();
                return false;


            }
        });

        ImageView Three=(ImageView) findViewById(R.id.Three);
        Three.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View v, MotionEvent event)
            {

                int imageId = getImageId3((int)event.getX(), (int)event.getY());
                if (imageId >= 0)
                    Toast.makeText(getApplicationContext(), "Services", Toast.LENGTH_SHORT).show();
                return false;


            }
        });




    }


    private int getImageId(int x, int y)
    {
        ViewGroup parent = (ViewGroup) findViewById(R.id.Frame);
        for (int a = parent.getChildCount()-1; a >= 0; a--)
        {
            if (parent.getChildAt(a) instanceof ImageView)
                if (!checkPixelTransparent((ImageView)parent.getChildAt(a), x, y))
                    return parent.getChildAt(a).getId();
        }
        return -1;
    }


    private int getImageId1(int x, int y)
    {
//        ArrayList<ViewGroup> grp=new ArrayList<ViewGroup>();
//        grp.add((ViewGroup) findViewById(R.id.Frame0));
//        grp.add((ViewGroup) findViewById(R.id.Frame1));
//        grp.add((ViewGroup) findViewById(R.id.Frame2));
//        grp.add((ViewGroup) findViewById(R.id.Frame3));

        ViewGroup parent = (ViewGroup) findViewById(R.id.Frame1);
       
        for (int a = parent.getChildCount()-1; a >= 0; a--)
        {

            if (parent.getChildAt(a) instanceof ImageView)
                if (!checkPixelTransparent((ImageView)parent.getChildAt(a), x, y))
                    return parent.getChildAt(a).getId();
        }
        return -1;
    }

    private int getImageId2(int x, int y)
    {
//        ArrayList<ViewGroup> grp=new ArrayList<ViewGroup>();
//        grp.add((ViewGroup) findViewById(R.id.Frame0));
//        grp.add((ViewGroup) findViewById(R.id.Frame1));
//        grp.add((ViewGroup) findViewById(R.id.Frame2));
//        grp.add((ViewGroup) findViewById(R.id.Frame3));

        ViewGroup parent = (ViewGroup) findViewById(R.id.Frame2);
        for (int a = parent.getChildCount()-1; a >= 0; a--)
        {
            if (parent.getChildAt(a) instanceof ImageView)
                if (!checkPixelTransparent((ImageView)parent.getChildAt(a), x, y))
                    return parent.getChildAt(a).getId();
        }
        return -1;
    }

    private int getImageId3(int x, int y)
    {
//        ArrayList<ViewGroup> grp=new ArrayList<ViewGroup>();
//        grp.add((ViewGroup) findViewById(R.id.Frame0));
//        grp.add((ViewGroup) findViewById(R.id.Frame1));
//        grp.add((ViewGroup) findViewById(R.id.Frame2));
//        grp.add((ViewGroup) findViewById(R.id.Frame3));

        ViewGroup parent = (ViewGroup) findViewById(R.id.Frame3);
        for (int a = parent.getChildCount()-1; a >= 0; a--)
        {
            if (parent.getChildAt(a) instanceof ImageView)
                if (!checkPixelTransparent((ImageView)parent.getChildAt(a), x, y))
                    return parent.getChildAt(a).getId();
        }
        return -1;
    }

    private boolean checkPixelTransparent(ImageView iv, int x, int y)
    {
        Bitmap bitmap = ((BitmapDrawable) iv.getDrawable()).getBitmap();
        if (Color.alpha(bitmap.getPixel(x, y)) == 0)
            return true;
        else
            return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
