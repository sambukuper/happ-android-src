package defpackage;

import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e32 extends ms0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public e32(v15 v15Var) {
        u32 u32Var = u32.a;
        i32 i32Var = u32.b;
        me4 me4Var = ve4.e;
        fx4 fx4Var = fx4.f0;
        us0 us0Var = us0.X;
        List list = d02.X;
        super(i32Var, v15Var, fx4Var, us0Var, list, me4Var);
        gs0 gs0Var = new gs0(this, null, oy1.f0, true, 1, ke7.G);
        gs0Var.U0(list, gl1.e);
        String str = gs0Var.getName().X;
        str.getClass();
        n32 n32VarB = u32.b(o32.SCOPE_FOR_ERROR_CLASS, str, _UrlKt.FRAGMENT_ENCODE_SET);
        s32 s32Var = s32.ERROR_CLASS;
        gs0Var.k0 = new q32(u32.d(s32Var, new String[0]), n32VarB, s32Var, list, false, new String[0]);
        B0(n32VarB, w45.U(gs0Var), gs0Var);
    }

    @Override // defpackage.m0
    /* JADX INFO: renamed from: A0 */
    public final sx4 g(wi8 wi8Var) {
        wi8Var.getClass();
        return this;
    }

    @Override // defpackage.m0, defpackage.ew7
    public final gd1 g(wi8 wi8Var) {
        wi8Var.getClass();
        return this;
    }

    @Override // defpackage.sx4
    public final et4 m0(ui8 ui8Var, z14 z14Var) {
        String str = getName().X;
        str.getClass();
        return u32.b(o32.SCOPE_FOR_ERROR_CLASS, str, ui8Var.toString());
    }

    @Override // defpackage.ms0
    public final String toString() {
        String strB = getName().b();
        strB.getClass();
        return strB;
    }
}
