package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ m0 Y;

    public /* synthetic */ l0(m0 m0Var, byte b) {
        this.X = b;
        this.Y = m0Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        m0 m0Var = this.Y;
        switch (b) {
            case 0:
                et4 et4VarR0 = m0Var.r0();
                f0 f0Var = new f0(this, (byte) 1);
                q32 q32Var = cj8.a;
                if (u32.f(m0Var)) {
                    return u32.c(s32.UNABLE_TO_SUBSTITUTE_TYPE, m0Var.toString());
                }
                lh8 lh8VarL = m0Var.l();
                if (lh8VarL == null) {
                    cj8.a(12);
                    throw null;
                }
                if (et4VarR0 == null) {
                    cj8.a(13);
                    throw null;
                }
                List listD = cj8.d(lh8VarL.g());
                ch8.Y.getClass();
                return dh3.P(ch8.Z, lh8VarL, listD, false, et4VarR0, f0Var);
            case 1:
                return new dd3(m0Var.r0());
            default:
                return new i44(m0Var);
        }
    }
}
