package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lm1 extends v1 {
    public final jl1 o0;
    public final sz5 p0;
    public final ll1 q0;

    /* JADX WARN: Illegal instructions before constructor call */
    public lm1(jl1 jl1Var, sz5 sz5Var, int i) {
        rt8 rt8Var;
        ve4 ve4Var = ((hl1) jl1Var.X).a;
        ed1 ed1Var = (ed1) jl1Var.Z;
        rm rmVar = oy1.f0;
        v15 v15VarS = u70.S((w15) jl1Var.Y, sz5Var.g0);
        rz5 rz5Var = sz5Var.i0;
        rz5Var.getClass();
        int iOrdinal = rz5Var.ordinal();
        if (iOrdinal == 0) {
            rt8Var = rt8.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            rt8Var = rt8.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                b61.c();
                throw null;
            }
            rt8Var = rt8.INVARIANT;
        }
        rt8 rt8Var2 = rt8Var;
        boolean z = sz5Var.h0;
        if (ve4Var == null) {
            v1.B(0);
            throw null;
        }
        if (ed1Var == null) {
            v1.B(1);
            throw null;
        }
        super(i, rmVar, ed1Var, ve4Var, v15VarS, rt8Var2, z);
        this.o0 = jl1Var;
        this.p0 = sz5Var;
        this.q0 = new ll1(ve4Var, new f3(this, (byte) 20));
    }

    @Override // defpackage.k3
    public final List I0() {
        jl1 jl1Var = this.o0;
        List listJ0 = vr3.j0(this.p0, (ux4) jl1Var.f0);
        if (listJ0.isEmpty()) {
            return i21.K(el1.e(this).n());
        }
        fc8 fc8Var = (fc8) jl1Var.j0;
        ArrayList arrayList = new ArrayList(xv0.Z(listJ0, 10));
        Iterator it = listJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(fc8Var.i((nz5) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.cw0, defpackage.zk
    public final sm getAnnotations() {
        return this.q0;
    }
}
