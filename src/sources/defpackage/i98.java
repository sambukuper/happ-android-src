package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i98 implements q61 {
    public final br5 X;
    public final ThreadLocal Y;
    public final k98 Z;

    public i98(br5 br5Var, ThreadLocal threadLocal) {
        this.X = br5Var;
        this.Y = threadLocal;
        this.Z = new k98(threadLocal);
    }

    @Override // defpackage.s61
    public final s61 B0(s61 s61Var) {
        return g33.K(this, s61Var);
    }

    @Override // defpackage.s61
    public final q61 H0(r61 r61Var) {
        if (this.Z.equals(r61Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    public final void a(Object obj) {
        this.Y.set(obj);
    }

    @Override // defpackage.s61
    public final s61 a0(r61 r61Var) {
        return this.Z.equals(r61Var) ? b02.X : this;
    }

    public final Object b() {
        ThreadLocal threadLocal = this.Y;
        Object obj = threadLocal.get();
        threadLocal.set(this.X);
        return obj;
    }

    @Override // defpackage.q61
    public final r61 getKey() {
        return this.Z;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.X + ", threadLocal = " + this.Y + ')';
    }
}
