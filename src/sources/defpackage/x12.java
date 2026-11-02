package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x12 extends g24 implements gn2 {
    public final /* synthetic */ byte Y = 1;
    public final /* synthetic */ x77 Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x12(x77 x77Var, rd8 rd8Var, rd8 rd8Var2, rd8 rd8Var3) {
        super(1);
        this.Z = x77Var;
        this.f0 = rd8Var;
        this.g0 = rd8Var2;
        this.h0 = rd8Var3;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        x77 x77Var = this.Z;
        Object obj4 = this.h0;
        switch (b) {
            case 0:
                pk6 pk6Var = (pk6) obj;
                lh7 lh7Var = (lh7) obj3;
                float fFloatValue = lh7Var != null ? ((Number) lh7Var.getValue()).floatValue() : 1.0f;
                d6 d6Var = x77Var.c;
                nh5 nh5Var = (nh5) d6Var.i0;
                float fL = fFloatValue * ((x77Var.b() && ((Boolean) ((rh5) d6Var.Y).getValue()).booleanValue()) ? ((nh5) d6Var.g0).l() : 1.0f);
                if (x77Var.b()) {
                    x77Var.f = fL;
                }
                pk6Var.b(fL);
                lh7 lh7Var2 = (lh7) obj2;
                float fFloatValue2 = lh7Var2 != null ? ((Number) lh7Var2.getValue()).floatValue() : 1.0f;
                boolean z = x77Var.b() && ((Boolean) ((rh5) d6Var.h0).getValue()).booleanValue();
                float fL2 = fFloatValue2 * (z ? nh5Var.l() : 1.0f);
                if (x77Var.b()) {
                    x77Var.g = fL2;
                    if (z) {
                        nh5Var.l();
                    }
                    if (z) {
                        vu8 vu8Var = x77Var.j;
                        if (vu8Var == null) {
                            vu8Var = new vu8(false);
                            x77Var.j = vu8Var;
                        }
                        r06 r06Var = bh1.a;
                        vu8Var.a(fL2, gx1.d(ka8.b(x77Var.d)));
                    }
                }
                pk6Var.g(fL2);
                pk6Var.h(fL2);
                lh7 lh7Var3 = (lh7) obj4;
                long j = lh7Var3 != null ? ((gd8) lh7Var3.getValue()).a : gd8.b;
                if (x77Var.b() && ((Boolean) ((rh5) d6Var.j0).getValue()).booleanValue()) {
                    j = ((gd8) ((rh5) d6Var.Z).getValue()).a;
                }
                if (x77Var.b()) {
                    x77Var.h = j;
                }
                pk6Var.m(j);
                return dn8.a;
            default:
                h62 h62Var = (h62) obj4;
                int iOrdinal = ((r12) obj).ordinal();
                gd8 gd8Var = null;
                if (iOrdinal == 0) {
                    qw6 qw6Var = ((g22) obj2).a.d;
                    if (qw6Var != null) {
                        gd8Var = new gd8(qw6Var.b);
                    } else {
                        qw6 qw6Var2 = h62Var.a.d;
                        if (qw6Var2 != null) {
                            gd8Var = new gd8(qw6Var2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    gd8Var = (gd8) obj3;
                } else {
                    if (iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    qw6 qw6Var3 = h62Var.a.d;
                    gd8Var = new gd8(qw6Var3 != null ? qw6Var3.b : x77Var.h);
                }
                return new gd8(gd8Var != null ? gd8Var.a : gd8.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x12(gd8 gd8Var, g22 g22Var, h62 h62Var, x77 x77Var) {
        super(1);
        this.f0 = gd8Var;
        this.g0 = g22Var;
        this.h0 = h62Var;
        this.Z = x77Var;
    }
}
