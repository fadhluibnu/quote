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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnLogout;

  @NonNull
  public final TextView homeTittle;

  @NonNull
  public final TextView textView;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnLogout, @NonNull TextView homeTittle,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.btnLogout = btnLogout;
    this.homeTittle = homeTittle;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_logout;
      AppCompatButton btnLogout = rootView.findViewById(id);
      if (btnLogout == null) {
        break missingId;
      }

      id = R.id.home_tittle;
      TextView homeTittle = rootView.findViewById(id);
      if (homeTittle == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, btnLogout, homeTittle, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
