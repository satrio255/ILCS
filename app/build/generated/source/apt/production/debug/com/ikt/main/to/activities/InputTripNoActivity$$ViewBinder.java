// Generated code from Butter Knife. Do not modify!
package com.ikt.main.to.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class InputTripNoActivity$$ViewBinder<T extends com.ikt.main.to.activities.InputTripNoActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755542, "field 'toolbarTitle'");
    target.toolbarTitle = finder.castView(view, 2131755542, "field 'toolbarTitle'");
    view = finder.findRequiredView(source, 2131755180, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131755180, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131755346, "field 'edtNoOfTrip'");
    target.edtNoOfTrip = finder.castView(view, 2131755346, "field 'edtNoOfTrip'");
    view = finder.findRequiredView(source, 2131755347, "field 'edtTruckCapacity'");
    target.edtTruckCapacity = finder.castView(view, 2131755347, "field 'edtTruckCapacity'");
    view = finder.findRequiredView(source, 2131755348, "field 'btnSaveOrCheck'");
    target.btnSaveOrCheck = finder.castView(view, 2131755348, "field 'btnSaveOrCheck'");
    view = finder.findRequiredView(source, 2131755218, "field 'btnCancel'");
    target.btnCancel = finder.castView(view, 2131755218, "field 'btnCancel'");
  }

  @Override public void unbind(T target) {
    target.toolbarTitle = null;
    target.toolbar = null;
    target.edtNoOfTrip = null;
    target.edtTruckCapacity = null;
    target.btnSaveOrCheck = null;
    target.btnCancel = null;
  }
}
