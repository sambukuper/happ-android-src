package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class do0 extends ui8 {
    public final /* synthetic */ byte b;
    public final ui8 c;

    public /* synthetic */ do0(ui8 ui8Var, byte b) {
        this.b = b;
        this.c = ui8Var;
    }

    @Override // defpackage.ui8
    public boolean a() {
        switch (this.b) {
            case 0:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override // defpackage.ui8
    public boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // defpackage.ui8
    public final sm c(sm smVar) {
        byte b = this.b;
        ui8 ui8Var = this.c;
        smVar.getClass();
        switch (b) {
            case 0:
                break;
        }
        return ui8Var.c(smVar);
    }

    @Override // defpackage.ui8
    public final ni8 d(t14 t14Var) {
        byte b = this.b;
        ui8 ui8Var = this.c;
        switch (b) {
            case 0:
                ni8 ni8VarD = ui8Var.d(t14Var);
                if (ni8VarD == null) {
                    return null;
                }
                ot0 ot0VarX = t14Var.n0().x();
                return z91.q(ni8VarD, ot0VarX instanceof hi8 ? (hi8) ot0VarX : null);
            default:
                return ui8Var.d(t14Var);
        }
    }

    @Override // defpackage.ui8
    public final boolean e() {
        byte b = this.b;
        ui8 ui8Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return ui8Var.e();
    }

    @Override // defpackage.ui8
    public final t14 f(t14 t14Var, rt8 rt8Var) {
        byte b = this.b;
        ui8 ui8Var = this.c;
        t14Var.getClass();
        rt8Var.getClass();
        switch (b) {
            case 0:
                break;
        }
        return ui8Var.f(t14Var, rt8Var);
    }
}
