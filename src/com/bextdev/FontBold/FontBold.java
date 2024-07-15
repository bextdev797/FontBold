package com.bextdev.FontBold;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.widget.TextView;
import android.graphics.Typeface;

public class FontBold extends AndroidNonvisibleComponent {

  public FontBold(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public void EnableBold(AndroidViewComponent component){
    View view = component.getView();
    if(view instanceof TextView){
      TextView tv = (TextView) view;
      tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
    }
 }

   @SimpleFunction
   public void DisableBold(AndroidViewComponent component){
    View view = component.getView();
    if(view instanceof TextView){
      TextView tv = (TextView) view;
      tv.setTypeface(tv.getTypeface(), Typeface.NORMAL);
    }
  }
}