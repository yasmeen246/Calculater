package com.example.jasmn.calculater;

public class calculations  {
    private double sumnumber;
    private double waitingnumber;
    private String waitingOperator;
    private double calculatorMemory;

    // operator types
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";
    public static final String CLEAR = "C" ;
    public static final String RECALLMEMORY = "history";
    public static final String SQUAREROOT = "√";
    public static final String SQUARED = "x²";
    public static final String INVERT = "1/x";
    public static final String SIGN = "_";
    public static final String SINE = "sin";
    public static final String COSINE = "cos";
    public static final String TANGENT = "tan";
    public static final String Hunderd = "%";
    public static final String log="log";
    public static final String LN="ln";
    public static final String abs="abs";
    public static final String XY="x^";
    public static final String bi="π";
    public static final String E="e";
    public static final String exe="exe^";


    public static final String ROOT3 = "3√";
    public static final String cot = "cot";
    public static final String sec = "sec";
    public static final String csc = "csc";
    public static final String sinh = "sinh";
    public static final String cosh = "cosh";
    public static final String tanh = "tanh";
    public static final String sinh_1 = "sinh-1";
    public static final String cosh_1="cosh-1";
    public static final String tanh_1="tanh-1";
    public static final String x_2="2^";
    public static final String x_3="^3";
    public static final String mad="!";


    public calculations() {
        sumnumber = 0;
        waitingnumber=0;
        waitingOperator="";
        calculatorMemory=0;
    }

    public void setWaitingnumber(double waitingnumber) {
        this.waitingnumber = waitingnumber;
    }

    public double getWaitingnumber() {
        return waitingnumber;
    }

    public double getResult() {
        return sumnumber;
    }

    public void setSumnumber(double number) {
        this.sumnumber = number;
    }
    public void setoneActions(String operator) {
        if (operator.equals(CLEAR)) {
            sumnumber = 0;
            waitingnumber = 0;
            waitingOperator = "";
        } else if (operator.equals(SQUAREROOT)) {
            sumnumber = Math.sqrt(sumnumber);
        }
        else if (operator.equals(SINE)){
            sumnumber=Math.sin(Math.toRadians(sumnumber));
        } else if (operator.equals(COSINE)) {
            sumnumber=Math.cos(Math.toRadians(sumnumber));
        }
        else if (operator.equals(TANGENT)){
            sumnumber=Math.tan(Math.toRadians(sumnumber));

        }

            else if (operator.equals(Hunderd)) {
            sumnumber=sumnumber/100;
        }
        else if (operator.equals(log)){
            sumnumber=Math.log10(sumnumber);
        } else if (operator.equals(INVERT)) {
            sumnumber= 1/sumnumber;
        }
        else if (operator.equals(LN)) {
            sumnumber = Math.log(sumnumber);
        }
        else if (operator.equals(abs)){
            sumnumber=Math.abs(sumnumber);
        }

        else if (operator.equals(bi)){
            sumnumber=Math.PI;
        }
        else if (operator.equals(E)){
            sumnumber=Math.E;
        }
        else if (operator.equals(exe)){
            sumnumber=Math.pow((Math.E),sumnumber);
        }
        //-------------------------------------------------
        else if (operator.equals(ROOT3)) {
            sumnumber = Math.cbrt(sumnumber);
        } else if (operator.equals(cot)) {
            sumnumber = Math.asin(Math.toRadians(sumnumber));

        }
        else if (operator.equals(sec)){
            sumnumber=Math.acos(Math.toRadians(sumnumber));
        } else if (operator.equals(csc)) {
            sumnumber=Math.atan(Math.toRadians(sumnumber));
        }
        else if (operator.equals(sinh)){
            sumnumber=Math.sinh(Math.toRadians(sumnumber));

        }
        else if (operator.equals(cosh)){
            sumnumber=Math.cosh(Math.toRadians(sumnumber));
        } else if (operator.equals(tanh)) {
            sumnumber=Math.tanh(Math.toRadians(sumnumber));
        }
        else if (operator.equals(sinh_1)){
            sumnumber=1/Math.sinh(Math.toRadians(sumnumber));

        }
        else if (operator.equals(cosh_1)){
            sumnumber=1/Math.cosh(Math.toRadians(sumnumber));
        } else if (operator.equals(tanh_1)) {
            sumnumber=1/Math.tanh(Math.toRadians(sumnumber));
        }
        else if (operator.equals(x_2)){
            sumnumber=Math.pow(2,sumnumber);
        }
        else if (operator.equals(SIGN)){
            waitingOperator=SUBTRACT;
            setmltiaction();
        }



        //**************************************
        else {
            setmltiaction();
            waitingOperator = operator;
            waitingnumber = sumnumber;
        }

    }

    private void setmltiaction() {
        if (waitingOperator.equals(ADD)){
            sumnumber=waitingnumber +sumnumber;
        }else if (waitingOperator.equals(SUBTRACT)){
            sumnumber=waitingnumber-sumnumber;
        }else if (waitingOperator.equals(MULTIPLY)){
            sumnumber=waitingnumber*sumnumber;
        } else if (waitingOperator.equals(DIVIDE)) {
            if (sumnumber !=0){
                sumnumber=waitingnumber/sumnumber;
            }

        }
        else if (waitingOperator.equals(SQUARED)) {
            sumnumber = Math.pow(sumnumber, 2);

        }
        else if (waitingOperator.equals(XY)){

            sumnumber=Math.pow(waitingnumber,sumnumber);
        }
        else if (waitingOperator.equals(x_3)){

            sumnumber=Math.pow(waitingnumber,3);
        }
        else if (waitingOperator.equals(mad)){double fact=1;
            for (double i = 1;  i <=waitingnumber ;i++) {
                fact =  i*fact;
            }
            sumnumber=fact;
        }


    }

}
