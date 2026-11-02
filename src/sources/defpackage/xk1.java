package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum xk1 {
    f0(true),
    g0(true),
    h0(true),
    i0(false),
    j0(true),
    k0(true),
    l0(true),
    m0(true),
    n0(true),
    o0(true),
    p0(true),
    q0(true),
    r0(true),
    s0(true);

    public static final Set Y;
    public static final Set Z;
    public final boolean X;

    static {
        xk1[] xk1VarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (xk1 xk1Var : xk1VarArrValues) {
            if (xk1Var.X) {
                arrayList.add(xk1Var);
            }
        }
        Y = wv0.c1(arrayList);
        Z = eu.L0(values());
    }

    xk1(boolean z) {
        this.X = z;
    }
}
