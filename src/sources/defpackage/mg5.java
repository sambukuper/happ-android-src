package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class mg5 extends g96 {
    public RecyclerView a;
    public final bd7 b = new bd7(this);
    public e c;
    public d d;

    public static int c(View view, td5 td5Var) {
        return ((td5Var.e(view) / 2) + td5Var.g(view)) - ((td5Var.n() / 2) + td5Var.m());
    }

    public static View d(j jVar, td5 td5Var) {
        int I = jVar.I();
        View view = null;
        if (I == 0) {
            return null;
        }
        int iN = (td5Var.n() / 2) + td5Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = jVar.H(i2);
            int iAbs = Math.abs(((td5Var.e(viewH) / 2) + td5Var.g(viewH)) - iN);
            if (iAbs < i) {
                view = viewH;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        bd7 bd7Var = this.b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.m1;
            if (arrayList != null) {
                arrayList.remove(bd7Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                bt.i("An instance of OnFlingListener already set.");
                return;
            }
            this.a.j(bd7Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] b(j jVar, View view) {
        int[] iArr = new int[2];
        if (jVar.p()) {
            iArr[0] = c(view, f(jVar));
        } else {
            iArr[0] = 0;
        }
        if (jVar.q()) {
            iArr[1] = c(view, g(jVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View e(j jVar) {
        if (jVar.q()) {
            return d(jVar, g(jVar));
        }
        if (jVar.p()) {
            return d(jVar, f(jVar));
        }
        return null;
    }

    public final td5 f(j jVar) {
        d dVar = this.d;
        if (dVar != null && ((j) dVar.b) == jVar) {
            return dVar;
        }
        d dVar2 = new d(jVar);
        this.d = dVar2;
        return dVar2;
    }

    public final td5 g(j jVar) {
        e eVar = this.c;
        if (eVar != null && ((j) eVar.b) == jVar) {
            return eVar;
        }
        e eVar2 = new e(jVar);
        this.c = eVar2;
        return eVar2;
    }

    public final void h() {
        j layoutManager;
        View viewE;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.l0(i, iArrB[1]);
    }
}
