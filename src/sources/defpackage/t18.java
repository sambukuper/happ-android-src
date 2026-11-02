package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t18 implements gk {
    public final ju8 a;
    public final ug8 b;
    public final Object c;
    public final Object d;
    public final wk e;
    public final wk f;
    public final wk g;
    public long h;
    public wk i;

    public t18(pk pkVar, ug8 ug8Var, Object obj, Object obj2, wk wkVar) {
        this.a = pkVar.a(ug8Var);
        this.b = ug8Var;
        this.c = obj2;
        this.d = obj;
        this.e = (wk) ug8Var.a.B(obj);
        gn2 gn2Var = ug8Var.a;
        this.f = (wk) gn2Var.B(obj2);
        this.g = wkVar != null ? ci8.p(wkVar) : ((wk) gn2Var.B(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.gk
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.gk
    public final long b() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jD = this.a.d(this.e, this.f, this.g);
        this.h = jD;
        return jD;
    }

    @Override // defpackage.gk
    public final ug8 c() {
        return this.b;
    }

    @Override // defpackage.gk
    public final wk d(long j) {
        if (!e(j)) {
            return this.a.m(j, this.e, this.f, this.g);
        }
        wk wkVar = this.i;
        if (wkVar != null) {
            return wkVar;
        }
        wk wkVarA = this.a.A(this.e, this.f, this.g);
        this.i = wkVarA;
        return wkVarA;
    }

    @Override // defpackage.gk
    public final Object f(long j) {
        if (e(j)) {
            return this.c;
        }
        wk wkVarZ = this.a.z(j, this.e, this.f, this.g);
        int iB = wkVarZ.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(wkVarZ.a(i))) {
                yr5.b("AnimationVector cannot contain a NaN. " + wkVarZ + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.B(wkVarZ);
    }

    @Override // defpackage.gk
    public final Object g() {
        return this.c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
