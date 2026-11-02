package su.happ.proxyutility.service;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.IpPrefix;
import android.net.NetworkRequest;
import android.net.VpnService;
import android.os.Build;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import com.tencent.mmkv.MMKV;
import defpackage.c16;
import defpackage.cg8;
import defpackage.dg8;
import defpackage.eg8;
import defpackage.fg8;
import defpackage.gg8;
import defpackage.h69;
import defpackage.i69;
import defpackage.j61;
import defpackage.jk5;
import defpackage.jz8;
import defpackage.kw4;
import defpackage.n67;
import defpackage.n69;
import defpackage.p69;
import defpackage.pz7;
import defpackage.q69;
import defpackage.r69;
import defpackage.ri7;
import defpackage.ss8;
import defpackage.u42;
import defpackage.y59;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import libxray.XRayPoint;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.util.AntiFilterJNIWrapper;
import su.happ.tunnel.TProxyService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lsu/happ/proxyutility/service/XRayVpnService;", "Landroid/net/VpnService;", "Lh69;", "<init>", "()V", "q69", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class XRayVpnService extends VpnService implements h69 {
    public static final /* synthetic */ int v0 = 0;
    public ParcelFileDescriptor j0;
    public volatile boolean k0;
    public volatile boolean l0;
    public AntiFilterJNIWrapper n0;
    public TProxyService o0;
    public boolean p0;
    public ServerConfig q0;
    public final vz7 X = new vz7(new i69(7));
    public final vz7 Y = new vz7(new i69(9));
    public final vz7 Z = new vz7(new i69(10));
    public final vz7 f0 = new vz7(new p69(this, 3));
    public final vz7 g0 = new vz7(new p69(this, 4));
    public final vz7 h0 = new vz7(new p69(this, 5));
    public final vz7 i0 = new vz7(new i69(11));
    public long m0 = -1;
    public final vz7 r0 = new vz7(new i69(12));
    public final vz7 s0 = new vz7(new p69(this, 6));
    public final vz7 t0 = new vz7(new p69(this, 0));
    public final vz7 u0 = new vz7(new i69(8));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(VpnService.Builder builder) {
        ss8 ss8Var = ss8.a;
        List listO = ss8.o();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (ss8.y((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.addDnsServer((String) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h69
    public final ri7 a() {
        return (ri7) this.h0.getValue();
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
        s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getM0() {
        return this.m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    public final void d() {
        ServerConfig serverConfig = this.q0;
        if (serverConfig == null) {
            serverConfig = n69.g;
        }
        VpnService.Builder builderQ = q(serverConfig, false);
        if (builderQ != null) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.j0;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
            this.l0 = false;
            p(builderQ);
            if (!n67.f()) {
                o();
            } else {
                XRayPoint xRayPoint = n69.a;
                n69.c(this, this.j0, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h69
    public final jz8 e() {
        return (jz8) this.f0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    public final void f() {
        rj6 rj6Var;
        String remarks;
        ServerConfig serverConfig = this.q0;
        if (serverConfig == null) {
            serverConfig = n69.g;
        }
        try {
            if (VpnService.prepare(this) != null) {
                rj6Var = null;
            } else {
                rj6Var = new VpnService.Builder(this);
                rj6Var.setMtu(1500);
                rj6Var.addAddress("26.26.26.1", 30);
                if (serverConfig == null || (remarks = serverConfig.getRemarks()) == null) {
                    ServerConfig serverConfig2 = n69.g;
                    remarks = serverConfig2 != null ? serverConfig2.getRemarks() : null;
                    if (remarks == null) {
                        remarks = "";
                    }
                }
                rj6Var.setSession(remarks);
                try {
                    ParcelFileDescriptor parcelFileDescriptor = this.j0;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    rj6Var.setMetered(false);
                }
            }
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            rj6Var = new rj6(th2);
        }
        VpnService.Builder builder = (VpnService.Builder) (rj6Var instanceof rj6 ? null : rj6Var);
        if (builder != null) {
            this.l0 = true;
            if (n67.f()) {
                XRayPoint xRayPoint = n69.a;
                n69.d(this, (6 & 2) != 0, null);
            } else {
                t();
            }
            try {
                ParcelFileDescriptor parcelFileDescriptor2 = this.j0;
                if (parcelFileDescriptor2 != null) {
                    parcelFileDescriptor2.close();
                }
            } catch (Throwable th3) {
                if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                    throw th3;
                }
            }
            p(builder);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h69
    public final j61 h() {
        return (j61) this.g0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getL0() {
        return this.l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w47
    public final void j(ServerConfig serverConfig) {
        XRayPoint xRayPoint = n69.a;
        n69.c(this, this.j0, this.p0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV l() {
        return (MMKV) this.X.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(ServerConfig serverConfig) {
        String advancedFragment;
        String strI = null;
        if (!n67.e()) {
            if ((serverConfig != null ? serverConfig.getAdvancedFragment() : null) == null) {
                return;
            }
        }
        r();
        ArrayList arrayListF = i21.f(new String[]{"--no-domain", "--ip", "127.0.0.1", "--port", String.valueOf(n67.a())});
        try {
            if (n67.e()) {
                strI = l().i("pref_antifilter_params");
            } else if (serverConfig != null && (advancedFragment = serverConfig.getAdvancedFragment()) != null && advancedFragment.length() > 0) {
                strI = advancedFragment;
            }
            if (strI != null) {
                arrayListF.addAll(fm7.E0(strI, new char[]{' '}));
            }
            AntiFilterJNIWrapper antiFilterJNIWrapper = new AntiFilterJNIWrapper(new q69(this));
            this.n0 = antiFilterJNIWrapper;
            antiFilterJNIWrapper.a(arrayListF);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ParcelFileDescriptor parcelFileDescriptor = this.j0;
        parcelFileDescriptor.getClass();
        TProxyService tProxyService = new TProxyService(applicationContext, parcelFileDescriptor, new p69(this, (byte) 1), new p69(this, (byte) 2));
        this.o0 = tProxyService;
        tProxyService.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        dn8 rj6Var;
        try {
            if (!n67.f()) {
                n();
            }
            m(this.q0);
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            s();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        XRayPoint xRayPoint = n69.a;
        n69.a(new SoftReference(this));
        if (Build.VERSION.SDK_INT >= 26) {
            e().a();
        }
        try {
            XRayServiceManager$VpnMessageReceiver xRayServiceManager$VpnMessageReceiver = (XRayServiceManager$VpnMessageReceiver) this.i0.getValue();
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
        ((c16) this.u0.getValue()).i();
        t();
        r();
        e().getClass();
        stopForeground(1);
        XRayPoint xRayPoint = n69.a;
        n69.d(this, (6 & 2) != 0, null);
        unregisterReceiver((XRayServiceManager$VpnMessageReceiver) this.i0.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.VpnService
    public final void onRevoke() {
        s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ServerConfig serverConfigB;
        String stringExtra;
        this.m0 = System.currentTimeMillis();
        this.p0 = intent != null ? intent.getBooleanExtra("silent", false) : false;
        if (intent == null || (stringExtra = intent.getStringExtra("guid")) == null) {
            serverConfigB = null;
        } else {
            ((c16) this.u0.getValue()).b(stringExtra);
            kw4 kw4Var = kw4.a;
            serverConfigB = kw4.b(stringExtra);
        }
        this.q0 = serverConfigB;
        u15.A(this);
        ServerConfig serverConfig = this.q0;
        if (serverConfig == null) {
            serverConfig = n69.g;
        }
        VpnService.Builder builderQ = q(serverConfig, true);
        if (builderQ != null) {
            p(builderQ);
            o();
            ServerConfig serverConfig2 = this.q0;
            if (serverConfig2 == null) {
                serverConfig2 = n69.g;
            }
            j(serverConfig2);
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(VpnService.Builder builder) {
        dn8 rj6Var;
        try {
            ParcelFileDescriptor parcelFileDescriptorEstablish = builder.establish();
            if (parcelFileDescriptorEstablish == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.j0 = parcelFileDescriptorEstablish;
            this.k0 = true;
            rj6Var = dn8.a;
            if (sj6.a(rj6Var) != null) {
                s();
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:149:0x0243 A[Catch: all -> 0x0247, TRY_LEAVE, TryCatch #6 {all -> 0x0247, blocks: (B:147:0x023f, B:149:0x0243), top: B:207:0x023f, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0252 A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0036, blocks: (B:3:0x0003, B:6:0x000c, B:8:0x0029, B:11:0x0039, B:14:0x0047, B:61:0x00f7, B:69:0x010b, B:71:0x012f, B:105:0x019c, B:107:0x01a2, B:108:0x01bf, B:110:0x01c5, B:115:0x01d5, B:117:0x01e3, B:119:0x01e9, B:121:0x01ef, B:123:0x01f5, B:124:0x0200, B:126:0x0206, B:128:0x0213, B:129:0x0217, B:130:0x021b, B:132:0x0221, B:146:0x023e, B:157:0x0252, B:171:0x0281, B:172:0x0282, B:174:0x0288, B:179:0x028f, B:183:0x0293, B:63:0x00fd, B:65:0x0101, B:15:0x0052, B:18:0x0060, B:20:0x0066, B:22:0x006a, B:24:0x0076, B:26:0x007c, B:28:0x0082, B:40:0x00b1, B:43:0x00b6, B:46:0x00bb, B:49:0x00c0, B:51:0x00c4, B:55:0x00d0, B:57:0x00e6, B:58:0x00ea, B:52:0x00c9, B:53:0x00ce, B:32:0x00a4, B:34:0x00a8, B:37:0x00ad, B:59:0x00f2, B:101:0x0194, B:103:0x0198, B:182:0x0292, B:133:0x0227, B:135:0x022d, B:29:0x0088, B:72:0x0131, B:79:0x013f, B:83:0x0147, B:84:0x014d, B:86:0x0153, B:87:0x015d, B:88:0x0162, B:89:0x0163, B:91:0x0168, B:94:0x016f, B:95:0x0178, B:97:0x017e, B:98:0x0188, B:99:0x0190, B:160:0x0258, B:147:0x023f, B:149:0x0243, B:138:0x0232, B:140:0x0236, B:145:0x023d, B:152:0x0248, B:154:0x024c, B:178:0x028e, B:163:0x0275, B:165:0x0279, B:170:0x0280), top: B:206:0x0003, inners: #0, #1, #2, #3, #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0288 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #5 {all -> 0x0036, blocks: (B:3:0x0003, B:6:0x000c, B:8:0x0029, B:11:0x0039, B:14:0x0047, B:61:0x00f7, B:69:0x010b, B:71:0x012f, B:105:0x019c, B:107:0x01a2, B:108:0x01bf, B:110:0x01c5, B:115:0x01d5, B:117:0x01e3, B:119:0x01e9, B:121:0x01ef, B:123:0x01f5, B:124:0x0200, B:126:0x0206, B:128:0x0213, B:129:0x0217, B:130:0x021b, B:132:0x0221, B:146:0x023e, B:157:0x0252, B:171:0x0281, B:172:0x0282, B:174:0x0288, B:179:0x028f, B:183:0x0293, B:63:0x00fd, B:65:0x0101, B:15:0x0052, B:18:0x0060, B:20:0x0066, B:22:0x006a, B:24:0x0076, B:26:0x007c, B:28:0x0082, B:40:0x00b1, B:43:0x00b6, B:46:0x00bb, B:49:0x00c0, B:51:0x00c4, B:55:0x00d0, B:57:0x00e6, B:58:0x00ea, B:52:0x00c9, B:53:0x00ce, B:32:0x00a4, B:34:0x00a8, B:37:0x00ad, B:59:0x00f2, B:101:0x0194, B:103:0x0198, B:182:0x0292, B:133:0x0227, B:135:0x022d, B:29:0x0088, B:72:0x0131, B:79:0x013f, B:83:0x0147, B:84:0x014d, B:86:0x0153, B:87:0x015d, B:88:0x0162, B:89:0x0163, B:91:0x0168, B:94:0x016f, B:95:0x0178, B:97:0x017e, B:98:0x0188, B:99:0x0190, B:160:0x0258, B:147:0x023f, B:149:0x0243, B:138:0x0232, B:140:0x0236, B:145:0x023d, B:152:0x0248, B:154:0x024c, B:178:0x028e, B:163:0x0275, B:165:0x0279, B:170:0x0280), top: B:206:0x0003, inners: #0, #1, #2, #3, #4, #6, #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0298  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:207:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2 A[Catch: all -> 0x0036, TryCatch #5 {all -> 0x0036, blocks: (B:3:0x0003, B:6:0x000c, B:8:0x0029, B:11:0x0039, B:14:0x0047, B:61:0x00f7, B:69:0x010b, B:71:0x012f, B:105:0x019c, B:107:0x01a2, B:108:0x01bf, B:110:0x01c5, B:115:0x01d5, B:117:0x01e3, B:119:0x01e9, B:121:0x01ef, B:123:0x01f5, B:124:0x0200, B:126:0x0206, B:128:0x0213, B:129:0x0217, B:130:0x021b, B:132:0x0221, B:146:0x023e, B:157:0x0252, B:171:0x0281, B:172:0x0282, B:174:0x0288, B:179:0x028f, B:183:0x0293, B:63:0x00fd, B:65:0x0101, B:15:0x0052, B:18:0x0060, B:20:0x0066, B:22:0x006a, B:24:0x0076, B:26:0x007c, B:28:0x0082, B:40:0x00b1, B:43:0x00b6, B:46:0x00bb, B:49:0x00c0, B:51:0x00c4, B:55:0x00d0, B:57:0x00e6, B:58:0x00ea, B:52:0x00c9, B:53:0x00ce, B:32:0x00a4, B:34:0x00a8, B:37:0x00ad, B:59:0x00f2, B:101:0x0194, B:103:0x0198, B:182:0x0292, B:133:0x0227, B:135:0x022d, B:29:0x0088, B:72:0x0131, B:79:0x013f, B:83:0x0147, B:84:0x014d, B:86:0x0153, B:87:0x015d, B:88:0x0162, B:89:0x0163, B:91:0x0168, B:94:0x016f, B:95:0x0178, B:97:0x017e, B:98:0x0188, B:99:0x0190, B:160:0x0258, B:147:0x023f, B:149:0x0243, B:138:0x0232, B:140:0x0236, B:145:0x023d, B:152:0x0248, B:154:0x024c, B:178:0x028e, B:163:0x0275, B:165:0x0279, B:170:0x0280), top: B:206:0x0003, inners: #0, #1, #2, #3, #4, #6, #7, #8, #9 }] */
    public final VpnService.Builder q(ServerConfig serverConfig, boolean z) {
        rj6 rj6Var;
        gg8 gg8VarA;
        String str;
        XRayConfig.DnsBean dns;
        String remarks;
        ParcelFileDescriptor parcelFileDescriptor;
        RouteSettingsCache routeSettingsCacheB;
        RouteSettings routeSettings;
        List directIp;
        vz7 vz7Var = this.Y;
        try {
            if (VpnService.prepare(this) != null) {
                rj6Var = null;
            } else {
                rj6Var = new VpnService.Builder(this);
                rj6Var.setMtu(1500);
                rj6Var.addAddress("26.26.26.1", 30);
                rj6Var.addRoute("0.0.0.0", 0);
                if (n67.g()) {
                    rj6Var.addAddress("da26:2626::1", 126);
                    rj6Var.addRoute("::", 0);
                }
                if (l().b("pref_local_dns_enabled")) {
                    rj6Var.addDnsServer("26.26.26.2").getClass();
                } else if (l().c("pref_enable_rules", false)) {
                    k(rj6Var);
                } else if ((serverConfig != null ? serverConfig.getConfigType() : null) == EConfigType.CUSTOM && l().b("pref_dns_from_json")) {
                    XRayConfig fullConfig = serverConfig.getFullConfig();
                    if (fullConfig == null || (dns = fullConfig.getDns()) == null) {
                        gg8VarA = null;
                    } else {
                        gg8VarA = y59.a(dns);
                        try {
                            Intent intent = new Intent();
                            intent.setAction("su.happ.proxyutility.action.activity");
                            intent.setPackage("su.happ.proxyutility");
                            intent.putExtra("key", 130);
                            intent.putExtra("content", gg8VarA);
                            sendBroadcast(intent);
                        } catch (Throwable th) {
                            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                throw th;
                            }
                        }
                    }
                    if (gg8VarA == null || (gg8VarA instanceof cg8) || (gg8VarA instanceof dg8) || (gg8VarA instanceof eg8)) {
                        str = null;
                    } else {
                        if (!(gg8VarA instanceof fg8)) {
                            throw new b55();
                        }
                        str = ((fg8) gg8VarA).X;
                    }
                    HappApplication happApplication = HappApplication.M0;
                    k32.i().d().h(new nm7(str, (byte) 20));
                    if (str == null) {
                        k(rj6Var);
                    } else {
                        rj6Var.addDnsServer(str).getClass();
                    }
                } else {
                    k(rj6Var);
                }
                if (serverConfig == null || (remarks = serverConfig.getRemarks()) == null) {
                    ServerConfig serverConfig2 = n69.g;
                    remarks = serverConfig2 != null ? serverConfig2.getRemarks() : null;
                    if (remarks == null) {
                        remarks = "";
                    }
                }
                rj6Var.setSession(remarks);
                Set setK = l().k("pref_per_app_proxy_set", (Set) null);
                we5 we5Var = jk5.X;
                int iD = l().d();
                we5Var.getClass();
                jk5 jk5Var = (jk5) wv0.u0(iD, jk5.h0);
                if (jk5Var == null) {
                    jk5Var = jk5.Y;
                }
                try {
                    int iOrdinal = jk5Var.ordinal();
                    if (iOrdinal == 0) {
                        rj6Var.addDisallowedApplication("su.happ.proxyutility");
                    } else if (iOrdinal == 1) {
                        Set set = setK;
                        if (set == null || set.isEmpty()) {
                            rj6Var.addDisallowedApplication("su.happ.proxyutility").getClass();
                        } else {
                            setK.remove("su.happ.proxyutility");
                            Iterator it = setK.iterator();
                            while (it.hasNext()) {
                                rj6Var.addAllowedApplication((String) it.next());
                            }
                        }
                    } else {
                        if (iOrdinal != 2) {
                            throw new b55();
                        }
                        if (setK != null) {
                            setK.add("su.happ.proxyutility");
                        }
                        if (setK != null) {
                            Iterator it2 = setK.iterator();
                            while (it2.hasNext()) {
                                rj6Var.addDisallowedApplication((String) it2.next());
                            }
                        }
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                    return (VpnService.Builder) (rj6Var instanceof rj6 ? null : rj6Var);
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    ((u42) vz7Var.getValue()).b();
                    Iterator it3 = ((Iterable) ((u42) vz7Var.getValue()).c.X.getValue()).iterator();
                    while (it3.hasNext()) {
                        IpPrefix ipPrefix = ((ExcludeSettingsCache) it3.next()).getIpPrefix();
                        if (ipPrefix != null) {
                            rj6Var.excludeRoute(ipPrefix);
                        }
                    }
                    RouteProfile routeProfileK = mn6.k((mn6) this.Z.getValue());
                    if (routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB.getRouteSettings()) == null || (directIp = routeSettings.getDirectIp()) == null) {
                        try {
                            parcelFileDescriptor = this.j0;
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                                if (z && Build.VERSION.SDK_INT >= 28) {
                                    try {
                                        ((ConnectivityManager) this.s0.getValue()).requestNetwork((NetworkRequest) this.r0.getValue(), (r69) this.t0.getValue());
                                    } catch (Throwable th3) {
                                        try {
                                            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                }
                                if (Build.VERSION.SDK_INT >= 29) {
                                    rj6Var.setMetered(false);
                                }
                            } else {
                                if (z) {
                                    ((ConnectivityManager) this.s0.getValue()).requestNetwork((NetworkRequest) this.r0.getValue(), (r69) this.t0.getValue());
                                }
                                if (Build.VERSION.SDK_INT >= 29) {
                                    rj6Var.setMetered(false);
                                }
                            }
                        } catch (Throwable th5) {
                            if ((th5 instanceof InterruptedException) || (th5 instanceof CancellationException)) {
                                throw th5;
                            }
                            if (th instanceof InterruptedException) {
                            }
                            throw th;
                        }
                    } else {
                        ss8 ss8Var = ss8.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : directIp) {
                            if (ss8.y((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            try {
                                IpPrefix ipPrefixE = jm4.E((String) it4.next());
                                if (ipPrefixE != null) {
                                    rj6Var.excludeRoute(ipPrefixE);
                                }
                            } catch (Throwable th6) {
                                try {
                                    if ((th6 instanceof InterruptedException) || (th6 instanceof CancellationException)) {
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                        parcelFileDescriptor = this.j0;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                            if (z) {
                                ((ConnectivityManager) this.s0.getValue()).requestNetwork((NetworkRequest) this.r0.getValue(), (r69) this.t0.getValue());
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                rj6Var.setMetered(false);
                            }
                        } else {
                            if (z) {
                                ((ConnectivityManager) this.s0.getValue()).requestNetwork((NetworkRequest) this.r0.getValue(), (r69) this.t0.getValue());
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                rj6Var.setMetered(false);
                            }
                        }
                    }
                } else {
                    parcelFileDescriptor = this.j0;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                        if (z) {
                            ((ConnectivityManager) this.s0.getValue()).requestNetwork((NetworkRequest) this.r0.getValue(), (r69) this.t0.getValue());
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            rj6Var.setMetered(false);
                        }
                    } else {
                        if (z) {
                            ((ConnectivityManager) this.s0.getValue()).requestNetwork((NetworkRequest) this.r0.getValue(), (r69) this.t0.getValue());
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            rj6Var.setMetered(false);
                        }
                    }
                }
            }
        } catch (Throwable th8) {
            if (th8 instanceof InterruptedException) {
            }
            throw th8;
        }
        return (VpnService.Builder) (rj6Var instanceof rj6 ? null : rj6Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        try {
            AntiFilterJNIWrapper antiFilterJNIWrapper = this.n0;
            if (antiFilterJNIWrapper != null) {
                antiFilterJNIWrapper.b();
            }
            this.n0 = null;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        this.k0 = false;
        this.l0 = false;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                ((ConnectivityManager) this.s0.getValue()).unregisterNetworkCallback((r69) this.t0.getValue());
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        }
        XRayPoint xRayPoint = n69.a;
        n69.d(this, (6 & 2) != 0, null);
        t();
        r();
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.j0;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            this.j0 = null;
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
        }
        stopSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        try {
            getPackageName();
            if (this.o0 != null) {
                TProxyService.b();
            }
            this.o0 = null;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    @Override // defpackage.w47
    public final Service g() {
        return this;
    }
}
