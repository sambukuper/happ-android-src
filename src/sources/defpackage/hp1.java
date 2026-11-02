package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hp1 extends ui8 {
    public final ui8 b;
    public final ui8 c;

    public hp1(ui8 ui8Var, ui8 ui8Var2) {
        this.b = ui8Var;
        this.c = ui8Var2;
    }

    @Override // defpackage.ui8
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // defpackage.ui8
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // defpackage.ui8
    public final sm c(sm smVar) {
        smVar.getClass();
        return this.c.c(this.b.c(smVar));
    }

    @Override // defpackage.ui8
    public final ni8 d(t14 t14Var) {
        ni8 ni8VarD = this.b.d(t14Var);
        return ni8VarD == null ? this.c.d(t14Var) : ni8VarD;
    }

    @Override // defpackage.ui8
    public final t14 f(t14 t14Var, rt8 rt8Var) {
        t14Var.getClass();
        rt8Var.getClass();
        return this.c.f(this.b.f(t14Var, rt8Var), rt8Var);
    }
}
