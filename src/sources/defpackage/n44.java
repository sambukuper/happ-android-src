package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n44 implements sm {
    public final z47 X;
    public final vj3 Y;
    public final boolean Z;
    public final vt1 f0;

    public n44(z47 z47Var, vj3 vj3Var, boolean z) {
        z47Var.getClass();
        vj3Var.getClass();
        this.X = z47Var;
        this.Y = vj3Var;
        this.Z = z;
        this.f0 = ((ve4) ((c6) z47Var.Y).f0).c(new f0(this, (byte) 19));
    }

    @Override // defpackage.sm
    public final boolean isEmpty() {
        return this.Y.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        vj3 vj3Var = this.Y;
        md8 md8VarL0 = w27.l0(wv0.l0(vj3Var.getAnnotations()), this.f0);
        v15 v15Var = uj3.a;
        return new ka2(new la2(w27.g0(eu.Y(new u27[]{md8VarL0, new hu(uj3.a(tg7.m, vj3Var, this.X), (byte) 5)})), false, new zx6((byte) 6)));
    }

    @Override // defpackage.sm
    public final /* bridge */ boolean k(fk2 fk2Var) {
        return z39.y(this, fk2Var);
    }

    @Override // defpackage.sm
    public final gm p(fk2 fk2Var) {
        gm gmVar;
        fk2Var.getClass();
        vj3 vj3Var = this.Y;
        ja6 ja6VarA = vj3Var.a(fk2Var);
        if (ja6VarA != null && (gmVar = (gm) this.f0.B(ja6VarA)) != null) {
            return gmVar;
        }
        v15 v15Var = uj3.a;
        return uj3.a(fk2Var, vj3Var, this.X);
    }
}
