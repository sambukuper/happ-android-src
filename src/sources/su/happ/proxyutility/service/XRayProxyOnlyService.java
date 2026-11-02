package su.happ.proxyutility.service;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.IBinder;
import android.os.LocaleList;
import com.tencent.mmkv.MMKV;
import defpackage.c16;
import defpackage.g69;
import defpackage.h69;
import defpackage.j61;
import defpackage.jz8;
import defpackage.kw4;
import defpackage.n67;
import defpackage.n69;
import defpackage.ng8;
import defpackage.pz7;
import defpackage.ri7;
import defpackage.ss8;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import libxray.XRayPoint;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.service.XRayProxyOnlyService;
import su.happ.proxyutility.util.AntiFilterJNIWrapper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/service/XRayProxyOnlyService;", "Landroid/app/Service;", "Lh69;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class XRayProxyOnlyService extends Service implements h69 {
    public static final /* synthetic */ int k0 = 0;
    public final vz7 Y;
    public final vz7 f0;
    public final vz7 g0;
    public AntiFilterJNIWrapper j0;
    public final vz7 X = new vz7(new ng8((byte) 26));
    public final vz7 Z = new vz7(new ng8((byte) 27));
    public final vz7 h0 = new vz7(new ng8((byte) 28));
    public long i0 = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public XRayProxyOnlyService() {
        final byte b = 0;
        this.Y = new vz7(new dn2(this) { // from class: f69
            public final /* synthetic */ XRayProxyOnlyService Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b2 = b;
                XRayProxyOnlyService xRayProxyOnlyService = this.Y;
                switch (b2) {
                    case 0:
                        int i = XRayProxyOnlyService.k0;
                        return new jz8(xRayProxyOnlyService);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = XRayProxyOnlyService.k0;
                        return new j61(xRayProxyOnlyService, (byte) 2);
                    default:
                        int i3 = XRayProxyOnlyService.k0;
                        return new ri7(xRayProxyOnlyService);
                }
            }
        });
        final byte b2 = 1;
        this.f0 = new vz7(new dn2(this) { // from class: f69
            public final /* synthetic */ XRayProxyOnlyService Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b2;
                XRayProxyOnlyService xRayProxyOnlyService = this.Y;
                switch (b3) {
                    case 0:
                        int i = XRayProxyOnlyService.k0;
                        return new jz8(xRayProxyOnlyService);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = XRayProxyOnlyService.k0;
                        return new j61(xRayProxyOnlyService, (byte) 2);
                    default:
                        int i3 = XRayProxyOnlyService.k0;
                        return new ri7(xRayProxyOnlyService);
                }
            }
        });
        final byte b3 = 2;
        this.g0 = new vz7(new dn2(this) { // from class: f69
            public final /* synthetic */ XRayProxyOnlyService Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b4 = b3;
                XRayProxyOnlyService xRayProxyOnlyService = this.Y;
                switch (b4) {
                    case 0:
                        int i = XRayProxyOnlyService.k0;
                        return new jz8(xRayProxyOnlyService);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = XRayProxyOnlyService.k0;
                        return new j61(xRayProxyOnlyService, (byte) 2);
                    default:
                        int i3 = XRayProxyOnlyService.k0;
                        return new ri7(xRayProxyOnlyService);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h69
    public final ri7 a() {
        return (ri7) this.g0.getValue();
    }

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
        AntiFilterJNIWrapper antiFilterJNIWrapper = this.j0;
        if (antiFilterJNIWrapper != null) {
            antiFilterJNIWrapper.b();
        }
        this.j0 = null;
        stopSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getX() {
        return this.i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h69
    public final jz8 e() {
        return (jz8) this.Y.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h69
    public final j61 h() {
        return (j61) this.f0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    /* JADX INFO: renamed from: i */
    public final boolean getL0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    public final void j(ServerConfig serverConfig) {
        String advancedFragment;
        String strI = null;
        if (!n67.e()) {
            if ((serverConfig != null ? serverConfig.getAdvancedFragment() : null) == null) {
                return;
            }
        }
        AntiFilterJNIWrapper antiFilterJNIWrapper = this.j0;
        if (antiFilterJNIWrapper != null) {
            antiFilterJNIWrapper.b();
        }
        this.j0 = null;
        ArrayList arrayListF = i21.f(new String[]{"--no-domain", "--ip", "127.0.0.1", "--port", String.valueOf(n67.a())});
        if (n67.e()) {
            strI = ((MMKV) this.X.getValue()).i("pref_antifilter_params");
        } else if (serverConfig != null && (advancedFragment = serverConfig.getAdvancedFragment()) != null && advancedFragment.length() > 0) {
            strI = advancedFragment;
        }
        if (strI != null) {
            arrayListF.addAll(fm7.E0(strI, new char[]{' '}));
        }
        AntiFilterJNIWrapper antiFilterJNIWrapper2 = new AntiFilterJNIWrapper(new g69());
        this.j0 = antiFilterJNIWrapper2;
        antiFilterJNIWrapper2.a(arrayListF);
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
        XRayPoint xRayPoint = n69.a;
        n69.a(new SoftReference(this));
        if (Build.VERSION.SDK_INT >= 26) {
            e().a();
        }
        try {
            XRayServiceManager$VpnMessageReceiver xRayServiceManager$VpnMessageReceiver = (XRayServiceManager$VpnMessageReceiver) this.h0.getValue();
            IntentFilter intentFilter = new IntentFilter("su.happ.proxyutility.action.service");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ue3.I(this, xRayServiceManager$VpnMessageReceiver, intentFilter, 2);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        AntiFilterJNIWrapper antiFilterJNIWrapper = this.j0;
        if (antiFilterJNIWrapper != null) {
            antiFilterJNIWrapper.b();
        }
        this.j0 = null;
        e().getClass();
        stopForeground(1);
        XRayPoint xRayPoint = n69.a;
        n69.d(this, (6 & 2) != 0, null);
        unregisterReceiver((XRayServiceManager$VpnMessageReceiver) this.h0.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        this.i0 = System.currentTimeMillis();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("silent", false) : false;
        if (intent != null && (stringExtra = intent.getStringExtra("guid")) != null) {
            ((c16) this.Z.getValue()).b(stringExtra);
            kw4 kw4Var = kw4.a;
            kw4.b(stringExtra);
        }
        u15.A(this);
        XRayPoint xRayPoint = n69.a;
        n69.c(this, null, booleanExtra);
        return 1;
    }

    @Override // defpackage.w47
    public final void d() {
    }

    @Override // defpackage.w47
    public final void f() {
    }

    @Override // defpackage.w47
    public final Service g() {
        return this;
    }
}
