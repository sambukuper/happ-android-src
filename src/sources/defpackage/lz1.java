package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 implements kz1 {
    public final int X;
    public int Y = -1;
    public int Z = -1;

    public lz1(int i) {
        this.X = i;
    }

    @Override // defpackage.kz1
    public final boolean r(CharSequence charSequence, int i, int i2, oj8 oj8Var) {
        int i3 = this.X;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.Y = i;
        this.Z = i2;
        return false;
    }

    @Override // defpackage.kz1
    public final Object i() {
        return this;
    }
}
