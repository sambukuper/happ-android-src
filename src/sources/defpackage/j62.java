package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j62 extends t3 {
    public static final Rect p0 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final k32 q0 = new k32();
    public static final k42 r0 = new k42();
    public final AccessibilityManager j0;
    public final View k0;
    public cc l0;
    public final Rect f0 = new Rect();
    public final Rect g0 = new Rect();
    public final Rect h0 = new Rect();
    public final int[] i0 = new int[2];
    public int m0 = Integer.MIN_VALUE;
    public int n0 = Integer.MIN_VALUE;
    public int o0 = Integer.MIN_VALUE;

    public j62(View view) {
        this.k0 = view;
        this.j0 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.t3
    public final wl6 b(View view) {
        cc ccVar = this.l0;
        if (ccVar != null) {
            return ccVar;
        }
        cc ccVar2 = new cc(this, (byte) 1);
        this.l0 = ccVar2;
        return ccVar2;
    }

    @Override // defpackage.t3
    public final void d(View view, h4 h4Var) {
        this.X.onInitializeAccessibilityNodeInfo(view, h4Var.a);
        s(h4Var);
    }

    public final boolean j(int i) {
        if (this.n0 != i) {
            return false;
        }
        this.n0 = Integer.MIN_VALUE;
        u(i, false);
        w(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.k0;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        h4 h4VarQ = q(i);
        accessibilityEventObtain2.getText().add(h4VarQ.g());
        AccessibilityNodeInfo accessibilityNodeInfo = h4VarQ.a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            kp5.t("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final h4 l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        h4 h4Var = new h4(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        h4Var.m("android.view.View");
        Rect rect = p0;
        h4Var.k(rect);
        h4Var.l(rect);
        h4Var.b = -1;
        View view = this.k0;
        accessibilityNodeInfoObtain.setParent(view);
        t(i, h4Var);
        if (h4Var.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            kp5.t("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.g0;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f0;
        h4Var.f(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            kp5.t("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            kp5.t("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            kp5.t("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        h4Var.c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.m0 == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            h4Var.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            h4Var.a(64);
        }
        boolean z = this.n0 == i;
        if (z) {
            h4Var.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            h4Var.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.i0;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            h4Var.k(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (h4Var.b != -1) {
                h4 h4Var2 = new h4(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i2 = h4Var.b; i2 != -1; i2 = h4Var2.b) {
                    h4Var2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = h4Var2.a;
                    accessibilityNodeInfo.setParent(view, -1);
                    h4Var2.k(rect);
                    t(i2, h4Var2);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            h4Var.l(rect4);
            h4Var.f(rect3);
        }
        Rect rect6 = this.h0;
        if (view.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect6)) {
                h4Var.l(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        h4Var.a.setVisibleToUser(true);
                    }
                }
            }
        }
        return h4Var;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.j0;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.o0;
            if (i2 != iN) {
                this.o0 = iN;
                w(iN, 128);
                w(i2, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.o0) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.o0 = Integer.MIN_VALUE;
                w(Integer.MIN_VALUE, 128);
                w(i, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    public final boolean p(int i, Rect rect) {
        int i2;
        Object obj;
        h4 h4Var;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        ue7 ue7Var = new ue7(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ue7Var.d(((Integer) arrayList.get(i3)).intValue(), l(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.n0;
        int iC = Integer.MIN_VALUE;
        h4 h4Var2 = i4 == Integer.MIN_VALUE ? null : (h4) x97.t(ue7Var, i4);
        k32 k32Var = q0;
        k42 k42Var = r0;
        View view = this.k0;
        int i5 = -1;
        if (i == 1 || i == 2) {
            boolean z = view.getLayoutDirection() == 1;
            k42Var.getClass();
            int i6 = ue7Var.Z;
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList2.add((h4) ue7Var.e(i7));
            }
            Collections.sort(arrayList2, new zh2(z, k32Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (h4Var2 != null) {
                    size = arrayList2.indexOf(h4Var2);
                }
                int i8 = size - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    bt.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (h4Var2 == null ? -1 : arrayList2.lastIndexOf(h4Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            h4Var = (h4) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                bt.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.n0;
            if (i9 != Integer.MIN_VALUE) {
                q(i9).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    bt.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            k42Var.getClass();
            int i10 = ue7Var.Z;
            Rect rect4 = new Rect();
            h4Var = null;
            for (int i11 = 0; i11 < i10; i11++) {
                h4 h4Var3 = (h4) ue7Var.e(i11);
                if (h4Var3 != h4Var2) {
                    k32Var.getClass();
                    h4Var3.f(rect4);
                    if (nr4.G(i, rect2, rect4)) {
                        if (!nr4.G(i, rect2, rect3) || nr4.h(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            h4Var = h4Var3;
                        } else if (!nr4.h(i, rect2, rect3, rect4)) {
                            int iH = nr4.H(i, rect2, rect4);
                            int I = nr4.I(i, rect2, rect4);
                            int i12 = (I * I) + (iH * 13 * iH);
                            int iH2 = nr4.H(i, rect2, rect3);
                            int I2 = nr4.I(i, rect2, rect3);
                            if (i12 < (I2 * I2) + (iH2 * 13 * iH2)) {
                                rect3.set(rect4);
                                h4Var = h4Var3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        h4 h4Var4 = h4Var;
        if (h4Var4 != null) {
            int i13 = ue7Var.Z;
            for (int i14 = i2; i14 < i13; i14++) {
                if (ue7Var.Y[i14] == h4Var4) {
                    i5 = i14;
                    break;
                }
            }
            iC = ue7Var.c(i5);
        }
        return v(iC);
    }

    public final h4 q(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.k0;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        h4 h4Var = new h4(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = cw8.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            kp5.t("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h4Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return h4Var;
    }

    public abstract boolean r(int i, int i2, Bundle bundle);

    public abstract void t(int i, h4 h4Var);

    public final boolean v(int i) {
        int i2;
        View view = this.k0;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.n0) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.n0 = i;
        u(i, true);
        w(i, 8);
        return true;
    }

    public final void w(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.j0.isEnabled() || (parent = (view = this.k0).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }

    public void s(h4 h4Var) {
    }

    public void u(int i, boolean z) {
    }
}
