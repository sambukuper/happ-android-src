package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 {
    public final byte a;
    public final long b;
    public final Throwable c;

    public fk0(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof vl0) {
            this.a = (byte) 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof pc3)) {
            this.a = (byte) 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof kl0) {
            this.a = (byte) 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = (byte) 1;
        } else {
            this.a = (byte) 0;
        }
    }
}
