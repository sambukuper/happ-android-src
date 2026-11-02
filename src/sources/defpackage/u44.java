package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u44 implements dn2 {
    public final /* synthetic */ byte X;
    public final v44 Y;

    public /* synthetic */ u44(v44 v44Var, byte b) {
        this.X = b;
        this.Y = v44Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        v44 v44Var = this.Y;
        switch (b) {
            case 0:
                Object obj = v44Var.l0.Y;
                v44Var.i0.a.a.getClass();
                return zp4.P(new ArrayList());
            default:
                v44Var.k0.getClass();
                return new ArrayList(xv0.Z(d02.X, 10));
        }
    }
}
