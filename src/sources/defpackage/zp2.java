package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zp2 implements Comparable {
    public final short X;
    public final a39 Y;
    public final boolean Z;

    /* JADX WARN: Multi-variable type inference failed */
    public zp2(int i, a39 a39Var, boolean z) {
        this.X = i;
        this.Y = a39Var;
        this.Z = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.X - ((zp2) obj).X;
    }
}
