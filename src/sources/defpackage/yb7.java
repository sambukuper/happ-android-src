package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yb7 implements o01, Iterable, qv3 {
    public int Y;
    public int f0;
    public int g0;
    public boolean i0;
    public int j0;
    public HashMap l0;
    public vz4 m0;
    public int[] X = new int[0];
    public Object[] Z = new Object[0];
    public final Object h0 = new Object();
    public ArrayList k0 = new ArrayList();

    public final int a(gp2 gp2Var) {
        if (this.i0) {
            d01.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!gp2Var.a()) {
            wr5.a("Anchor refers to a group that was removed");
        }
        return gp2Var.a;
    }

    public final void b() {
        this.l0 = new HashMap();
    }

    public final xb7 c() {
        if (this.i0) {
            bt.i("Cannot read while a writer is pending");
            return null;
        }
        this.g0++;
        return new xb7(this);
    }

    public final bc7 e() {
        if (this.i0) {
            d01.a("Cannot start a writer when another writer is pending");
        }
        if (this.g0 > 0) {
            d01.a("Cannot start a writer when a reader is pending");
        }
        this.i0 = true;
        this.j0++;
        return new bc7(this);
    }

    public final boolean f(gp2 gp2Var) {
        int iC;
        return gp2Var.a() && (iC = ac7.c(this.k0, gp2Var.a, this.Y)) >= 0 && dh3.f(this.k0.get(iC), gp2Var);
    }

    public final np2 h(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.l0;
        if (map != null) {
            if (this.i0) {
                d01.a("use active SlotWriter to crate an anchor for location instead");
            }
            gp2 gp2Var = (i < 0 || i >= (i2 = this.Y) || (iC = ac7.c((arrayList = this.k0), i, i2)) < 0) ? null : (gp2) arrayList.get(iC);
            if (gp2Var != null) {
                return (np2) map.get(gp2Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qu2(this, 0, this.Y);
    }
}
