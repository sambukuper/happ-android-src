package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kj7 extends lj7 {
    public final /* synthetic */ byte Z = 1;
    public final Serializable f0;

    public kj7(dh8 dh8Var, String str) {
        super(Object.class);
        this.f0 = str;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) throws nh3 {
        byte b = this.Z;
        Serializable serializable = this.f0;
        switch (b) {
            case 0:
                if (t37Var.X.j(n37.q0)) {
                    ro3Var.U(obj.toString());
                    return;
                }
                Enum r3 = (Enum) obj;
                if (t37Var.X.j(n37.s0)) {
                    ro3Var.U(String.valueOf(r3.ordinal()));
                    return;
                } else {
                    ro3Var.R(((r37[]) ((zl) serializable).Z)[r3.ordinal()]);
                    return;
                }
            default:
                t37Var.A((String) serializable);
                throw null;
        }
    }

    public kj7(Class cls, zl zlVar) {
        super(0, cls);
        this.f0 = zlVar;
    }
}
