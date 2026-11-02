package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class w04 implements dn2 {
    public final /* synthetic */ byte X;
    public final y04 Y;

    public /* synthetic */ w04(y04 y04Var, byte b) {
        this.X = b;
        this.Y = y04Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        y04 y04Var = this.Y;
        switch (b) {
            case 0:
                iz3 iz3Var = y04Var.k0;
                mz3 mz3Var = iz3Var.d;
                if (ow.o.x(ow.a[33], iz3Var)) {
                    return null;
                }
                return mz3Var;
            default:
                Type typeX = w51.x(y04Var);
                return typeX == null ? y04Var.r().j() : typeX;
        }
    }
}
