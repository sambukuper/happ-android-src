package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ku extends si8 {
    public static final ku d = new ku(null, 0 == true ? 1 : 0, 0);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(vh8 vh8Var, d50 d50Var, byte b) {
        super(vh8Var, d50Var);
        this.c = b;
    }

    @Override // defpackage.ri8
    public ri8 a(d50 d50Var) {
        switch (this.c) {
            case 0:
                return this;
            case 1:
                return g(d50Var);
            default:
                return this.b == d50Var ? this : new ku(this.a, d50Var, (byte) 2);
        }
    }

    @Override // defpackage.ri8
    public tr3 c() {
        switch (this.c) {
            case 0:
                return tr3.g0;
            case 1:
                return tr3.Z;
            default:
                return tr3.Y;
        }
    }

    @Override // defpackage.si8, defpackage.ri8
    public z76 e(ro3 ro3Var, z76 z76Var) {
        switch (this.c) {
            case 0:
                if (!((gr3) z76Var.i0).Z) {
                    return null;
                }
                ro3Var.getClass();
                ro3Var.e1(z76Var);
                return z76Var;
            default:
                super.e(ro3Var, z76Var);
                return z76Var;
        }
    }

    @Override // defpackage.ri8
    public z76 f(ro3 ro3Var, z76 z76Var) {
        switch (this.c) {
            case 0:
                if (z76Var == null) {
                    return null;
                }
                ro3Var.f1(z76Var);
                return z76Var;
            default:
                return super.f(ro3Var, z76Var);
        }
    }

    public ku g(d50 d50Var) {
        return this.b == d50Var ? this : new ku(this.a, d50Var, (byte) 1);
    }
}
