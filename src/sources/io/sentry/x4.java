package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 implements b5 {
    public final b5 a;

    public x4() {
        if (io.sentry.util.k.a || !io.sentry.util.k.b) {
            this.a = new p5((byte) 1);
        } else {
            this.a = new p5((byte) 0);
        }
    }

    @Override // io.sentry.b5
    public final a5 a() {
        return this.a.a();
    }
}
