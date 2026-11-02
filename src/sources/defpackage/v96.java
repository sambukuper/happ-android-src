package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v96 extends t3 {
    public final RecyclerView f0;
    public final u96 g0;

    public v96(RecyclerView recyclerView) {
        this.f0 = recyclerView;
        u96 u96Var = this.g0;
        if (u96Var != null) {
            this.g0 = u96Var;
        } else {
            this.g0 = new u96(this);
        }
    }

    @Override // defpackage.t3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f0.P()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().j0(accessibilityEvent);
        }
    }

    @Override // defpackage.t3
    public final void d(View view, h4 h4Var) {
        this.X.onInitializeAccessibilityNodeInfo(view, h4Var.a);
        RecyclerView recyclerView = this.f0;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return;
        }
        j layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.Y;
        layoutManager.k0(recyclerView2.h0, recyclerView2.k1, h4Var);
    }

    @Override // defpackage.t3
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f0;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().B0(i, bundle);
    }
}
