package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fo2 extends xr2 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fo2(ve4 ve4Var, m0 m0Var, byte b) {
        super(ve4Var, m0Var);
        this.e = b;
    }

    @Override // defpackage.xr2
    public final List h() {
        byte b = this.e;
        d02 d02Var = d02.X;
        switch (b) {
            case 0:
                do2 do2Var = (do2) this.b;
                so2 so2Var = do2Var.i0;
                if (dh3.f(so2Var, oo2.d)) {
                    return i21.K(z39.o(do2Var, false));
                }
                return dh3.f(so2Var, ro2.d) ? i21.K(z39.o(do2Var, true)) : d02Var;
            default:
                return d02Var;
        }
    }
}
