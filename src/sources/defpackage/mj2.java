package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mj2 implements Comparable {
    public final int X;
    public final int Y;
    public final String Z;
    public final String f0;

    public mj2(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.X = i;
        this.Y = i2;
        this.Z = str;
        this.f0 = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mj2 mj2Var = (mj2) obj;
        mj2Var.getClass();
        int i = this.X - mj2Var.X;
        return i == 0 ? this.Y - mj2Var.Y : i;
    }
}
