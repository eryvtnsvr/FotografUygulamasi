// Generated by view binder compiler. Do not edit!
package com.example.butunleme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.butunleme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFotografekleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox Football;

  @NonNull
  public final CheckBox View;

  @NonNull
  public final CheckBox car;

  @NonNull
  public final ImageView imgView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final CheckBox nature;

  @NonNull
  public final Button select;

  @NonNull
  public final Button share;

  private FragmentFotografekleBinding(@NonNull ConstraintLayout rootView,
      @NonNull CheckBox Football, @NonNull CheckBox View, @NonNull CheckBox car,
      @NonNull ImageView imgView, @NonNull LinearLayout linearLayout, @NonNull CheckBox nature,
      @NonNull Button select, @NonNull Button share) {
    this.rootView = rootView;
    this.Football = Football;
    this.View = View;
    this.car = car;
    this.imgView = imgView;
    this.linearLayout = linearLayout;
    this.nature = nature;
    this.select = select;
    this.share = share;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFotografekleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFotografekleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_fotografekle, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFotografekleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Football;
      CheckBox Football = ViewBindings.findChildViewById(rootView, id);
      if (Football == null) {
        break missingId;
      }

      id = R.id.View;
      CheckBox View = ViewBindings.findChildViewById(rootView, id);
      if (View == null) {
        break missingId;
      }

      id = R.id.car;
      CheckBox car = ViewBindings.findChildViewById(rootView, id);
      if (car == null) {
        break missingId;
      }

      id = R.id.imgView;
      ImageView imgView = ViewBindings.findChildViewById(rootView, id);
      if (imgView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.nature;
      CheckBox nature = ViewBindings.findChildViewById(rootView, id);
      if (nature == null) {
        break missingId;
      }

      id = R.id.select;
      Button select = ViewBindings.findChildViewById(rootView, id);
      if (select == null) {
        break missingId;
      }

      id = R.id.share;
      Button share = ViewBindings.findChildViewById(rootView, id);
      if (share == null) {
        break missingId;
      }

      return new FragmentFotografekleBinding((ConstraintLayout) rootView, Football, View, car,
          imgView, linearLayout, nature, select, share);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}