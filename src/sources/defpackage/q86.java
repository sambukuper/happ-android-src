package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q86 implements rs {
    public final uz4 X = new uz4();
    public final j05 Y = new j05();
    public final Object Z;

    public q86(Object obj) {
        this.Z = obj;
    }

    public final void a(ml8 ml8Var, p91 p91Var) {
        Exception exc;
        uz4 uz4Var = this.X;
        int i = uz4Var.b;
        j05 j05Var = new j05();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j05 j05Var2 = this.Y;
            if (i2 >= i) {
                if (i3 != j05Var2.b) {
                    d01.a("Applier operation size mismatch");
                }
                j05Var2.d();
                uz4Var.b = 0;
                ml8Var.o();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (uz4Var.c(i2)) {
                        case 0:
                            ml8Var.l();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            ml8Var.h(j05Var2.g(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            ml8Var.k(uz4Var.c(i4), uz4Var.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    ml8Var.j(uz4Var.c(i4), uz4Var.c(i7), uz4Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            ml8Var.a();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            ml8Var.g(uz4Var.c(i4), j05Var2.g(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                uz4Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objG = j05Var2.g(i3);
                            objG.getClass();
                            ci8.i(2, objG);
                            i3 += 2;
                            ml8Var.p((rn2) objG, j05Var2.g(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = ml8Var.Z;
                            if (obj instanceof jz0) {
                                jz0 jz0Var = (jz0) obj;
                                if (((c15) p91Var.f).j(jz0Var)) {
                                    jz0Var.b();
                                }
                            }
                            j05Var.a(obj);
                            ml8Var.i();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                ml8Var.o();
                throw th;
            }
            exc = e3;
            throw new lz0(j05Var2, j05Var, uz4Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.rs
    public final Object f() {
        return this.Z;
    }

    @Override // defpackage.rs
    public final void g(int i, Object obj) {
        uz4 uz4Var = this.X;
        uz4Var.a(5);
        uz4Var.a(i);
        this.Y.a(obj);
    }

    @Override // defpackage.rs
    public final void h(Object obj) {
        this.X.a(1);
        this.Y.a(obj);
    }

    @Override // defpackage.rs
    public final void i() {
        this.X.a(8);
    }

    @Override // defpackage.rs
    public final void j(int i, int i2, int i3) {
        uz4 uz4Var = this.X;
        uz4Var.a(3);
        uz4Var.a(i);
        uz4Var.a(i2);
        uz4Var.a(i3);
    }

    @Override // defpackage.rs
    public final void k(int i, int i2) {
        uz4 uz4Var = this.X;
        uz4Var.a(2);
        uz4Var.a(i);
        uz4Var.a(i2);
    }

    @Override // defpackage.rs
    public final void l() {
        this.X.a(0);
    }

    @Override // defpackage.rs
    public final void n(int i, Object obj) {
        uz4 uz4Var = this.X;
        uz4Var.a(6);
        uz4Var.a(i);
        this.Y.a(obj);
    }

    @Override // defpackage.rs
    public final void p(rn2 rn2Var, Object obj) {
        this.X.a(7);
        j05 j05Var = this.Y;
        j05Var.a(rn2Var);
        j05Var.a(obj);
    }
}
