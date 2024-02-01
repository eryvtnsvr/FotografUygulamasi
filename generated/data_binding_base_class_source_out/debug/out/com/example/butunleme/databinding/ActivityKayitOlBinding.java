// Generated by view binder compiler. Do not edit!
package com.example.butunleme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.butunleme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityKayitOlBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText email;

  @NonNull
  public final Button girisyap;

  @NonNull
  public final EditText isim;

  @NonNull
  public final Button kayitol;

  @NonNull
  public final EditText sifre;

  @NonNull
  public final EditText soyisim;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  private ActivityKayitOlBinding(@NonNull ConstraintLayout rootView, @NonNull EditText email,
      @NonNull Button girisyap, @NonNull EditText isim, @NonNull Button kayitol,
      @NonNull EditText sifre, @NonNull EditText soyisim, @NonNull TextView textView12,
      @NonNull TextView textView13) {
    this.rootView = rootView;
    this.email = email;
    this.girisyap = girisyap;
    this.isim = isim;
    this.kayitol = kayitol;
    this.sifre = sifre;
    this.soyisim = soyisim;
    this.textView12 = textView12;
    this.textView13 = textView13;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityKayitOlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityKayitOlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_kayit_ol, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityKayitOlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.girisyap;
      Button girisyap = ViewBindings.findChildViewById(rootView, id);
      if (girisyap == null) {
        break missingId;
      }

      id = R.id.isim;
      EditText isim = ViewBindings.findChildViewById(rootView, id);
      if (isim == null) {
        break missingId;
      }

      id = R.id.kayitol;
      Button kayitol = ViewBindings.findChildViewById(rootView, id);
      if (kayitol == null) {
        break missingId;
      }

      id = R.id.sifre;
      EditText sifre = ViewBindings.findChildViewById(rootView, id);
      if (sifre == null) {
        break missingId;
      }

      id = R.id.soyisim;
      EditText soyisim = ViewBindings.findChildViewById(rootView, id);
      if (soyisim == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      return new ActivityKayitOlBinding((ConstraintLayout) rootView, email, girisyap, isim, kayitol,
          sifre, soyisim, textView12, textView13);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
