package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class t3 {
    public static final View.AccessibilityDelegate Z = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate X;
    public final s3 Y;

    public t3(View.AccessibilityDelegate accessibilityDelegate) {
        this.X = accessibilityDelegate;
        this.Y = new s3(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.X.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public wl6 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.X.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new wl6((Object) accessibilityNodeProvider, (byte) 3);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.X.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, h4 h4Var) {
        this.X.onInitializeAccessibilityNodeInfo(view, h4Var.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.X.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.X.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(j46.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                a4 a4Var = (a4) list.get(i2);
                if (a4Var.a() == i) {
                    Class cls = a4Var.c;
                    u4 u4Var = a4Var.d;
                    if (u4Var != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception unused) {
                            }
                        }
                        zPerformAccessibilityAction = u4Var.f(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.X.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != j46.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(j46.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void h(View view, int i) {
        this.X.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.X.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public t3() {
        this(Z);
    }
}
