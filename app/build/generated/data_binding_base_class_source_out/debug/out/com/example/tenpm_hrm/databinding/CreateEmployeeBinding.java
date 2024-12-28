// Generated by view binder compiler. Do not edit!
package com.example.tenpm_hrm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public final class CreateEmployeeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText Address;

  @NonNull
  public final TextInputEditText Birthday;

  @NonNull
  public final TextInputEditText CCCD;

  @NonNull
  public final TextInputEditText Email;

  @NonNull
  public final TextInputEditText Name;

  @NonNull
  public final TextInputEditText Phone;

  @NonNull
  public final TextInputEditText Position;

  @NonNull
  public final Button button;

  @NonNull
  public final RadioGroup genderGroup;

  @NonNull
  public final TextInputEditText idDepartment;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RadioButton radioFemale;

  @NonNull
  public final RadioButton radioMale;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  private CreateEmployeeBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText Address, @NonNull TextInputEditText Birthday,
      @NonNull TextInputEditText CCCD, @NonNull TextInputEditText Email,
      @NonNull TextInputEditText Name, @NonNull TextInputEditText Phone,
      @NonNull TextInputEditText Position, @NonNull Button button, @NonNull RadioGroup genderGroup,
      @NonNull TextInputEditText idDepartment, @NonNull ImageView imageView,
      @NonNull ImageView imageView10, @NonNull ImageView imageView2, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6,
      @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9,
      @NonNull ConstraintLayout main, @NonNull RadioButton radioFemale,
      @NonNull RadioButton radioMale, @NonNull TextView textView, @NonNull TextView textView10,
      @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15,
      @NonNull TextView textView2, @NonNull TextView textView4, @NonNull TextView textView5,
      @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8,
      @NonNull TextView textView9) {
    this.rootView = rootView;
    this.Address = Address;
    this.Birthday = Birthday;
    this.CCCD = CCCD;
    this.Email = Email;
    this.Name = Name;
    this.Phone = Phone;
    this.Position = Position;
    this.button = button;
    this.genderGroup = genderGroup;
    this.idDepartment = idDepartment;
    this.imageView = imageView;
    this.imageView10 = imageView10;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.imageView9 = imageView9;
    this.main = main;
    this.radioFemale = radioFemale;
    this.radioMale = radioMale;
    this.textView = textView;
    this.textView10 = textView10;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView2 = textView2;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CreateEmployeeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CreateEmployeeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.create_employee, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CreateEmployeeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Address;
      TextInputEditText Address = ViewBindings.findChildViewById(rootView, id);
      if (Address == null) {
        break missingId;
      }

      id = R.id.Birthday;
      TextInputEditText Birthday = ViewBindings.findChildViewById(rootView, id);
      if (Birthday == null) {
        break missingId;
      }

      id = R.id.CCCD;
      TextInputEditText CCCD = ViewBindings.findChildViewById(rootView, id);
      if (CCCD == null) {
        break missingId;
      }

      id = R.id.Email;
      TextInputEditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.Name;
      TextInputEditText Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.Phone;
      TextInputEditText Phone = ViewBindings.findChildViewById(rootView, id);
      if (Phone == null) {
        break missingId;
      }

      id = R.id.Position;
      TextInputEditText Position = ViewBindings.findChildViewById(rootView, id);
      if (Position == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.genderGroup;
      RadioGroup genderGroup = ViewBindings.findChildViewById(rootView, id);
      if (genderGroup == null) {
        break missingId;
      }

      id = R.id.idDepartment;
      TextInputEditText idDepartment = ViewBindings.findChildViewById(rootView, id);
      if (idDepartment == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.radioFemale;
      RadioButton radioFemale = ViewBindings.findChildViewById(rootView, id);
      if (radioFemale == null) {
        break missingId;
      }

      id = R.id.radioMale;
      RadioButton radioMale = ViewBindings.findChildViewById(rootView, id);
      if (radioMale == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
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

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new CreateEmployeeBinding((ConstraintLayout) rootView, Address, Birthday, CCCD, Email,
          Name, Phone, Position, button, genderGroup, idDepartment, imageView, imageView10,
          imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8,
          imageView9, main, radioFemale, radioMale, textView, textView10, textView13, textView14,
          textView15, textView2, textView4, textView5, textView6, textView7, textView8, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
