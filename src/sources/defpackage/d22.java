package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ f22 Z;
    public final /* synthetic */ long f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d22(f22 f22Var, long j, byte b) {
        super(1);
        this.Y = b;
        this.Z = f22Var;
        this.f0 = j;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        gn2 gn2Var;
        gn2 gn2Var2;
        gn2 gn2Var3;
        gn2 gn2Var4;
        int iOrdinal;
        byte b = this.Y;
        long j = this.f0;
        long jB = 0;
        f22 f22Var = this.Z;
        switch (b) {
            case 0:
                int iOrdinal2 = ((r12) obj).ordinal();
                if (iOrdinal2 == 0) {
                    fp0 fp0Var = f22Var.v0.a.c;
                    if (fp0Var != null && (gn2Var = fp0Var.b) != null) {
                        j = ((pf3) gn2Var.B(new pf3(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        b61.c();
                        return null;
                    }
                    fp0 fp0Var2 = f22Var.w0.a.c;
                    if (fp0Var2 != null && (gn2Var2 = fp0Var2.b) != null) {
                        j = ((pf3) gn2Var2.B(new pf3(j))).a;
                    }
                }
                return new pf3(j);
            case 1:
                r12 r12Var = (r12) obj;
                if (r12Var == r12.Z && f22Var.w0.a.b == null) {
                    jB = f22Var.x0.i;
                } else {
                    eb7 eb7Var = f22Var.v0.a.b;
                    long j2 = (eb7Var == null || (gn2Var4 = eb7Var.a) == null) ? 0L : ((hf3) gn2Var4.B(new pf3(j))).a;
                    eb7 eb7Var2 = f22Var.w0.a.b;
                    long j3 = (eb7Var2 == null || (gn2Var3 = eb7Var2.a) == null) ? 0L : ((hf3) gn2Var3.B(new pf3(j))).a;
                    int iOrdinal3 = r12Var.ordinal();
                    if (iOrdinal3 == 0) {
                        jB = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            b61.c();
                            return null;
                        }
                        jB = j3;
                    }
                }
                return new hf3(jB);
            default:
                r12 r12Var2 = (r12) obj;
                if (f22Var.B0 != null && f22Var.a1() != null && !dh3.f(f22Var.B0, f22Var.a1()) && (iOrdinal = r12Var2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    fp0 fp0Var3 = f22Var.w0.a.c;
                    if (fp0Var3 != null) {
                        gn2 gn2Var5 = fp0Var3.b;
                        long j4 = this.f0;
                        long j5 = ((pf3) gn2Var5.B(new pf3(j4))).a;
                        q8 q8VarA1 = f22Var.a1();
                        q8VarA1.getClass();
                        z24 z24Var = z24.X;
                        long jA = q8VarA1.a(j4, j5, z24Var);
                        q8 q8Var = f22Var.B0;
                        q8Var.getClass();
                        jB = hf3.b(jA, q8Var.a(j4, j5, z24Var));
                    }
                }
                return new hf3(jB);
        }
    }
}
