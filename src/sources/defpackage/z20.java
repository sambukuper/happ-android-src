package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z20 {
    public static final Class[] j = new Class[0];
    public final dh8 a;
    public final pf5 b;
    public final vp4 c;
    public final m85 d;
    public final al e;
    public Class[] f;
    public boolean g;
    public List h;
    public final f85 i;

    /* JADX WARN: Illegal instructions before constructor call */
    public z20(pf5 pf5Var) {
        dh8 dh8Var = pf5Var.c;
        al alVar = pf5Var.d;
        this(dh8Var);
        this.b = pf5Var;
        l37 l37Var = pf5Var.a;
        this.c = l37Var;
        this.d = l37Var.d();
        this.e = alVar;
        m85 m85Var = pf5Var.f;
        f85 f85VarP = m85Var.p(alVar);
        this.i = f85VarP != null ? m85Var.q(alVar, f85VarP) : f85VarP;
    }

    public static z20 d(vp4 vp4Var, dh8 dh8Var, al alVar) {
        List list = Collections.EMPTY_LIST;
        return new z20(vp4Var, dh8Var, alVar);
    }

    public final List a() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        pf5 pf5Var = this.b;
        if (!pf5Var.i) {
            pf5Var.i();
        }
        ArrayList arrayList = new ArrayList(pf5Var.j.values());
        this.h = arrayList;
        return arrayList;
    }

    public final no3 b() {
        pf5 pf5Var = this.b;
        if (pf5Var == null) {
            return no3.k0;
        }
        no3 no3Var = pf5Var.t;
        if (no3Var != null) {
            return no3Var;
        }
        m85 m85Var = pf5Var.f;
        no3 no3VarH = m85Var != null ? m85Var.h(pf5Var.d) : null;
        Class cls = pf5Var.c.j0;
        no3 no3Var2 = no3.k0;
        if (no3Var2 != null) {
            no3VarH = no3VarH == null ? no3Var2 : no3VarH.c(no3Var2);
        }
        if (no3VarH != null) {
            no3Var2 = no3VarH;
        }
        pf5Var.t = no3Var2;
        return no3Var2;
    }

    public final gl c() {
        pf5 pf5Var = this.b;
        if (pf5Var != null) {
            if (!pf5Var.i) {
                pf5Var.i();
            }
            LinkedList linkedList = pf5Var.r;
            if (linkedList != null) {
                if (linkedList.size() <= 1 || pf5.g(pf5Var.r)) {
                    return (gl) pf5Var.r.get(0);
                }
                pf5Var.j("Multiple 'as-value' properties defined (%s vs %s)", pf5Var.r.get(0), pf5Var.r.get(1));
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z20(vp4 vp4Var, dh8 dh8Var, al alVar) {
        this(dh8Var);
        List list = Collections.EMPTY_LIST;
        this.b = null;
        this.c = vp4Var;
        if (vp4Var == null) {
            this.d = null;
        } else {
            this.d = vp4Var.d();
        }
        this.e = alVar;
        this.h = list;
    }

    public z20(dh8 dh8Var) {
        this.a = dh8Var;
    }
}
