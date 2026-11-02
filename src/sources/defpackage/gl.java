package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gl extends vj8 implements Serializable {
    public final transient pi8 B0;
    public final transient yr2 C0;

    public gl(pi8 pi8Var, yr2 yr2Var) {
        this.B0 = pi8Var;
        this.C0 = yr2Var;
    }

    public String A0() {
        return z0().getName() + "#" + L();
    }

    public Member B0() {
        return null;
    }

    @Override // defpackage.vj8
    public final Annotation C(Class cls) {
        yr2 yr2Var = this.C0;
        if (yr2Var == null) {
            return null;
        }
        return yr2Var.a(cls);
    }

    public abstract Object C0(Object obj);

    public final boolean D0(Class[] clsArr) {
        yr2 yr2Var = this.C0;
        if (yr2Var == null || ((HashMap) yr2Var.Y) == null) {
            return false;
        }
        for (Class cls : clsArr) {
            if (((HashMap) yr2Var.Y).containsKey(cls)) {
                return true;
            }
        }
        return false;
    }

    public abstract Class z0();

    public vj8 E0(yr2 yr2Var) {
        return this;
    }
}
