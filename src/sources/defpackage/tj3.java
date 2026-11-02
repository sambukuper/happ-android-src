package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class tj3 implements pr5 {
    public static final /* synthetic */ nw3[] e = {new lx5(tj3.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};
    public final fk2 a;
    public final ke7 b;
    public final te4 c;
    public final ka6 d;

    public tj3(z47 z47Var, ja6 ja6Var, fk2 fk2Var) {
        z47Var.getClass();
        c6 c6Var = (c6) z47Var.Y;
        fk2Var.getClass();
        this.a = fk2Var;
        this.b = ja6Var != null ? lh4.Z0(ja6Var) : ke7.G;
        this.c = new te4((ve4) c6Var.f0, new c3((Object) z47Var, (Object) this, (byte) 16));
        this.d = ja6Var != null ? (ka6) wv0.s0(ja6Var.b()) : null;
    }

    @Override // defpackage.gm
    public final t14 c() {
        Object objE0 = hi5.e0(this.c, e[0]);
        objE0.getClass();
        return (aa7) objE0;
    }

    @Override // defpackage.gm
    public final fk2 d() {
        return this.a;
    }

    @Override // defpackage.gm
    public Map e() {
        return e02.X;
    }

    @Override // defpackage.gm
    public final ke7 getSource() {
        return this.b;
    }
}
