package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w86 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ w86(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public void a(l lVar, rb0 rb0Var, rb0 rb0Var2) {
        boolean zG;
        lVar.o(false);
        RecyclerView recyclerView = this.a;
        ff1 ff1Var = (ff1) recyclerView.S0;
        if (rb0Var != null) {
            ff1Var.getClass();
            int i = rb0Var.a;
            int i2 = rb0Var2.a;
            if (i == i2 && rb0Var.b == rb0Var2.b) {
                ff1Var.l(lVar);
                lVar.a.setAlpha(0.0f);
                ff1Var.i.add(lVar);
                zG = true;
            } else {
                zG = ff1Var.g(lVar, i, rb0Var.b, i2, rb0Var2.b);
            }
        } else {
            ff1Var.l(lVar);
            lVar.a.setAlpha(0.0f);
            ff1Var.i.add(lVar);
            zG = true;
        }
        if (zG) {
            recyclerView.Y();
        }
    }

    public void b(l lVar, rb0 rb0Var, rb0 rb0Var2) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.h0.m(lVar);
        recyclerView.h(lVar);
        lVar.o(false);
        ff1 ff1Var = (ff1) recyclerView.S0;
        ff1Var.getClass();
        int i = rb0Var.a;
        int i2 = rb0Var.b;
        View view = lVar.a;
        int left = rb0Var2 == null ? view.getLeft() : rb0Var2.a;
        int top = rb0Var2 == null ? view.getTop() : rb0Var2.b;
        if (lVar.i() || (i == left && i2 == top)) {
            ff1Var.l(lVar);
            ff1Var.h.add(lVar);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = ff1Var.g(lVar, i, i2, left, top);
        }
        if (zG) {
            recyclerView.Y();
        }
    }

    public void c(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
