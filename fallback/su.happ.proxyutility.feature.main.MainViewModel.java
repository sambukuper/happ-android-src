package su.happ.proxyutility.feature.main;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tencent.mmkv.MMKV;
import defpackage.a23;
import defpackage.ae1;
import defpackage.ak7;
import defpackage.an4;
import defpackage.ap4;
import defpackage.b61;
import defpackage.b69;
import defpackage.bt;
import defpackage.c71;
import defpackage.co1;
import defpackage.d02;
import defpackage.d69;
import defpackage.df0;
import defpackage.dh3;
import defpackage.dm4;
import defpackage.dn8;
import defpackage.do4;
import defpackage.ea6;
import defpackage.ec7;
import defpackage.em4;
import defpackage.eu;
import defpackage.ev7;
import defpackage.f76;
import defpackage.fi;
import defpackage.fm7;
import defpackage.fo4;
import defpackage.fr1;
import defpackage.gv6;
import defpackage.gw4;
import defpackage.h76;
import defpackage.h87;
import defpackage.hu;
import defpackage.i21;
import defpackage.ig8;
import defpackage.is7;
import defpackage.ja3;
import defpackage.jm4;
import defpackage.jn4;
import defpackage.k32;
import defpackage.ka2;
import defpackage.kn4;
import defpackage.kw2;
import defpackage.kw4;
import defpackage.l90;
import defpackage.la2;
import defpackage.lf2;
import defpackage.lm4;
import defpackage.ln4;
import defpackage.m40;
import defpackage.mm4;
import defpackage.mm7;
import defpackage.mn4;
import defpackage.mq0;
import defpackage.nf1;
import defpackage.nm4;
import defpackage.o15;
import defpackage.o61;
import defpackage.og7;
import defpackage.oh7;
import defpackage.pb3;
import defpackage.ph7;
import defpackage.pn4;
import defpackage.pn5;
import defpackage.po4;
import defpackage.pv0;
import defpackage.q02;
import defpackage.q15;
import defpackage.q51;
import defpackage.qe4;
import defpackage.qg5;
import defpackage.qk4;
import defpackage.qn4;
import defpackage.qo4;
import defpackage.qq0;
import defpackage.qs7;
import defpackage.r15;
import defpackage.rg8;
import defpackage.rj6;
import defpackage.rm4;
import defpackage.rn4;
import defpackage.rw1;
import defpackage.s24;
import defpackage.s51;
import defpackage.sh4;
import defpackage.sm4;
import defpackage.tn;
import defpackage.tn4;
import defpackage.tp1;
import defpackage.tu0;
import defpackage.u15;
import defpackage.u77;
import defpackage.um4;
import defpackage.un5;
import defpackage.uy7;
import defpackage.v77;
import defpackage.vn4;
import defpackage.vz7;
import defpackage.w27;
import defpackage.w39;
import defpackage.w51;
import defpackage.wk0;
import defpackage.wn4;
import defpackage.wv0;
import defpackage.xa2;
import defpackage.xe2;
import defpackage.xm4;
import defpackage.xn4;
import defpackage.xv0;
import defpackage.xw8;
import defpackage.y0;
import defpackage.y08;
import defpackage.ye1;
import defpackage.yn1;
import defpackage.yw2;
import defpackage.yz4;
import defpackage.zc1;
import defpackage.zd1;
import defpackage.zo4;
import defpackage.zt7;
import defpackage.zw8;
import defpackage.zx6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.ServerAffiliationInfo;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.TestPingViaProxyData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.dto.enums.EPingType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
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
        byte b = 1;
        u77 u77VarB = v77.b(1, 1, l90.Y);
        this.t = u77VarB;
        this.u = jm4.m(u77VarB);
        rm4 rm4Var = rm4.a;
        ec7 ec7Var = ec7.Y;
        oh7 oh7VarA = ph7.a(new xm4(null, 0L, null, ec7Var, false, 0, 0, null, null, false, um4.a, false, null, false, false, rm4Var));
        this.w = oh7VarA;
        this.x = jm4.n(oh7VarA);
        this.y = new vz7(new em4(this, (byte) 2));
        this.z = new vz7(new sh4((byte) 21));
        this.A = new vz7(new em4(this, b));
        oh7 oh7VarA2 = ph7.a(null);
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
        this.I = w51.t(new co1(h76VarA0, b));
        this.J = new vz7(new sh4((byte) 8));
        this.K = new LinkedHashMap();
        this.L = r15.a();
        this.M = new BroadcastReceiver() { // from class: su.happ.proxyutility.feature.main.MainViewModel$mMsgReceiver$1
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
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onReceive(android.content.Context r32, android.content.Intent r33) {
                /*
                    Method dump skipped, instruction units count: 749
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.feature.main.MainViewModel$mMsgReceiver$1.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
    }

    public static /* synthetic */ void C(MainViewModel mainViewModel, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        mainViewModel.B(null, z);
    }

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

    public static final void Q(MainViewModel mainViewModel, List list) {
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

    public static void y(MainViewModel mainViewModel, String str, String str2, boolean z, int i) {
        qs7 qs7VarA;
        Object next;
        Long l = null;
        String str3 = (i & 1) != 0 ? null : str;
        String str4 = (i & 2) != 0 ? null : str2;
        boolean z2 = (i & 4) != 0 ? false : z;
        CopyOnWriteArrayList<ConfigGroupCache> copyOnWriteArrayList = mainViewModel.q;
        int i2 = 1;
        if (str4 != null) {
            un5 un5VarO = mainViewModel.o();
            un5VarO.getClass();
            String[] strArrA = un5VarO.b.a();
            if (strArrA == null) {
                strArrA = new String[0];
            }
            ka2 ka2Var = new ka2(new la2(w27.l0(eu.Y(strArrA), pn5.X), true, new gw4(str4, (byte) 2)));
            while (ka2Var.hasNext()) {
                un5.e(((GuId) ka2Var.next()).getValue());
            }
            Iterator it = wv0.d1(copyOnWriteArrayList).iterator();
            do {
                rw1 rw1Var = (rw1) it;
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
                List<ServerCache> listB = configGroupCache.getConfigs();
                listB.getClass();
                ArrayList arrayList = new ArrayList(listB.size());
                for (ServerCache serverCache : listB) {
                    serverCache.getClass();
                    arrayList.add(ServerCache.a(serverCache, null, new ServerAffiliationInfo(l, i2), false, 11));
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
                ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue2)).getConfigs().set(iIntValue3, ServerCache.a((ServerCache) ((ConfigGroupCache) copyOnWriteArrayList.get(iIntValue2)).getConfigs().get(iIntValue3), null, new ServerAffiliationInfo(l, i2), false, 11));
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
                    List<ServerCache> listB2 = configGroupCacheA.getConfigs();
                    listB2.getClass();
                    ArrayList arrayList3 = new ArrayList(listB2.size());
                    for (ServerCache serverCache2 : listB2) {
                        serverCache2.getClass();
                        arrayList3.add(ServerCache.a(serverCache2, null, new ServerAffiliationInfo(l, i2), false, 11));
                    }
                    configGroupCacheA = ConfigGroupCache.a(configGroupCacheA, null, arrayList3, false, false, 27);
                }
                arrayList2.add(configGroupCacheA);
            }
            zc1.i0(copyOnWriteArrayList, arrayList2);
        }
        mainViewModel.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        oh7 oh7Var;
        Object value;
        xm4 xm4Var;
        pv0 pv0Var = (pv0) this.h.getValue();
        pv0Var.getClass();
        kw4 kw4Var = kw4.a;
        byte b = 1;
        ka2 ka2Var = new ka2(new la2(new hu(kw4.d(), b), true, new y0((Object) pv0Var, (byte) 16)));
        do {
            if (!ka2Var.hasNext()) {
                b = 0;
                break;
            }
        } while (!((SubscriptionItem) ((qg5) ka2Var.next()).Y).getIsExpand());
        boolean z = b;
        do {
            oh7Var = this.w;
            value = oh7Var.getValue();
            xm4Var = (xm4) value;
            xm4Var.getClass();
        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, z, 0, 0, null, null, false, null, false, null, false, false, null, 65519)));
    }

    public final void B(String str, boolean z) {
        jm4.Q(zw8.a(this), tp1.a, new po4(this, z, str, (q51) null), 2);
    }

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
                q15 q15Var = this.F;
                qo4Var.h0 = q15Var;
                qo4Var.f0 = z;
                qo4Var.k0 = 1;
                if (q15Var.g(qo4Var) != obj2) {
                    o15Var = q15Var;
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
                    o15Var.m(null);
                    return dn8.a;
                } catch (Throwable th) {
                    th = th;
                    o15Var2.m(null);
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
                    String value = ((SubId) qg5Var.X).getValue();
                    SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var.Y;
                    if (str2 == null || str2.equals(value)) {
                        kw4 kw4Var2 = kw4.a;
                        SubscriptionItem subscriptionItemF = kw4.f(value);
                        if (subscriptionItemF == null) {
                            subscriptionItemD = null;
                        } else {
                            subscriptionItemD = SubscriptionItem.d(subscriptionItemF, y08.c(), false, null, false, null, 268434943);
                            kw4.u(subscriptionItemD, value);
                        }
                        if (subscriptionItemD != null) {
                            subscriptionItem = subscriptionItemD;
                        }
                    }
                    arrayList.add(new qg5(new SubId(value), subscriptionItem));
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
            o15Var.m(null);
            return dn8.a;
        } catch (Throwable th2) {
            th = th2;
            o15Var2 = o15Var;
            o15Var2.m(null);
            throw th;
        }
    }

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
            this.p.remove(new qg5(new SubId(SubId.EMPTY), null));
        }
        if (z) {
            s();
        }
    }

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
    public final java.lang.Object F(defpackage.s51 r24) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.feature.main.MainViewModel.F(s51):java.lang.Object");
    }

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
            SubscriptionItem subscriptionItemD = configGroupCache.getSubscriptionItem();
            if (!(subscriptionItemD != null ? dh3.f(subscriptionItemD.getImport(), Boolean.FALSE) : false) && !configGroupCache.getConfigs().isEmpty()) {
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

    public final Object I(uy7 uy7Var) {
        Object objZ = z(jn4.a, uy7Var);
        return objZ == c71.X ? objZ : dn8.a;
    }

    public final void J(long j) {
        q51 q51Var;
        ea6 ea6Var = new ea6();
        ea6Var.X = this;
        while (true) {
            og7 og7Var = ((MainViewModel) ea6Var.X).B;
            q51Var = null;
            if (og7Var == null || (og7Var != null && og7Var.S())) {
                break;
            }
            MainViewModel mainViewModel = (MainViewModel) ea6Var.X;
            og7 og7Var2 = mainViewModel.B;
            if (og7Var2 != null) {
                og7Var2.m(null);
            }
            mainViewModel.B = null;
            ea6Var.X = (MainViewModel) ea6Var.X;
        }
        Object obj = ea6Var.X;
        ((MainViewModel) obj).B = jm4.Q(zw8.a((xw8) obj), null, new df0(ea6Var, j, q51Var, (byte) 1), 3);
    }

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
        jm4.Q(zw8.a(this), null, new xn4(this, null, (byte) 3), 3);
        C(this, false, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (defpackage.w51.W(r12, r4, r0) == r10) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.s51 r12, java.lang.String r13, boolean r14) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.wo4
            if (r0 == 0) goto L13
            r0 = r12
            wo4 r0 = (defpackage.wo4) r0
            int r1 = r0.k0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k0 = r1
            goto L18
        L13:
            wo4 r0 = new wo4
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.i0
            int r1 = r0.k0
            r2 = 2
            r3 = 1
            r8 = 0
            c71 r10 = defpackage.c71.X
            if (r1 == 0) goto L41
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            q15 r11 = r0.g0
            java.util.List r11 = (java.util.List) r11
            defpackage.w39.n0(r12)
            goto L7e
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r11)
            r11 = 0
            return r11
        L36:
            boolean r14 = r0.h0
            q15 r13 = r0.g0
            java.lang.String r1 = r0.f0
            defpackage.w39.n0(r12)
            r7 = r1
            goto L5b
        L41:
            defpackage.w39.n0(r12)
            r12 = 3
            y(r11, r8, r8, r14, r12)
            r0.f0 = r13
            q15 r12 = r11.F
            r0.g0 = r12
            r0.h0 = r14
            r0.k0 = r3
            java.lang.Object r1 = r12.g(r0)
            if (r1 != r10) goto L59
            goto L7d
        L59:
            r7 = r13
            r13 = r12
        L5b:
            java.util.concurrent.CopyOnWriteArrayList r12 = r11.q     // Catch: java.lang.Throwable -> L81
            java.util.ArrayList r6 = r11.l(r12, r14)     // Catch: java.lang.Throwable -> L81
            r13.m(r8)
            nf1 r12 = defpackage.tp1.a
            hv2 r12 = defpackage.dm4.a
            qk4 r4 = new qk4
            r9 = 6
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f0 = r8
            r0.g0 = r8
            r0.h0 = r14
            r0.k0 = r2
            java.lang.Object r11 = defpackage.w51.W(r12, r4, r0)
            if (r11 != r10) goto L7e
        L7d:
            return r10
        L7e:
            dn8 r11 = defpackage.dn8.a
            return r11
        L81:
            r0 = move-exception
            r11 = r0
            r13.m(r8)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.feature.main.MainViewModel.L(s51, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (defpackage.w51.W(r12, r0, r7) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(java.lang.String r14, su.happ.proxyutility.dto.enums.EPingType r15, boolean r16, defpackage.s51 r17) {
        /*
            r13 = this;
            r0 = r16
            r2 = r17
            boolean r3 = r2 instanceof defpackage.xo4
            if (r3 == 0) goto L18
            r3 = r2
            xo4 r3 = (defpackage.xo4) r3
            int r4 = r3.l0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.l0 = r4
        L16:
            r7 = r3
            goto L1e
        L18:
            xo4 r3 = new xo4
            r3.<init>(r13, r2)
            goto L16
        L1e:
            java.lang.Object r2 = r7.j0
            int r3 = r7.l0
            r8 = 2
            r4 = 1
            r9 = 0
            c71 r10 = defpackage.c71.X
            if (r3 == 0) goto L4b
            if (r3 == r4) goto L3b
            if (r3 != r8) goto L35
            q15 r0 = r7.h0
            java.util.List r0 = (java.util.List) r0
            defpackage.w39.n0(r2)
            goto L98
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r0)
            return r9
        L3b:
            boolean r0 = r7.i0
            q15 r3 = r7.h0
            su.happ.proxyutility.dto.enums.EPingType r4 = r7.g0
            java.lang.String r5 = r7.f0
            defpackage.w39.n0(r2)
            r11 = r5
            r5 = r3
            r3 = r11
        L49:
            r11 = r0
            goto L71
        L4b:
            defpackage.w39.n0(r2)
            r2 = 72
            java.lang.String r3 = ""
            android.app.Application r5 = r13.b
            defpackage.qe4.M0(r2, r5, r3)
            r2 = 3
            y(r13, r9, r9, r0, r2)
            r7.f0 = r14
            r7.g0 = r15
            q15 r5 = r13.F
            r7.h0 = r5
            r7.i0 = r0
            r7.l0 = r4
            java.lang.Object r4 = r5.g(r7)
            if (r4 != r10) goto L6e
            goto L97
        L6e:
            r3 = r14
            r4 = r15
            goto L49
        L71:
            java.util.concurrent.CopyOnWriteArrayList r0 = r13.q     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r2 = r13.l(r0, r11)     // Catch: java.lang.Throwable -> L9b
            r5.m(r9)
            nf1 r0 = defpackage.tp1.a
            hv2 r12 = defpackage.dm4.a
            pi r0 = new pi
            r5 = 0
            r6 = 15
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f0 = r9
            r7.g0 = r9
            r7.h0 = r9
            r7.i0 = r11
            r7.l0 = r8
            java.lang.Object r0 = defpackage.w51.W(r12, r0, r7)
            if (r0 != r10) goto L98
        L97:
            return r10
        L98:
            dn8 r0 = defpackage.dn8.a
            return r0
        L9b:
            r0 = move-exception
            r5.m(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.feature.main.MainViewModel.N(java.lang.String, su.happ.proxyutility.dto.enums.EPingType, boolean, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (defpackage.w51.W(r13, r5, r0) == r11) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(defpackage.s51 r13, java.lang.String r14, boolean r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.yo4
            if (r0 == 0) goto L13
            r0 = r13
            yo4 r0 = (defpackage.yo4) r0
            int r1 = r0.k0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k0 = r1
            goto L18
        L13:
            yo4 r0 = new yo4
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.i0
            int r1 = r0.k0
            r2 = 3
            r3 = 2
            r4 = 1
            r9 = 0
            c71 r11 = defpackage.c71.X
            if (r1 == 0) goto L4d
            if (r1 == r4) goto L45
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L33
            q15 r12 = r0.g0
            java.util.List r12 = (java.util.List) r12
            defpackage.w39.n0(r13)
            goto L9d
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r12)
            r12 = 0
            return r12
        L3a:
            boolean r14 = r0.h0
            q15 r15 = r0.g0
            java.lang.String r1 = r0.f0
            defpackage.w39.n0(r13)
            r8 = r1
            goto L76
        L45:
            boolean r15 = r0.h0
            java.lang.String r14 = r0.f0
            defpackage.w39.n0(r13)
            goto L5f
        L4d:
            defpackage.w39.n0(r13)
            of7 r13 = defpackage.of7.a
            r0.f0 = r14
            r0.h0 = r15
            r0.k0 = r4
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r11) goto L5f
            goto L9c
        L5f:
            y(r12, r9, r9, r15, r2)
            r0.f0 = r14
            q15 r13 = r12.F
            r0.g0 = r13
            r0.h0 = r15
            r0.k0 = r3
            java.lang.Object r1 = r13.g(r0)
            if (r1 != r11) goto L73
            goto L9c
        L73:
            r8 = r14
            r14 = r15
            r15 = r13
        L76:
            java.util.concurrent.CopyOnWriteArrayList r13 = r12.q     // Catch: java.lang.Throwable -> La0
            java.util.ArrayList r13 = r12.l(r13, r14)     // Catch: java.lang.Throwable -> La0
            java.util.List r7 = defpackage.wv0.Y0(r13)     // Catch: java.lang.Throwable -> La0
            r15.m(r9)
            nf1 r13 = defpackage.tp1.a
            hv2 r13 = defpackage.dm4.a
            qk4 r5 = new qk4
            r10 = 7
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f0 = r9
            r0.g0 = r9
            r0.h0 = r14
            r0.k0 = r2
            java.lang.Object r12 = defpackage.w51.W(r13, r5, r0)
            if (r12 != r11) goto L9d
        L9c:
            return r11
        L9d:
            dn8 r12 = defpackage.dn8.a
            return r12
        La0:
            r0 = move-exception
            r12 = r0
            r15.m(r9)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.feature.main.MainViewModel.P(s51, java.lang.String, boolean):java.lang.Object");
    }

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
            jm4.Q(zw8.a(this), null, new wk0(b, q51Var, b), 3);
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

    public final void T(String str, EPingType ePingType) {
        Object next;
        qe4.M0(72, this.b, _UrlKt.FRAGMENT_ENCODE_SET);
        q51 q51Var = null;
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
        jm4.Q(tu0VarA, dm4.a, new qk4((Object) this, (Object) configGroupCache, (Object) ePingType, q51Var, (byte) 8), 2);
    }

    public final void U() {
        Object next;
        byte b;
        boolean Z;
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
            String value = guId2 != null ? guId2.getValue() : null;
            GuId guId3 = value != null ? new GuId(value) : null;
            kw4 kw4Var = kw4.a;
            if (value != null) {
                guId = new GuId(value);
            }
            guId.getClass();
            arrayList.add(new qg5(guId3, kw4.b(value)));
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
            String value2 = guId4 != null ? guId4.getValue() : null;
            copyOnWriteArrayList2.remove(value2 != null ? new GuId(value2) : null);
            kw4 kw4Var2 = kw4.a;
            (value2 != null ? new GuId(value2) : null).getClass();
            kw4.q(value2);
        }
        ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList2, 10));
        for (qg5 qg5Var : arrayList2) {
            GuId guId5 = (GuId) qg5Var.X;
            String value3 = guId5 != null ? guId5.getValue() : null;
            ServerConfig serverConfig = (ServerConfig) qg5Var.Y;
            GuId guId6 = value3 != null ? new GuId(value3) : null;
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
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.p;
        if (next != null) {
            SubId.Companion.getClass();
            copyOnWriteArrayList3.add(0, new qg5(new SubId(SubId.EMPTY), null));
        }
        String strI = n().i("SELECTED_SERVER");
        if (strI == null) {
            strI = null;
        }
        ArrayList<qg5> arrayList5 = new ArrayList(xv0.Z(copyOnWriteArrayList3, 10));
        Iterator it4 = copyOnWriteArrayList3.iterator();
        while (true) {
            b = 1;
            if (!it4.hasNext()) {
                break;
            }
            qg5 qg5Var2 = (qg5) it4.next();
            String value4 = ((SubId) qg5Var2.X).getValue();
            SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var2.Y;
            la2 la2Var = new la2(new hu(arrayList4, b), true, new m40(value4, (byte) 12));
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
                Z = subscriptionItem.getIsExpand();
            } else {
                ak7 ak7Var = this.E;
                ak7Var.getClass();
                Z = ak7Var.a.getBoolean("storageExpandStatus", true);
            }
            ConfigGroupCache configGroupCache = new ConfigGroupCache(value4, subscriptionItem, arrayList7, Z, false);
            String strR = subscriptionItem != null ? subscriptionItem.getProviderId() : null;
            arrayList5.add(new qg5(configGroupCache, strR != null ? new ProviderId(strR) : null));
        }
        int iZ = xv0.Z(arrayList5, 10);
        ArrayList arrayList8 = new ArrayList(iZ);
        ArrayList arrayList9 = new ArrayList(iZ);
        for (qg5 qg5Var3 : arrayList5) {
            arrayList8.add(qg5Var3.X);
            arrayList9.add(qg5Var3.Y);
        }
        copyOnWriteArrayList.addAll(arrayList8);
        Set setO0 = w27.o0(new la2(new hu(arrayList9, b), false, new zx6((byte) 6)));
        int size = setO0.size();
        vz7 vz7Var = this.f;
        if (size == 1) {
            ((s24) vz7Var.getValue()).a(((ProviderId) wv0.q0(setO0)).getValue());
        } else if (setO0.size() > 1) {
            ((ak7) ((gv6) ((s24) vz7Var.getValue()).b.getValue()).a.getValue()).b("current_provider_id");
        }
        G();
    }

    public final void V(long j, String str) {
        str.getClass();
        tu0 tu0VarA = zw8.a(this);
        nf1 nf1Var = tp1.a;
        jm4.Q(tu0VarA, ye1.Z, new pn4(this, str, j, null, (byte) 3), 2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final void W(String str) {
        boolean z;
        MetaParams metaParamsP;
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
                    MetaParams metaParamsP2 = subscriptionItemF.getMetaParams();
                    String strS0 = metaParamsP2 != null ? metaParamsP2.getProfileTitle() : null;
                    if (strS0 == null) {
                        strS0 = _UrlKt.FRAGMENT_ENCODE_SET;
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
                if (subscriptionItem != null && (metaParamsP = subscriptionItem.getMetaParams()) != null && (numT0 = metaParamsP.getProfileUpdateInterval()) != null && (iIntValue = numT0.intValue()) > 0 && !z) {
                    ev7.b(iIntValue, str);
                }
            } else {
                copyOnWriteArrayList.add(configGroupCache);
            }
        }
        s();
    }

    public final void X(rg8 rg8Var) {
        ig8 ig8Var = (ig8) this.i.getValue();
        ig8Var.getClass();
        ig8Var.b.n(null, rg8Var);
        if (ig8Var.a()) {
            return;
        }
        ig8Var.a = false;
    }

    @Override // defpackage.xw8
    public final void d() {
        ((HappApplication) this.b).unregisterReceiver(this.M);
        jm4.Q(zw8.a(this), null, new wk0(2, null, (byte) 1), 3);
    }

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

    public final void f(String str, String str2, EPingType ePingType) {
        try {
            qe4.M0(7, this.b, yw2.b.h(new TestPingViaProxyData(str2, str, ePingType)));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    public final void g(String str, XRayConfig.OutboundBean outboundBean) {
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
            q15Var.m(null);
            return dn8Var;
        } catch (Throwable th) {
            q15Var.m(null);
            throw th;
        }
    }

    public final Object k(tn tnVar, uy7 uy7Var) {
        int i = 0;
        int i2 = 2;
        Class<MainViewModel> cls = MainViewModel.class;
        Object objB = ((qq0) this.e.getValue()).b(tnVar, new yn1(i2, this, cls, "changeSubRestrictedStatus", "changeSubRestrictedStatus-SHcGJD0(Ljava/lang/String;Lsu/happ/proxyutility/interfaces/ImportStatus;)V", i, (byte) 8), new yn1(i2, this, cls, "changeSubExtraStatus", "changeSubExtraStatus-SHcGJD0(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;)V", i, (byte) 9), uy7Var);
        return objB == c71.X ? objB : dn8.a;
    }

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

    public final yz4 m() {
        return (yz4) this.z.getValue();
    }

    public final MMKV n() {
        return (MMKV) this.c.getValue();
    }

    public final un5 o() {
        return (un5) this.k.getValue();
    }

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

    public final zt7 q() {
        return (zt7) this.n.getValue();
    }

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
                Activity activity = (Activity) k32.i().L0.Y;
                if (activity != null) {
                    MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
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

    public final void s() {
        u15.S(this.G, new lm4(this, (byte) 0));
    }

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
                    SubscriptionItem subscriptionItemD = configGroupCache.getSubscriptionItem();
                    if (subscriptionItemD != null) {
                        if (subscriptionItemD.getIsExpand()) {
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
            q15Var.m(null);
        }
    }

    public final boolean u() {
        return ((ig8) this.i.getValue()).a();
    }

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

    public final Object z(kn4 kn4Var, s51 s51Var) {
        Object objL = this.t.l(kn4Var, s51Var);
        return objL == c71.X ? objL : dn8.a;
    }
}
