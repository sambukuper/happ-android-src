package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jm8 extends nm8 {
    public final /* synthetic */ byte a;
    public final int b;

    public /* synthetic */ jm8(byte b, int i) {
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
        }
        return this.b;
    }

    @Override // defpackage.qm8
    public final char b() {
        switch (this.a) {
            case 0:
                return 'h';
            case 1:
                return 'a';
            case 2:
                return 'H';
            default:
                return 'm';
        }
    }

    @Override // defpackage.nm8
    public final void c(ac1 ac1Var) {
        byte b = this.a;
        dg5 dg5Var = dg5.X;
        dg5 dg5Var2 = dg5.Y;
        int i = this.b;
        switch (b) {
            case 0:
                vm8.c(this);
                throw null;
            case 1:
                vm8.c(this);
                throw null;
            case 2:
                if (i == 1) {
                    ac1Var.b(dg5Var);
                    return;
                } else if (i == 2) {
                    ac1Var.b(dg5Var2);
                    return;
                } else {
                    vm8.e(this);
                    throw null;
                }
            default:
                if (i == 1) {
                    ac1Var.f(dg5Var);
                    return;
                } else if (i == 2) {
                    ac1Var.f(dg5Var2);
                    return;
                } else {
                    vm8.e(this);
                    throw null;
                }
        }
    }
}
