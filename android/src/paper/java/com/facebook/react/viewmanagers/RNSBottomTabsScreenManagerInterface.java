/**
* This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
*
* Do not edit this file as changes may cause incorrect behavior and will be lost
* once the code is regenerated.
*
* @generated by codegen project: GeneratePropsJavaInterface.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;


public interface RNSBottomTabsScreenManagerInterface<T extends View>  {
  void setIsFocused(T view, boolean value);
  void setTabKey(T view, @Nullable String value);
  void setTabBarBackgroundColor(T view, @Nullable Integer value);
  void setTabBarBlurEffect(T view, @Nullable String value);
  void setTabBarItemTitleFontFamily(T view, @Nullable String value);
  void setTabBarItemTitleFontSize(T view, float value);
  void setTabBarItemTitleFontWeight(T view, @Nullable String value);
  void setTabBarItemTitleFontStyle(T view, @Nullable String value);
  void setTabBarItemTitleFontColor(T view, @Nullable Integer value);
  void setTabBarItemTitlePositionAdjustment(T view, @Nullable ReadableMap value);
  void setTabBarItemIconColor(T view, @Nullable Integer value);
  void setTabBarItemBadgeBackgroundColor(T view, @Nullable Integer value);
  void setTitle(T view, @Nullable String value);
  void setIconResourceName(T view, @Nullable String value);
  void setTabBarItemBadgeTextColor(T view, @Nullable Integer value);
  void setIconType(T view, @Nullable String value);
  void setIconImageSource(T view, @Nullable ReadableMap value);
  void setIconSfSymbolName(T view, @Nullable String value);
  void setSelectedIconImageSource(T view, @Nullable ReadableMap value);
  void setSelectedIconSfSymbolName(T view, @Nullable String value);
  void setBadgeValue(T view, @Nullable String value);
  void setSpecialEffects(T view, @Nullable ReadableMap value);
  void setOverrideScrollViewContentInsetAdjustmentBehavior(T view, boolean value);
}
