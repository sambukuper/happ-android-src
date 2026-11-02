package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nq8 {
    public final jr8 a;
    public final pr8 b;
    public final qq8 c;
    public final v06 d;
    public final v06 e;
    public final v06 f;
    public final int g;
    public final pv h;
    public final vz7 i;
    public final vz7 j;

    public nq8(jr8 jr8Var, pr8 pr8Var, qq8 qq8Var, v06 v06Var, v06 v06Var2, v06 v06Var3) {
        jr8Var.getClass();
        pr8Var.getClass();
        qq8Var.getClass();
        v06Var.getClass();
        v06Var2.getClass();
        v06Var3.getClass();
        this.a = jr8Var;
        this.b = pr8Var;
        this.c = qq8Var;
        this.d = v06Var;
        this.e = v06Var2;
        this.f = v06Var3;
        qv qvVar = oq8.a;
        qvVar.getClass();
        this.g = qv.b.incrementAndGet(qvVar);
        final byte b = 0;
        this.h = nr4.e(false);
        if (hi5.i0("CXCP")) {
            toString();
        }
        this.i = new vz7(new dn2(this) { // from class: lq8
            public final /* synthetic */ nq8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                nq8 nq8Var = this.Y;
                switch (b2) {
                    case 0:
                        return (or8) nq8Var.d.get();
                    case 1:
                        return (h57) nq8Var.e.get();
                    default:
                        return (en0) nq8Var.f.get();
                }
            }
        });
        final byte b2 = 1;
        this.j = new vz7(new dn2(this) { // from class: lq8
            public final /* synthetic */ nq8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                nq8 nq8Var = this.Y;
                switch (b3) {
                    case 0:
                        return (or8) nq8Var.d.get();
                    case 1:
                        return (h57) nq8Var.e.get();
                    default:
                        return (en0) nq8Var.f.get();
                }
            }
        });
        final byte b3 = 2;
        new vz7(new dn2(this) { // from class: lq8
            public final /* synthetic */ nq8 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b4 = b3;
                nq8 nq8Var = this.Y;
                switch (b4) {
                    case 0:
                        return (or8) nq8Var.d.get();
                    case 1:
                        return (h57) nq8Var.e.get();
                    default:
                        return (en0) nq8Var.f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.g;
    }
}
