// Generated by view binder compiler. Do not edit!
package com.example.quote.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.quote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemProfilBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView edit;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView textQuote;

  private ItemProfilBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull TextView edit, @NonNull LinearLayout linearLayout, @NonNull TextView textQuote) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.edit = edit;
    this.linearLayout = linearLayout;
    this.textQuote = textQuote;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemProfilBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemProfilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_profil, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemProfilBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.edit;
      TextView edit = rootView.findViewById(id);
      if (edit == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = rootView.findViewById(id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.text_quote;
      TextView textQuote = rootView.findViewById(id);
      if (textQuote == null) {
        break missingId;
      }

      return new ItemProfilBinding((CardView) rootView, cardView, edit, linearLayout, textQuote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
