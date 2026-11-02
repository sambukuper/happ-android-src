package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class om8 extends hm8 {
    public final /* synthetic */ byte a;
    public final int b;

    public /* synthetic */ om8(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    @Override // defpackage.qm8
    public final int a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return this.b;
    }

    @Override // defpackage.qm8
    public final char b() {
        switch (this.a) {
            case 0:
                return 'U';
            case 1:
                return 'G';
            case 2:
                return 'M';
            case 3:
                return 'Q';
            case 4:
                return 'r';
            case 5:
                return 'L';
            case 6:
                return 'q';
            case 7:
                return 'u';
            default:
                return 'y';
        }
    }

    @Override // defpackage.hm8
    public final void c(zb1 zb1Var) {
        d(zb1Var);
    }

    public final void d(bc1 bc1Var) {
        byte b = this.a;
        dg5 dg5Var = dg5.X;
        dg5 dg5Var2 = dg5.Y;
        int i = this.b;
        switch (b) {
            case 0:
                vm8.f("cyclic-year", null);
                throw null;
            case 1:
                vm8.c(this);
                throw null;
            case 2:
                if (i == 1) {
                    bc1Var.e(dg5Var);
                    return;
                }
                if (i == 2) {
                    bc1Var.e(dg5Var2);
                    return;
                } else {
                    if (i == 3 || i == 4 || i == 5) {
                        vm8.c(this);
                        throw null;
                    }
                    vm8.e(this);
                    throw null;
                }
            case 3:
                if (i == 1 || i == 2) {
                    vm8.f("quarter-of-year", null);
                    throw null;
                }
                if (i == 3 || i == 4 || i == 5) {
                    vm8.c(this);
                    throw null;
                }
                vm8.e(this);
                throw null;
            case 4:
                vm8.f("related-gregorian-year", null);
                throw null;
            case 5:
                if (i == 1) {
                    bc1Var.e(dg5Var);
                    return;
                }
                if (i == 2) {
                    bc1Var.e(dg5Var2);
                    return;
                } else {
                    if (i == 3 || i == 4 || i == 5) {
                        vm8.c(this);
                        throw null;
                    }
                    vm8.e(this);
                    throw null;
                }
            case 6:
                if (i == 1 || i == 2) {
                    vm8.f("standalone-quarter-of-year", null);
                    throw null;
                }
                if (i == 3 || i == 4 || i == 5) {
                    vm8.c(this);
                    throw null;
                }
                vm8.e(this);
                throw null;
            case 7:
                if (i == 1) {
                    bc1Var.d(dg5Var);
                    return;
                }
                if (i == 2) {
                    ((p3) bc1Var).h(new c30(new y96(false)));
                    return;
                }
                if (i == 3) {
                    vm8.g(this, i);
                    throw null;
                }
                if (i == 4) {
                    bc1Var.d(dg5Var2);
                    return;
                } else {
                    vm8.g(this, i);
                    throw null;
                }
            default:
                if (i == 1) {
                    hb3 hb3Var = d79.a;
                    ((p3) bc1Var).h(new c30(new s69(dg5Var, true)));
                    return;
                }
                if (i == 2) {
                    hb3 hb3Var2 = d79.a;
                    ((p3) bc1Var).h(new c30(new y96(true)));
                    return;
                } else {
                    if (i == 3) {
                        vm8.g(this, i);
                        throw null;
                    }
                    if (i != 4) {
                        vm8.g(this, i);
                        throw null;
                    }
                    hb3 hb3Var3 = d79.a;
                    ((p3) bc1Var).h(new c30(new s69(dg5Var2, true)));
                    return;
                }
        }
    }
}
