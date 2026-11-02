package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.checkbox.MaterialCheckBox;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class g6 extends kw8 {
    public static final SparseIntArray s0;
    public final HappTextButton m0;
    public final MaterialCheckBox n0;
    public final HappEditText o0;
    public final Toolbar p0;
    public final HappTextView q0;
    public long r0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        s0 = sparseIntArray;
        sparseIntArray.put(e46.toolbar, 1);
        sparseIntArray.put(e46.scroll_main, 2);
        sparseIntArray.put(e46.ll_report_problem, 3);
        sparseIntArray.put(e46.et_report, 4);
        sparseIntArray.put(e46.tv_symbols_indicator, 5);
        sparseIntArray.put(e46.cc_send_data, 6);
        sparseIntArray.put(e46.checkbox_send_data, 7);
        sparseIntArray.put(e46.btn_send, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(View view) {
        super(view, (Object) null);
        Object[] objArrE = kw8.e(view, 9, s0);
        HappTextButton happTextButton = (HappTextButton) objArrE[8];
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) objArrE[7];
        HappEditText happEditText = (HappEditText) objArrE[4];
        Toolbar toolbar = (Toolbar) objArrE[1];
        HappTextView happTextView = (HappTextView) objArrE[5];
        this.m0 = happTextButton;
        this.n0 = materialCheckBox;
        this.o0 = happEditText;
        this.p0 = toolbar;
        this.q0 = happTextView;
        this.r0 = -1L;
        ((LinearLayout) objArrE[0]).setTag(null);
        g(view);
        synchronized (this) {
            this.r0 = 1L;
        }
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this) {
            this.r0 = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.r0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
