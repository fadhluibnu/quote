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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final TextView forgetPw;

  @NonNull
  public final TextView haventAccount;

  @NonNull
  public final TextView loginSubTittle;

  @NonNull
  public final TextView loginTittle;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilPassword;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnLogin, @NonNull TextInputEditText etEmail,
      @NonNull TextInputEditText etPassword, @NonNull TextView forgetPw,
      @NonNull TextView haventAccount, @NonNull TextView loginSubTittle,
      @NonNull TextView loginTittle, @NonNull TextInputLayout tilEmail,
      @NonNull TextInputLayout tilPassword) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.etEmail = etEmail;
    this.etPassword = etPassword;
    this.forgetPw = forgetPw;
    this.haventAccount = haventAccount;
    this.loginSubTittle = loginSubTittle;
    this.loginTittle = loginTittle;
    this.tilEmail = tilEmail;
    this.tilPassword = tilPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      AppCompatButton btnLogin = rootView.findViewById(id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.et_email;
      TextInputEditText etEmail = rootView.findViewById(id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_password;
      TextInputEditText etPassword = rootView.findViewById(id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.forget_pw;
      TextView forgetPw = rootView.findViewById(id);
      if (forgetPw == null) {
        break missingId;
      }

      id = R.id.havent_account;
      TextView haventAccount = rootView.findViewById(id);
      if (haventAccount == null) {
        break missingId;
      }

      id = R.id.login_sub_tittle;
      TextView loginSubTittle = rootView.findViewById(id);
      if (loginSubTittle == null) {
        break missingId;
      }

      id = R.id.login_tittle;
      TextView loginTittle = rootView.findViewById(id);
      if (loginTittle == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = rootView.findViewById(id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = rootView.findViewById(id);
      if (tilPassword == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, etEmail, etPassword,
          forgetPw, haventAccount, loginSubTittle, loginTittle, tilEmail, tilPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}