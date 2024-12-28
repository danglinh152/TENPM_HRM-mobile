// Generated by view binder compiler. Do not edit!
package com.example.tenpm_hrm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tenpm_hrm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AttendanceManagementViewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView ivAttendance1Delete;

  @NonNull
  public final ImageView ivAttendance2Delete;

  @NonNull
  public final ImageView ivEmployee1Detail;

  @NonNull
  public final ImageView ivEmployee2Detail;

  @NonNull
  public final RelativeLayout rlEmployee1Information;

  @NonNull
  public final RelativeLayout rlEmployee2Information;

  @NonNull
  public final RecyclerView rvCalendar;

  @NonNull
  public final TextView tvEmployee1Name;

  @NonNull
  public final TextView tvEmployee1NameValue;

  @NonNull
  public final TextView tvEmployee2Name;

  @NonNull
  public final TextView tvEmployee2NameValue;

  @NonNull
  public final TextView tvMonthYear;

  @NonNull
  public final TextView tvOnTimeStatusEmployee1;

  @NonNull
  public final TextView tvOnTimeStatusEmployee2;

  @NonNull
  public final TextView tvWorkTimeEmployee1;

  @NonNull
  public final TextView tvWorkTimeEmployee2;

  @NonNull
  public final TextView tvWorkTimeValueEmployee1;

  @NonNull
  public final TextView tvWorkTimeValueEmployee2;

  private AttendanceManagementViewBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView ivAttendance1Delete, @NonNull ImageView ivAttendance2Delete,
      @NonNull ImageView ivEmployee1Detail, @NonNull ImageView ivEmployee2Detail,
      @NonNull RelativeLayout rlEmployee1Information,
      @NonNull RelativeLayout rlEmployee2Information, @NonNull RecyclerView rvCalendar,
      @NonNull TextView tvEmployee1Name, @NonNull TextView tvEmployee1NameValue,
      @NonNull TextView tvEmployee2Name, @NonNull TextView tvEmployee2NameValue,
      @NonNull TextView tvMonthYear, @NonNull TextView tvOnTimeStatusEmployee1,
      @NonNull TextView tvOnTimeStatusEmployee2, @NonNull TextView tvWorkTimeEmployee1,
      @NonNull TextView tvWorkTimeEmployee2, @NonNull TextView tvWorkTimeValueEmployee1,
      @NonNull TextView tvWorkTimeValueEmployee2) {
    this.rootView = rootView;
    this.ivAttendance1Delete = ivAttendance1Delete;
    this.ivAttendance2Delete = ivAttendance2Delete;
    this.ivEmployee1Detail = ivEmployee1Detail;
    this.ivEmployee2Detail = ivEmployee2Detail;
    this.rlEmployee1Information = rlEmployee1Information;
    this.rlEmployee2Information = rlEmployee2Information;
    this.rvCalendar = rvCalendar;
    this.tvEmployee1Name = tvEmployee1Name;
    this.tvEmployee1NameValue = tvEmployee1NameValue;
    this.tvEmployee2Name = tvEmployee2Name;
    this.tvEmployee2NameValue = tvEmployee2NameValue;
    this.tvMonthYear = tvMonthYear;
    this.tvOnTimeStatusEmployee1 = tvOnTimeStatusEmployee1;
    this.tvOnTimeStatusEmployee2 = tvOnTimeStatusEmployee2;
    this.tvWorkTimeEmployee1 = tvWorkTimeEmployee1;
    this.tvWorkTimeEmployee2 = tvWorkTimeEmployee2;
    this.tvWorkTimeValueEmployee1 = tvWorkTimeValueEmployee1;
    this.tvWorkTimeValueEmployee2 = tvWorkTimeValueEmployee2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AttendanceManagementViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AttendanceManagementViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.attendance_management_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AttendanceManagementViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivAttendance1Delete;
      ImageView ivAttendance1Delete = ViewBindings.findChildViewById(rootView, id);
      if (ivAttendance1Delete == null) {
        break missingId;
      }

      id = R.id.ivAttendance2Delete;
      ImageView ivAttendance2Delete = ViewBindings.findChildViewById(rootView, id);
      if (ivAttendance2Delete == null) {
        break missingId;
      }

      id = R.id.ivEmployee1Detail;
      ImageView ivEmployee1Detail = ViewBindings.findChildViewById(rootView, id);
      if (ivEmployee1Detail == null) {
        break missingId;
      }

      id = R.id.ivEmployee2Detail;
      ImageView ivEmployee2Detail = ViewBindings.findChildViewById(rootView, id);
      if (ivEmployee2Detail == null) {
        break missingId;
      }

      id = R.id.rlEmployee1Information;
      RelativeLayout rlEmployee1Information = ViewBindings.findChildViewById(rootView, id);
      if (rlEmployee1Information == null) {
        break missingId;
      }

      id = R.id.rlEmployee2Information;
      RelativeLayout rlEmployee2Information = ViewBindings.findChildViewById(rootView, id);
      if (rlEmployee2Information == null) {
        break missingId;
      }

      id = R.id.rvCalendar;
      RecyclerView rvCalendar = ViewBindings.findChildViewById(rootView, id);
      if (rvCalendar == null) {
        break missingId;
      }

      id = R.id.tvEmployee1Name;
      TextView tvEmployee1Name = ViewBindings.findChildViewById(rootView, id);
      if (tvEmployee1Name == null) {
        break missingId;
      }

      id = R.id.tvEmployee1NameValue;
      TextView tvEmployee1NameValue = ViewBindings.findChildViewById(rootView, id);
      if (tvEmployee1NameValue == null) {
        break missingId;
      }

      id = R.id.tvEmployee2Name;
      TextView tvEmployee2Name = ViewBindings.findChildViewById(rootView, id);
      if (tvEmployee2Name == null) {
        break missingId;
      }

      id = R.id.tvEmployee2NameValue;
      TextView tvEmployee2NameValue = ViewBindings.findChildViewById(rootView, id);
      if (tvEmployee2NameValue == null) {
        break missingId;
      }

      id = R.id.tvMonthYear;
      TextView tvMonthYear = ViewBindings.findChildViewById(rootView, id);
      if (tvMonthYear == null) {
        break missingId;
      }

      id = R.id.tvOnTimeStatusEmployee1;
      TextView tvOnTimeStatusEmployee1 = ViewBindings.findChildViewById(rootView, id);
      if (tvOnTimeStatusEmployee1 == null) {
        break missingId;
      }

      id = R.id.tvOnTimeStatusEmployee2;
      TextView tvOnTimeStatusEmployee2 = ViewBindings.findChildViewById(rootView, id);
      if (tvOnTimeStatusEmployee2 == null) {
        break missingId;
      }

      id = R.id.tvWorkTimeEmployee1;
      TextView tvWorkTimeEmployee1 = ViewBindings.findChildViewById(rootView, id);
      if (tvWorkTimeEmployee1 == null) {
        break missingId;
      }

      id = R.id.tvWorkTimeEmployee2;
      TextView tvWorkTimeEmployee2 = ViewBindings.findChildViewById(rootView, id);
      if (tvWorkTimeEmployee2 == null) {
        break missingId;
      }

      id = R.id.tvWorkTimeValueEmployee1;
      TextView tvWorkTimeValueEmployee1 = ViewBindings.findChildViewById(rootView, id);
      if (tvWorkTimeValueEmployee1 == null) {
        break missingId;
      }

      id = R.id.tvWorkTimeValueEmployee2;
      TextView tvWorkTimeValueEmployee2 = ViewBindings.findChildViewById(rootView, id);
      if (tvWorkTimeValueEmployee2 == null) {
        break missingId;
      }

      return new AttendanceManagementViewBinding((RelativeLayout) rootView, ivAttendance1Delete,
          ivAttendance2Delete, ivEmployee1Detail, ivEmployee2Detail, rlEmployee1Information,
          rlEmployee2Information, rvCalendar, tvEmployee1Name, tvEmployee1NameValue,
          tvEmployee2Name, tvEmployee2NameValue, tvMonthYear, tvOnTimeStatusEmployee1,
          tvOnTimeStatusEmployee2, tvWorkTimeEmployee1, tvWorkTimeEmployee2,
          tvWorkTimeValueEmployee1, tvWorkTimeValueEmployee2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
