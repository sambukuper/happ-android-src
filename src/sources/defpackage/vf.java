package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ vf(b83 b83Var, String str, String str2, gn2 gn2Var, kx4 kx4Var) {
        this.X = (byte) 2;
        this.Y = b83Var;
        this.g0 = str;
        this.Z = str2;
        this.f0 = gn2Var;
        this.h0 = kx4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        int i = 0;
        Object obj2 = this.h0;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        Object obj5 = this.g0;
        Object obj6 = this.Y;
        switch (b) {
            case 0:
                ir5 ir5Var = (ir5) obj6;
                ir5Var.v0.addView(ir5Var, ir5Var.w0);
                ir5Var.n((dn2) obj4, (or5) obj3, (String) obj5, (z24) obj2);
                return new jd(ir5Var, (byte) 1);
            case 1:
                uy4 uy4Var = (uy4) obj6;
                ea6 ea6Var = (ea6) obj4;
                ba6 ba6Var = (ba6) obj3;
                sy6 sy6Var = (sy6) obj5;
                aa6 aa6Var = (aa6) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                qy4 qy4VarG = uy4.g(uy4Var.g);
                if (qy4VarG != null) {
                    mj0 mj0Var = uy4Var.e;
                    long j = qy4VarG.b;
                    long j2 = qy4VarG.a;
                    ((vu8) mj0Var.Y).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((vu8) mj0Var.Z).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    qy4 qy4VarA = ((qy4) ea6Var.X).a(qy4VarG);
                    ea6Var.X = qy4VarA;
                    float fJ = sy6Var.j(sy6Var.f(qy4VarA.a));
                    ba6Var.X = fJ;
                    aa6Var.X = !w79.G(fJ - fFloatValue);
                }
                return Boolean.valueOf(qy4VarG != null);
            default:
                b83 b83Var = (b83) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                gn2 gn2Var = (gn2) obj3;
                kx4 kx4Var = (kx4) obj2;
                y64 y64Var = (y64) obj;
                y64Var.getClass();
                for (Object obj7 : b83Var) {
                    int i2 = i + 1;
                    if (i < 0) {
                        i21.X();
                        throw null;
                    }
                    um6 um6Var = (um6) obj7;
                    y64.a(y64Var, um6Var.c, new zy0(858564590, true, new zv2(um6Var, str, str2, gn2Var, kx4Var, (byte) 2)));
                    if (i != ((z0) b83Var).size() - 1) {
                        y64.a(y64Var, oi0.l("Divider", um6Var.c), new zy0(-2029300151, true, new hr2(kx4Var, (byte) 2)));
                    }
                    i = i2;
                }
                return dn8.a;
        }
    }

    public /* synthetic */ vf(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
        this.h0 = serializable;
    }
}
