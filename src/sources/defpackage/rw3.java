package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rw3 implements mh8, ji8, lv3 {
    public final Object X;
    public final g44 Y;
    public final sw3 Z;
    public final String f0;
    public final yw3 g0;
    public final hi8 h0;
    public volatile List i0;

    /* JADX WARN: Illegal instructions before constructor call */
    public rw3(sw3 sw3Var, hi8 hi8Var) {
        yw3 yw3Var;
        sw3Var.getClass();
        String strB = hi8Var.getName().b();
        strB.getClass();
        rt8 rt8VarD = hi8Var.D();
        rt8VarD.getClass();
        int iOrdinal = rt8VarD.ordinal();
        if (iOrdinal == 0) {
            yw3Var = yw3.X;
        } else if (iOrdinal == 1) {
            yw3Var = yw3.Y;
        } else {
            if (iOrdinal != 2) {
                b61.c();
                throw null;
            }
            yw3Var = yw3.Z;
        }
        hi8Var.y();
        this(hi8Var, sw3Var, strB, yw3Var);
        List upperBounds = hi8Var.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(xv0.Z(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new kk1((t14) it.next(), 0));
        }
        this.i0 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rw3)) {
            return false;
        }
        rw3 rw3Var = (rw3) obj;
        return dh3.f(this.f0, rw3Var.f0) && this.X.equals(rw3Var.X);
    }

    public final List getUpperBounds() {
        List list = this.i0;
        if (list != null) {
            return list;
        }
        dh3.T("upperBounds");
        throw null;
    }

    public final int hashCode() {
        return this.f0.hashCode() + (this.X.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.g0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(this.f0);
        return sb.toString();
    }

    public rw3(hi8 hi8Var, sw3 sw3Var, String str, yw3 yw3Var) {
        sw3Var.getClass();
        this.X = sw3Var;
        this.Y = x97.P(w74.X, new tb2(this, (byte) 16));
        this.Z = sw3Var;
        this.f0 = str;
        this.g0 = yw3Var;
        this.h0 = hi8Var;
    }
}
