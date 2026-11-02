package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class h6 extends kw8 {
    public static final SparseIntArray q0;
    public final RelativeLayout m0;
    public final RelativeLayout n0;
    public final Toolbar o0;
    public long p0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        q0 = sparseIntArray;
        sparseIntArray.put(e46.toolbar, 1);
        sparseIntArray.put(e46.ll_main, 2);
        sparseIntArray.put(e46.title_category, 3);
        sparseIntArray.put(e46.rl_reset_user_settings, 4);
        sparseIntArray.put(e46.tv_reset_user_settings, 5);
        sparseIntArray.put(e46.tv_reset_user_settings_description, 6);
        sparseIntArray.put(e46.rl_reset_settings, 7);
        sparseIntArray.put(e46.tv_reset_settings, 8);
        sparseIntArray.put(e46.tv_reset_settings_description, 9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(View view) {
        super(view, (Object) null);
        Object[] objArrE = kw8.e(view, 10, q0);
        RelativeLayout relativeLayout = (RelativeLayout) objArrE[7];
        RelativeLayout relativeLayout2 = (RelativeLayout) objArrE[4];
        Toolbar toolbar = (Toolbar) objArrE[1];
        this.m0 = relativeLayout;
        this.n0 = relativeLayout2;
        this.o0 = toolbar;
        this.p0 = -1L;
        ((LinearLayout) objArrE[0]).setTag(null);
        g(view);
        synchronized (this) {
            this.p0 = 1L;
        }
        f();
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
