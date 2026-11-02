package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ cd(float f, je jeVar, g60 g60Var) {
        this.X = (byte) 0;
        this.Y = f;
        this.Z = jeVar;
        this.f0 = g60Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.f0;
        float f = this.Y;
        Object obj3 = this.Z;
        switch (b) {
            case 0:
                je jeVar = (je) obj3;
                g60 g60Var = (g60) obj2;
                p34 p34Var = (p34) obj;
                p34Var.a();
                lr lrVar = p34Var.X.Y;
                long jP = lrVar.p();
                lrVar.k().g();
                try {
                    wl6 wl6Var = (wl6) lrVar.Y;
                    wl6Var.V(f, 0.0f);
                    wl6Var.T(45.0f, 0L);
                    sv1.U(p34Var, jeVar, 0L, 0.0f, g60Var, 0, 46);
                    return dn8Var;
                } finally {
                    p61.w(lrVar, jP);
                }
            case 1:
                pk6 pk6Var = (pk6) obj;
                pk6Var.getClass();
                pk6Var.n(((Number) ((oi) obj3).d()).floatValue());
                pk6Var.b(((Number) ((dn2) obj2).invoke()).floatValue() * f);
                pk6Var.f(new u24(8.0f, 8.0f, 8.0f, 8.0f));
                return dn8Var;
            case 2:
                eo5 eo5Var = (eo5) obj3;
                do5 do5Var = (do5) obj;
                oi oiVar = ((aa8) obj2).u0;
                do5.h(do5Var, eo5Var, oiVar != null ? (int) ((Number) oiVar.d()).floatValue() : (int) f, 0);
                return dn8Var;
            default:
                qo8 qo8Var = (qo8) obj3;
                gn2 gn2Var = (gn2) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = qo8Var.b;
                if (j == Long.MIN_VALUE) {
                    qo8Var.b = jLongValue;
                    j = jLongValue;
                }
                float f2 = qo8Var.e;
                sk skVar = new sk(f2);
                sk skVar2 = qo8.f;
                long jD = f == 0.0f ? qo8Var.a.d(new sk(f2), skVar2, qo8Var.c) : nr4.P((jLongValue - j) / f);
                float f3 = ((sk) qo8Var.a.z(jD, skVar, skVar2, qo8Var.c)).a;
                qo8Var.c = (sk) qo8Var.a.m(jD, skVar, skVar2, qo8Var.c);
                qo8Var.b = jLongValue;
                float f4 = qo8Var.e - f3;
                qo8Var.e = f3;
                gn2Var.B(Float.valueOf(f4));
                return dn8Var;
        }
    }

    public /* synthetic */ cd(eo5 eo5Var, aa8 aa8Var, float f) {
        this.X = (byte) 2;
        this.Z = eo5Var;
        this.f0 = aa8Var;
        this.Y = f;
    }

    public /* synthetic */ cd(Object obj, float f, on2 on2Var, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = f;
        this.f0 = on2Var;
    }
}
