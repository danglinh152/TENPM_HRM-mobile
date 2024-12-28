// Generated by view binder compiler. Do not edit!
package com.example.tenpm_hrm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tenpm_hrm.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CreateAccountBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final TextInputEditText inputAccType;

  @NonNull
  public final TextInputEditText inputEmployeeId;

  @NonNull
  public final TextInputEditText inputPassword;

  @NonNull
  public final TextInputEditText inputUsername;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  private CreateAccountBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull TextInputEditText inputAccType, @NonNull TextInputEditText inputEmployeeId,
      @NonNull TextInputEditText inputPassword, @NonNull TextInputEditText inputUsername,
      @NonNull ConstraintLayout linearLayout, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6,
      @NonNull TextView textView8) {
    this.rootView = rootView;
    this.button = button;
    this.inputAccType = inputAccType;
    this.inputEmployeeId = inputEmployeeId;
    this.inputPassword = inputPassword;
    this.inputUsername = inputUsername;
    this.linearLayout = linearLayout;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CreateAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CreateAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.create_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CreateAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.inputAccType;
      TextInputEditText inputAccType = ViewBindings.findChildViewById(rootView, id);
      if (inputAccType == null) {
        break missingId;
      }

      id = R.id.inputEmployeeId;
      TextInputEditText inputEmployeeId = ViewBindings.findChildViewById(rootView, id);
      if (inputEmployeeId == null) {
        break missingId;
      }

      id = R.id.inputPassword;
      TextInputEditText inputPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.inputUsername;
      TextInputEditText inputUsername = ViewBindings.findChildViewById(rootView, id);
      if (inputUsername == null) {
        break missingId;
      }

      ConstraintLayout linearLayout = (ConstraintLayout) rootView;

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new CreateAccountBinding((ConstraintLayout) rootView, button, inputAccType,
          inputEmployeeId, inputPassword, inputUsername, linearLayout, textView3, textView4,
          textView5, textView6, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
