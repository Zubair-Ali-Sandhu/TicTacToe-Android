package me.zubair.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String btn1Text, btn2Text, btn3Text, btn4Text, btn5Text, btn6Text, btn7Text, btn8Text, btn9Text;
    int flag=0;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();


    }
    public void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
    }
    public void resetGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
        btn4.setClickable(true);
        btn5.setClickable(true);
        btn6.setClickable(true);
        btn7.setClickable(true);
        btn8.setClickable(true);
        btn9.setClickable(true);

        flag = 0;
        count = 0;
    }
    public void check(View v){
        count++;
        Button b=(Button) v;
        if(flag==0){
            b.setText("X");
            flag=1;
        }
        else{
            b.setText("O");
            flag=0;
        }
        b.setClickable(false);
        if (count>4){
           btn1Text=btn1.getText().toString();
           btn2Text=btn2.getText().toString();
           btn3Text=btn3.getText().toString();
           btn4Text=btn4.getText().toString();
           btn5Text=btn5.getText().toString();
           btn6Text=btn6.getText().toString();
           btn7Text=btn7.getText().toString();
           btn8Text=btn8.getText().toString();
           btn9Text=btn9.getText().toString();
            if (btn1Text.equals("X") && btn5Text.equals("X") && btn9Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();

            }
            else if (btn1Text.equals("X") && btn2Text.equals("X") && btn3Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn1Text.equals("X") && btn4Text.equals("X") && btn7Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn2Text.equals("X") && btn5Text.equals("X") && btn8Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn3Text.equals("X") && btn6Text.equals("X") && btn9Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn3Text.equals("X") && btn5Text.equals("X") && btn7Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn4Text.equals("X") && btn5Text.equals("X") && btn6Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn7Text.equals("X") && btn8Text.equals("X") && btn9Text.equals("X")) {
                // Add your logic here
                Toast.makeText(this,"Player 1 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }

            if (btn1Text.equals("O") && btn5Text.equals("O") && btn9Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn1Text.equals("O") && btn2Text.equals("O") && btn3Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn1Text.equals("O") && btn4Text.equals("O") && btn7Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();
            }
            else if (btn2Text.equals("O") && btn5Text.equals("O") && btn8Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();

            }
            else if (btn3Text.equals("O") && btn6Text.equals("O") && btn9Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();

            }
            else if (btn3Text.equals("O") && btn5Text.equals("O") && btn7Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();

            }
            else if (btn4Text.equals("O") && btn5Text.equals("O") && btn6Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();

            }
            else if (btn7Text.equals("O") && btn8Text.equals("O") && btn9Text.equals("O")) {
                // Add your logic here
                Toast.makeText(this,"Player 2 wins",Toast.LENGTH_SHORT).show();
                resetGame();

            }


        } else if (count==9) {
            Toast.makeText(this,"Draw",Toast.LENGTH_SHORT).show();
            resetGame();


        }

    }


}