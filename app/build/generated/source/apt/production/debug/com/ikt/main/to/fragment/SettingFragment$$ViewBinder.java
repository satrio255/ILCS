// Generated code from Butter Knife. Do not modify!
package com.ikt.main.to.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SettingFragment$$ViewBinder<T extends com.ikt.main.to.fragment.SettingFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755522, "field 'listSetting'");
    target.listSetting = finder.castView(view, 2131755522, "field 'listSetting'");
  }

  @Override public void unbind(T target) {
    target.listSetting = null;
  }
}
