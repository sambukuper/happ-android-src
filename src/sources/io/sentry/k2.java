package io.sentry;

import defpackage.oi0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {
    public final ArrayList a;

    public k2(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public f2 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (f2) oi0.h(1, arrayList);
    }

    public boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        f2 f2VarA = a();
        d();
        if (!(a() instanceof i2)) {
            if (!(a() instanceof g2)) {
                return false;
            }
            g2 g2Var = (g2) a();
            if (f2VarA == null || g2Var == null) {
                return false;
            }
            g2Var.a.add(f2VarA.getValue());
            return false;
        }
        i2 i2Var = (i2) a();
        d();
        h2 h2Var = (h2) a();
        if (i2Var == null || f2VarA == null || h2Var == null) {
            return false;
        }
        h2Var.a.put(i2Var.a, f2VarA.getValue());
        return false;
    }

    public boolean c(e2 e2Var) {
        Object objB = e2Var.b();
        if (a() == null && objB != null) {
            this.a.add(new j2(objB));
            return true;
        }
        if (a() instanceof i2) {
            i2 i2Var = (i2) a();
            d();
            ((h2) a()).a.put(i2Var.a, objB);
            return false;
        }
        if (!(a() instanceof g2)) {
            return false;
        }
        ((g2) a()).a.add(objB);
        return false;
    }

    public void d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public k2() {
        this.a = new ArrayList();
    }
}
