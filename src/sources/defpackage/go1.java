package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.GeoFileSearchCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class go1 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ go1(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Uri rj6Var;
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                io1 io1Var = (io1) obj2;
                hm6 hm6Var = (hm6) obj;
                int i = hm6Var.j;
                int i2 = hm6Var.k;
                Rect bounds = hm6Var.getBounds();
                int i3 = bounds.left;
                int i4 = bounds.top;
                int i5 = bounds.right;
                int i6 = bounds.bottom;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                hm6Var.setBounds(0, 0, i, i2);
                hm6Var.draw(new Canvas(bitmapCreateBitmap));
                hm6Var.setBounds(i3, i4, i5, i6);
                try {
                    File file = new File(io1Var.M().getCacheDir(), "qr_codes");
                    file.mkdirs();
                    ss8 ss8Var = ss8.a;
                    File file2 = new File(file, "share_qr_code_" + new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss", ss8.n()).format(Calendar.getInstance().getTime()) + ".png");
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        rj6Var = FileProvider.c(io1Var.N(), "su.happ.proxyutility.provider", file2);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            oc.h(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    rj6Var = new rj6(th3);
                }
                if (rj6Var instanceof rj6) {
                    rj6Var = null;
                }
                Uri uri = rj6Var;
                if (uri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.STREAM", uri);
                    intent.addFlags(1);
                    intent.setType("image/png");
                    tk2 tk2Var = ((qk2) io1Var).w0;
                    if (tk2Var == null) {
                        b61.k("Fragment ", io1Var, " not attached to Activity");
                        return;
                    }
                    tk2Var.C0.startActivity(intent, null);
                }
                io1Var.R(false, false);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ((lr2) obj2).d.B(((GeoFileSearchCache) obj).getValue());
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                Context context = (Context) obj;
                String string = ((HappInfoField) obj2).g0.getText().toString();
                if (string.length() > 0) {
                    ss8 ss8Var2 = ss8.a;
                    ss8.E(context, string);
                    x79.h(context, y46.toast_copied_to_clipboard);
                    return;
                }
                return;
            case 3:
                Context context2 = (Context) obj;
                String strValueOf = String.valueOf(((HappInputField) obj2).g0.getText());
                if (strValueOf.length() > 0) {
                    ss8 ss8Var3 = ss8.a;
                    ss8.E(context2, strValueOf);
                    x79.h(context2, y46.toast_copied_to_clipboard);
                    return;
                }
                return;
            case 4:
                gn2 gn2Var = (gn2) obj;
                SwitchCompat switchCompat = ((HappToggleField) obj2).g0;
                if (switchCompat.isEnabled()) {
                    gn2Var.B(Boolean.valueOf(switchCompat.isChecked()));
                    return;
                }
                return;
            case 5:
                sd3 sd3Var = (sd3) obj2;
                gn2 gn2Var2 = sd3Var.B1;
                Editable text = ((EditText) obj).getText();
                text.getClass();
                gn2Var2.B(fm7.R0(text).toString());
                sd3Var.R(false, false);
                return;
            case 6:
                SnackbarHostActivity snackbarHostActivity = (RoutingRulesActivity) obj2;
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                int i7 = RoutingRulesActivity.X0;
                d8.a0(snackbarHostActivity, new sd3(od3.Z, routeSettingsCache.getName(), new zw2(snackbarHostActivity, routeSettingsCache, (byte) 29)), "InputCustomDialog");
                return;
            case 7:
                pv7 pv7Var = (pv7) obj;
                String guid = pv7Var.a.getGuid();
                guid.getClass();
                lv7 lv7Var = new lv7(guid);
                String str = pv7Var.b;
                str.getClass();
                ((sn2) obj2).x(lv7Var, new mv7(str), Boolean.valueOf(!pv7Var.f));
                return;
            default:
                Intent intent2 = new Intent();
                ServerCache serverCache = ((pv7) obj2).a;
                Intent intentPutExtra = intent2.putExtra("guid", serverCache.getGuid());
                intentPutExtra.getClass();
                EConfigType configType = serverCache.getConfig().getConfigType();
                EConfigType eConfigType = EConfigType.CUSTOM;
                vj4 vj4Var = ((f47) obj).d;
                if (configType == eConfigType) {
                    if (vj4Var != null) {
                        SnackbarHostActivity snackbarHostActivity2 = vj4Var.a;
                        snackbarHostActivity2.startActivity(intentPutExtra.setClass(snackbarHostActivity2, ServerCustomConfigActivity.class));
                        return;
                    }
                    return;
                }
                if (vj4Var != null) {
                    SnackbarHostActivity snackbarHostActivity3 = vj4Var.a;
                    snackbarHostActivity3.startActivity(intentPutExtra.setClass(snackbarHostActivity3, ServerActivity.class));
                    return;
                }
                return;
        }
    }
}
