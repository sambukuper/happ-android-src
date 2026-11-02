package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zk2 extends yk2 {
    public static final SparseIntArray C0;
    public long B0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(e46.ll_flows, 1);
        sparseIntArray.put(e46.ll_browser_flow, 2);
        sparseIntArray.put(e46.tv_browser_code, 3);
        sparseIntArray.put(e46.tv_or, 4);
        sparseIntArray.put(e46.ll_qr_flow, 5);
        sparseIntArray.put(e46.tv_qr_description, 6);
        sparseIntArray.put(e46.img_share_qr_content, 7);
        sparseIntArray.put(e46.ll_texts_with_buttons, 8);
        sparseIntArray.put(e46.tv_title, 9);
        sparseIntArray.put(e46.space_title_description, 10);
        sparseIntArray.put(e46.tv_description, 11);
        sparseIntArray.put(e46.btn_back_skip, 12);
        sparseIntArray.put(e46.space_back_web_input, 13);
        sparseIntArray.put(e46.btn_web_input, 14);
        sparseIntArray.put(e46.rl_loader, 15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public zk2(View view) {
        Object[] objArrE = kw8.e(view, 16, C0);
        HappTextButton happTextButton = (HappTextButton) objArrE[12];
        HappTextButton happTextButton2 = (HappTextButton) objArrE[14];
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrE[7];
        LinearLayout linearLayout = (LinearLayout) objArrE[2];
        LinearLayout linearLayout2 = (LinearLayout) objArrE[1];
        super(view, happTextButton, happTextButton2, appCompatImageView, linearLayout, linearLayout2, (LinearLayout) objArrE[8], (RelativeLayout) objArrE[15], (Space) objArrE[13], (Space) objArrE[10], (HappTextView) objArrE[3], (HappTextView) objArrE[11], (HappTextView) objArrE[4], (HappTextView) objArrE[6], (HappTextView) objArrE[9]);
        this.B0 = -1L;
        ((RelativeLayout) objArrE[0]).setTag(null);
        g(view);
        synchronized (this) {
            this.B0 = 1L;
        }
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this) {
            this.B0 = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.B0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
