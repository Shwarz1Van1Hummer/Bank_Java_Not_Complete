package com.example.bank.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {
    public TextField fname_fld;
    public TextField lname_fld;
    public TextField Password_fld;
    public CheckBox paddress_box;
    public Label paddress_fld;
    public CheckBox check_acc_fld;
    public TextField check_acc_bal_fld;
    public CheckBox save_acc_box;
    public TextField save_acc_bal_fld;
    public Button create_client_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
