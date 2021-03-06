// Generated by view binder compiler. Do not edit!
package com.example.quote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.quote.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnRegister;

  @NonNull
  public final TextInputEditText etConfirmPassword;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etFullname;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final TextInputEditText etUsername;

  @NonNull
  public final TextView haveAccount;

  @NonNull
  public final TextView registerSubTittle;

  @NonNull
  public final TextView registerTittle;

  @NonNull
  public final TextInputLayout tilCofirmPassword;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilFullname;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextInputLayout tilUsername;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnRegister, @NonNull TextInputEditText etConfirmPassword,
      @NonNull TextInputEditText etEmail, @NonNull TextInputEditText etFullname,
      @NonNull TextInputEditText etPassword, @NonNull TextInputEditText etUsername,
      @NonNull TextView haveAccount, @NonNull TextView registerSubTittle,
      @NonNull TextView registerTittle, @NonNull TextInputLayout tilCofirmPassword,
      @NonNull TextInputLayout tilEmail, @NonNull TextInputLayout tilFullname,
      @NonNull TextInputLayout tilPassword, @NonNull TextInputLayout tilUsername) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.etConfirmPassword = etConfirmPassword;
    this.etEmail = etEmail;
    this.etFullname = etFullname;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.haveAccount = haveAccount;
    this.registerSubTittle = registerSubTittle;
    this.registerTittle = registerTittle;
    this.tilCofirmPassword = tilCofirmPassword;
    this.tilEmail = tilEmail;
    this.tilFullname = tilFullname;
    this.tilPassword = tilPassword;
    this.tilUsername = tilUsername;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      AppCompatButton btnRegister = rootView.findViewById(id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.et_confirm_password;
      TextInputEditText etConfirmPassword = rootView.findViewById(id);
      if (etConfirmPassword == null) {
        break missingId;
      }

      id = R.id.et_email;
      TextInputEditText etEmail = rootView.findViewById(id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_fullname;
      TextInputEditText etFullname = rootView.findViewById(id);
      if (etFullname == null) {
        break missingId;
      }

      id = R.id.et_password;
      TextInputEditText etPassword = rootView.findViewById(id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.et_username;
      TextInputEditText etUsername = rootView.findViewById(id);
      if (etUsername == null) {
        break missingId;
      }

      id = R.id.have_account;
      TextView haveAccount = rootView.findViewById(id);
      if (haveAccount == null) {
        break missingId;
      }

      id = R.id.register_sub_tittle;
      TextView registerSubTittle = rootView.findViewById(id);
      if (registerSubTittle == null) {
        break missingId;
      }

      id = R.id.register_tittle;
      TextView registerTittle = rootView.findViewById(id);
      if (registerTittle == null) {
        break missingId;
      }

      id = R.id.til_cofirm_password;
      TextInputLayout tilCofirmPassword = rootView.findViewById(id);
      if (tilCofirmPassword == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = rootView.findViewById(id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_fullname;
      TextInputLayout tilFullname = rootView.findViewById(id);
      if (tilFullname == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = rootView.findViewById(id);
      if (tilPassword == null) {
        break missingId;
      }

      id = R.id.til_username;
      TextInputLayout tilUsername = rootView.findViewById(id);
      if (tilUsername == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, btnRegister,
          etConfirmPassword, etEmail, etFullname, etPassword, etUsername, haveAccount,
          registerSubTittle, registerTittle, tilCofirmPassword, tilEmail, tilFullname, tilPassword,
          tilUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
