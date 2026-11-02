package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bd5 implements p85 {
    public final int X;
    public final int Y;

    public bd5(int i, int i2) {
        if (i <= 0) {
            bt.q("count must be greater than 0");
            throw null;
        }
        if (i2 <= 0) {
            bt.q("skip must be greater than 0");
            throw null;
        }
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.cn2
    public final Object a(Object obj) {
        aq7 aq7Var = (aq7) obj;
        int i = this.Y;
        int i2 = this.X;
        if (i == i2) {
            xc5 xc5Var = new xc5(aq7Var, i2);
            aq7Var.X.b(xc5Var);
            aq7Var.f(new y45(xc5Var));
            return xc5Var;
        }
        if (i > i2) {
            ad5 ad5Var = new ad5(aq7Var, i2, i);
            aq7Var.X.b(ad5Var);
            aq7Var.f(new yc5(ad5Var, (byte) 1));
            return ad5Var;
        }
        zc5 zc5Var = new zc5(aq7Var, i2, i);
        aq7Var.X.b(zc5Var);
        aq7Var.f(new yc5(zc5Var, (byte) 0));
        return zc5Var;
    }
}
