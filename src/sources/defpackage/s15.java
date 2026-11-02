package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s15 {
    public final /* synthetic */ byte a;
    public final pv b;
    public final Object c;

    public s15(o15 o15Var) {
        this.a = (byte) 0;
        o15Var.getClass();
        this.c = o15Var;
        this.b = nr4.e(false);
    }

    public final boolean a() {
        byte b = this.a;
        pv pvVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return pvVar.b();
    }

    public final boolean b() {
        q51 q51Var = null;
        switch (this.a) {
            case 0:
                if (!this.b.a()) {
                    return false;
                }
                ((o15) this.c).m(null);
                return true;
            default:
                if (!this.b.a()) {
                    return false;
                }
                z05 z05Var = (z05) this.c;
                synchronized (z05Var.Z) {
                    int i = z05Var.X - 1;
                    z05Var.X = i;
                    if (i == 0 && !z05Var.Y) {
                        z05Var.h0 = w51.G((b71) z05Var.f0, null, null, new ym7(z05Var, q51Var, (byte) 13), 3);
                    }
                    break;
                }
                return true;
        }
    }

    public s15(z05 z05Var) {
        this.a = (byte) 1;
        this.c = z05Var;
        this.b = nr4.e(false);
    }
}
