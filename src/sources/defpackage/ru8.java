package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ru8 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ su8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru8(su8 su8Var, byte b) {
        super(1);
        this.Y = b;
        this.Z = su8Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        long j;
        byte b = this.Y;
        su8 su8Var = this.Z;
        switch (b) {
            case 0:
                wd8 wd8Var = (wd8) obj;
                r12 r12Var = r12.X;
                r12 r12Var2 = r12.Y;
                if (wd8Var.b(r12Var, r12Var2)) {
                    be8 be8Var = su8Var.r0.a;
                    return b22.c;
                }
                if (!wd8Var.b(r12Var2, r12.Z)) {
                    return b22.c;
                }
                be8 be8Var2 = su8Var.s0.a;
                return b22.c;
            default:
                int iOrdinal = ((r12) obj).ordinal();
                if (iOrdinal == 0) {
                    be8 be8Var3 = su8Var.r0.a;
                    j = dw0.f;
                } else if (iOrdinal == 1) {
                    be8 be8Var4 = su8Var.r0.a;
                    be8 be8Var5 = su8Var.s0.a;
                    j = dw0.f;
                } else {
                    if (iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    be8 be8Var6 = su8Var.s0.a;
                    j = su8Var.t0.e;
                }
                return new dw0(j);
        }
    }
}
