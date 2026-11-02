package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r20 extends t3 {
    public final /* synthetic */ byte f0;
    public final /* synthetic */ Object g0;

    public r20(DrawerLayout drawerLayout) {
        this.f0 = (byte) 4;
        this.g0 = drawerLayout;
        new Rect();
    }

    @Override // defpackage.t3
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f0) {
            case 4:
                DrawerLayout drawerLayout = (DrawerLayout) this.g0;
                if (accessibilityEvent.getEventType() != 32) {
                    return this.X.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                View viewE = drawerLayout.e();
                if (viewE != null) {
                    int iG = drawerLayout.g(viewE);
                    WeakHashMap weakHashMap = cw8.a;
                    Gravity.getAbsoluteGravity(iG, drawerLayout.getLayoutDirection());
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.t3
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f0) {
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.g0).i0);
                break;
            case 4:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.t3
    public final void d(View view, h4 h4Var) {
        String string;
        byte b = this.f0;
        Object obj = this.g0;
        View.AccessibilityDelegate accessibilityDelegate = this.X;
        switch (b) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = h4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                h4Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = h4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((q70) obj).m0) {
                    h4Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                }
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, h4Var.a);
                BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) obj;
                int i = BottomSheetDragHandleView.s0;
                if (bottomSheetDragHandleView.j0 != null) {
                    CharSequence contentDescription = bottomSheetDragHandleView.getContentDescription();
                    int i2 = bottomSheetDragHandleView.j0.P;
                    if (i2 == 3) {
                        string = bottomSheetDragHandleView.getResources().getString(h56.bottomsheet_state_expanded);
                    } else if (i2 != 4) {
                        string = i2 != 6 ? null : bottomSheetDragHandleView.getResources().getString(h56.bottomsheet_state_half_expanded);
                    } else {
                        string = bottomSheetDragHandleView.getResources().getString(h56.bottomsheet_state_collapsed);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        if (!TextUtils.isEmpty(contentDescription)) {
                            string = string + ". " + ((Object) contentDescription);
                        }
                        h4Var.p(string);
                    }
                }
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = h4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.j0);
                accessibilityNodeInfo3.setChecked(checkableImageButton.i0);
                break;
            case 4:
                int[] iArr = DrawerLayout.G0;
                AccessibilityNodeInfo accessibilityNodeInfo4 = h4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                h4Var.m("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo4.setFocusable(false);
                accessibilityNodeInfo4.setFocused(false);
                accessibilityNodeInfo4.removeAction((AccessibilityNodeInfo.AccessibilityAction) a4.e.a);
                accessibilityNodeInfo4.removeAction((AccessibilityNodeInfo.AccessibilityAction) a4.f.a);
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, h4Var.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.y0;
                int i4 = -1;
                if (view instanceof MaterialButton) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < materialButtonToggleGroup.getChildCount(); i6++) {
                        if (materialButtonToggleGroup.getChildAt(i6) == view) {
                            i4 = i5;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i6).getVisibility() != 8) {
                                i5++;
                            }
                        }
                    }
                }
                h4Var.o(g4.a(0, ((MaterialButton) view).A0, 1, i4, 1));
                break;
            case 6:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, h4Var.a);
                wq4 wq4Var = (wq4) obj;
                h4Var.b(new a4(16, wq4Var.o1.getVisibility() == 0 ? wq4Var.p(h56.mtrl_picker_toggle_to_year_selection) : wq4Var.p(h56.mtrl_picker_toggle_to_day_selection)));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = h4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo5.setCheckable(navigationMenuItemView.C0);
                accessibilityNodeInfo5.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(h56.item_view_role_description));
                break;
        }
    }

    @Override // defpackage.t3
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f0) {
            case 2:
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.g0;
                    int i = BottomSheetDragHandleView.s0;
                    bottomSheetDragHandleView.c();
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.t3
    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f0) {
            case 4:
                int[] iArr = DrawerLayout.G0;
                return this.X.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    @Override // defpackage.t3
    public boolean g(View view, int i, Bundle bundle) {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((v20) obj).a(3);
                return true;
            case 1:
                if (i == 1048576) {
                    q70 q70Var = (q70) obj;
                    if (q70Var.m0) {
                        q70Var.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }

    public /* synthetic */ r20(Object obj, byte b) {
        this.f0 = b;
        this.g0 = obj;
    }
}
