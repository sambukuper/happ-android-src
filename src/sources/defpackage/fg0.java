package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 implements k62, dr8 {
    public final /* synthetic */ byte X;
    public final k05 Y;

    public fg0(byte b) {
        this.X = b;
        switch (b) {
            case 1:
                k05 k05VarJ = k05.j();
                this.Y = k05VarJ;
                zx zxVar = u18.J;
                Class cls = (Class) k05VarJ.a(zxVar, null);
                if (cls != null && !cls.equals(zl0.class)) {
                    b61.l("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                k05VarJ.o(zxVar, zl0.class);
                zx zxVar2 = u18.I;
                if (k05VarJ.a(zxVar2, null) == null) {
                    k05VarJ.o(zxVar2, zl0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.Y = k05.j();
                return;
            default:
                this.Y = k05.j();
                return;
        }
    }

    public gg0 a() {
        return new gg0(qd5.c(this.Y), (byte) 18);
    }

    @Override // defpackage.k62
    public k05 b() {
        switch (this.X) {
            case 0:
                throw null;
            case 1:
            default:
                return this.Y;
            case 2:
                throw null;
        }
    }

    public void c(l11 l11Var) {
        l11Var.getClass();
        for (zx zxVar : l11Var.b()) {
            zxVar.getClass();
            this.Y.l(zxVar, l11Var.i(zxVar), l11Var.d(zxVar));
        }
    }

    @Override // defpackage.dr8
    public er8 d() {
        return new hl7(qd5.c(this.Y));
    }

    public fg0(k05 k05Var) {
        this.X = (byte) 3;
        this.Y = k05Var;
        zx zxVar = u18.J;
        Class cls = (Class) k05Var.a(zxVar, null);
        if (cls != null && !cls.equals(gl7.class)) {
            b61.l("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        k05Var.o(er8.W, gr8.g0);
        k05Var.o(zxVar, gl7.class);
        zx zxVar2 = u18.I;
        if (k05Var.a(zxVar2, null) == null) {
            k05Var.o(zxVar2, gl7.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
