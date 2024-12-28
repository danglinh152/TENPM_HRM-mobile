// Generated by view binder compiler. Do not edit!
package com.example.tenpm_hrm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tenpm_hrm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProjectBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnProjectAdd;

  @NonNull
  public final ImageView ivProjectHeader;

  @NonNull
  public final ImageView ivProjectSearch;

  @NonNull
  public final RelativeLayout linearLayout;

  @NonNull
  public final LinearLayout projectContainer;

  @NonNull
  public final RelativeLayout rlHeaderContainer;

  @NonNull
  public final TextView tvProjectHeaderDescription;

  @NonNull
  public final TextView tvProjectHeaderTitle;

  private ProjectBinding(@NonNull RelativeLayout rootView, @NonNull Button btnProjectAdd,
      @NonNull ImageView ivProjectHeader, @NonNull ImageView ivProjectSearch,
      @NonNull RelativeLayout linearLayout, @NonNull LinearLayout projectContainer,
      @NonNull RelativeLayout rlHeaderContainer, @NonNull TextView tvProjectHeaderDescription,
      @NonNull TextView tvProjectHeaderTitle) {
    this.rootView = rootView;
    this.btnProjectAdd = btnProjectAdd;
    this.ivProjectHeader = ivProjectHeader;
    this.ivProjectSearch = ivProjectSearch;
    this.linearLayout = linearLayout;
    this.projectContainer = projectContainer;
    this.rlHeaderContainer = rlHeaderContainer;
    this.tvProjectHeaderDescription = tvProjectHeaderDescription;
    this.tvProjectHeaderTitle = tvProjectHeaderTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProjectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.project, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProjectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnProjectAdd;
      Button btnProjectAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnProjectAdd == null) {
        break missingId;
      }

      id = R.id.ivProjectHeader;
      ImageView ivProjectHeader = ViewBindings.findChildViewById(rootView, id);
      if (ivProjectHeader == null) {
        break missingId;
      }

      id = R.id.ivProjectSearch;
      ImageView ivProjectSearch = ViewBindings.findChildViewById(rootView, id);
      if (ivProjectSearch == null) {
        break missingId;
      }

      RelativeLayout linearLayout = (RelativeLayout) rootView;

      id = R.id.projectContainer;
      LinearLayout projectContainer = ViewBindings.findChildViewById(rootView, id);
      if (projectContainer == null) {
        break missingId;
      }

      id = R.id.rlHeaderContainer;
      RelativeLayout rlHeaderContainer = ViewBindings.findChildViewById(rootView, id);
      if (rlHeaderContainer == null) {
        break missingId;
      }

      id = R.id.tvProjectHeaderDescription;
      TextView tvProjectHeaderDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvProjectHeaderDescription == null) {
        break missingId;
      }

      id = R.id.tvProjectHeaderTitle;
      TextView tvProjectHeaderTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvProjectHeaderTitle == null) {
        break missingId;
      }

      return new ProjectBinding((RelativeLayout) rootView, btnProjectAdd, ivProjectHeader,
          ivProjectSearch, linearLayout, projectContainer, rlHeaderContainer,
          tvProjectHeaderDescription, tvProjectHeaderTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}