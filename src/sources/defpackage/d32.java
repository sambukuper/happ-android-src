package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d32 implements f72 {
    @Override // defpackage.f72
    public final int a() {
        return 2;
    }

    @Override // defpackage.f72
    public final int b(jd0 jd0Var, jd0 jd0Var2, sx4 sx4Var) {
        jd0Var.getClass();
        jd0Var2.getClass();
        if (!(jd0Var2 instanceof dl3)) {
            return 3;
        }
        dl3 dl3Var = (dl3) jd0Var2;
        if (!dl3Var.getTypeParameters().isEmpty()) {
            return 3;
        }
        gf5 gf5VarI = hf5.i(jd0Var, jd0Var2);
        if ((gf5VarI != null ? gf5VarI.b() : 0) != 0) {
            return 3;
        }
        List listL = dl3Var.L();
        listL.getClass();
        md8 md8VarL0 = w27.l0(new hu(listL, (byte) 1), cl1.Z);
        t14 t14Var = dl3Var.k0;
        t14Var.getClass();
        sd2 sd2VarG0 = w27.g0(eu.Y(new u27[]{md8VarL0, new hu(t14Var, (byte) 5)}));
        i44 i44Var = dl3Var.m0;
        rd2 rd2Var = new rd2(w27.g0(eu.Y(new u27[]{sd2VarG0, new hu(i21.M(i44Var != null ? i44Var.c() : null), (byte) 1)})));
        while (rd2Var.hasNext()) {
            t14 t14Var2 = (t14) rd2Var.next();
            if (!t14Var2.l0().isEmpty() && !(t14Var2.q0() instanceof r66)) {
                return 3;
            }
        }
        jd0 jd0VarBuild = (jd0) jd0Var.g(new wi8(new q66()));
        if (jd0VarBuild == null) {
            return 3;
        }
        if (jd0VarBuild instanceof q97) {
            q97 q97Var = (q97) jd0VarBuild;
            if (!q97Var.getTypeParameters().isEmpty()) {
                jd0VarBuild = q97Var.i0().o().build();
                jd0VarBuild.getClass();
            }
        }
        int iB = hf5.c.n(jd0VarBuild, jd0Var2, false).b();
        if (iB != 0) {
            return c32.a[p61.B(iB)] == 1 ? 1 : 3;
        }
        throw null;
    }
}
