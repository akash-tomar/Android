package com.binaryoperands.blackhat.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


     Button b1;// = (Button)findViewById(R.id.one);
     Button b2;// = (Button)findViewById(R.id.two);
     Button b3;// = (Button)findViewById(R.id.three);
     Button b4 ;//= (Button)findViewById(R.id.four);
     Button b5;// = (Button)findViewById(R.id.five);
     Button b6 ;//= (Button)findViewById(R.id.six);
     Button b7 ;//= (Button)findViewById(R.id.seven);
     Button b8 ;//= (Button)findViewById(R.id.eight);
     Button b9 ;//= (Button)findViewById(R.id.nine);
     Button plus;// = (Button)findViewById(R.id.plus);
     Button minus;// = (Button)findViewById(R.id.minus);
     Button multiply;// = (Button)findViewById(R.id.multiply);
     Button divide ;//= (Button)findViewById(R.id.divide);
     Button clear ;//= (Button)findViewById(R.id.clear);
     Button result ;//= (Button)findViewById(R.id.result);
    //protected Button dot = (Button)findViewById(R.id.dot);
     TextView text ;//= (TextView)findViewById(R.id.ans);
     int x;//=0;
     int y;//=0;
     boolean isPlus;//=false;
     boolean isMinus;//=false;
     boolean isMulti;//=false;
     boolean isDivide;//=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button)findViewById(R.id.one);
         b2 = (Button)findViewById(R.id.two);
         b3 = (Button)findViewById(R.id.three);
         b4 = (Button)findViewById(R.id.four);
         b5 = (Button)findViewById(R.id.five);
         b6 = (Button)findViewById(R.id.six);
         b7 = (Button)findViewById(R.id.seven);
         b8 = (Button)findViewById(R.id.eight);
         b9 = (Button)findViewById(R.id.nine);
         plus = (Button)findViewById(R.id.plus);
         minus = (Button)findViewById(R.id.minus);
         multiply = (Button)findViewById(R.id.multiply);
         divide = (Button)findViewById(R.id.divide);
         clear = (Button)findViewById(R.id.clear);
         result = (Button)findViewById(R.id.result);
        x=0;
        y=0;
        isDivide=false;
        isMulti=false;
        isPlus=false;
        isMinus=false;
        //protected Button dot = (Button)findViewById(R.id.dot);
         text = (TextView)findViewById(R.id.ans);
        text.setText("");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"1";
                text.setText(str);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"2";
                text.setText(str);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"3";
                text.setText(str);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"4";
                text.setText(str);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"5";
                text.setText(str);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"6";
                text.setText(str);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"7";
                text.setText(str);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"8";
                text.setText(str);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                str=str+"9";
                text.setText(str);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
                isDivide=false;
                isMinus=false;
                isMulti=false;
                isPlus=false;
                x=y=0;
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                x=Integer.parseInt(str);
                text.setText("");
                isPlus=true;
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                x=Integer.parseInt(str);
                text.setText("");
                isMinus=true;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                x=Integer.parseInt(str);
                text.setText("");
                isMulti=true;
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                x=Integer.parseInt(str);
                text.setText("");
                isDivide=true;
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text.getText().toString();
                y=Integer.parseInt(str);

                if(isPlus) {
                    text.setText((x+y)+"");
                } else if(isMinus) {
                    text.setText((x-y)+"");
                } else if(isDivide) {
                    if(y!=0) {
                        text.setText((x/y)+"");
                    } else {
                        text.setText("Cannot divide by zero");
                    }

                } else if(isMulti) {
                    text.setText((x*y)+"");
                }

            }
        });




    }

    protected int getScreen() {
        String str = text.getText().toString();
        int x = Integer.parseInt(str);
        return x;
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
