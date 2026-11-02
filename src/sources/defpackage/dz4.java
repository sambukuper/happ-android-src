package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dz4 implements fi1 {
    public x78 X;
    public final /* synthetic */ ez4 Y;

    public dz4(ez4 ez4Var) {
        this.Y = ez4Var;
    }

    @Override // defpackage.fi1
    public final float G0(long j) {
        if (!v88.d(j)) {
            return getDensity() * A(j);
        }
        ez4 ez4Var = this.Y;
        if (v88.d(ez4Var.l.a.b)) {
            bt.i("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return 0.0f;
        }
        if (v88.a(ez4Var.l.a.b, v88.c)) {
            bt.i("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            return 0.0f;
        }
        return v88.c(j) * G0(ez4Var.l.a.b);
    }

    public final x78 a(long j, long j2) {
        long jH;
        ez4 ez4Var = this.Y;
        o88 o88Var = ez4Var.l;
        long jA = v88.d(j2) ? fz4.a(ez4Var.l.a.b, j2) : j2;
        if (!v88.a(jA, ez4Var.l.a.b)) {
            ez4Var.f(o88.a(ez4Var.l, 0L, jA, null, null, 0L, 0L, null, 16777213));
        }
        if (ez4Var.f > 1) {
            z24 z24Var = ez4Var.n;
            z24Var.getClass();
            jH = ez4Var.h(j, z24Var);
        } else {
            jH = j;
        }
        z24 z24Var2 = ez4Var.n;
        z24Var2.getClass();
        bz4 bz4VarB = ez4Var.b(jH, z24Var2);
        z24 z24Var3 = ez4Var.n;
        z24Var3.getClass();
        x78 x78VarG = ez4Var.g(z24Var3, jH, bz4VarB);
        this.X = x78VarG;
        ez4Var.f(o88Var);
        return x78VarG;
    }

    @Override // defpackage.fi1
    public final float b0() {
        fi1 fi1Var = this.Y.k;
        fi1Var.getClass();
        return fi1Var.b0();
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        fi1 fi1Var = this.Y.k;
        fi1Var.getClass();
        return fi1Var.getDensity();
    }
}
