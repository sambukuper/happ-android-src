package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j64 implements lh7 {
    public final rh5 X;
    public int Y;

    public j64(int i) {
        int i2 = (i / 30) * 30;
        this.X = new rh5(x97.a0(Math.max(i2 - 100, 0), i2 + 130), qe4.v0);
        this.Y = i;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return (kf3) this.X.getValue();
    }
}
