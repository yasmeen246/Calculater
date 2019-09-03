package com.example.jasmn.calculater;

import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    String operator = "+-/*%";
    String numbers=".0123456789";
    ArrayList<String> data;
    calculations calculations;
    TextView text, text2;
    ArrayList<String> hist;
    ArrayList<String> alga;
    TableLayout tableLayout;
    Button gazr_,sin_,cos_,tan_,ln_,log_,x_,ex_,x2_,xy_,abs,bi,e_;
    boolean one=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.edt);
        text2 = findViewById(R.id.textView2);
        data = new ArrayList<>();
        hist = new ArrayList<>();
        tableLayout=findViewById(R.id.tabel);
        gazr_=findViewById(R.id.gazr);
        sin_=findViewById(R.id.sin);
        cos_=findViewById(R.id.cos);
        tan_=findViewById(R.id.tan);
        ln_=findViewById(R.id.ln);
        log_=findViewById(R.id.log);
        x_=findViewById(R.id.xx);
        ex_=findViewById(R.id.ee);
        x2_=findViewById(R.id.xxx);
        xy_=findViewById(R.id.xy);
        abs=findViewById(R.id.lxl);
        bi=findViewById(R.id.bay);
        e_=findViewById(R.id.e);
    }
    Button button;
    private void setnum(View view) {
        button = (Button) view;
        String views = button.getText().toString();
        if (views.equals("2nd")){
            button.setText("1st");
            gazr_.setText("3√");
            sin_.setText("cot");
            cos_.setText("sec");
            tan_.setText("csc");
            ln_.setText("sinh");
            log_.setText("cosh");
            x_.setText("tanh");
            ex_.setText("sinh-1");
            x2_.setText("cosh-1");
            xy_.setText("tanh-1");
            abs.setText("2^x");
            bi.setText("x^3");
            e_.setText("x!");
        }
        else if (views.equals("1st")){
            button.setText("2nd");
            gazr_.setText("√");
            sin_.setText("sin");
            cos_.setText("cos");
            tan_.setText("tan");
            ln_.setText("ln");
            log_.setText("log");
            x_.setText("1/x");
            ex_.setText("e^x");
            x2_.setText("x²");
            xy_.setText("x^y");
            abs.setText("lxl");
            bi.setText("π");
            e_.setText("e");
        }
       else if (text.getText().toString().equals("")) {
            if (operator.contains(views))
                text.setText(null);
            else if (views.equals(".")) {
                text.setText("0" + views);
                data.add(button.getText().toString());
            }
//            else if (views.equals("( )")){
//                text.setText("(");
//                data.add("(");}
                else {
                text.setText(text.getText() + views);
                data.add(button.getText().toString());
            }
        } else { try {
            if (operator.contains(data.get(data.size()-1)) && operator.contains(views)) {
                data.remove(data.size()-1);
                data.add(views);
                text.setText(text.getText().toString().substring(0, text.getText().length() - 1) + views);
            }
//            else if (views.equals("( )")){
//
//                    text.setText("(");
//                    data.add("(");
//                }
                else {
                data.add(views);
                text.setText(text.getText() + views);
            }
        }catch (Exception e){

        }

        }


}
    public void cancle(View view) {
        text.setText("");

    }
    public void one(View view) {
        setnum(view);
    }

    public void two(View view) {setnum(view);
    }


    public void tree(View view) {setnum(view);
    }
    public void four(View view) {setnum(view);
    }

    public void five(View view) {setnum(view);
    }

    public void six(View view) {setnum(view);
    }
    public void siven(View view) {setnum(view);
    }

    public void eght(View view) {setnum(view);
    }

    public void nine(View view) {
        setnum(view);
    }
    public void dot(View view) {setnum(view);
    }

    public void zero(View view) {
        setnum(view);
        }

    public void minse(View view) {
        text.setText(text.getText()+"-");
        data.add("_");
          }

    public void add(View view) {        setnum(view);

    }

    public void sub(View view) {        setnum(view); }



    public void mult(View view) {
        setnum(view);

    }


    public void div(View view) {        setnum(view);

    }
    String h_data;
    String h_result;

    public void equal(View view)

    {
        setprimtive_operations();

//        h_data = text.getText().toString();
//        calculations=new calculations();
//        String s = "";
//        String num="";
//        String op = "";
//        Iterator<String> iterator = data.iterator();
//        boolean sign = false;
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if (numbers.contains(next)){
//                num = num+next ;
//            }
//            else{
//                op=next;
//                if (op.equals("(-"))
//                   sign=true;
//               else{ try {
//                    calculations.setSumnumber(Double.parseDouble(num));
//
//                    Toast.makeText(this, ""+num+op, Toast.LENGTH_SHORT).show();
//
//                    calculations.setoneActions(op);
//                    num="";
//                }
//                catch (Exception e){
//
//                }}}
//
//
//            if (! iterator.hasNext()&& !operator.contains(next)){
//              //  calculations.setWaitingnumber(calculations.getResult());
//               // Toast.makeText(this, ""+op, Toast.LENGTH_SHORT).show();
// try {
//     if (sign){
//        calculations.setWaitingnumber(- calculations.getWaitingnumber());
//        calculations.setSumnumber(Double.parseDouble(num));
//         calculations.setoneActions(op);
//     }
//
//else {
//     try {
//         calculations.setSumnumber(Double.parseDouble(num));
//
//     } catch (Exception e) {
//
//     }
//     calculations.setoneActions(op);
//     Toast.makeText(this, "" + op + num , Toast.LENGTH_SHORT).show();
// }}
//                catch (Exception e){
//
//                }
//            }
//        }
//
//
//            text.setText(""+calculations.getResult());
//
//        h_result = text.getText().toString();
//        data.clear();
//         data.add(h_result);
//         hist.add(h_data+"="+h_result);
        }


    public void clear(View view) {
        try {
            String newtext=text.getText().toString().substring(0,text.getText().toString().length()-1);
            text.setText(newtext);
            data.remove(data.size()-1);
        }
       catch (Exception e){

       }

    }


    public void hundred(View view) {        setnum(view);
    }
    public void square(View view){
        button = (Button) view;

        setnum(view);
    }
    public void sin(View view) {
       setnum(view);
    }
    public void cos(View view) {
        setnum(view);
        }

    public void tan(View view) {
        setnum(view);
    }
    public void log(View view) {
        setnum(view);
    }
    public void ln(View view) {
        setnum(view);
    }
    public void nd(View view) {
        setnum(view);
    }
    public void sqrttwo(View view) {
        button = (Button) view;

        if (button.getText().toString().equals("x²")) {
            text.setText(text.getText() + "^2");
            data.add("x²");

        } else setnum(view);  }
    public void xy(View view) {
        button = (Button) view;

        if (button.getText().toString().equals("x^y")) {
            text.setText(text.getText() + "^");
            data.add("x^");

        } else       setnum(view);

    }
    public void inversex(View view){
        button = (Button) view;

        if (button.getText().toString().equals("1/x")) {
            text.setText(text.getText() + "1/");
            data.add("1/x");

        } else       setnum(view);
    }
    public void inverse_sign(View view){
        button = (Button) view;

        if (button.getText().toString().equals("lxl")) {
            text.setText(text.getText() + "abs");
            data.add("abs");

        } else{ text.setText(text.getText() + "2^");
            data.add("2^");

        }

        }
    public void by(View view){
        button = (Button) view;

        if (button.getText().toString().equals("π")) {
           setnum(view);

        } else{ text.setText(text.getText() + "^3");
            data.add("^3");
            one=true;

        }


    }
    public void e (View view){
        button = (Button) view;

        if (button.getText().toString().equals("e")) {
            setnum(view);

        } else{ text.setText(text.getText() + "!");
            data.add("!");

        }

    }
    public void ex(View view){
        button = (Button) view;

        if (button.getText().toString().equals("e^x")) {
            text.setText(text.getText()+"exe^");
            data.add("exe^");
        } else       setnum(view);
    }


    public void doub(View view) {
        if (one){
            text.setText(text.getText()+"(");
            data.add("(");
            one=false;}
            else {
            text.setText(text.getText()+")");
            data.add(")");
            one=true;}

    }
    public void history(View view){
        text.setText(h_data+"="+h_result);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",text.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        text.setText(savedInstanceState.getString("text"));
    }

    public void setprimtive_operations(){
        String data_in,data_in2;
        ArrayList<String>sublist =new ArrayList<>();
       try {

        Iterator<String> iterator = data.iterator();
        while (iterator.hasNext())
        {
            String next = iterator.next();
            if (next.equals("(")){
                data.set(data.indexOf(next),"");
                    if (! next.equals(")")){
                        sublist.add(String.valueOf(next));
                        data.set(data.indexOf(next),"");
                    }
                    else {
                        data.set(data.indexOf(next),"");
                        double result = equality(sublist);
                        Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();
                        data.add(String.valueOf(result));
                        data.add(data.indexOf(next), String.valueOf(result));

                    }
                }




            }

        double equality_result = equality(data);
        text.setText(""+equality_result);

        h_result = text.getText().toString();
        data.clear();
        data.add(h_result);
        hist.add(h_data+"="+h_result);
    }catch (Exception e){
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public double equality(ArrayList<String> sub_list){
        h_data = text.getText().toString();
        calculations=new calculations();
        String s = "";
        String num="";
        String op = "";
        Iterator<String> iterator = sub_list.iterator();
        boolean sign = false;
        while (iterator.hasNext()){
            String next = iterator.next();
            if (numbers.contains(next)){
                num = num+next ;
            }
            else{
                op=next;
                if (op.equals("_"))
                    sign=true;
                else{ try {
                    calculations.setSumnumber(Double.parseDouble(num));

                    Toast.makeText(this, ""+num+op, Toast.LENGTH_SHORT).show();

                    calculations.setoneActions(op);
                    num="";
                }
                catch (Exception e){

                }}}


            if (! iterator.hasNext()&& !operator.contains(next)){
                //  calculations.setWaitingnumber(calculations.getResult());
                // Toast.makeText(this, ""+op, Toast.LENGTH_SHORT).show();
                try {
                    if (sign){
                        calculations.setWaitingnumber(- calculations.getWaitingnumber());
                        calculations.setSumnumber(Double.parseDouble(num));
                        calculations.setoneActions(op);
                    }

                    else {
                        try {
                            calculations.setSumnumber(Double.parseDouble(num));

                        } catch (Exception e) {

                        }
                        calculations.setoneActions(op);
                        Toast.makeText(this, "" + op + num , Toast.LENGTH_SHORT).show();
                    }}
                catch (Exception e){

                }
            }
        }

        double result = calculations.getResult();
        return result;
    }
}
