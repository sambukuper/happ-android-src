package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vp2 implements Cloneable {
    public final cq2 X;
    public cq2 Y;

    public vp2(cq2 cq2Var) {
        this.X = cq2Var;
        if (cq2Var.g()) {
            bt.q("Default instance must be immutable.");
            throw null;
        }
        this.Y = cq2Var.i();
    }

    public final cq2 a() {
        cq2 cq2VarB = b();
        cq2VarB.getClass();
        if (cq2.f(cq2VarB, true)) {
            return cq2VarB;
        }
        throw new ym8();
    }

    public final cq2 b() {
        boolean zG = this.Y.g();
        cq2 cq2Var = this.Y;
        if (!zG) {
            return cq2Var;
        }
        cq2Var.getClass();
        l06 l06Var = l06.c;
        l06Var.getClass();
        l06Var.a(cq2Var.getClass()).b(cq2Var);
        cq2Var.h();
        return this.Y;
    }

    public final void c() {
        if (this.Y.g()) {
            return;
        }
        cq2 cq2VarI = this.X.i();
        cq2 cq2Var = this.Y;
        l06 l06Var = l06.c;
        l06Var.getClass();
        l06Var.a(cq2VarI.getClass()).a(cq2VarI, cq2Var);
        this.Y = cq2VarI;
    }

    public final Object clone() {
        vp2 vp2Var = (vp2) this.X.c(5);
        vp2Var.Y = b();
        return vp2Var;
    }
}
