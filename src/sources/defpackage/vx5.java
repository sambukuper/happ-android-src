package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vx5 {
    public final ArrayList a = new ArrayList();
    public final d08 b;
    public fe3 c;
    public fe3 d;
    public int e;
    public boolean f;

    public vx5(d08 d08Var, ArrayList arrayList) {
        fe3 fe3Var = fe3.e;
        this.c = fe3Var;
        this.d = fe3Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = d08Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            fe3 fe3Var2 = d08Var.c;
            fe3 fe3Var3 = d08Var.d;
            this.c = fe3Var2;
            this.d = fe3Var3;
            c();
            b(d08Var.e);
        }
        this.b = d08Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gw0 gw0Var = (gw0) list.get(i);
            gw0Var.getClass();
            if (true == z) {
                vx5 vx5Var = gw0Var.c;
                if (vx5Var != null) {
                    throw new IllegalStateException(gw0Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + vx5Var + " but is still added to " + this);
                }
                gw0Var.c = this;
                this.a.add(gw0Var);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gw0 gw0Var = (gw0) arrayList.get(size);
            if (!gw0Var.d && gw0Var.e != i) {
                gw0Var.e = i;
                throw null;
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        gw0 gw0Var = (gw0) arrayList.get(size);
        fe3 fe3Var = this.c;
        fe3 fe3Var2 = this.d;
        gw0Var.a = fe3Var;
        gw0Var.b = fe3Var2;
        throw null;
    }
}
