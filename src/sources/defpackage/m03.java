package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m03 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public m03(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + z85.h(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + z85.h(this.d) + ")";
    }
}
