package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u96 extends t3 {
    public final v96 f0;
    public final WeakHashMap g0 = new WeakHashMap();

    public u96(v96 v96Var) {
        this.f0 = v96Var;
    }

    @Override // defpackage.t3
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        t3 t3Var = (t3) this.g0.get(view);
        return t3Var != null ? t3Var.a(view, accessibilityEvent) : this.X.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.t3
    public final wl6 b(View view) {
        t3 t3Var = (t3) this.g0.get(view);
        return t3Var != null ? t3Var.b(view) : super.b(view);
    }

    @Override // defpackage.t3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        t3 t3Var = (t3) this.g0.get(view);
        if (t3Var != null) {
            t3Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.t3
    public final void d(View view, h4 h4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = h4Var.a;
        v96 v96Var = this.f0;
        RecyclerView recyclerView = v96Var.f0;
        RecyclerView recyclerView2 = v96Var.f0;
        boolean zP = recyclerView.P();
        View.AccessibilityDelegate accessibilityDelegate = this.X;
        if (zP || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().l0(view, h4Var);
        t3 t3Var = (t3) this.g0.get(view);
        if (t3Var != null) {
            t3Var.d(view, h4Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.t3
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        t3 t3Var = (t3) this.g0.get(view);
        if (t3Var != null) {
            t3Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.t3
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        t3 t3Var = (t3) this.g0.get(viewGroup);
        return t3Var != null ? t3Var.f(viewGroup, view, accessibilityEvent) : this.X.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.t3
    public final boolean g(View view, int i, Bundle bundle) {
        v96 v96Var = this.f0;
        RecyclerView recyclerView = v96Var.f0;
        RecyclerView recyclerView2 = v96Var.f0;
        if (recyclerView.P() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        t3 t3Var = (t3) this.g0.get(view);
        if (t3Var != null) {
            if (t3Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        k kVar = recyclerView2.getLayoutManager().Y.h0;
        return false;
    }

    @Override // defpackage.t3
    public final void h(View view, int i) {
        t3 t3Var = (t3) this.g0.get(view);
        if (t3Var != null) {
            t3Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.t3
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        t3 t3Var = (t3) this.g0.get(view);
        if (t3Var != null) {
            t3Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
