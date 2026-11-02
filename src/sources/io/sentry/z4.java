package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z4 {
    public static final z4 c = new z4();
    public boolean a;
    public final io.sentry.util.a b = new io.sentry.util.a();

    public final void a() {
        io.sentry.util.a aVar = this.b;
        aVar.g();
        try {
            if (!this.a) {
                this.a = true;
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
