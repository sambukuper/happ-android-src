package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDescription;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class x6 extends w6 {
    public static final SparseIntArray G0;
    public long F0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G0 = sparseIntArray;
        sparseIntArray.put(e46.toolbar, 1);
        sparseIntArray.put(e46.scroll_view, 2);
        sparseIntArray.put(e46.ll_main, 3);
        sparseIntArray.put(e46.title_vpn_setting, 4);
        sparseIntArray.put(e46.toggle_local_dns_enabled, 5);
        sparseIntArray.put(e46.divider_local_dns_enabled, 6);
        sparseIntArray.put(e46.if_local_dns_port, 7);
        sparseIntArray.put(e46.divider_local_dns_port, 8);
        sparseIntArray.put(e46.toggle_dns_from_json, 9);
        sparseIntArray.put(e46.divider_dns_from_json, 10);
        sparseIntArray.put(e46.toggle_sniffing_enabled, 11);
        sparseIntArray.put(e46.divider_sniffing_enabled, 12);
        sparseIntArray.put(e46.spinner_vpn_mode, 13);
        sparseIntArray.put(e46.toggle_resolve_server_enabled, 14);
        sparseIntArray.put(e46.divider_resolve_server_dns_ip, 15);
        sparseIntArray.put(e46.if_resolve_server_dns_ip, 16);
        sparseIntArray.put(e46.divider_resolve_server_dns_domain, 17);
        sparseIntArray.put(e46.if_resolve_server_dns_domain, 18);
        sparseIntArray.put(e46.ff_excluded_routes, 19);
        sparseIntArray.put(e46.ll_background_settings, 20);
        sparseIntArray.put(e46.title_background_settings, 21);
        sparseIntArray.put(e46.ff_background_settings, 22);
        sparseIntArray.put(e46.tv_background_settings_description, 23);
        sparseIntArray.put(e46.snackbar_host_root, 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public x6(View view) {
        Object[] objArrE = kw8.e(view, 25, G0);
        HappSettingsDivider happSettingsDivider = (HappSettingsDivider) objArrE[17];
        HappSettingsDivider happSettingsDivider2 = (HappSettingsDivider) objArrE[15];
        HappForwardField happForwardField = (HappForwardField) objArrE[22];
        HappForwardField happForwardField2 = (HappForwardField) objArrE[19];
        HappInputField happInputField = (HappInputField) objArrE[7];
        HappInputField happInputField2 = (HappInputField) objArrE[18];
        HappInputField happInputField3 = (HappInputField) objArrE[16];
        LinearLayout linearLayout = (LinearLayout) objArrE[20];
        LinearLayout linearLayout2 = (LinearLayout) objArrE[3];
        ScrollView scrollView = (ScrollView) objArrE[2];
        HappSnackbarHost happSnackbarHost = (HappSnackbarHost) objArrE[24];
        HappSpinnerField happSpinnerField = (HappSpinnerField) objArrE[13];
        super(view, happSettingsDivider, happSettingsDivider2, happForwardField, happForwardField2, happInputField, happInputField2, happInputField3, linearLayout, linearLayout2, scrollView, happSnackbarHost, happSpinnerField, (HappToggleField) objArrE[9], (HappToggleField) objArrE[5], (HappToggleField) objArrE[14], (HappToggleField) objArrE[11], (Toolbar) objArrE[1], (HappSettingsDescription) objArrE[23]);
        this.F0 = -1L;
        ((RelativeLayout) objArrE[0]).setTag(null);
        g(view);
        synchronized (this) {
            this.F0 = 1L;
        }
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this) {
            this.F0 = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        synchronized (this) {
            try {
                return this.F0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
