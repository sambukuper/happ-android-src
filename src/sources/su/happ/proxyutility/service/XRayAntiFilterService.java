package su.happ.proxyutility.service;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.os.LocaleList;
import defpackage.pz7;
import defpackage.ss8;
import defpackage.vh;
import defpackage.w47;
import defpackage.x59;
import defpackage.x79;
import go.Seq;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import libxray.XRayPoint;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/service/XRayAntiFilterService;", "Landroid/app/Service;", "Lw47;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class XRayAntiFilterService extends Service implements w47 {
    public long X = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ContextWrapper contextWrapper;
        if (context != null) {
            ss8 ss8Var = ss8.a;
            Locale localeN = ss8.n();
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocale(localeN);
            LocaleList localeList = new LocaleList(localeN);
            LocaleList.setDefault(localeList);
            configuration.setLocales(localeList);
            context.createConfigurationContext(configuration);
            if (pz7.a()) {
                configuration.uiMode = (configuration.uiMode & (-16)) | 4;
            }
            contextWrapper = new ContextWrapper(context);
        } else {
            contextWrapper = null;
        }
        super.attachBaseContext(contextWrapper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    public final void b() {
        stopSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getX() {
        return this.X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    /* JADX INFO: renamed from: i */
    public final boolean getL0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        XRayPoint xRayPoint = x59.a;
        SoftReference softReference = new SoftReference(this);
        x59.c = softReference;
        w47 w47Var = (w47) softReference.get();
        Seq.setContext(w47Var != null ? w47Var.g().getApplicationContext() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onDestroy() {
        w47 w47Var;
        w47 w47Var2;
        super.onDestroy();
        SoftReference softReference = x59.c;
        if (softReference == null || (w47Var = (w47) softReference.get()) == null) {
            return;
        }
        Service serviceG = w47Var.g();
        if (x59.a.getIsRunning()) {
            jm4.Q(x59.e, tp1.a, new vh(2, null, (byte) 6), 2);
        }
        try {
            Intent intent = new Intent();
            intent.setAction("su.happ.proxyutility.action.activity");
            intent.setPackage("su.happ.proxyutility");
            intent.putExtra("key", 43);
            intent.putExtra("content", (Serializable) "");
            serviceG.sendBroadcast(intent);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        SoftReference softReference2 = x59.c;
        if (softReference2 != null && (w47Var2 = (w47) softReference2.get()) != null) {
            w47Var2.g().stopForeground(1);
        }
        try {
            serviceG.unregisterReceiver(x59.b);
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Serializable] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Object stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        String stringExtra5;
        this.X = System.currentTimeMillis();
        u15.A(this);
        String stringExtra6 = intent != null ? intent.getStringExtra("type") : null;
        if (dh3.f(stringExtra6, "array")) {
            String[] stringArrayExtra = intent.getStringArrayExtra("packet");
            if (stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                }
                stringExtra = (Integer[]) arrayList.toArray(new Integer[0]);
            } else {
                stringExtra = null;
            }
        } else if (intent != null) {
            stringExtra = intent.getStringExtra("packet");
        } else {
            stringExtra = null;
        }
        ?? r5 = stringExtra;
        XRayPoint xRayPoint = x59.a;
        if (intent == null || (stringExtra2 = intent.getStringExtra("packets")) == null) {
            stringExtra2 = "tlshello";
        }
        if (intent == null || (stringExtra3 = intent.getStringExtra("length")) == null) {
            stringExtra3 = "50-100";
        }
        if (intent == null || (stringExtra4 = intent.getStringExtra("delay")) == null) {
            stringExtra4 = "10-20";
        }
        if (intent == null || (stringExtra5 = intent.getStringExtra("max_split")) == null) {
            stringExtra5 = "100-200";
        }
        LinkedHashMap linkedHashMapC = XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.c(stringExtra5, stringExtra4, stringExtra3, stringExtra2);
        List listK = i21.K(new XRayConfig.OutboundBean.OutSettingsBean.NoisesBean(stringExtra6, intent != null ? intent.getStringExtra("rand") : null, intent != null ? intent.getStringExtra("rand_range") : null, intent != null ? intent.getStringExtra("delay") : null, r5));
        HashMap map = intent != null ? (HashMap) x79.c(intent, "dnsMapping", HashMap.class) : null;
        HashMap map2 = map != null ? map : null;
        if (map2 == null) {
            map2 = new HashMap();
        }
        x59.a(linkedHashMapC, listK, map2);
        return 1;
    }

    @Override // defpackage.w47
    public final Service g() {
        return this;
    }

    @Override // defpackage.w47
    public final void j(ServerConfig serverConfig) {
    }
}
