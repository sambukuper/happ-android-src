package su.happ.proxyutility.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.gson.a;
import kotlin.Metadata;
import su.happ.proxyutility.dto.AlertMessageData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.AlertType;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"su/happ/proxyutility/util/AlertUtil$mMsgReceiver$1", "Landroid/content/BroadcastReceiver;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class AlertUtil$mMsgReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ o8 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AlertUtil$mMsgReceiver$1(o8 o8Var) {
        this.a = o8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
        if (numValueOf == null || numValueOf.intValue() != 122 || (stringExtra = intent.getStringExtra("content")) == null || stringExtra.length() == 0) {
            return;
        }
        o8 o8Var = this.a;
        if (o8Var.Y) {
            if (!mm7.Z(stringExtra, false, "data:")) {
                BaseActivity baseActivity = (BaseActivity) o8Var.Z;
                if (baseActivity != null) {
                    be.m(baseActivity, (String) null, stringExtra, (String) null, (String) null, (String) null, (Integer) null, new x((byte) 6), (dn2) null, 1524);
                    return;
                }
                return;
            }
            AlertMessageData alertMessageData = (AlertMessageData) new a().c(stringExtra.substring(5), new yi8(AlertMessageData.class));
            if (alertMessageData != null) {
                String title = alertMessageData.getTitle();
                String message = alertMessageData.getMessage();
                String button = alertMessageData.getButton();
                AlertType type = alertMessageData.getType();
                title.getClass();
                message.getClass();
                button.getClass();
                type.getClass();
                BaseActivity baseActivity2 = (BaseActivity) o8Var.Z;
                if (baseActivity2 != null) {
                    be.m(baseActivity2, title, message, (String) null, button, (String) null, Integer.valueOf(type.getLayoutRes()), (dn2) null, (dn2) null, 1872);
                }
            }
        }
    }
}
