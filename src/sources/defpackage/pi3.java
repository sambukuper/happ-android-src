package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pi3 extends oi3 {
    public static final SparseIntArray q0;
    public long p0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        q0 = sparseIntArray;
        sparseIntArray.put(e46.ll_warning, 1);
        sparseIntArray.put(e46.config_activated, 2);
        sparseIntArray.put(e46.iv_warning_triangle, 3);
        sparseIntArray.put(e46.tv_warning_title, 4);
        sparseIntArray.put(e46.tv_warning_description, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this) {
            this.p0 = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.p0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
