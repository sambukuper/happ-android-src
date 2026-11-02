package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oi {
    public final ug8 a;
    public final Object b;
    public final qk c;
    public final rh5 d;
    public final rh5 e;
    public final n15 f;
    public final wf7 g;
    public final wk h;
    public final wk i;
    public final wk j;
    public final wk k;

    public oi(Object obj, ug8 ug8Var, Object obj2) {
        this.a = ug8Var;
        this.b = obj2;
        qk qkVar = new qk(ug8Var, obj, null, 60);
        this.c = qkVar;
        this.d = z51.H(Boolean.FALSE);
        this.e = z51.H(obj);
        this.f = new n15();
        this.g = new wf7(obj2);
        wk wkVar = qkVar.Z;
        boolean z = wkVar instanceof sk;
        wk wkVar2 = z ? z51.e : wkVar instanceof tk ? z51.f : wkVar instanceof uk ? z51.g : z51.h;
        this.h = wkVar2;
        wk wkVar3 = z ? z51.a : wkVar instanceof tk ? z51.b : wkVar instanceof uk ? z51.c : z51.d;
        this.i = wkVar3;
        this.j = wkVar2;
        this.k = wkVar3;
    }

    public static Object a(oi oiVar, Object obj, pk pkVar, gn2 gn2Var, q51 q51Var, int i) {
        if ((i & 2) != 0) {
            pkVar = oiVar.g;
        }
        pk pkVar2 = pkVar;
        Object objB = oiVar.a.b.B(oiVar.c.Z);
        if ((i & 8) != 0) {
            gn2Var = null;
        }
        gn2 gn2Var2 = gn2Var;
        Object objD = oiVar.d();
        ug8 ug8Var = oiVar.a;
        return n15.a(oiVar.f, new ji(oiVar, objB, new t18(pkVar2, ug8Var, objD, obj, (wk) ug8Var.a.B(objB)), oiVar.c.f0, gn2Var2, null), q51Var);
    }

    public final Object b(Object obj) {
        wk wkVar = this.h;
        wk wkVar2 = this.j;
        boolean zF = dh3.f(wkVar2, wkVar);
        wk wkVar3 = this.k;
        if (!zF || !dh3.f(wkVar3, this.i)) {
            ug8 ug8Var = this.a;
            wk wkVar4 = (wk) ug8Var.a.B(obj);
            int iB = wkVar4.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (wkVar4.a(i) < wkVar2.a(i) || wkVar4.a(i) > wkVar3.a(i)) {
                    wkVar4.e(i, x97.m(wkVar4.a(i), wkVar2.a(i), wkVar3.a(i)));
                    z = true;
                }
            }
            if (z) {
                return ug8Var.b.B(wkVar4);
            }
        }
        return obj;
    }

    public final void c() {
        qk qkVar = this.c;
        qkVar.Z.d();
        qkVar.f0 = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.Y.getValue();
    }

    public final Object e(q51 q51Var, Object obj) {
        Object objA = n15.a(this.f, new ki(this, obj, null, (byte) 0), q51Var);
        return objA == c71.X ? objA : dn8.a;
    }

    public final Object f(uy7 uy7Var) {
        Object objA = n15.a(this.f, new li(this, null, (byte) 0), uy7Var);
        return objA == c71.X ? objA : dn8.a;
    }

    public /* synthetic */ oi(Object obj, ug8 ug8Var, Object obj2, int i) {
        this(obj, ug8Var, (i & 4) != 0 ? null : obj2);
    }
}
