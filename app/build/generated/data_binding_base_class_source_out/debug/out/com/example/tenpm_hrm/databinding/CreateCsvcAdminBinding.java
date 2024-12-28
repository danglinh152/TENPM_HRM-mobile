// Generated by view binder compiler. Do not edit!
package com.example.tenpm_hrm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tenpm_hrm.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CreateCsvcAdminBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonAddFacility;

  @NonNull
  public final TextInputEditText inputAddBuyingDate;

  @NonNull
  public final TextInputLayout inputAddBuyingDateLayout;

  @NonNull
  public final TextInputEditText inputAddDepartmentID;

  @NonNull
  public final TextInputLayout inputAddDepartmentIDLayout;

  @NonNull
  public final TextInputEditText inputAddFacilityName;

  @NonNull
  public final TextInputLayout inputAddFacilityNameLayout;

  @NonNull
  public final TextInputEditText inputAddFacilityQuantity;

  @NonNull
  public final TextInputLayout inputAddFacilityQuantityLayout;

  @NonNull
  public final RelativeLayout inputContainer;

  @NonNull
  public final ImageView ivHeader;

  @NonNull
  public final TextView labelAddBuyingDateLayout;

  @NonNull
  public final TextView labelAddDepartmentIDLayout;

  @NonNull
  public final TextView labelAddFacilityName;

  @NonNull
  public final TextView labelAddFacilityQuantity;

  @NonNull
  public final RelativeLayout linearLayout;

  @NonNull
  public final RelativeLayout rlHeaderContainer;

  @NonNull
  public final TextView tvHeaderDescription;

  @NonNull
  public final TextView tvHeaderTitle;

  @NonNull
  public final TextView tvLabel;

  private CreateCsvcAdminBinding(@NonNull RelativeLayout rootView,
      @NonNull Button buttonAddFacility, @NonNull TextInputEditText inputAddBuyingDate,
      @NonNull TextInputLayout inputAddBuyingDateLayout,
      @NonNull TextInputEditText inputAddDepartmentID,
      @NonNull TextInputLayout inputAddDepartmentIDLayout,
      @NonNull TextInputEditText inputAddFacilityName,
      @NonNull TextInputLayout inputAddFacilityNameLayout,
      @NonNull TextInputEditText inputAddFacilityQuantity,
      @NonNull TextInputLayout inputAddFacilityQuantityLayout,
      @NonNull RelativeLayout inputContainer, @NonNull ImageView ivHeader,
      @NonNull TextView labelAddBuyingDateLayout, @NonNull TextView labelAddDepartmentIDLayout,
      @NonNull TextView labelAddFacilityName, @NonNull TextView labelAddFacilityQuantity,
      @NonNull RelativeLayout linearLayout, @NonNull RelativeLayout rlHeaderContainer,
      @NonNull TextView tvHeaderDescription, @NonNull TextView tvHeaderTitle,
      @NonNull TextView tvLabel) {
    this.rootView = rootView;
    this.buttonAddFacility = buttonAddFacility;
    this.inputAddBuyingDate = inputAddBuyingDate;
    this.inputAddBuyingDateLayout = inputAddBuyingDateLayout;
    this.inputAddDepartmentID = inputAddDepartmentID;
    this.inputAddDepartmentIDLayout = inputAddDepartmentIDLayout;
    this.inputAddFacilityName = inputAddFacilityName;
    this.inputAddFacilityNameLayout = inputAddFacilityNameLayout;
    this.inputAddFacilityQuantity = inputAddFacilityQuantity;
    this.inputAddFacilityQuantityLayout = inputAddFacilityQuantityLayout;
    this.inputContainer = inputContainer;
    this.ivHeader = ivHeader;
    this.labelAddBuyingDateLayout = labelAddBuyingDateLayout;
    this.labelAddDepartmentIDLayout = labelAddDepartmentIDLayout;
    this.labelAddFacilityName = labelAddFacilityName;
    this.labelAddFacilityQuantity = labelAddFacilityQuantity;
    this.linearLayout = linearLayout;
    this.rlHeaderContainer = rlHeaderContainer;
    this.tvHeaderDescription = tvHeaderDescription;
    this.tvHeaderTitle = tvHeaderTitle;
    this.tvLabel = tvLabel;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CreateCsvcAdminBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CreateCsvcAdminBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.create_csvc_admin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CreateCsvcAdminBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAddFacility;
      Button buttonAddFacility = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddFacility == null) {
        break missingId;
      }

      id = R.id.inputAddBuyingDate;
      TextInputEditText inputAddBuyingDate = ViewBindings.findChildViewById(rootView, id);
      if (inputAddBuyingDate == null) {
        break missingId;
      }

      id = R.id.inputAddBuyingDateLayout;
      TextInputLayout inputAddBuyingDateLayout = ViewBindings.findChildViewById(rootView, id);
      if (inputAddBuyingDateLayout == null) {
        break missingId;
      }

      id = R.id.inputAddDepartmentID;
      TextInputEditText inputAddDepartmentID = ViewBindings.findChildViewById(rootView, id);
      if (inputAddDepartmentID == null) {
        break missingId;
      }

      id = R.id.inputAddDepartmentIDLayout;
      TextInputLayout inputAddDepartmentIDLayout = ViewBindings.findChildViewById(rootView, id);
      if (inputAddDepartmentIDLayout == null) {
        break missingId;
      }

      id = R.id.inputAddFacilityName;
      TextInputEditText inputAddFacilityName = ViewBindings.findChildViewById(rootView, id);
      if (inputAddFacilityName == null) {
        break missingId;
      }

      id = R.id.inputAddFacilityNameLayout;
      TextInputLayout inputAddFacilityNameLayout = ViewBindings.findChildViewById(rootView, id);
      if (inputAddFacilityNameLayout == null) {
        break missingId;
      }

      id = R.id.inputAddFacilityQuantity;
      TextInputEditText inputAddFacilityQuantity = ViewBindings.findChildViewById(rootView, id);
      if (inputAddFacilityQuantity == null) {
        break missingId;
      }

      id = R.id.inputAddFacilityQuantityLayout;
      TextInputLayout inputAddFacilityQuantityLayout = ViewBindings.findChildViewById(rootView, id);
      if (inputAddFacilityQuantityLayout == null) {
        break missingId;
      }

      id = R.id.inputContainer;
      RelativeLayout inputContainer = ViewBindings.findChildViewById(rootView, id);
      if (inputContainer == null) {
        break missingId;
      }

      id = R.id.ivHeader;
      ImageView ivHeader = ViewBindings.findChildViewById(rootView, id);
      if (ivHeader == null) {
        break missingId;
      }

      id = R.id.labelAddBuyingDateLayout;
      TextView labelAddBuyingDateLayout = ViewBindings.findChildViewById(rootView, id);
      if (labelAddBuyingDateLayout == null) {
        break missingId;
      }

      id = R.id.labelAddDepartmentIDLayout;
      TextView labelAddDepartmentIDLayout = ViewBindings.findChildViewById(rootView, id);
      if (labelAddDepartmentIDLayout == null) {
        break missingId;
      }

      id = R.id.labelAddFacilityName;
      TextView labelAddFacilityName = ViewBindings.findChildViewById(rootView, id);
      if (labelAddFacilityName == null) {
        break missingId;
      }

      id = R.id.labelAddFacilityQuantity;
      TextView labelAddFacilityQuantity = ViewBindings.findChildViewById(rootView, id);
      if (labelAddFacilityQuantity == null) {
        break missingId;
      }

      RelativeLayout linearLayout = (RelativeLayout) rootView;

      id = R.id.rlHeaderContainer;
      RelativeLayout rlHeaderContainer = ViewBindings.findChildViewById(rootView, id);
      if (rlHeaderContainer == null) {
        break missingId;
      }

      id = R.id.tvHeaderDescription;
      TextView tvHeaderDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvHeaderDescription == null) {
        break missingId;
      }

      id = R.id.tvHeaderTitle;
      TextView tvHeaderTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvHeaderTitle == null) {
        break missingId;
      }

      id = R.id.tvLabel;
      TextView tvLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvLabel == null) {
        break missingId;
      }

      return new CreateCsvcAdminBinding((RelativeLayout) rootView, buttonAddFacility,
          inputAddBuyingDate, inputAddBuyingDateLayout, inputAddDepartmentID,
          inputAddDepartmentIDLayout, inputAddFacilityName, inputAddFacilityNameLayout,
          inputAddFacilityQuantity, inputAddFacilityQuantityLayout, inputContainer, ivHeader,
          labelAddBuyingDateLayout, labelAddDepartmentIDLayout, labelAddFacilityName,
          labelAddFacilityQuantity, linearLayout, rlHeaderContainer, tvHeaderDescription,
          tvHeaderTitle, tvLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
