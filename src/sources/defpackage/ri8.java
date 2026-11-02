package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ri8 {
    public ri8 a(d50 d50Var) {
        throw new UnsupportedOperationException();
    }

    public String b() {
        return null;
    }

    public tr3 c() {
        return tr3.f0;
    }

    public final z76 d(Object obj, gr3 gr3Var) {
        z76 z76Var = new z76(obj, gr3Var);
        int iOrdinal = c().ordinal();
        if (iOrdinal == 0) {
            z76Var.X = 3;
            z76Var.h0 = b();
            return z76Var;
        }
        if (iOrdinal == 1) {
            z76Var.X = 2;
            return z76Var;
        }
        if (iOrdinal == 2) {
            z76Var.X = 1;
            return z76Var;
        }
        if (iOrdinal == 3) {
            z76Var.X = 5;
            z76Var.h0 = b();
            return z76Var;
        }
        if (iOrdinal == 4) {
            z76Var.X = 4;
            z76Var.h0 = b();
            return z76Var;
        }
        int i = ev8.a;
        kp5.t("Internal error: this code path should never get executed");
        return null;
    }

    public abstract z76 e(ro3 ro3Var, z76 z76Var);

    public z76 f(ro3 ro3Var, z76 z76Var) {
        if (z76Var != null) {
            ro3Var.f1(z76Var);
            return z76Var;
        }
        gr3 gr3Var = (gr3) z76Var.i0;
        if (gr3Var == gr3.START_OBJECT) {
            ro3Var.J();
            return z76Var;
        }
        if (gr3Var == gr3.START_ARRAY) {
            ro3Var.D();
        }
        return z76Var;
    }
}
