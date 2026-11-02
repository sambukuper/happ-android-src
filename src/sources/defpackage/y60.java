package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y60 implements gn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ y60(ny6 ny6Var, z24 z24Var, long j, long j2) {
        this.f0 = ny6Var;
        this.g0 = z24Var;
        this.Y = j;
        this.Z = j2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        tx6 tx6VarO;
        float f;
        float fIntBitsToFloat;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        switch (b) {
            case 0:
                tv1 tv1Var = (tv1) obj2;
                p34 p34Var = (p34) obj;
                p34Var.a();
                sv1.E0(p34Var, (d90) obj3, this.Y, this.Z, 0.0f, tv1Var, 0, 104);
                return dn8Var;
            default:
                ny6 ny6Var = (ny6) obj3;
                z24 z24Var = (z24) obj2;
                p34 p34Var2 = (p34) obj;
                p34Var2.getClass();
                um0 um0Var = p34Var2.X;
                p34Var2.a();
                if ((ny6Var.j() || ny6Var.m()) && (tx6VarO = ny6Var.o()) != null) {
                    int iP = tx6VarO.p();
                    int iS = tx6VarO.s();
                    int iE = tx6VarO.e();
                    if (iP != Integer.MAX_VALUE && iS != Integer.MAX_VALUE && iE != Integer.MAX_VALUE && iP > iS && iS > 0) {
                        float fH0 = p34Var2.h0(6.0f);
                        float fH1 = p34Var2.h0(3.0f);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (um0Var.e() & 4294967295L)) - (fH0 * 2.0f);
                        float fM = 0.0f;
                        if (fIntBitsToFloat2 > 0.0f && Float.intBitsToFloat((int) (um0Var.e() >> 32)) >= fH0 + fH1) {
                            float fM2 = x97.m((iS * fIntBitsToFloat2) / iP, Math.min(p34Var2.h0(24.0f), fIntBitsToFloat2), fIntBitsToFloat2);
                            if (!ny6Var.j()) {
                                f = fM;
                            } else if (ny6Var.m()) {
                                fM = x97.m(iE / (iP - iS), 0.0f, 1.0f);
                                f = fM;
                            } else {
                                f = 1.0f;
                            }
                            int iOrdinal = z24Var.ordinal();
                            if (iOrdinal == 0) {
                                fIntBitsToFloat = (Float.intBitsToFloat((int) (um0Var.e() >> 32)) - fH0) - fH1;
                            } else {
                                if (iOrdinal != 1) {
                                    b61.c();
                                    return null;
                                }
                                fIntBitsToFloat = fH0;
                            }
                            float f2 = fH1 / 2.0f;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                            p34Var2.f0(this.Y, (((long) Float.floatToRawIntBits(fH0)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (((long) Float.floatToRawIntBits(fH1)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), jFloatToRawIntBits);
                            p34Var2.f0(this.Z, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(p61.e(fIntBitsToFloat2, fM2, f, fH0))) & 4294967295L), (((long) Float.floatToRawIntBits(fH1)) << 32) | (((long) Float.floatToRawIntBits(fM2)) & 4294967295L), jFloatToRawIntBits);
                        }
                    }
                }
                return dn8Var;
        }
    }

    public /* synthetic */ y60(fe7 fe7Var, long j, long j2, tv1 tv1Var) {
        this.f0 = fe7Var;
        this.Y = j;
        this.Z = j2;
        this.g0 = tv1Var;
    }
}
