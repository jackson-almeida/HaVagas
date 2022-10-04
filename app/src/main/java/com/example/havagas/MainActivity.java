package com.example.havagas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private FormularioPessoa form;
    private ActivityMainBinding acb;

    private Button buttonClear;
    private Button buttonSave;

    private EditText etName;
    private EditText etEmail;
    private EditText etPhone;
    private RadioButton rbResid;
    private RadioButton rbCom;
    private EditText etCellphone;
    private RadioButton rbMasc;
    private RadioButton rbFem;
    private EditText etDataNasc;
    private Spinner spSchooling;
    private EditText etIntVagas;

    @Override
    protected void onSaveInstanceState(@Nullable Bundle savedInstanceState) {
        savedInstanceState.putString("ET_NAME", etName.toString());
        savedInstanceState.putString("ET_PHONE", etName.toString());
        savedInstanceState.putString("RB_RESID", etName.toString());
        savedInstanceState.putString("RB_COM", etName.toString());
        savedInstanceState.putString("ET_CELLPHONE", etName.toString());
        savedInstanceState.putString("RB_MASC", etName.toString());
        savedInstanceState.putString("RB_FEM", etName.toString());
        savedInstanceState.putString("ET_DATANASC", etName.toString());
        savedInstanceState.putString("SP_ESC", etName.toString());
        savedInstanceState.putString("ET_VAGA_INT", etName.toString());

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());



//        amb.etName.setText(savedInstanceState.getString("ET_NAME"));
//        amb.etEmail.setText(savedInstanceState.getString(""));
//        amb.etPhone.setText(savedInstanceState.getString(""));
//        amb.rbResid.setText(savedInstanceState.getString(""));
//        amb.rbCom.setText(savedInstanceState.getString(""));
//        amb.etCellPhone.setText(savedInstanceState.getString(""));
//        amb.rbMasc.setText(savedInstanceState.getString(""));
//        amb.rbFem.setText(savedInstanceState.getString(""));
//        amb.etDataNasc.setText(savedInstanceState.getString(""));
//        amb.spEs.setEnabled(false);
//        amb.etVagaInteresse.setText(savedInstanceState.getString(""));

        buttonClear = findViewById(R.id.btLimpar);
        buttonSave = findViewById(R.id.btSalvar);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        rbResid = findViewById(R.id.rbResid);
        rbCom = findViewById(R.id.rbCom);
        etCellphone = findViewById(R.id.etCellPhone);
        rbMasc = findViewById(R.id.rbMasc);
        rbFem = findViewById(R.id.rbFem);
        etDataNasc = findViewById(R.id.etDataNasc);
        spSchooling = findViewById(R.id.spEs);
        etIntVagas = findViewById(R.id.etVagaInteresse);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText("");
                etEmail.setText("");
                etPhone.setText("");
                rbResid.setChecked(true);
                rbCom.setChecked(false);
                etCellphone.setText("");
                rbMasc.setChecked(false);
                rbFem.setChecked(false);
                spSchooling.setSelection(0);
                etIntVagas.setText("");
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FormularioPessoa form = new FormularioPessoa();
                form.setNome(etName.getText().toString());
                form.setEmail(etEmail.getText().toString());
                form.setTelefone(etPhone.getText().toString());
                form.setCelular(etCellphone.getText().toString());
                form.setSexo(String.valueOf(rbFem.isChecked() ? rbFem.getText() : rbMasc.getText()));
                form.setDataNasc(etDataNasc.getText().toString());
                form.setEscolaridade(((TextView) spSchooling.getSelectedView()).getText().toString());
                form.setVagasInteresse(etIntVagas.getText().toString());
            }
        });
    }
}