package defpackage;

import io.sentry.android.core.internal.util.t;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ad1 implements gk {
    public long a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ad1(bd1 bd1Var, ug8 ug8Var, Object obj, wk wkVar) {
        nu8 nu8Var = new nu8(bd1Var.a);
        this.b = nu8Var;
        this.c = ug8Var;
        this.d = obj;
        wk wkVar2 = (wk) ug8Var.a.B(obj);
        this.f = wkVar2;
        this.g = ci8.p(wkVar);
        gn2 gn2Var = ug8Var.b;
        wk wkVarC = nu8Var.d;
        if (wkVarC == null) {
            wkVarC = wkVar2.c();
            nu8Var.d = wkVarC;
        }
        int iB = wkVarC.b();
        int i = 0;
        while (true) {
            wk wkVar3 = nu8Var.d;
            qe2 qe2Var = nu8Var.a;
            if (i >= iB) {
                if (wkVar3 == null) {
                    dh3.T("targetVector");
                    throw null;
                }
                this.e = gn2Var.B(wkVar3);
                wk wkVarC2 = nu8Var.c;
                if (wkVarC2 == null) {
                    wkVarC2 = wkVar2.c();
                    nu8Var.c = wkVarC2;
                }
                int iB2 = wkVarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    wkVar2.getClass();
                    jMax = Math.max(jMax, qe2Var.m0(wkVar.a(i2)));
                }
                this.a = jMax;
                wk wkVarP = ci8.p(((nu8) this.b).a(jMax, (wk) this.f, wkVar));
                this.h = wkVarP;
                int iB3 = wkVarP.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    wk wkVar4 = (wk) this.h;
                    float fA = wkVar4.a(i3);
                    float f = ((nu8) this.b).e;
                    wkVar4.e(i3, x97.m(fA, -f, f));
                }
                return;
            }
            if (wkVar3 == null) {
                dh3.T("targetVector");
                throw null;
            }
            wkVar3.e(i, qe2Var.r0(wkVar2.a(i), wkVar.a(i)));
            i++;
        }
    }

    @Override // defpackage.gk
    public boolean a() {
        return false;
    }

    @Override // defpackage.gk
    public long b() {
        return this.a;
    }

    @Override // defpackage.gk
    public ug8 c() {
        return (ug8) this.c;
    }

    @Override // defpackage.gk
    public wk d(long j) {
        return !e(j) ? ((nu8) this.b).a(j, (wk) this.f, (wk) this.g) : (wk) this.h;
    }

    @Override // defpackage.gk
    public Object f(long j) {
        if (e(j)) {
            return this.e;
        }
        gn2 gn2Var = ((ug8) this.c).b;
        nu8 nu8Var = (nu8) this.b;
        wk wkVar = (wk) this.f;
        wk wkVar2 = (wk) this.g;
        wk wkVarC = nu8Var.b;
        if (wkVarC == null) {
            wkVarC = wkVar.c();
            nu8Var.b = wkVarC;
        }
        int iB = wkVarC.b();
        int i = 0;
        while (true) {
            wk wkVar3 = nu8Var.b;
            if (i >= iB) {
                if (wkVar3 != null) {
                    return gn2Var.B(wkVar3);
                }
                dh3.T("valueVector");
                throw null;
            }
            if (wkVar3 == null) {
                dh3.T("valueVector");
                throw null;
            }
            wkVar3.e(i, nu8Var.a.T(wkVar.a(i), wkVar2.a(i), j));
            i++;
        }
    }

    @Override // defpackage.gk
    public Object g() {
        return this.e;
    }

    public ad1(t tVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = new ConcurrentLinkedDeque();
        this.g = new ConcurrentLinkedDeque();
        this.h = new ConcurrentLinkedDeque();
        this.a = 0L;
        this.b = tVar;
    }
}
