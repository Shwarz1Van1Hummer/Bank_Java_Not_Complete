package com.example.bank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    public Label checking_acc_num;
    public Label checking_trans_limit;
    public Label checking_date_create;
    public Label checking_balance;
    public Label sv_number;
    public Label sv_limit;
    public Label sv_date;
    public Label sv_balance;
    public TextField amount_to_sv;
    public Button trans_to_sv_btn;
    public TextField amount_to_ch;
    public Button trans_to_ch;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
