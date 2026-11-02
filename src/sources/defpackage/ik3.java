package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ik3 implements wd0 {
    public final /* synthetic */ jk3 a;

    public ik3(jk3 jk3Var) {
        this.a = jk3Var;
    }

    @Override // defpackage.wd0
    public final List a() {
        return d02.X;
    }

    @Override // defpackage.wd0
    public final Member b() {
        return null;
    }

    @Override // defpackage.wd0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.wd0
    public final Object d(Object[] objArr) {
        l22 l22Var = this.a.Z;
        int length = objArr.length;
        if (length == 0) {
            return l22Var;
        }
        bt.q(ie2.h("Callable expects 0 arguments, but ", length, " were provided."));
        return null;
    }

    @Override // defpackage.wd0
    public final Type j() {
        pw3 pw3VarJ = this.a.j();
        pw3VarJ.getClass();
        if (pw3VarJ instanceof u1) {
            tb6 tb6Var = ((u1) pw3VarJ).X;
            Type type = tb6Var != null ? (Type) tb6Var.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return vj8.v(pw3VarJ, false);
    }
}
