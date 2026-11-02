package su.happ.proxyutility.feature.main;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import defpackage.ae1;
import defpackage.ak7;
import defpackage.an4;
import defpackage.ap4;
import defpackage.b69;
import defpackage.co1;
import defpackage.d69;
import defpackage.do4;
import defpackage.e46;
import defpackage.ev7;
import defpackage.fi;
import defpackage.fo4;
import defpackage.go4;
import defpackage.gw4;
import defpackage.ho4;
import defpackage.io4;
import defpackage.ja3;
import defpackage.jn4;
import defpackage.kn1;
import defpackage.kn4;
import defpackage.kw2;
import defpackage.kw4;
import defpackage.l69;
import defpackage.lm4;
import defpackage.ln4;
import defpackage.m40;
import defpackage.mm4;
import defpackage.mn4;
import defpackage.nm4;
import defpackage.of7;
import defpackage.om4;
import defpackage.pn4;
import defpackage.pn5;
import defpackage.po4;
import defpackage.qn4;
import defpackage.qo4;
import defpackage.rg8;
import defpackage.rm4;
import defpackage.rn4;
import defpackage.s24;
import defpackage.sm4;
import defpackage.tn4;
import defpackage.um4;
import defpackage.vn4;
import defpackage.wk0;
import defpackage.wn4;
import defpackage.wo4;
import defpackage.x79;
import defpackage.xm4;
import defpackage.xn4;
import defpackage.xo4;
import defpackage.yo4;
import defpackage.zd1;
import defpackage.zo4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.StateCreateProfile;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.ServerAffiliationInfo;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.StartServiceDataInfo;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.TestPingViaProxyData;
import su.happ.proxyutility.dto.TestPingViaProxyResultData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.dto.error.CoreRoutingError;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class MainViewModel extends fi {
    public final vz7 A;
    public og7 B;
    public final oh7 C;
    public final h76 D;
    public final ak7 E;
    public final q15 F;
    public final oh7 G;
    public final h76 H;
    public final xe2 I;
    public final vz7 J;
    public final LinkedHashMap K;
    public final q15 L;
    public final MainViewModel$mMsgReceiver$1 M;
    public final vz7 c;
    public final vz7 d;
    public final vz7 e;
    public final vz7 f;
    public final vz7 g;
    public final vz7 h;
    public final vz7 i;
    public final vz7 j;
    public final vz7 k;
    public final vz7 l;
    public final vz7 m;
    public final vz7 n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final ArrayList r;
    public a23 s;
    public final u77 t;
    public final f76 u;
    public q02 v;
    public final oh7 w;
    public final h76 x;
    public final vz7 y;
    public final vz7 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v21, types: [su.happ.proxyutility.feature.main.MainViewModel$mMsgReceiver$1] */
    public MainViewModel(Application application) {
        super(application);
        application.getClass();
        this.c = new vz7(new sh4((byte) 18));
        this.d = new vz7(new sh4((byte) 9));
        this.e = new vz7(new sh4((byte) 10));
        this.f = new vz7(new sh4((byte) 11));
        this.g = new vz7(new sh4((byte) 12));
        this.h = new vz7(new sh4((byte) 13));
        this.i = new vz7(new sh4((byte) 14));
        this.j = new vz7(new sh4((byte) 15));
        this.k = new vz7(new sh4((byte) 16));
        this.l = new vz7(new sh4((byte) 17));
        this.m = new vz7(new sh4((byte) 19));
        this.n = new vz7(new sh4((byte) 20));
        kw4 kw4Var = kw4.a;
        this.o = new CopyOnWriteArrayList(kw4.c());
        this.p = new CopyOnWriteArrayList(new ArrayList(kw4.d()));
        this.q = new CopyOnWriteArrayList(new ArrayList());
        this.r = new ArrayList();
        final byte b = 1;
        u77 u77VarB = v77.b(1, 1, l90.Y);
        this.t = u77VarB;
        this.u = jm4.m(u77VarB);
        rm4 rm4Var = rm4.a;
        ec7 ec7Var = ec7.Y;
        oh7 oh7VarA = ph7.a(new xm4(null, 0L, null, ec7Var, false, 0, 0, null, null, false, um4.a, false, null, false, false, rm4Var));
        this.w = oh7VarA;
        this.x = jm4.n(oh7VarA);
        final byte b2 = 2;
        this.y = new vz7(new dn2(this) { // from class: em4
            public final /* synthetic */ MainViewModel Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                rs4 rs4Var;
                byte b3 = b2;
                MainViewModel mainViewModel = this.Y;
                switch (b3) {
                    case 0:
                        mainViewModel.x(false);
                        return dn8.a;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        yz4 yz4VarM = mainViewModel.m();
                        uh3 uh3Var = new uh3((byte) 25);
                        yz4VarM.getClass();
                        if (((qc4) yz4VarM).e != qc4.k) {
                            rs4Var = new rs4(uh3Var.B(yz4VarM.d()));
                            rs4Var.l = new yu6();
                        } else {
                            rs4Var = new rs4();
                            rs4Var.l = new yu6();
                        }
                        bm4 bm4Var = new bm4(new gq6(rs4Var, uh3Var, (byte) 16), (byte) 3);
                        qs4 qs4Var = new qs4(yz4VarM, bm4Var);
                        qs4 qs4Var2 = (qs4) rs4Var.l.a(yz4VarM, qs4Var);
                        if (qs4Var2 != null && qs4Var2.b != bm4Var) {
                            bt.q("This source was already added with the different observer");
                            return null;
                        }
                        if (qs4Var2 != null || ((qc4) rs4Var).c <= 0) {
                            return rs4Var;
                        }
                        yz4VarM.f(qs4Var);
                        return rs4Var;
                    default:
                        return ((ig8) mainViewModel.i.getValue()).c;
                }
            }
        });
        this.z = new vz7(new sh4((byte) 21));
        this.A = new vz7(new dn2(this) { // from class: em4
            public final /* synthetic */ MainViewModel Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                rs4 rs4Var;
                byte b3 = b;
                MainViewModel mainViewModel = this.Y;
                switch (b3) {
                    case 0:
                        mainViewModel.x(false);
                        return dn8.a;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        yz4 yz4VarM = mainViewModel.m();
                        uh3 uh3Var = new uh3((byte) 25);
                        yz4VarM.getClass();
                        if (((qc4) yz4VarM).e != qc4.k) {
                            rs4Var = new rs4(uh3Var.B(yz4VarM.d()));
                            rs4Var.l = new yu6();
                        } else {
                            rs4Var = new rs4();
                            rs4Var.l = new yu6();
                        }
                        bm4 bm4Var = new bm4(new gq6(rs4Var, uh3Var, (byte) 16), (byte) 3);
                        qs4 qs4Var = new qs4(yz4VarM, bm4Var);
                        qs4 qs4Var2 = (qs4) rs4Var.l.a(yz4VarM, qs4Var);
                        if (qs4Var2 != null && qs4Var2.b != bm4Var) {
                            bt.q("This source was already added with the different observer");
                            return null;
                        }
                        if (qs4Var2 != null || ((qc4) rs4Var).c <= 0) {
                            return rs4Var;
                        }
                        yz4VarM.f(qs4Var);
                        return rs4Var;
                    default:
                        return ((ig8) mainViewModel.i.getValue()).c;
                }
            }
        });
        oh7 oh7VarA2 = ph7.a((Object) null);
        this.C = oh7VarA2;
        this.D = jm4.n(oh7VarA2);
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        this.E = new ak7(applicationContext);
        this.F = r15.a();
        oh7 oh7VarA3 = ph7.a(ec7Var);
        this.G = oh7VarA3;
        h76 h76VarA0 = jm4.a0(zc1.H(new lf2(oh7VarA3, this, (byte) 6), tp1.a), zw8.a(this), h87.a, d02.X);
        this.H = h76VarA0;
        this.I = w51.t(new co1(h76VarA0, (byte) 1));
        this.J = new vz7(new sh4((byte) 8));
        this.K = new LinkedHashMap();
        this.L = r15.a();
        this.M = new BroadcastReceiver() { // from class: su.happ.proxyutility.feature.main.MainViewModel$mMsgReceiver$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0154, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x0157, code lost:
            
                if ((r0 instanceof java.lang.InterruptedException) != false) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
            
                throw r0;
             */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onReceive(Context context, Intent intent) {
                q02 q02Var;
                Object value;
                xm4 xm4Var;
                byte b3 = 0;
                q51 q51Var = null;
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
                Serializable serializableExtra = intent != null ? intent.getSerializableExtra("content") : null;
                MainViewModel mainViewModel = this.a;
                if (numValueOf != null && numValueOf.intValue() == 11) {
                    mainViewModel.X(rg8.Z);
                    mainViewModel.J(we3.a.a().a() - intent.getLongExtra("content", 0L));
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 12) {
                    mainViewModel.X(rg8.f0);
                    og7 og7Var = mainViewModel.B;
                    if (og7Var != null) {
                        og7Var.m((CancellationException) null);
                    }
                    mainViewModel.B = null;
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 31) {
                    mainViewModel.X(rg8.X);
                    StartServiceDataInfo startServiceDataInfo = (StartServiceDataInfo) x79.c(intent, "content", StartServiceDataInfo.class);
                    if (startServiceDataInfo != null) {
                        mainViewModel.J(we3.a.a().a() - startServiceDataInfo.getStartTime());
                    }
                    jm4.Q(zw8.a(mainViewModel), (u61) null, new ho4(mainViewModel, null, (byte) 0), 3);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 32) {
                    mainViewModel.X(rg8.g0);
                    og7 og7Var2 = mainViewModel.B;
                    if (og7Var2 != null) {
                        og7Var2.m((CancellationException) null);
                    }
                    mainViewModel.B = null;
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 41) {
                    mainViewModel.X(rg8.Y);
                    og7 og7Var3 = mainViewModel.B;
                    if (og7Var3 != null) {
                        og7Var3.m((CancellationException) null);
                    }
                    mainViewModel.B = null;
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 61) {
                    ((yz4) mainViewModel.J.getValue()).j(x79.c(intent, "content", l69.class));
                    return;
                }
                byte b4 = 1;
                if (numValueOf != null && numValueOf.intValue() == 71) {
                    oh7 oh7Var = mainViewModel.w;
                    do {
                        value = oh7Var.getValue();
                        xm4Var = (xm4) value;
                        xm4Var.getClass();
                    } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f - 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                    String stringExtra = intent.getStringExtra("content");
                    if (stringExtra != null) {
                        a aVar = yw2.b;
                        aVar.getClass();
                        TestPingViaProxyResultData testPingViaProxyResultData = (TestPingViaProxyResultData) aVar.c(stringExtra, new yi8(TestPingViaProxyResultData.class));
                        mainViewModel.V(testPingViaProxyResultData.getPing(), testPingViaProxyResultData.getGuid());
                        return;
                    }
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 73) {
                    mainViewModel.K();
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 14) {
                    mainViewModel.m().j(om4.Z);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 15) {
                    mainViewModel.m().j(om4.f0);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 33) {
                    mainViewModel.m().j(om4.X);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 34) {
                    mainViewModel.m().j(om4.g0);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 43) {
                    mainViewModel.m().j(om4.Y);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 123) {
                    c4.m(intent, yb6.a.b(StateCreateProfile.class));
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 125) {
                    CoreRoutingError coreRoutingError = (CoreRoutingError) x79.c(intent, "content", CoreRoutingError.class);
                    if (coreRoutingError == null || (q02Var = mainViewModel.v) == null) {
                        return;
                    }
                    MainActivity mainActivity = (MainActivity) q02Var.Y;
                    String fileName = coreRoutingError.getFileName();
                    String sectionsName = coreRoutingError.getSectionsName();
                    String message = coreRoutingError.getMessage();
                    int i = e46.fragment_container_view;
                    fileName.getClass();
                    sectionsName.getClass();
                    ml2 ml2VarN = mainActivity.n();
                    kn1 kn1Var = new kn1();
                    Bundle bundle = new Bundle();
                    bundle.putString("core_routing_file_name", fileName);
                    bundle.putString("core_routing_sections_name", sectionsName);
                    if (message != null) {
                        bundle.putString("core_routing_message", message);
                    }
                    kn1Var.Q(bundle);
                    kn1Var.V();
                    r00 r00Var = new r00(ml2VarN);
                    r00Var.o = true;
                    r00Var.g(i, kn1Var, (String) null, 1);
                    r00Var.e();
                    int i2 = MainActivity.y1;
                    mainActivity.j0();
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 35) {
                    mainViewModel.J(intent.getLongExtra("content", 0L));
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 126) {
                    MainViewModel.C(mainViewModel, true, 2);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 129) {
                    MainViewModel.C(mainViewModel, false, 2);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 127) {
                    jm4.Q(zw8.a(mainViewModel), (u61) null, new io4(mainViewModel, serializableExtra, q51Var, b3), 3);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 128) {
                    jm4.Q(zw8.a(mainViewModel), (u61) null, new io4(mainViewModel, serializableExtra, q51Var, b4), 3);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 130) {
                    jm4.Q(zw8.a(mainViewModel), (u61) null, new go4(intent, mainViewModel, q51Var, b4), 3);
                } else if (numValueOf != null && numValueOf.intValue() == 131) {
                    jm4.Q(zw8.a(mainViewModel), (u61) null, new go4(intent, mainViewModel, q51Var, b3), 3);
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void C(MainViewModel mainViewModel, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        mainViewModel.B(null, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(MainViewModel mainViewModel, List list) {
        Object value;
        xm4 xm4Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (ServerCache serverCache : ((ConfigGroupCache) it.next()).getConfigs()) {
                XRayConfig.OutboundBean outboundBeanG = serverCache.getConfig().g();
                if (outboundBeanG != null) {
                    oh7 oh7Var = mainViewModel.w;
                    do {
                        value = oh7Var.getValue();
                        xm4Var = (xm4) value;
                        xm4Var.getClass();
                    } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f + 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                    mainViewModel.e(serverCache.getGuid(), outboundBeanG);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void O(MainViewModel mainViewModel, EPingType ePingType, List list) {
        Object value;
        xm4 xm4Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (ServerCache serverCache : ((ConfigGroupCache) it.next()).getConfigs()) {
                vz7 vz7Var = d69.a;
                b69 b69VarL = d69.l(mainViewModel.b, serverCache.getGuid(), false, 20);
                if (b69VarL.a) {
                    oh7 oh7Var = mainViewModel.w;
                    do {
                        value = oh7Var.getValue();
                        xm4Var = (xm4) value;
                        xm4Var.getClass();
                    } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f + 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                    mainViewModel.f(serverCache.getGuid(), b69VarL.b, ePingType);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void Q(MainViewModel mainViewModel, List list) throws Throwable {
        Object value;
        xm4 xm4Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (ServerCache serverCache : ((ConfigGroupCache) it.next()).getConfigs()) {
                XRayConfig.OutboundBean outboundBeanG = serverCache.getConfig().g();
                if (outboundBeanG != null) {
                    oh7 oh7Var = mainViewModel.w;
                    do {
                        value = oh7Var.getValue();
                        xm4Var = (xm4) value;
                        xm4Var.getClass();
                    } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f + 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                    mainViewModel.g(serverCache.getGuid(), outboundBeanG);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(String str, MainViewModel mainViewModel) {
        Object value;
        xm4 xm4Var;
        mainViewModel.V(-1L, str);
        oh7 oh7Var = mainViewModel.w;
        do {
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f - 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(MainViewModel mainViewModel, String str, String str2, boolean z, int i) {
        qs7 qs7VarA;
        Object next;
        String str3 = (i & 1) != 0 ? null : str;
        String str4 = (i & 2) != 0 ? null : str2;
        boolean z2 = (i & 4) != 0 ? false : z;
        CopyOnWriteArrayList<ConfigGroupCache> copyOnWriteArrayList = mainViewModel.q;
        if (str4 != null) {
            un5 un5VarO = mainViewModel.o();
            un5VarO.getClass();
            String[] strArrA = un5VarO.b.a();
            if (strArrA == null) {
                strArrA = new String[0];
            }
            ka2 ka2Var = new ka2(new la2(w27.l0(eu.Y(strArrA), pn5.X), true, new gw4(str4, (byte) 2)));
            while (ka2Var.hasNext()) {
                un5.e(((GuId) ka2Var.next()).b());
            }
            rw1 it = wv0.d1(copyOnWriteArrayList).iterator();
            do {
                rw1 rw1Var = it;
                if (!rw1Var.Y.hasNext()) {
                    next = null;
                    break;
                }
                next = rw1Var.next();
            } while (!dh3.f(((ConfigGroupCache) ((pb3) next).b).getSubId(), str4));
            pb3 pb3Var = (pb3) next;
            Integer numValueOf = pb3Var != null ? Integer.valueOf(pb3Var.a) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                ConfigGroupCache configGroupCache = (ConfigGroupCache) copyOnWriteArrayList.get(iIntValue);
                configGroupCache.getClass();
                List<ServerCache> configs = configGroupCache.getConfigs();
                configs.getClass();
                ArrayList arrayList = new ArrayList(configs.size());
                for (ServerCache serverCache : configs) {
                    serverCache.getClass();
                    arrayList.add(ServerCache.a(serverCache, null, new ServerAffiliationInfo((Long) null, 1), false, 11));
                }
                copyOnWriteArrayList.set(iIntValue, ConfigGroupCache.a(configGroupCache, null, arrayList, false, false, 27));
            }
        }
        if (str3 != null) {
            mainViewModel.o().getClass();
            un5.e(str3);
            qg5 qg5VarP = mainViewModel.p(str3);
            int iIntValue2 = ((Number) qg5VarP.X).intValue();
            int iIntValue3 = ((Number) qg5VarP.Y).intValue();
            if (iIntValue2 != -1 && iIntValue3 != -1) {
                ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue2)).getConfigs().set(iIntValue3, ServerCache.a((ServerCache) ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue2)).getConfigs().get(iIntValue3), null, new ServerAffiliationInfo((Long) null, 1), false, 11));
            }
        }
        if (str4 == null && str3 == null) {
            mainViewModel.o().getClass();
            kw4 kw4Var = kw4.a;
            kw4.i().clearAll();
            ArrayList arrayList2 = new ArrayList(xv0.Z(copyOnWriteArrayList, 10));
            for (ConfigGroupCache configGroupCacheA : copyOnWriteArrayList) {
                if (z2 || ((qs7VarA = mainViewModel.q().a(configGroupCacheA.getSubId())) != null && qs7VarA.c)) {
                    configGroupCacheA.getClass();
                    List<ServerCache> configs2 = configGroupCacheA.getConfigs();
                    configs2.getClass();
                    ArrayList arrayList3 = new ArrayList(configs2.size());
                    for (ServerCache serverCache2 : configs2) {
                        serverCache2.getClass();
                        arrayList3.add(ServerCache.a(serverCache2, null, new ServerAffiliationInfo((Long) null, 1), false, 11));
                    }
                    configGroupCacheA = ConfigGroupCache.a(configGroupCacheA, null, arrayList3, false, false, 27);
                }
                arrayList2.add(configGroupCacheA);
            }
            zc1.i0(copyOnWriteArrayList, arrayList2);
        }
        mainViewModel.s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A() {
        oh7 oh7Var;
        Object value;
        xm4 xm4Var;
        pv0 pv0Var = (pv0) this.h.getValue();
        pv0Var.getClass();
        kw4 kw4Var = kw4.a;
        boolean z = true;
        ka2 ka2Var = new ka2(new la2(new hu(kw4.d(), (byte) 1), true, new y0(pv0Var, (byte) 16)));
        do {
            if (!ka2Var.hasNext()) {
                z = false;
                break;
            }
        } while (!((SubscriptionItem) ((qg5) ka2Var.next()).Y).getIsExpand());
        boolean z2 = z;
        do {
            oh7Var = this.w;
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, z2, 0, 0, null, null, false, null, false, null, false, false, null, 65519)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(String str, boolean z) {
        jm4.Q(zw8.a(this), tp1.a, new po4(this, z, str, (q51) null), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object D(s51 s51Var, String str, boolean z) throws Throwable {
        qo4 qo4Var;
        String str2;
        o15 o15Var;
        boolean z2;
        o15 o15Var2;
        SubscriptionItem subscriptionItemD;
        if (s51Var instanceof qo4) {
            qo4Var = (qo4) s51Var;
            int i = qo4Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qo4Var.k0 = i - Integer.MIN_VALUE;
            } else {
                qo4Var = new qo4(this, s51Var);
            }
        } else {
            qo4Var = new qo4(this, s51Var);
        }
        Object obj = qo4Var.i0;
        int i2 = qo4Var.k0;
        Object obj2 = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                str2 = str;
                qo4Var.g0 = str2;
                o15 o15Var3 = this.F;
                qo4Var.h0 = o15Var3;
                qo4Var.f0 = z;
                qo4Var.k0 = 1;
                if (o15Var3.g(qo4Var) != obj2) {
                    o15Var = o15Var3;
                    z2 = z;
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o15Var2 = qo4Var.h0;
                try {
                    w39.n0(obj);
                    o15Var = o15Var2;
                    o15Var.m((Object) null);
                    return dn8.a;
                } catch (Throwable th) {
                    th = th;
                    o15Var2.m((Object) null);
                    throw th;
                }
            }
            z2 = qo4Var.f0;
            o15Var = qo4Var.h0;
            String str3 = qo4Var.g0;
            w39.n0(obj);
            str2 = str3;
            CopyOnWriteArrayList copyOnWriteArrayList = this.o;
            kw4 kw4Var = kw4.a;
            zc1.i0(copyOnWriteArrayList, kw4.c());
            List<qg5> listD = kw4.d();
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.p;
            if (z2) {
                ArrayList arrayList = new ArrayList(xv0.Z(listD, 10));
                for (qg5 qg5Var : listD) {
                    String strD = ((SubId) qg5Var.X).d();
                    SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var.Y;
                    if (str2 == null || str2.equals(strD)) {
                        kw4 kw4Var2 = kw4.a;
                        SubscriptionItem subscriptionItemF = kw4.f(strD);
                        if (subscriptionItemF == null) {
                            subscriptionItemD = null;
                        } else {
                            subscriptionItemD = SubscriptionItem.d(subscriptionItemF, y08.c(), false, null, false, null, 268434943);
                            kw4.u(subscriptionItemD, strD);
                        }
                        if (subscriptionItemD != null) {
                            subscriptionItem = subscriptionItemD;
                        }
                    }
                    arrayList.add(new qg5(new SubId(strD), subscriptionItem));
                }
                listD = arrayList;
            }
            zc1.i0(copyOnWriteArrayList2, new ArrayList(listD));
            U();
            s();
            if (HappApplication.Q0) {
                qo4Var.g0 = null;
                qo4Var.h0 = o15Var;
                qo4Var.f0 = z2;
                qo4Var.k0 = 2;
                if (F(qo4Var) != obj2) {
                    o15Var2 = o15Var;
                    o15Var = o15Var2;
                }
                return obj2;
            }
            o15Var.m((Object) null);
            return dn8.a;
        } catch (Throwable th2) {
            th = th2;
            o15Var2 = o15Var;
            o15Var2.m((Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(String str, boolean z) {
        str.getClass();
        GuId guId = new GuId(str);
        CopyOnWriteArrayList copyOnWriteArrayList = this.o;
        copyOnWriteArrayList.remove(guId);
        kw4 kw4Var = kw4.a;
        kw4.q(str);
        qg5 qg5VarP = p(str);
        Object obj = qg5VarP.Y;
        Number number = (Number) qg5VarP.X;
        if (number.intValue() >= 0) {
            Number number2 = (Number) obj;
            if (number2.intValue() >= 0) {
                int iIntValue = number.intValue();
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.q;
                ((ConfigGroupCache) copyOnWriteArrayList2.get(iIntValue)).getConfigs().remove(number2.intValue());
                if (((ConfigGroupCache) copyOnWriteArrayList2.get(number.intValue())).getConfigs().isEmpty() && ((ConfigGroupCache) copyOnWriteArrayList2.get(number.intValue())).getSubscriptionItem() == null) {
                    copyOnWriteArrayList2.remove(number.intValue());
                }
            }
        }
        if (copyOnWriteArrayList.isEmpty()) {
            SubId.Companion.getClass();
            this.p.remove(new qg5(new SubId(SubId.c()), (Object) null));
        }
        if (z) {
            s();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:101:0x0246) to fix multi-entry loop: BACK_EDGE: B:101:0x0246 -> B:102:0x0248 */
    /* JADX WARN: Code duplicated, block: B:100:0x0242  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:70:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x023e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x023f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x023f -> B:102:0x0248). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object F(s51 r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof defpackage.ro4
            if (r2 == 0) goto L17
            r2 = r1
            ro4 r2 = (defpackage.ro4) r2
            int r3 = r2.k0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.k0 = r3
            goto L1c
        L17:
            ro4 r2 = new ro4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.i0
            int r3 = r2.k0
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3a
            if (r3 != r5) goto L34
            java.util.Iterator r3 = r2.h0
            aa6 r7 = r2.g0
            ca6 r8 = r2.f0
            w39.n0(r1)
            r1 = r5
            r5 = r6
            goto L248
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            bt.i(r0)
            return r6
        L3a:
            w39.n0(r1)
            su.happ.proxyutility.HappApplication.Q0 = r4
            ca6 r1 = new ca6
            r1.<init>()
            aa6 r3 = new aa6
            r3.<init>()
            java.util.concurrent.CopyOnWriteArrayList r7 = r0.p
            hu r7 = wv0.l0(r7)
            lm4 r8 = new lm4
            r8.<init>(r0, r5)
            la2 r7 = w27.m0(r7, r8)
            uh3 r8 = new uh3
            r9 = 26
            r8.<init>(r9)
            la2 r9 = new la2
            r9.<init>(r7, r5, r8)
            ka2 r7 = new ka2
            r7.<init>(r9)
            r8 = r7
            r7 = r3
            r3 = r8
            r8 = r1
        L6d:
            boolean r1 = r3.hasNext()
            dn8 r9 = dn8.a
            if (r1 == 0) goto L24d
            java.lang.Object r1 = r3.next()
            yf8 r1 = (yf8) r1
            java.lang.Object r10 = r1.X
            su.happ.proxyutility.domain.sub.SubId r10 = (su.happ.proxyutility.domain.sub.SubId) r10
            java.lang.String r11 = r10.d()
            java.lang.Object r10 = r1.Y
            r12 = r10
            su.happ.proxyutility.dto.SubscriptionItem r12 = (su.happ.proxyutility.dto.SubscriptionItem) r12
            java.lang.Object r1 = r1.Z
            qs7 r1 = (qs7) r1
            if (r1 == 0) goto L98
            is7 r10 = r1.a
            if (r10 == 0) goto L98
            boolean r10 = r10.a
            if (r10 != r5) goto L98
            r10 = r5
            goto L99
        L98:
            r10 = r4
        L99:
            if (r1 == 0) goto La2
            is7 r1 = r1.a
            if (r1 == 0) goto La2
            int r1 = r1.c
            goto La3
        La2:
            r1 = r5
        La3:
            su.happ.proxyutility.dto.MetaParams r13 = r12.getMetaParams()
            if (r13 == 0) goto Lc0
            java.lang.Integer r13 = r13.getProfileUpdateInterval()
            if (r13 == 0) goto Lc0
            int r14 = r13.intValue()
            if (r14 <= 0) goto Lb8
            if (r10 != 0) goto Lb8
            goto Lb9
        Lb8:
            r13 = r6
        Lb9:
            if (r13 == 0) goto Lc0
        Lbb:
            int r1 = r13.intValue()
            goto Ld2
        Lc0:
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r1)
            int r1 = r13.intValue()
            if (r1 <= 0) goto Lce
            if (r10 != 0) goto Lce
            goto Lcf
        Lce:
            r13 = r6
        Lcf:
            if (r13 == 0) goto L242
            goto Lbb
        Ld2:
            java.lang.Long r10 = r12.getLastCheckUpdate()
            if (r10 == 0) goto Lf2
            long r15 = r10.longValue()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r13 = r12.getLastUpdated()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r13)
            long r13 = r4.longValue()
            long r13 = r13 * r17
            int r4 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r4 <= 0) goto Lf4
            goto Lf5
        Lf2:
            r17 = 1000(0x3e8, double:4.94E-321)
        Lf4:
            r10 = r6
        Lf5:
            if (r10 == 0) goto Lfc
            long r13 = r10.longValue()
            goto L10b
        Lfc:
            long r13 = r12.getLastUpdated()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r13)
            long r13 = r4.longValue()
            long r13 = r13 * r17
        L10b:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.LinkedHashMap r10 = r0.K
            java.util.Set r15 = r10.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L11a:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L146
            java.lang.Object r16 = r15.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r17 = r16.getKey()
            su.happ.proxyutility.domain.sub.SubId r17 = (su.happ.proxyutility.domain.sub.SubId) r17
            java.lang.String r5 = r17.d()
            boolean r5 = dh3.f(r5, r11)
            if (r5 == 0) goto L144
            java.lang.Object r5 = r16.getKey()
            java.lang.Object r6 = r16.getValue()
            r4.put(r5, r6)
            r5 = 1
            r6 = 0
            goto L11a
        L144:
            r5 = 1
            goto L11a
        L146:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L17a
            java.lang.Object r4 = r4.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 <= 0) goto L173
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            goto L174
        L173:
            r4 = r13
        L174:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            goto L17b
        L17a:
            r6 = 0
        L17b:
            if (r6 == 0) goto L181
            long r13 = r6.longValue()
        L181:
            mu0 r4 = we3.a
            te3 r4 = r4.a()
            long r4 = r4.a()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            long r15 = r6.longValue()
            r17 = 3600000(0x36ee80, double:1.7786363E-317)
            long r15 = r15 * r17
            long r15 = r15 + r13
            int r1 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r1 < 0) goto L1a4
            r1 = 1
            r5 = 0
        L1a0:
            r21 = r2
            goto L246
        L1a4:
            su.happ.proxyutility.domain.sub.SubId r1 = new su.happ.proxyutility.domain.sub.SubId
            r1.<init>(r11)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r10.put(r1, r6)
            kw4 r1 = defpackage.kw4.a
            su.happ.proxyutility.dto.SubscriptionItem r1 = defpackage.kw4.f(r11)
            if (r1 != 0) goto L1ba
            goto L1d2
        L1ba:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r19 = 201326591(0xbffffff, float:9.860761E-32)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = r1
            su.happ.proxyutility.dto.SubscriptionItem r1 = su.happ.proxyutility.dto.SubscriptionItem.d(r12, r13, r15, r16, r17, r18, r19)
            defpackage.kw4.u(r1, r11)
        L1d2:
            boolean r1 = r7.X
            if (r1 != 0) goto L1f1
            q02 r1 = r0.v
            if (r1 == 0) goto L1ec
            m51 r4 = defpackage.ko1.B1
            java.lang.Object r1 = r1.Y
            su.happ.proxyutility.feature.main.MainActivity r1 = (su.happ.proxyutility.feature.main.MainActivity) r1
            ml2 r1 = r1.n()
            jo1 r4 = defpackage.jo1.X
            r5 = 0
            km4.l0(r1, r4, r5)
        L1ea:
            r1 = 1
            goto L1ee
        L1ec:
            r5 = 0
            goto L1ea
        L1ee:
            r7.X = r1
            goto L1f3
        L1f1:
            r1 = 1
            r5 = 0
        L1f3:
            int r4 = r8.X
            int r4 = r4 + r1
            r8.X = r4
            q02 r4 = r0.v
            if (r4 == 0) goto L23f
            zz2 r6 = new zz2
            r10 = 10
            r6.<init>(r8, r0, r10)
            r2.f0 = r8
            r2.g0 = r7
            r2.h0 = r3
            r2.k0 = r1
            su.happ.proxyutility.HappApplication r13 = su.happ.proxyutility.HappApplication.M0
            su.happ.proxyutility.HappApplication r13 = k32.i()
            kf4 r13 = r13.d()
            uq0 r14 = new uq0
            r14.<init>(r12, r10)
            r13.h(r14)
            java.lang.Object r4 = r4.Y
            r10 = r4
            su.happ.proxyutility.feature.main.MainActivity r10 = (su.happ.proxyutility.feature.main.MainActivity) r10
            r19 = 0
            r22 = 432(0x1b0, float:6.05E-43)
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r21 = r2
            r20 = r6
            java.lang.Object r2 = su.happ.proxyutility.feature.main.MainActivity.P(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            c71 r4 = c71.X
            if (r2 != r4) goto L23c
            r9 = r2
        L23c:
            if (r9 != r4) goto L246
            return r4
        L23f:
            r21 = r2
            goto L248
        L242:
            r1 = r5
            r5 = r6
            goto L1a0
        L246:
            r2 = r21
        L248:
            r6 = r5
            r4 = 0
            r5 = r1
            goto L6d
        L24d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.feature.main.MainViewModel.F(s51):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ServerConfig G() {
        ServerConfig serverConfigB;
        Object next;
        ServerCache serverCache;
        String strI = n().i("SELECTED_SERVER");
        if (strI != null) {
            kw4 kw4Var = kw4.a;
            serverConfigB = kw4.b(strI);
        } else {
            serverConfigB = null;
        }
        if (serverConfigB != null) {
            return serverConfigB;
        }
        Iterator it = this.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ConfigGroupCache configGroupCache = (ConfigGroupCache) next;
            SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
            if (!(subscriptionItem != null ? dh3.f(subscriptionItem.getImport(), Boolean.FALSE) : false) && !configGroupCache.getConfigs().isEmpty()) {
                break;
            }
        }
        ConfigGroupCache configGroupCache2 = (ConfigGroupCache) next;
        if (configGroupCache2 == null || (serverCache = (ServerCache) wv0.t0(configGroupCache2.getConfigs())) == null) {
            return null;
        }
        n().q("SELECTED_SERVER", serverCache.getGuid());
        serverCache.f();
        return serverCache.getConfig();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(String str) {
        oh7 oh7Var;
        Object value;
        xm4 xm4Var;
        str.getClass();
        kw4 kw4Var = kw4.a;
        ServerConfig serverConfigB = kw4.b(str);
        if (serverConfigB != null) {
            do {
                oh7Var = this.w;
                value = oh7Var.getValue();
                xm4Var = (xm4) value;
                xm4Var.getClass();
            } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, serverConfigB, null, false, 0, 0, null, null, false, null, false, null, false, false, null, 65531)));
        }
        String strI = n().i("SELECTED_SERVER");
        if (strI == null) {
            strI = null;
        }
        if (strI == null ? false : strI.equals(str)) {
            return;
        }
        n().q("SELECTED_SERVER", str);
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (strI != null && (!fm7.o0(strI))) {
            qg5 qg5VarP = p(strI);
            int iIntValue = ((Number) qg5VarP.X).intValue();
            int iIntValue2 = ((Number) qg5VarP.Y).intValue();
            if (iIntValue != -1 && iIntValue2 != -1) {
                ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue)).getConfigs().set(iIntValue2, ServerCache.a((ServerCache) ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue)).getConfigs().get(iIntValue2), null, null, false, 7));
            }
        }
        qg5 qg5VarP2 = p(str);
        int iIntValue3 = ((Number) qg5VarP2.X).intValue();
        int iIntValue4 = ((Number) qg5VarP2.Y).intValue();
        if (iIntValue3 == -1 || iIntValue4 == -1) {
            return;
        }
        ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue3)).getConfigs().set(iIntValue4, ServerCache.a((ServerCache) ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue3)).getConfigs().get(iIntValue4), null, null, true, 7));
        s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object I(uy7 uy7Var) {
        Object objZ = z(jn4.a, uy7Var);
        return objZ == c71.X ? objZ : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(long j) {
        ea6 ea6Var = new ea6();
        ea6Var.X = this;
        while (true) {
            og7 og7Var = ((MainViewModel) ea6Var.X).B;
            if (og7Var == null || (og7Var != null && og7Var.S())) {
                break;
            }
            MainViewModel mainViewModel = (MainViewModel) ea6Var.X;
            og7 og7Var2 = mainViewModel.B;
            if (og7Var2 != null) {
                og7Var2.m((CancellationException) null);
            }
            mainViewModel.B = null;
            ea6Var.X = (MainViewModel) ea6Var.X;
        }
        Object obj = ea6Var.X;
        ((MainViewModel) obj).B = jm4.Q(zw8.a((xw8) obj), (u61) null, new df0(ea6Var, j, (q51) null, (byte) 1), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K() {
        oh7 oh7Var;
        Object value;
        xm4 xm4Var;
        do {
            oh7Var = this.w;
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, false, false, null, 65503)));
        jm4.Q(zw8.a(this), (u61) null, new xn4(this, null, (byte) 3), 3);
        C(this, false, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (w51.W(r12, r4, r0) == r10) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(s51 s51Var, String str, boolean z) {
        wo4 wo4Var;
        String str2;
        q15 q15Var;
        if (s51Var instanceof wo4) {
            wo4Var = (wo4) s51Var;
            int i = wo4Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wo4Var.k0 = i - Integer.MIN_VALUE;
            } else {
                wo4Var = new wo4(this, s51Var);
            }
        } else {
            wo4Var = new wo4(this, s51Var);
        }
        Object obj = wo4Var.i0;
        int i2 = wo4Var.k0;
        c71 c71Var = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                y(this, null, null, z, 3);
                wo4Var.f0 = str;
                q15 q15Var2 = this.F;
                wo4Var.g0 = q15Var2;
                wo4Var.h0 = z;
                wo4Var.k0 = 1;
                if (q15Var2.g(wo4Var) != c71Var) {
                    str2 = str;
                    q15Var = q15Var2;
                }
                return c71Var;
            }
            if (i2 == 1) {
                z = wo4Var.h0;
                q15Var = wo4Var.g0;
                String str3 = wo4Var.f0;
                w39.n0(obj);
                str2 = str3;
            } else {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list = wo4Var.g0;
                w39.n0(obj);
            }
            return dn8.a;
            ArrayList arrayListL = l(this.q, z);
            q15Var.m((Object) null);
            nf1 nf1Var = tp1.a;
            hv2 hv2Var = dm4.a;
            qk4 qk4Var = new qk4(this, arrayListL, str2, (q51) null, (byte) 6);
            wo4Var.f0 = null;
            wo4Var.g0 = null;
            wo4Var.h0 = z;
            wo4Var.k0 = 2;
        } catch (Throwable th) {
            q15Var.m((Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (w51.W(r12, r0, r7) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(String str, EPingType ePingType, boolean z, s51 s51Var) {
        xo4 xo4Var;
        o15 o15Var;
        String str2;
        EPingType ePingType2;
        boolean z2;
        boolean z3 = z;
        if (s51Var instanceof xo4) {
            xo4Var = (xo4) s51Var;
            int i = xo4Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                xo4Var.l0 = i - Integer.MIN_VALUE;
            } else {
                xo4Var = new xo4(this, s51Var);
            }
        } else {
            xo4Var = new xo4(this, s51Var);
        }
        xo4 xo4Var2 = xo4Var;
        Object obj = xo4Var2.j0;
        int i2 = xo4Var2.l0;
        c71 c71Var = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                qe4.M0(72, this.b, "");
                y(this, null, null, z3, 3);
                xo4Var2.f0 = str;
                xo4Var2.g0 = ePingType;
                o15Var = this.F;
                xo4Var2.h0 = o15Var;
                xo4Var2.i0 = z3;
                xo4Var2.l0 = 1;
                if (o15Var.g(xo4Var2) != c71Var) {
                    str2 = str;
                    ePingType2 = ePingType;
                }
                return c71Var;
            }
            if (i2 == 1) {
                z3 = xo4Var2.i0;
                o15 o15Var2 = xo4Var2.h0;
                ePingType2 = xo4Var2.g0;
                String str3 = xo4Var2.f0;
                w39.n0(obj);
                o15Var = o15Var2;
                str2 = str3;
            } else {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list = xo4Var2.h0;
                w39.n0(obj);
            }
            return dn8.a;
            ArrayList arrayListL = l(this.q, z2);
            o15Var.m((Object) null);
            nf1 nf1Var = tp1.a;
            hv2 hv2Var = dm4.a;
            pi piVar = new pi(this, arrayListL, str2, ePingType2, (q51) null, (byte) 15);
            xo4Var2.f0 = null;
            xo4Var2.g0 = null;
            xo4Var2.h0 = null;
            xo4Var2.i0 = z2;
            xo4Var2.l0 = 2;
        } catch (Throwable th) {
            o15Var.m((Object) null);
            throw th;
        }
        z2 = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (w51.W(r13, r5, r0) == r11) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(s51 s51Var, String str, boolean z) {
        yo4 yo4Var;
        String str2;
        boolean z2;
        q15 q15Var;
        if (s51Var instanceof yo4) {
            yo4Var = (yo4) s51Var;
            int i = yo4Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                yo4Var.k0 = i - Integer.MIN_VALUE;
            } else {
                yo4Var = new yo4(this, s51Var);
            }
        } else {
            yo4Var = new yo4(this, s51Var);
        }
        Object obj = yo4Var.i0;
        int i2 = yo4Var.k0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            of7 of7Var = of7.a;
            yo4Var.f0 = str;
            yo4Var.h0 = z;
            yo4Var.k0 = 1;
            if (of7Var.a(yo4Var) != c71Var) {
            }
            return c71Var;
        }
        if (i2 == 1) {
            z = yo4Var.h0;
            str = yo4Var.f0;
            w39.n0(obj);
        } else if (i2 == 2) {
            z2 = yo4Var.h0;
            q15Var = yo4Var.g0;
            String str3 = yo4Var.f0;
            w39.n0(obj);
            str2 = str3;
            try {
                List listY0 = wv0.Y0(l(this.q, z2));
                q15Var.m((Object) null);
                nf1 nf1Var = tp1.a;
                hv2 hv2Var = dm4.a;
                qk4 qk4Var = new qk4(this, listY0, str2, (q51) null, (byte) 7);
                yo4Var.f0 = null;
                yo4Var.g0 = null;
                yo4Var.h0 = z2;
                yo4Var.k0 = 3;
            } catch (Throwable th) {
                q15Var.m((Object) null);
                throw th;
            }
        } else {
            if (i2 != 3) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = yo4Var.g0;
            w39.n0(obj);
        }
        return dn8.a;
        y(this, null, null, z, 3);
        yo4Var.f0 = str;
        q15 q15Var2 = this.F;
        yo4Var.g0 = q15Var2;
        yo4Var.h0 = z;
        yo4Var.k0 = 2;
        if (q15Var2.g(yo4Var) != c71Var) {
            str2 = str;
            z2 = z;
            q15Var = q15Var2;
            List listY1 = wv0.Y0(l(this.q, z2));
            q15Var.m((Object) null);
            nf1 nf1Var2 = tp1.a;
            hv2 hv2Var2 = dm4.a;
            qk4 qk4Var2 = new qk4(this, listY1, str2, (q51) null, (byte) 7);
            yo4Var.f0 = null;
            yo4Var.g0 = null;
            yo4Var.h0 = z2;
            yo4Var.k0 = 3;
        }
        return c71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object R(s51 s51Var, String str, boolean z) {
        un5 un5VarO = o();
        EPingType.Companion companion = EPingType.INSTANCE;
        int iE = un5VarO.c.e(-1, "pref_ping_type");
        companion.getClass();
        EPingType ePingType = (EPingType) wv0.u0(iE, EPingType.c());
        if (ePingType == null) {
            ePingType = EPingType.VIA_PROXY_GET;
        }
        int i = ln4.c[ePingType.ordinal()];
        c71 c71Var = c71.X;
        if (i == 1) {
            Object objN = N(str, ePingType, z, s51Var);
            if (objN == c71Var) {
                return objN;
            }
        } else if (i == 2) {
            Object objN2 = N(str, ePingType, z, s51Var);
            if (objN2 == c71Var) {
                return objN2;
            }
        } else if (i == 3) {
            Object objP = P(s51Var, str, z);
            if (objP == c71Var) {
                return objP;
            }
        } else {
            if (i != 4) {
                b61.c();
                return null;
            }
            Object objL = L(s51Var, str, z);
            if (objL == c71Var) {
                return objL;
            }
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S(String str) {
        Object next;
        Object next2;
        str.getClass();
        un5 un5VarO = o();
        EPingType.Companion companion = EPingType.INSTANCE;
        int iE = un5VarO.c.e(-1, "pref_ping_type");
        companion.getClass();
        EPingType ePingType = (EPingType) wv0.u0(iE, EPingType.c());
        if (ePingType == null) {
            ePingType = EPingType.VIA_PROXY_GET;
        }
        int i = ln4.c[ePingType.ordinal()];
        if (i == 1) {
            T(str, ePingType);
            return;
        }
        byte b = 2;
        if (i == 2) {
            T(str, ePingType);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        q51 q51Var = null;
        if (i == 3) {
            jm4.Q(zw8.a(this), (u61) null, new wk0(b, q51Var, b), 3);
            y(this, null, str, false, 5);
            Iterator it = wv0.Y0(copyOnWriteArrayList).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!dh3.f(((ConfigGroupCache) next).getSubId(), str));
            ConfigGroupCache configGroupCache = (ConfigGroupCache) next;
            if (configGroupCache == null) {
                return;
            }
            tu0 tu0VarA = zw8.a(this);
            nf1 nf1Var = tp1.a;
            jm4.Q(tu0VarA, dm4.a, new ap4(this, configGroupCache, null), 2);
            return;
        }
        if (i != 4) {
            b61.c();
            return;
        }
        y(this, null, str, false, 5);
        Iterator it2 = wv0.Y0(copyOnWriteArrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!dh3.f(((ConfigGroupCache) next2).getSubId(), str));
        ConfigGroupCache configGroupCache2 = (ConfigGroupCache) next2;
        if (configGroupCache2 == null) {
            return;
        }
        tu0 tu0VarA2 = zw8.a(this);
        nf1 nf1Var2 = tp1.a;
        jm4.Q(tu0VarA2, dm4.a, new zo4(this, configGroupCache2, null), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T(String str, EPingType ePingType) {
        Object next;
        qe4.M0(72, this.b, "");
        y(this, null, str, false, 5);
        Iterator it = wv0.Y0(this.q).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!dh3.f(((ConfigGroupCache) next).getSubId(), str));
        ConfigGroupCache configGroupCache = (ConfigGroupCache) next;
        if (configGroupCache == null) {
            return;
        }
        tu0 tu0VarA = zw8.a(this);
        nf1 nf1Var = tp1.a;
        jm4.Q(tu0VarA, dm4.a, new qk4(this, configGroupCache, ePingType, (q51) null, (byte) 8), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U() {
        Object next;
        boolean isExpand;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        copyOnWriteArrayList.clear();
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.o;
        ArrayList arrayList = new ArrayList(xv0.Z(copyOnWriteArrayList2, 10));
        Iterator it = copyOnWriteArrayList2.iterator();
        while (true) {
            GuId guId = null;
            if (!it.hasNext()) {
                break;
            }
            GuId guId2 = (GuId) it.next();
            String strB = guId2 != null ? guId2.b() : null;
            GuId guId3 = strB != null ? new GuId(strB) : null;
            kw4 kw4Var = kw4.a;
            if (strB != null) {
                guId = new GuId(strB);
            }
            guId.getClass();
            arrayList.add(new qg5(guId3, kw4.b(strB)));
        }
        ArrayList<qg5> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ServerConfig) ((qg5) obj).Y) != null) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            GuId guId4 = (GuId) ((qg5) it2.next()).X;
            String strB2 = guId4 != null ? guId4.b() : null;
            copyOnWriteArrayList2.remove(strB2 != null ? new GuId(strB2) : null);
            kw4 kw4Var2 = kw4.a;
            (strB2 != null ? new GuId(strB2) : null).getClass();
            kw4.q(strB2);
        }
        ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList2, 10));
        for (qg5 qg5Var : arrayList2) {
            GuId guId5 = (GuId) qg5Var.X;
            String strB3 = guId5 != null ? guId5.b() : null;
            ServerConfig serverConfig = (ServerConfig) qg5Var.Y;
            GuId guId6 = strB3 != null ? new GuId(strB3) : null;
            serverConfig.getClass();
            arrayList4.add(new qg5(guId6, serverConfig));
        }
        Iterator it3 = arrayList4.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!fm7.o0(((ServerConfig) ((qg5) next).Y).getSubscriptionId()));
        CopyOnWriteArrayList<qg5> copyOnWriteArrayList3 = this.p;
        if (next != null) {
            SubId.Companion.getClass();
            copyOnWriteArrayList3.add(0, new qg5(new SubId(SubId.c()), (Object) null));
        }
        String strI = n().i("SELECTED_SERVER");
        if (strI == null) {
            strI = null;
        }
        ArrayList<qg5> arrayList5 = new ArrayList(xv0.Z(copyOnWriteArrayList3, 10));
        for (qg5 qg5Var2 : copyOnWriteArrayList3) {
            String strD = ((SubId) qg5Var2.X).d();
            SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var2.Y;
            la2 la2Var = new la2(new hu(arrayList4, (byte) 1), true, new m40(strD, (byte) 12));
            mm4 mm4Var = new mm4(strI, this);
            ArrayList arrayList6 = new ArrayList();
            ka2 ka2Var = new ka2(la2Var);
            while (ka2Var.hasNext()) {
                arrayList6.add(mm4Var.B(ka2Var.next()));
            }
            if (subscriptionItem != null ? dh3.f(subscriptionItem.getImport(), Boolean.FALSE) : false) {
                arrayList6 = new ArrayList();
            }
            ArrayList arrayList7 = arrayList6;
            if (subscriptionItem != null) {
                isExpand = subscriptionItem.getIsExpand();
            } else {
                ak7 ak7Var = this.E;
                ak7Var.getClass();
                isExpand = ak7Var.a.getBoolean("storageExpandStatus", true);
            }
            ConfigGroupCache configGroupCache = new ConfigGroupCache(strD, subscriptionItem, arrayList7, isExpand, false);
            String providerId = subscriptionItem != null ? subscriptionItem.getProviderId() : null;
            arrayList5.add(new qg5(configGroupCache, providerId != null ? new ProviderId(providerId) : null));
        }
        int iZ = xv0.Z(arrayList5, 10);
        ArrayList arrayList8 = new ArrayList(iZ);
        ArrayList arrayList9 = new ArrayList(iZ);
        for (qg5 qg5Var3 : arrayList5) {
            arrayList8.add(qg5Var3.X);
            arrayList9.add(qg5Var3.Y);
        }
        copyOnWriteArrayList.addAll(arrayList8);
        Set setO0 = w27.o0(new la2(new hu(arrayList9, (byte) 1), false, new zx6((byte) 6)));
        int size = setO0.size();
        vz7 vz7Var = this.f;
        if (size == 1) {
            ((s24) vz7Var.getValue()).a(((ProviderId) wv0.q0(setO0)).getValue());
        } else if (setO0.size() > 1) {
            ((ak7) ((gv6) ((s24) vz7Var.getValue()).b.getValue()).a.getValue()).b("current_provider_id");
        }
        G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(long j, String str) {
        str.getClass();
        tu0 tu0VarA = zw8.a(this);
        nf1 nf1Var = tp1.a;
        jm4.Q(tu0VarA, ye1.Z, new pn4(this, str, j, null, (byte) 3), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final void W(String str) {
        boolean z;
        MetaParams metaParams;
        Integer numT0;
        int iIntValue;
        is7 is7Var;
        str.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        List<ConfigGroupCache> listY0 = wv0.Y0(copyOnWriteArrayList);
        copyOnWriteArrayList.clear();
        qs7 qs7VarA = q().a(str);
        if (qs7VarA != null && (is7Var = qs7VarA.a) != null) {
            z = is7Var.a;
        }
        for (ConfigGroupCache configGroupCache : listY0) {
            if (dh3.f(configGroupCache.getSubId(), str)) {
                kw4 kw4Var = kw4.a;
                SubscriptionItem subscriptionItemF = kw4.f(str);
                if (subscriptionItemF != null) {
                    MetaParams metaParams2 = subscriptionItemF.getMetaParams();
                    String strS0 = metaParams2 != null ? metaParams2.getProfileTitle() : null;
                    if (strS0 == null) {
                        strS0 = "";
                    }
                    subscriptionItemF.v0(strS0, false);
                } else {
                    subscriptionItemF = configGroupCache.getSubscriptionItem();
                }
                SubscriptionItem subscriptionItem = subscriptionItemF;
                copyOnWriteArrayList.add(new ConfigGroupCache(configGroupCache.getSubId(), subscriptionItem, dh3.f(subscriptionItem != null ? subscriptionItem.getImport() : null, Boolean.FALSE) ? new ArrayList() : configGroupCache.getConfigs(), configGroupCache.getIsExpand(), false));
                if (subscriptionItem != null) {
                    kw4.u(subscriptionItem, str);
                }
                if (subscriptionItem != null && (metaParams = subscriptionItem.getMetaParams()) != null && (numT0 = metaParams.getProfileUpdateInterval()) != null && (iIntValue = numT0.intValue()) > 0 && !z) {
                    ev7.b(iIntValue, str);
                }
            } else {
                copyOnWriteArrayList.add(configGroupCache);
            }
        }
        s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(rg8 rg8Var) {
        ig8 ig8Var = (ig8) this.i.getValue();
        ig8Var.getClass();
        ig8Var.b.n((Object) null, rg8Var);
        if (ig8Var.a()) {
            return;
        }
        ig8Var.a = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        this.b.unregisterReceiver(this.M);
        jm4.Q(zw8.a(this), (u61) null, new wk0(2, null, (byte) 1), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    public final void e(String str, XRayConfig.OutboundBean outboundBean) {
        MainViewModel mainViewModel;
        String str2;
        dn8 dn8Var;
        String strG = outboundBean.g();
        if (strG != null) {
            vz7 vz7Var = d69.a;
            if (!d69.s(str)) {
                tu0 tu0VarA = zw8.a(this);
                nf1 nf1Var = tp1.a;
                jm4.Q(tu0VarA, ye1.Z, new qn4(null, strG, str, this), 2);
                return;
            }
            kw4 kw4Var = kw4.a;
            ServerConfig serverConfigB = kw4.b(str);
            if (serverConfigB != null) {
                SubscriptionItem subscriptionItemF = kw4.f(serverConfigB.getSubscriptionId());
                if (subscriptionItemF != null) {
                    boolean zB0 = subscriptionItemF.b0();
                    Boolean boolValueOf = Boolean.valueOf(zB0);
                    if (!zB0) {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null) {
                        List listB = fr1.b(strG);
                        List<String> list = !listB.isEmpty() ? listB : null;
                        if (list != null) {
                            mainViewModel = this;
                            str2 = str;
                            nm4 nm4Var = new nm4(new ArrayList(), list, mainViewModel, str2, (byte) 1);
                            for (String str3 : list) {
                                try {
                                    tu0 tu0VarA2 = zw8.a(mainViewModel);
                                    nf1 nf1Var2 = tp1.a;
                                    jm4.Q(tu0VarA2, ye1.Z, new mn4(str3, nm4Var, null), 2);
                                } catch (Throwable th) {
                                    if (th instanceof InterruptedException) {
                                        throw th;
                                    }
                                    if (th instanceof CancellationException) {
                                        throw th;
                                    }
                                }
                            }
                            dn8Var = dn8.a;
                        } else {
                            mainViewModel = this;
                            str2 = str;
                            dn8Var = null;
                        }
                    } else {
                        mainViewModel = this;
                        str2 = str;
                        dn8Var = null;
                    }
                } else {
                    mainViewModel = this;
                    str2 = str;
                    dn8Var = null;
                }
                if (dn8Var != null) {
                    return;
                }
            } else {
                mainViewModel = this;
                str2 = str;
            }
            tu0 tu0VarA3 = zw8.a(mainViewModel);
            nf1 nf1Var3 = tp1.a;
            jm4.Q(tu0VarA3, ye1.Z, new qn4(null, strG, str2, mainViewModel), 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(String str, String str2, EPingType ePingType) {
        try {
            qe4.M0(7, this.b, yw2.b.h(new TestPingViaProxyData(str2, str, ePingType)));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(String str, XRayConfig.OutboundBean outboundBean) throws Throwable {
        nm4 nm4Var;
        XRayConfig.OutboundBean outboundBean2;
        String strG = outboundBean.g();
        Integer numH = outboundBean.h();
        if (strG == null || numH == null) {
            h(str, this);
            return;
        }
        vz7 vz7Var = d69.a;
        if (!d69.s(str)) {
            int iIntValue = numH.intValue();
            tu0 tu0VarA = zw8.a(this);
            nf1 nf1Var = tp1.a;
            jm4.Q(tu0VarA, ye1.Z, new tn4(outboundBean, strG, iIntValue, this, str, null), 2);
            return;
        }
        kw4 kw4Var = kw4.a;
        ServerConfig serverConfigB = kw4.b(str);
        if (serverConfigB == null) {
            int iIntValue2 = numH.intValue();
            tu0 tu0VarA2 = zw8.a(this);
            nf1 nf1Var2 = tp1.a;
            jm4.Q(tu0VarA2, ye1.Z, new tn4(outboundBean, strG, iIntValue2, this, str, null), 2);
            return;
        }
        XRayConfig.OutboundBean outboundBean3 = outboundBean;
        SubscriptionItem subscriptionItemF = kw4.f(serverConfigB.getSubscriptionId());
        if (subscriptionItemF == null || !subscriptionItemF.b0()) {
            h(str, this);
            return;
        }
        List listB = fr1.b(strG);
        if (listB.isEmpty()) {
            listB = null;
        }
        List<String> list = listB;
        if (list == null) {
            h(str, this);
            return;
        }
        nm4 nm4Var2 = new nm4(new ArrayList(), list, this, str, (byte) 0);
        for (String str2 : list) {
            try {
                tu0 tu0VarA3 = zw8.a(this);
                nf1 nf1Var3 = tp1.a;
                XRayConfig.OutboundBean outboundBean4 = outboundBean3;
                nm4Var = nm4Var2;
                try {
                    outboundBean2 = outboundBean4;
                    try {
                        jm4.Q(tu0VarA3, ye1.Z, new rn4(outboundBean4, str2, nm4Var, numH, null), 2);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        if (th2 instanceof InterruptedException) {
                            throw th2;
                        }
                        if (th2 instanceof CancellationException) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outboundBean2 = outboundBean4;
                }
            } catch (Throwable th4) {
                th = th4;
                nm4Var = nm4Var2;
                outboundBean2 = outboundBean3;
            }
            outboundBean3 = outboundBean2;
            nm4Var2 = nm4Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(s51 s51Var) {
        vn4 vn4Var;
        if (s51Var instanceof vn4) {
            vn4Var = (vn4) s51Var;
            int i = vn4Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vn4Var.h0 = i - Integer.MIN_VALUE;
            } else {
                vn4Var = new vn4(this, s51Var);
            }
        } else {
            vn4Var = new vn4(this, s51Var);
        }
        Object objA = vn4Var.f0;
        int i2 = vn4Var.h0;
        dn8 dn8Var = dn8.a;
        Object obj = c71.X;
        if (i2 == 0) {
            w39.n0(objA);
            mq0 mq0Var = (mq0) this.m.getValue();
            vn4Var.h0 = 1;
            objA = mq0Var.a(vn4Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(objA);
                return dn8Var;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(objA);
        ja3 ja3Var = (ja3) objA;
        if (ja3Var != null) {
            kn4 an4Var = new an4(ja3Var);
            vn4Var.h0 = 2;
            if (z(an4Var, vn4Var) == obj) {
                return obj;
            }
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(s51 s51Var) {
        wn4 wn4Var;
        q15 q15Var;
        FirebaseMessaging firebaseMessaging;
        if (s51Var instanceof wn4) {
            wn4Var = (wn4) s51Var;
            int i = wn4Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wn4Var.i0 = i - Integer.MIN_VALUE;
            } else {
                wn4Var = new wn4(this, s51Var);
            }
        } else {
            wn4Var = new wn4(this, s51Var);
        }
        Object obj = wn4Var.g0;
        c71 c71Var = c71.X;
        int i2 = wn4Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            q15 q15Var2 = this.L;
            wn4Var.f0 = q15Var2;
            wn4Var.i0 = 1;
            if (q15Var2.g(wn4Var) == c71Var) {
                return c71Var;
            }
            q15Var = q15Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = wn4Var.f0;
            w39.n0(obj);
        }
        try {
            if (((xm4) this.x.X.getValue()).i != null) {
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(xa2.b());
                }
                firebaseMessaging.getClass();
                firebaseMessaging.d().a(new o61(this, (byte) 16));
            }
            dn8 dn8Var = dn8.a;
            q15Var.m((Object) null);
            return dn8Var;
        } catch (Throwable th) {
            q15Var.m((Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object k(tn tnVar, uy7 uy7Var) {
        Object objB = ((qq0) this.e.getValue()).b(tnVar, new yn1(2, this, MainViewModel.class, "changeSubRestrictedStatus", "changeSubRestrictedStatus-SHcGJD0(Ljava/lang/String;Lsu/happ/proxyutility/interfaces/ImportStatus;)V", 0, (byte) 8), new yn1(2, this, MainViewModel.class, "changeSubExtraStatus", "changeSubExtraStatus-SHcGJD0(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;)V", 0, (byte) 9), uy7Var);
        return objB == c71.X ? objB : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList l(CopyOnWriteArrayList copyOnWriteArrayList, boolean z) {
        qs7 qs7VarA;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            ConfigGroupCache configGroupCache = (ConfigGroupCache) obj;
            if (z || ((qs7VarA = q().a(configGroupCache.getSubId())) != null && qs7VarA.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yz4 m() {
        return (yz4) this.z.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV n() {
        return (MMKV) this.c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final un5 o() {
        return (un5) this.k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final qg5 p(String str) {
        int i = 0;
        for (Object obj : this.q) {
            int i2 = i + 1;
            if (i < 0) {
                i21.X();
                throw null;
            }
            int i3 = 0;
            for (Object obj2 : ((ConfigGroupCache) obj).getConfigs()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    i21.X();
                    throw null;
                }
                if (dh3.f(((ServerCache) obj2).getGuid(), str)) {
                    return new qg5(Integer.valueOf(i), Integer.valueOf(i3));
                }
                i3 = i4;
            }
            i = i2;
        }
        return new qg5(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zt7 q() {
        return (zt7) this.n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object r(String str, String str2, Boolean bool, Boolean bool2, s51 s51Var) {
        do4 do4Var;
        EDeeplinkType eDeeplinkTypeB;
        int i;
        if (s51Var instanceof do4) {
            do4Var = (do4) s51Var;
            int i2 = do4Var.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                do4Var.h0 = i2 - Integer.MIN_VALUE;
            } else {
                do4Var = new do4(this, s51Var);
            }
        } else {
            do4Var = new do4(this, s51Var);
        }
        do4 do4Var2 = do4Var;
        Object objL = do4Var2.f0;
        int i3 = do4Var2.h0;
        try {
            if (i3 == 0) {
                w39.n0(objL);
                kw2 kw2Var = kw2.a;
                str.getClass();
                if (!mm7.Z(str, false, "happ://") || (eDeeplinkTypeB = ae1.b(str)) == null || ((i = zd1.a[eDeeplinkTypeB.ordinal()]) != 1 && i != 2 && i != 3 && i != 4 && i != 5)) {
                    if (!mm7.Z(str, false, "http://") && !mm7.Z(str, false, "https://")) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                HappApplication happApplication = HappApplication.M0;
                Object obj = (Activity) k32.i().L0.Y;
                if (obj != null) {
                    MainActivity mainActivity = obj instanceof MainActivity ? (MainActivity) obj : null;
                    if (mainActivity != null) {
                        do4Var2.h0 = 1;
                        objL = MainActivity.L(mainActivity, str, false, str2, bool, bool2, do4Var2, 136);
                        c71 c71Var = c71.X;
                        if (objL == c71Var) {
                            return c71Var;
                        }
                    }
                }
                return dn8.a;
            }
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objL);
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        u15.S(this.G, new lm4(this, (byte) 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(s51 s51Var) {
        fo4 fo4Var;
        q15 q15Var;
        if (s51Var instanceof fo4) {
            fo4Var = (fo4) s51Var;
            int i = fo4Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo4Var.i0 = i - Integer.MIN_VALUE;
            } else {
                fo4Var = new fo4(this, s51Var);
            }
        } else {
            fo4Var = new fo4(this, s51Var);
        }
        Object obj = fo4Var.g0;
        int i2 = fo4Var.i0;
        boolean z = true;
        if (i2 == 0) {
            w39.n0(obj);
            q15 q15Var2 = this.F;
            fo4Var.f0 = q15Var2;
            fo4Var.i0 = 1;
            Object objG = q15Var2.g(fo4Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            q15Var = q15Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = fo4Var.f0;
            w39.n0(obj);
        }
        try {
            CopyOnWriteArrayList<ConfigGroupCache> copyOnWriteArrayList = this.q;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                for (ConfigGroupCache configGroupCache : copyOnWriteArrayList) {
                    SubscriptionItem subscriptionItem = configGroupCache.getSubscriptionItem();
                    if (subscriptionItem != null) {
                        if (subscriptionItem.getIsExpand()) {
                            z = false;
                            break;
                        }
                    } else {
                        if (configGroupCache.getIsExpand()) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } finally {
            q15Var.m((Object) null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u() {
        return ((ig8) this.i.getValue()).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        oh7 oh7Var;
        Object value;
        xm4 xm4Var;
        do {
            oh7Var = this.w;
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, false, um4.a, false, null, false, false, null, 64511)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(String str) {
        oh7 oh7Var;
        Object value;
        xm4 xm4Var;
        do {
            oh7Var = this.w;
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, false, false, new sm4(str), 32767)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(boolean z) {
        oh7 oh7Var;
        Object value;
        xm4 xm4Var;
        do {
            oh7Var = this.w;
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, false, null, z, null, false, false, null, 63487)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object z(kn4 kn4Var, s51 s51Var) {
        Object objL = this.t.l(kn4Var, s51Var);
        return objL == c71.X ? objL : dn8.a;
    }
}
