package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mz3 {
    public int a;
    public i21 b;
    public final ArrayList c = new ArrayList(0);
    public mz3 d;
    public mz3 e;
    public hz3 f;
    public final ArrayList g;

    public mz3(int i) {
        this.a = i;
        bv4.a.getClass();
        List listA = av4.a();
        ArrayList arrayList = new ArrayList(xv0.Z(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((nt3) ((bv4) it.next())).getClass();
            arrayList.add(new tu3());
        }
        this.g = arrayList;
    }

    public final i21 a() {
        i21 i21Var = this.b;
        if (i21Var != null) {
            return i21Var;
        }
        dh3.T("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mz3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        mz3 mz3Var = (mz3) obj;
        return this.a == mz3Var.a && a().equals(mz3Var.a()) && dh3.f(this.c, mz3Var.c) && dh3.f(this.e, mz3Var.e) && dh3.f(this.d, mz3Var.d) && dh3.f(this.f, mz3Var.f) && dh3.f(this.g, mz3Var.g);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + (this.a * 31)) * 31);
    }
}
