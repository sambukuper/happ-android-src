package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class w5 extends v5 {
    public static final SparseIntArray u0;
    public long t0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(e46.ll_root, 1);
        sparseIntArray.put(e46.toolbar, 2);
        sparseIntArray.put(e46.ll_main, 3);
        sparseIntArray.put(e46.ll_ip_address, 4);
        sparseIntArray.put(e46.et_ip_address, 5);
        sparseIntArray.put(e46.btn_add, 6);
        sparseIntArray.put(e46.rv_ip_addresses, 7);
        sparseIntArray.put(e46.snackbar_host_root, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public w5(View view) {
        Object[] objArrE = kw8.e(view, 9, u0);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) objArrE[6];
        HappEditText happEditText = (HappEditText) objArrE[5];
        super(view, appCompatImageButton, happEditText, (LinearLayout) objArrE[1], (View) objArrE[7], (HappSnackbarHost) objArrE[8], (Toolbar) objArrE[2]);
        this.t0 = -1L;
        ((RelativeLayout) objArrE[0]).setTag(null);
        g(view);
        synchronized (this) {
            this.t0 = 1L;
        }
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this) {
            this.t0 = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.t0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
