package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gm8 extends hm8 {
    public final /* synthetic */ byte a;
    public final int b;

    public /* synthetic */ gm8(byte b, int i) {
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
            case 8:
                break;
        }
        return this.b;
    }

    @Override // defpackage.qm8
    public final char b() {
        switch (this.a) {
            case 0:
                return 'd';
            case 1:
                return 'E';
            case 2:
                return 'F';
            case 3:
                return 'D';
            case 4:
                return 'e';
            case 5:
                return 'g';
            case 6:
                return 'c';
            case 7:
                return 'Y';
            case 8:
                return 'W';
            default:
                return 'w';
        }
    }

    @Override // defpackage.hm8
    public final void c(zb1 zb1Var) {
        byte b = this.a;
        dg5 dg5Var = dg5.X;
        dg5 dg5Var2 = dg5.Y;
        int i = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    zb1Var.g(dg5Var);
                    return;
                } else if (i == 2) {
                    zb1Var.g(dg5Var2);
                    return;
                } else {
                    vm8.e(this);
                    throw null;
                }
            case 1:
                vm8.c(this);
                throw null;
            case 2:
                vm8.f("day-of-week-in-month", null);
                throw null;
            case 3:
                if (i == 1) {
                    ((n3) zb1Var).l(new c30(new vc1(dg5Var)));
                    return;
                } else if (i == 3) {
                    ((n3) zb1Var).l(new c30(new vc1(dg5Var2)));
                    return;
                } else {
                    vm8.e(this);
                    throw null;
                }
            case 4:
                vm8.c(this);
                throw null;
            case 5:
                vm8.f("modified-julian-day", null);
                throw null;
            case 6:
                vm8.c(this);
                throw null;
            case 7:
                vm8.f("week-based-year", null);
                throw null;
            case 8:
                vm8.f("week-of-month", null);
                throw null;
            default:
                vm8.f("week-of-week-based-year", null);
                throw null;
        }
    }
}
