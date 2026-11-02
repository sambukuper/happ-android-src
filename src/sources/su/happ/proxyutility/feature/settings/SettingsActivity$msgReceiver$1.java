package su.happ.proxyutility.feature.settings;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a23;
import defpackage.be;
import defpackage.pu;
import defpackage.ss8;
import defpackage.t46;
import defpackage.y46;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"su/happ/proxyutility/feature/settings/SettingsActivity$msgReceiver$1", "Landroid/content/BroadcastReceiver;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SettingsActivity$msgReceiver$1 extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ SettingsActivity a;

    public SettingsActivity$msgReceiver$1(SettingsActivity settingsActivity) {
        this.a = settingsActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
        SettingsActivity settingsActivity = this.a;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            ss8 ss8Var = ss8.a;
            String strJ = ss8.j(settingsActivity);
            be.m(settingsActivity, settingsActivity.getString(y46.report_sending_title), settingsActivity.getString(y46.report_sending_hwid, strJ), null, settingsActivity.getString(R.string.ok), null, Integer.valueOf(t46.dialog_alert_report), new a23((Object) settingsActivity, (Object) strJ, (byte) 18), null, 1360);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            pu.M(settingsActivity, y46.report_sending_failure);
        }
    }
}
