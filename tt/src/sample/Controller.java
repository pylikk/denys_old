package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class Controller {
    public Text output;
    public String operator = "+";
    public String currentOperator;
    public double buffer = 0.0;
    public String value;
    public boolean exec = false;
    public Model model = new Model();

    public void number (ActionEvent event) {
        value = ((Button) event.getSource()).getText();
        if (Double.parseDouble(output.getText()) != 0 && !exec) {
            output.setText(output.getText()+value);
        }
        else {
            output.setText(value);
        }
        exec = false;

    }
    public void operator (ActionEvent event) {

            buffer = model.calculate(buffer,operator,Double.parseDouble(output.getText()));
            if (buffer == (int) buffer) {
                output.setText(""+(int)buffer);
            }
            else {
                output.setText(""+buffer);
            }
            exec = true;

            if (((Button) event.getSource()).getText().equals("=")) {
                operator = "+";
                output.setText(""+buffer);
                buffer = 0.0;
                exec = false;

            }
            else {
                operator = ((Button) event.getSource()).getText();
            }

    }

    public void reset (ActionEvent event) {
        operator = "+";
        buffer = 0.0;
        exec = false;
        output.setText("0");
    }
}
