package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class n32 implements et4 {
    public final String b;

    public n32(o32 o32Var, String... strArr) {
        String str = o32Var.X;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.et4
    public Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return d02.X;
    }

    @Override // defpackage.et4
    public Set c() {
        return m02.X;
    }

    @Override // defpackage.et4
    public Set d() {
        return m02.X;
    }

    @Override // defpackage.et4
    public ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        return new e32(v15.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{v15Var}, 1))));
    }

    @Override // defpackage.et4
    public Set g() {
        return m02.X;
    }

    @Override // defpackage.et4
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        e32 e32Var = u32.c;
        e32Var.getClass();
        h32 h32Var = new h32(e32Var, null, oy1.f0, v15.g("<Error function>"), 1, ke7.G);
        q32 q32VarC = u32.c(s32.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        fx4 fx4Var = fx4.f0;
        fl1 fl1Var = gl1.e;
        d02 d02Var = d02.X;
        h32Var.L0(null, null, d02Var, d02Var, d02Var, q32VarC, fx4Var, fl1Var);
        return w45.U(h32Var);
    }

    @Override // defpackage.et4
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return u32.f;
    }

    public String toString() {
        return oi0.o(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
