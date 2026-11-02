package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x86 implements vo1 {
    public final /* synthetic */ RecyclerView X;

    public /* synthetic */ x86(RecyclerView recyclerView) {
        this.X = recyclerView;
    }

    public void a(c7 c7Var) {
        byte b = c7Var.a;
        RecyclerView recyclerView = this.X;
        if (b == 1) {
            recyclerView.s0.o0(c7Var.b, c7Var.d);
            return;
        }
        if (b == 2) {
            recyclerView.s0.r0(c7Var.b, c7Var.d);
        } else if (b == 4) {
            recyclerView.s0.t0(recyclerView, c7Var.b, c7Var.d);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.s0.q0(c7Var.b, c7Var.d);
        }
    }

    public l b(int i) {
        RecyclerView recyclerView = this.X;
        int iH = recyclerView.k0.h();
        l lVar = null;
        for (int i2 = 0; i2 < iH; i2++) {
            l lVarN = RecyclerView.N(recyclerView.k0.g(i2));
            if (lVarN != null && !lVarN.i() && lVarN.c == i) {
                if (!recyclerView.k0.c.contains(lVarN.a)) {
                    lVar = lVarN;
                    break;
                }
                lVar = lVarN;
            }
        }
        if (lVar == null) {
            return null;
        }
        if (!recyclerView.k0.c.contains(lVar.a)) {
            return lVar;
        }
        boolean z = RecyclerView.F1;
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.X;
        int iH = recyclerView.k0.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.k0.g(i6);
            l lVarN = RecyclerView.N(viewG);
            if (lVarN != null && !lVarN.p() && (i4 = lVarN.c) >= i && i4 < i5) {
                lVarN.a(2);
                if (obj == null) {
                    lVarN.a(1024);
                } else if ((1024 & lVarN.j) == 0) {
                    if (lVarN.k == null) {
                        ArrayList arrayList = new ArrayList();
                        lVarN.k = arrayList;
                        lVarN.l = Collections.unmodifiableList(arrayList);
                    }
                    lVarN.k.add(obj);
                }
                ((RecyclerView.LayoutParams) viewG.getLayoutParams()).Z = true;
            }
        }
        k kVar = recyclerView.h0;
        ArrayList arrayList2 = kVar.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            l lVar = (l) arrayList2.get(size);
            if (lVar != null && (i3 = lVar.c) >= i && i3 < i5) {
                lVar.a(2);
                kVar.h(size);
            }
        }
        recyclerView.o1 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.X;
        int iH = recyclerView.k0.h();
        for (int i3 = 0; i3 < iH; i3++) {
            l lVarN = RecyclerView.N(recyclerView.k0.g(i3));
            if (lVarN != null && !lVarN.p() && lVarN.c >= i) {
                if (RecyclerView.G1) {
                    lVarN.toString();
                }
                lVarN.m(i2, false);
                recyclerView.k1.f = true;
            }
        }
        ArrayList arrayList = recyclerView.h0.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = (l) arrayList.get(i4);
            if (lVar != null && lVar.c >= i) {
                if (RecyclerView.G1) {
                    lVar.toString();
                }
                lVar.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.n1 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.X;
        int iH = recyclerView.k0.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            l lVarN = RecyclerView.N(recyclerView.k0.g(i11));
            if (lVarN != null && (i9 = lVarN.c) >= i4 && i9 <= i3) {
                if (RecyclerView.G1) {
                    lVarN.toString();
                }
                if (lVarN.c == i) {
                    lVarN.m(i2 - i, false);
                } else {
                    lVarN.m(i5, false);
                }
                recyclerView.k1.f = true;
            }
        }
        ArrayList arrayList = recyclerView.h0.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            l lVar = (l) arrayList.get(i12);
            if (lVar != null && (i8 = lVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    lVar.m(i2 - i, false);
                } else {
                    lVar.m(i10, false);
                }
                if (RecyclerView.G1) {
                    lVar.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.n1 = true;
    }

    @Override // defpackage.vo1
    public boolean p(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.X;
        if (recyclerView.s0.q()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.s0.p()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.t0();
        return recyclerView.J(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.vo1
    public float w() {
        float f;
        RecyclerView recyclerView = this.X;
        if (recyclerView.s0.q()) {
            f = recyclerView.f1;
        } else {
            if (!recyclerView.s0.p()) {
                return 0.0f;
            }
            f = recyclerView.e1;
        }
        return -f;
    }

    @Override // defpackage.vo1
    public void x() {
        this.X.t0();
    }
}
