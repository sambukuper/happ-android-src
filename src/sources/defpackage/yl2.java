package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yl2 extends xl2 {
    public static final SparseIntArray t0;
    public long s0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        t0 = sparseIntArray;
        sparseIntArray.put(e46.story_image, 1);
        sparseIntArray.put(e46.view, 2);
        sparseIntArray.put(e46.ll_content, 3);
        sparseIntArray.put(e46.tv_story_title, 4);
        sparseIntArray.put(e46.scroll_body, 5);
        sparseIntArray.put(e46.tv_story_body, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this) {
            this.s0 = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.s0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
