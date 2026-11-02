package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru1 implements gn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ float Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ ru1(float f, aa6 aa6Var) {
        this.Y = f;
        this.Z = aa6Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        boolean z;
        byte b = this.X;
        boolean z2 = false;
        float f = this.Y;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                aa6 aa6Var = (aa6) obj2;
                hv1 hv1Var = (hv1) obj;
                boolean zF = dh3.f(hv1Var.Q(), "waiting");
                if (hv1Var.a0() == null) {
                    z = false;
                } else {
                    sd5 sd5VarA0 = hv1Var.a0();
                    sd5VarA0.getClass();
                    iv1 iv1Var = jv1.a;
                    if (sd5VarA0 != sd5.Y ? f <= 30.0f || f > 90.0f : f > 30.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (aa6Var.X || (zF && z)) {
                    z2 = true;
                }
                aa6Var.X = z2;
                return Boolean.valueOf(!z2);
            default:
                ce8 ce8Var = (ce8) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = ce8Var.g();
                ph5 ph5Var = ce8Var.h;
                if (!zG) {
                    if (ph5Var.l() == Long.MIN_VALUE) {
                        ph5Var.m(jLongValue);
                        ce8Var.a.a.setValue(Boolean.TRUE);
                    }
                    long jL = jLongValue - ph5Var.l();
                    if (f != 0.0f) {
                        jL = nr4.P(jL / ((double) f));
                    }
                    if (ce8Var.b == null) {
                        ce8Var.g.m(jL);
                    }
                    ce8Var.h(jL, f == 0.0f);
                }
                return dn8.a;
        }
    }

    public /* synthetic */ ru1(ce8 ce8Var, float f) {
        this.Z = ce8Var;
        this.Y = f;
    }
}
