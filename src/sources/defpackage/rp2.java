package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rp2 implements Runnable {
    public static final ThreadLocal g0 = new ThreadLocal();
    public static final l71 h0 = new l71((byte) 21);
    public long Y;
    public long Z;
    public final ArrayList X = new ArrayList();
    public final ArrayList f0 = new ArrayList();

    public static l c(RecyclerView recyclerView, int i, long j) {
        int iH = recyclerView.k0.h();
        for (int i2 = 0; i2 < iH; i2++) {
            l lVarN = RecyclerView.N(recyclerView.k0.g(i2));
            if (lVarN.c == i && !lVarN.g()) {
                return null;
            }
        }
        k kVar = recyclerView.h0;
        if (j == Long.MAX_VALUE) {
            try {
                if (wc8.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.W(false);
                Trace.endSection();
            }
        }
        recyclerView.V();
        l lVarL = kVar.l(i, j);
        if (lVarL != null) {
            if (!lVarL.f() || lVarL.g()) {
                kVar.a(lVarL, false);
            } else {
                kVar.i(lVarL.a);
            }
        }
        return lVarL;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.y0) {
            if (RecyclerView.F1 && !this.X.contains(recyclerView)) {
                bt.i("attempting to post unregistered view!");
                return;
            } else if (this.Y == 0) {
                this.Y = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        xr0 xr0Var = recyclerView.j1;
        xr0Var.b = i;
        xr0Var.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void b(long j) {
        qp2 qp2Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        qp2 qp2Var2;
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            xr0 xr0Var = recyclerView3.j1;
            if (windowVisibility == 0) {
                xr0Var.d(recyclerView3, false);
                i += xr0Var.d;
            }
        }
        ArrayList arrayList2 = this.f0;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                xr0 xr0Var2 = recyclerView4.j1;
                int iAbs = Math.abs(xr0Var2.c) + Math.abs(xr0Var2.b);
                for (?? r11 = z; r11 < xr0Var2.d * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        qp2Var2 = new qp2();
                        arrayList2.add(qp2Var2);
                    } else {
                        qp2Var2 = (qp2) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) xr0Var2.e;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    qp2Var2.a = z;
                    qp2Var2.b = iAbs;
                    qp2Var2.c = i5;
                    qp2Var2.d = recyclerView4;
                    qp2Var2.e = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, h0);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (qp2Var = (qp2) arrayList2.get(i6)).d) != null; i6++) {
            l lVarC = c(recyclerView, qp2Var.e, qp2Var.a ? Long.MAX_VALUE : j);
            if (lVarC != null && lVarC.b != null && lVarC.f() && !lVarC.g() && (recyclerView2 = (RecyclerView) lVarC.b.get()) != null) {
                if (recyclerView2.J0 && recyclerView2.k0.h() != 0) {
                    k kVar = recyclerView2.h0;
                    d96 d96Var = recyclerView2.S0;
                    if (d96Var != null) {
                        d96Var.e();
                    }
                    j jVar = recyclerView2.s0;
                    if (jVar != null) {
                        jVar.E0(kVar);
                        recyclerView2.s0.F0(kVar);
                    }
                    kVar.a.clear();
                    kVar.g();
                }
                xr0 xr0Var3 = recyclerView2.j1;
                xr0Var3.d(recyclerView2, true);
                if (xr0Var3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        q96 q96Var = recyclerView2.k1;
                        f fVar = recyclerView2.r0;
                        q96Var.d = (byte) 1;
                        q96Var.e = fVar.a();
                        q96Var.g = false;
                        q96Var.h = false;
                        q96Var.i = false;
                        for (int i7 = 0; i7 < xr0Var3.d * 2; i7 += 2) {
                            c(recyclerView2, ((int[]) xr0Var3.e)[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            qp2Var.a = false;
            qp2Var.b = 0;
            qp2Var.c = 0;
            qp2Var.d = null;
            qp2Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.X;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.Z);
                }
            }
        } finally {
            this.Y = 0L;
            Trace.endSection();
        }
    }
}
