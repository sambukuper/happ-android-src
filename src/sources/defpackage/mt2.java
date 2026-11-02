package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mt2 extends rt2 {
    public final int b;
    public final boolean c;

    public mt2(int i, boolean z) {
        super("GRAPH_ERROR");
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.rt2
    public final String toString() {
        return this.a + "(cameraError=" + ((Object) ai0.a(this.b)) + ", willAttemptRetry=" + this.c + ')';
    }
}
