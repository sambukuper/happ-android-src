package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tj0 {
    public static final qv a = nr4.f(0);

    public static final rj0 a(nj0 nj0Var) {
        try {
            Trace.beginSection("CameraPipe");
            return new rj0(new r91(new wl6(nj0Var, (byte) 16), new b8(nj0Var.b)));
        } finally {
            Trace.endSection();
        }
    }
}
