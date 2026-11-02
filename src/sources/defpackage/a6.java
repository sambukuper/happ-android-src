package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDescription;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class a6 extends z5 {
    public static final SparseIntArray D0;
    public long C0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(e46.toolbar, 1);
        sparseIntArray.put(e46.scroll_view, 2);
        sparseIntArray.put(e46.ll_socks, 3);
        sparseIntArray.put(e46.title_socks, 4);
        sparseIntArray.put(e46.if_socks_port, 5);
        sparseIntArray.put(e46.spinner_socks_mode, 6);
        sparseIntArray.put(e46.if_socks_user, 7);
        sparseIntArray.put(e46.if_socks_password, 8);
        sparseIntArray.put(e46.socks_description, 9);
        sparseIntArray.put(e46.ll_http, 10);
        sparseIntArray.put(e46.title_http, 11);
        sparseIntArray.put(e46.toggle_http_enabled, 12);
        sparseIntArray.put(e46.ll_http_params, 13);
        sparseIntArray.put(e46.if_http_port, 14);
        sparseIntArray.put(e46.spinner_http_mode, 15);
        sparseIntArray.put(e46.if_http_user, 16);
        sparseIntArray.put(e46.if_http_password, 17);
        sparseIntArray.put(e46.http_description, 18);
        sparseIntArray.put(e46.snackbar_host_root, 19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public a6(View view) {
        Object[] objArrE = kw8.e(view, 20, D0);
        HappSettingsDescription happSettingsDescription = (HappSettingsDescription) objArrE[18];
        HappInputField happInputField = (HappInputField) objArrE[17];
        HappInputField happInputField2 = (HappInputField) objArrE[14];
        HappInputField happInputField3 = (HappInputField) objArrE[16];
        HappInputField happInputField4 = (HappInputField) objArrE[8];
        HappInputField happInputField5 = (HappInputField) objArrE[5];
        HappInputField happInputField6 = (HappInputField) objArrE[7];
        LinearLayout linearLayout = (LinearLayout) objArrE[13];
        ScrollView scrollView = (ScrollView) objArrE[2];
        HappSnackbarHost happSnackbarHost = (HappSnackbarHost) objArrE[19];
        HappSettingsDescription happSettingsDescription2 = (HappSettingsDescription) objArrE[9];
        HappSpinnerField happSpinnerField = (HappSpinnerField) objArrE[15];
        HappSpinnerField happSpinnerField2 = (HappSpinnerField) objArrE[6];
        super(view, happSettingsDescription, happInputField, happInputField2, happInputField3, happInputField4, happInputField5, happInputField6, linearLayout, scrollView, happSnackbarHost, happSettingsDescription2, happSpinnerField, happSpinnerField2, (HappToggleField) objArrE[12], (Toolbar) objArrE[1]);
        this.C0 = -1L;
        ((RelativeLayout) objArrE[0]).setTag(null);
        g(view);
        synchronized (this) {
            this.C0 = 1L;
        }
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this) {
            this.C0 = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.C0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
