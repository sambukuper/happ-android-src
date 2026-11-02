package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class co0 implements bo0 {
    public final ni8 X;
    public d45 Y;

    public co0(ni8 ni8Var) {
        ni8Var.getClass();
        this.X = ni8Var;
        ni8Var.a();
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return false;
    }

    @Override // defpackage.bo0
    public final ni8 F() {
        return this.X;
    }

    @Override // defpackage.lh8
    public final Collection c() {
        ni8 ni8Var = this.X;
        t14 t14VarB = ni8Var.a() == rt8.OUT_VARIANCE ? ni8Var.b() : f().p();
        t14VarB.getClass();
        return i21.K(t14VarB);
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        zz3 zz3VarF = this.X.b().n0().f();
        zz3VarF.getClass();
        return zz3VarF;
    }

    @Override // defpackage.lh8
    public final List g() {
        return d02.X;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.X + ')';
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        return null;
    }
}
