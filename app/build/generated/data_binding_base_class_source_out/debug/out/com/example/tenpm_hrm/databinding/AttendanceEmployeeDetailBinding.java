// Generated by view binder compiler. Do not edit!
package com.example.tenpm_hrm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class AttendanceEmployeeDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonAttendanceCheckInOut;

  @NonNull
  public final TextView late;

  @NonNull
  public final TextView lateValue;

  @NonNull
  public final TextView nonPaidLeaves;

  @NonNull
  public final TextView nonPaidLeavesValue;

  @NonNull
  public final TextView overtime;

  @NonNull
  public final TextView overtimeValue;

  @NonNull
  public final TextView paidLeaves;

  @NonNull
  public final TextView paidLeavesValue;

  @NonNull
  public final RecyclerView rvCalendar;

  @NonNull
  public final TextView tvMonthYear;

  @NonNull
  public final TextView workDays;

  @NonNull
  public final TextView workDaysValue;

  private AttendanceEmployeeDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull Button buttonAttendanceCheckInOut, @NonNull TextView late,
      @NonNull TextView lateValue, @NonNull TextView nonPaidLeaves,
      @NonNull TextView nonPaidLeavesValue, @NonNull TextView overtime,
      @NonNull TextView overtimeValue, @NonNull TextView paidLeaves,
      @NonNull TextView paidLeavesValue, @NonNull RecyclerView rvCalendar,
      @NonNull TextView tvMonthYear, @NonNull TextView workDays, @NonNull TextView workDaysValue) {
    this.rootView = rootView;
    this.buttonAttendanceCheckInOut = buttonAttendanceCheckInOut;
    this.late = late;
    this.lateValue = lateValue;
    this.nonPaidLeaves = nonPaidLeaves;
    this.nonPaidLeavesValue = nonPaidLeavesValue;
    this.overtime = overtime;
    this.overtimeValue = overtimeValue;
    this.paidLeaves = paidLeaves;
    this.paidLeavesValue = paidLeavesValue;
    this.rvCalendar = rvCalendar;
    this.tvMonthYear = tvMonthYear;
    this.workDays = workDays;
    this.workDaysValue = workDaysValue;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AttendanceEmployeeDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AttendanceEmployeeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.attendance_employee_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AttendanceEmployeeDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAttendanceCheckInOut;
      Button buttonAttendanceCheckInOut = ViewBindings.findChildViewById(rootView, id);
      if (buttonAttendanceCheckInOut == null) {
        break missingId;
      }

      id = R.id.late;
      TextView late = ViewBindings.findChildViewById(rootView, id);
      if (late == null) {
        break missingId;
      }

      id = R.id.lateValue;
      TextView lateValue = ViewBindings.findChildViewById(rootView, id);
      if (lateValue == null) {
        break missingId;
      }

      id = R.id.nonPaidLeaves;
      TextView nonPaidLeaves = ViewBindings.findChildViewById(rootView, id);
      if (nonPaidLeaves == null) {
        break missingId;
      }

      id = R.id.nonPaidLeavesValue;
      TextView nonPaidLeavesValue = ViewBindings.findChildViewById(rootView, id);
      if (nonPaidLeavesValue == null) {
        break missingId;
      }

      id = R.id.overtime;
      TextView overtime = ViewBindings.findChildViewById(rootView, id);
      if (overtime == null) {
        break missingId;
      }

      id = R.id.overtimeValue;
      TextView overtimeValue = ViewBindings.findChildViewById(rootView, id);
      if (overtimeValue == null) {
        break missingId;
      }

      id = R.id.paidLeaves;
      TextView paidLeaves = ViewBindings.findChildViewById(rootView, id);
      if (paidLeaves == null) {
        break missingId;
      }

      id = R.id.paidLeavesValue;
      TextView paidLeavesValue = ViewBindings.findChildViewById(rootView, id);
      if (paidLeavesValue == null) {
        break missingId;
      }

      id = R.id.rvCalendar;
      RecyclerView rvCalendar = ViewBindings.findChildViewById(rootView, id);
      if (rvCalendar == null) {
        break missingId;
      }

      id = R.id.tvMonthYear;
      TextView tvMonthYear = ViewBindings.findChildViewById(rootView, id);
      if (tvMonthYear == null) {
        break missingId;
      }

      id = R.id.workDays;
      TextView workDays = ViewBindings.findChildViewById(rootView, id);
      if (workDays == null) {
        break missingId;
      }

      id = R.id.workDaysValue;
      TextView workDaysValue = ViewBindings.findChildViewById(rootView, id);
      if (workDaysValue == null) {
        break missingId;
      }

      return new AttendanceEmployeeDetailBinding((RelativeLayout) rootView,
          buttonAttendanceCheckInOut, late, lateValue, nonPaidLeaves, nonPaidLeavesValue, overtime,
          overtimeValue, paidLeaves, paidLeavesValue, rvCalendar, tvMonthYear, workDays,
          workDaysValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
