package sample.content.controller;


import com.example.demo.controllers.CalculatorController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    private CalculatorController cc;
    private String numero1;
    private String numero2;
    private String signo;

    @FXML private Button btn_result;
    @FXML private Button btn_delete;
    @FXML private Button btn_deleteall;
    @FXML private Button btn_sum;
    @FXML private Button btn_subtraction;
    @FXML private Button btn_multiplication;
    @FXML private Button btn_division;
    @FXML private Button btn_nine;
    @FXML private Button btn_eight;
    @FXML private Button btn_seven;
    @FXML private Button btn_six;
    @FXML private Button btn_five;
    @FXML private Button btn_four;
    @FXML private Button btn_three;
    @FXML private Button btn_two;
    @FXML private Button btn_one;
    @FXML private Button btn_zero;
    @FXML private Button btn_point;


    @FXML private TextField txt_result;

    public void setNine(ActionEvent event){
        btn_nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "9");
            }
        });
    }

    public void setEight(ActionEvent event){
        btn_eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "8");
            }
        });
    }

    public void setSeven(ActionEvent event){
        btn_seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "7");
            }
        });
    }

    public void setSix(ActionEvent event){
        btn_six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "6");
            }
        });
    }

    public void setFive(ActionEvent event){
        btn_five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "5");
            }
        });
    }

    public void setFour(ActionEvent event){
        btn_four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "4");
            }
        });
    }

    public void setThree(ActionEvent event){
        btn_three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "3");
            }
        });
    }

    public void setTwo(ActionEvent event){
        btn_two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "2");
            }
        });
    }

    public void setOne(ActionEvent event){
        btn_one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "1");
            }
        });
    }

    public void setZero(ActionEvent event){
        btn_zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText(txt_result.getText() + "0");
            }
        });
    }

    private boolean existePunto(String cadena){
        boolean respuesta = false;

        for (int i = 0; i < cadena.length();i++){
            if (cadena.substring(i, i+1).equals(".")){
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }

    public void setPoint(ActionEvent event){
        btn_point.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {

                if(txt_result.getText().length() <= 0){
                    txt_result.setText("0.");
                }
                else {
                    if(!existePunto(txt_result.getText()))
                        txt_result.setText(txt_result.getText() + ".");
                }

            }
        });
    }




    private String calcular(String numero1, String numero2, String signo) throws Exception {

        Double respuesta = 0.0;
        String resultado;

        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);

        for (int i = 0; i < signo.length();i++){
            if (signo.equals("+")){

                respuesta = cc.getOperationSum(num1, num2);
                break;
            }
            else if(signo.equals("-")){
                respuesta = cc.getOperationSubtraction(num1, num2);
                break;
            }
            else if (signo.equals("/")){
                respuesta = cc.getOperationDivision(num1, num2);
                break;
            }
            else if (signo.equals("*")){
                respuesta = cc.getOperationMultiplication(num1, num2);
                break;
            }
        }
        resultado = respuesta.toString();

        return resultado;
    }

    public void setSum(ActionEvent event){
        btn_sum.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {

                if(!txt_result.getText().equals("")){
                    numero1 = txt_result.getText();
                    signo = "+";
                    txt_result.setText("");
                }

            }
        });
    }

    public void setMultiplication(ActionEvent event){
        btn_multiplication.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {

                if(!txt_result.getText().equals("")){
                    numero1 = txt_result.getText();
                    System.out.println(numero1);
                    signo = "*";
                    txt_result.setText("");
                }
            }
        });
    }

    public void setDivision(ActionEvent event){
        btn_division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                if(!txt_result.getText().equals("")){
                    numero1 = txt_result.getText();
                    signo = "/";
                    txt_result.setText("");
                }
            }
        });
    }

    public void setSubtraction(ActionEvent event){
        btn_subtraction.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                if(!txt_result.getText().equals("")){
                    numero1 = txt_result.getText();
                    signo = "-";
                    txt_result.setText("");
                }
            }
        });
    }

    public void DeleteAll(ActionEvent event){
        btn_deleteall.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                txt_result.setText("");
            }
        });
    }

    public void Delete(ActionEvent event){
        btn_delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                if(txt_result.getText().length() > 0 ){
                    txt_result.setText(txt_result.getText().substring(0, txt_result.getText().length() - 1));
                }

            }
        });
    }

    public void getResult(ActionEvent event){
        btn_result.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero2 = txt_result.getText();
                System.out.println(numero2);
                String resultado = "";

                try {
                    resultado = calcular(numero1, numero2, signo);
                } catch (Exception e) {
                    System.out.println("Error in the operation, check the numbers. \n" + e.getCause());
                }

                txt_result.setText(resultado);

            }
        });
    }
}

