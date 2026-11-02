package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.StateCreateProfile;
import su.happ.proxyutility.domain.routing.entity.SubRoutingState;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.dto.enums.FragmentationType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kw2 {
    public static final kw2 a = new kw2();
    public static final vz7 b = new vz7(new tv2((byte) 8));
    public static final vz7 c = new vz7(new tv2((byte) 9));
    public static final vz7 d = new vz7(new tv2((byte) 10));
    public static final vz7 e = new vz7(new tv2((byte) 11));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    public static ImportResult a(String str, boolean z, String str2) {
        ServerConfig serverConfigB;
        ImportResult rj6Var;
        String remarks;
        XRayConfig.Meta meta;
        ImportResult rj6Var2;
        String remarks2;
        XRayConfig.Meta meta2;
        str2.getClass();
        if (str == null) {
            return new ImportResult(0, m83.a, null, 5);
        }
        boolean zD0 = fm7.d0(str, "outbounds", false);
        r83 r83Var = r83.a;
        n83 n83Var = n83.a;
        if (!zD0) {
            if (fm7.G0('{', str)) {
                return new ImportResult(0, new q83("json"), null, 5);
            }
            return fm7.G0('[', str) ? new ImportResult(0, n83Var, null, 5) : new ImportResult(0, r83Var, null, 5);
        }
        String strI = c().i("SELECTED_SERVER");
        if (strI == null) {
            strI = null;
        }
        if (fm7.o0(str2) || z) {
            serverConfigB = null;
        } else if (strI != null) {
            kw4 kw4Var = kw4.a;
            serverConfigB = kw4.b(strI);
            if (serverConfigB == null) {
                a aVar = yw2.c;
                String strI2 = c().i("REMOVED_SERVER");
                aVar.getClass();
                serverConfigB = (ServerConfig) aVar.c(strI2, new yi8(ServerConfig.class));
            } else {
                if (!dh3.f(serverConfigB.getSubscriptionId(), str2)) {
                    serverConfigB = null;
                }
                if (serverConfigB == null) {
                    a aVar2 = yw2.c;
                    String strI3 = c().i("REMOVED_SERVER");
                    aVar2.getClass();
                    serverConfigB = (ServerConfig) aVar2.c(strI3, new yi8(ServerConfig.class));
                }
            }
        } else {
            a aVar3 = yw2.c;
            String strI4 = c().i("REMOVED_SERVER");
            aVar3.getClass();
            serverConfigB = (ServerConfig) aVar3.c(strI4, new yi8(ServerConfig.class));
        }
        if (!z) {
            kw4 kw4Var2 = kw4.a;
            kw4.r(str2);
        }
        boolean Z = mm7.Z(str, false, "[");
        vz7 vz7Var = c;
        if (!Z) {
            if (!mm7.Z(str, false, "{")) {
                return new ImportResult(0, r83Var, null, 5);
            }
            try {
                ServerConfig.Companion companion = ServerConfig.INSTANCE;
                EConfigType eConfigType = EConfigType.CUSTOM;
                companion.getClass();
                ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
                a aVar4 = yw2.c;
                aVar4.getClass();
                serverConfigA.k((XRayConfig) aVar4.c(str, new yi8(XRayConfig.class)));
                XRayConfig fullConfig = serverConfigA.getFullConfig();
                if (fullConfig == null || (remarks2 = fullConfig.getRemarks()) == null) {
                    remarks2 = String.format("%04d-", Arrays.copyOf(new Object[]{1}, 1)) + System.currentTimeMillis();
                }
                serverConfigA.m(remarks2);
                XRayConfig fullConfig2 = serverConfigA.getFullConfig();
                String serverDescription = (fullConfig2 == null || (meta2 = fullConfig2.getMeta()) == null) ? null : meta2.getServerDescription();
                serverConfigA.l(serverConfigA.getMeta() != null ? new ServerConfig.Meta(serverDescription) : new ServerConfig.Meta(serverDescription));
                serverConfigA.n(str2);
                kw4 kw4Var3 = kw4.a;
                GuId.Companion.getClass();
                ((MMKV) vz7Var.getValue()).q(kw4.e(GuId.a(), serverConfigA), str);
                i(1, serverConfigB, str2, strI);
                rj6Var2 = new ImportResult(1, null, null, 6);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var2 = new rj6(th);
            }
            if (sj6.a(rj6Var2) != null) {
                rj6Var2 = new ImportResult(0, new q83("json"), null, 5);
            }
            return rj6Var2;
        }
        try {
            a aVar5 = yw2.c;
            aVar5.getClass();
            Object[] objArr = (Object[]) aVar5.c(str, new yi8(Object[].class));
            objArr.getClass();
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                ServerConfig.Companion companion2 = ServerConfig.INSTANCE;
                EConfigType eConfigType2 = EConfigType.CUSTOM;
                companion2.getClass();
                ServerConfig serverConfigA2 = ServerConfig.Companion.a(eConfigType2);
                a aVar6 = yw2.c;
                serverConfigA2.k((XRayConfig) aVar6.c(aVar6.h(obj), new yi8(XRayConfig.class)));
                XRayConfig fullConfig3 = serverConfigA2.getFullConfig();
                if (fullConfig3 == null || (remarks = fullConfig3.getRemarks()) == null) {
                    remarks = String.format("%04d-", Arrays.copyOf(new Object[]{Integer.valueOf(i2 + 1)}, 1)) + System.currentTimeMillis();
                }
                serverConfigA2.m(remarks);
                XRayConfig fullConfig4 = serverConfigA2.getFullConfig();
                String serverDescription2 = (fullConfig4 == null || (meta = fullConfig4.getMeta()) == null) ? null : meta.getServerDescription();
                serverConfigA2.l(serverConfigA2.getMeta() != null ? new ServerConfig.Meta(serverDescription2) : new ServerConfig.Meta(serverDescription2));
                serverConfigA2.n(str2);
                kw4 kw4Var4 = kw4.a;
                GuId.Companion.getClass();
                ((MMKV) vz7Var.getValue()).q(kw4.e(GuId.a(), serverConfigA2), yw2.d.h(obj));
                i2++;
                i++;
                objArr = objArr;
                vz7Var = vz7Var;
            }
            i(i2, serverConfigB, str2, strI);
            rj6Var = new ImportResult(i2, null, null, 6);
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            rj6Var = new rj6(th2);
        }
        if (sj6.a(rj6Var) != null) {
            rj6Var = new ImportResult(0, n83Var, null, 5);
        }
        return rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ImportResult b(String str, int i, String str2) {
        if ((i & 2) != 0) {
            SubId.Companion.getClass();
            str2 = SubId.c();
        }
        return a(str, false, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV c() {
        return (MMKV) b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object e(String str, String str2, s51 s51Var, int i) {
        if ((i & 2) != 0) {
            SubId.Companion.getClass();
            str2 = SubId.c();
        }
        return a.d(str, str2, false, s51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(int i, ServerConfig serverConfig, String str, String str2) {
        Object next;
        String subscriptionId;
        if (i < 1) {
            c().q("REMOVED_SERVER", yw2.c.h(serverConfig));
            return;
        }
        if (serverConfig != null) {
            kw4 kw4Var = kw4.a;
            Map mapK = kw4.k(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapK.entrySet()) {
                String strB = ((GuId) entry.getKey()).b();
                ServerConfig serverConfig2 = (ServerConfig) entry.getValue();
                if (!(str2 == null ? false : dh3.f(strB, str2)) && dh3.f(serverConfig2.getRemarks(), serverConfig.getRemarks())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                c().q("SELECTED_SERVER", ((GuId) ((Map.Entry) it.next()).getKey()).b());
            }
        }
        c().remove("REMOVED_SERVER");
        if (str2 == null && serverConfig == null) {
            kw4 kw4Var2 = kw4.a;
            Iterator it2 = kw4.c().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String strB2 = ((GuId) next).b();
                kw4 kw4Var3 = kw4.a;
                ServerConfig serverConfigB = kw4.b(strB2);
                subscriptionId = serverConfigB != null ? serverConfigB.getSubscriptionId() : null;
            } while (!(subscriptionId == null ? false : subscriptionId.equals(str)));
            GuId guId = (GuId) next;
            String strB3 = guId != null ? guId.b() : null;
            if (strB3 != null) {
                c().q("SELECTED_SERVER", strB3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String j(String str) {
        EDeeplinkType eDeeplinkTypeB = ae1.b(str);
        if (eDeeplinkTypeB != null) {
            String strC = ae1.c(fm7.x0("happ://", str), eDeeplinkTypeB);
            int i = fw2.a[eDeeplinkTypeB.ordinal()];
            if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                b12 b12VarA = ae1.a(eDeeplinkTypeB);
                if (b12VarA != null) {
                    return i21.u(strC, b12VarA);
                }
                bt.q("Required value was null.");
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String k(String str) {
        SubscriptionItem subscriptionItemF;
        str.getClass();
        try {
            kw4 kw4Var = kw4.a;
            ServerConfig serverConfigB = kw4.b(str);
            if (serverConfigB == null) {
                return "";
            }
            if (!fm7.o0(serverConfigB.getSubscriptionId()) && (subscriptionItemF = kw4.f(serverConfigB.getSubscriptionId())) != null && subscriptionItemF.G()) {
                return "";
            }
            String protocolScheme = serverConfigB.getConfigType().getProtocolScheme();
            kc6 kc6Var = i47.a;
            i47 i47VarA = h47.a(serverConfigB.getConfigType());
            if (i47VarA == null) {
                return "";
            }
            return protocolScheme + "://" + i47VarA.g(serverConfigB);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int l(Context context, String str) {
        dn8 rj6Var;
        str.getClass();
        try {
            kw4 kw4Var = kw4.a;
            if (kw4.b(str) != null) {
                FragmentationType.Companion companion = FragmentationType.INSTANCE;
                vz7 vz7Var = d;
                String strJ = ((MMKV) vz7Var.getValue()).j("pref_fragment_type", (String) null);
                companion.getClass();
                boolean z = ((MMKV) vz7Var.getValue()).c("pref_fragment_enabled", false) && FragmentationType.Companion.a(strJ) == FragmentationType.ADVANCED;
                vz7 vz7Var2 = d69.a;
                b69 b69VarL = d69.l(context, str, z, 24);
                if (b69VarL.a) {
                    ss8 ss8Var = ss8.a;
                    ss8.E(context, b69VarL.b);
                    rj6Var = dn8.a;
                    return sj6.a(rj6Var) == null ? 0 : -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[Catch: all -> 0x012e, TRY_LEAVE, TryCatch #3 {all -> 0x012e, blocks: (B:60:0x0125, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0144, B:75:0x0148, B:53:0x00ee, B:55:0x00f4, B:77:0x0154, B:79:0x0158, B:80:0x015a), top: B:113:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:60:0x0125, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0144, B:75:0x0148, B:53:0x00ee, B:55:0x00f4, B:77:0x0154, B:79:0x0158, B:80:0x015a), top: B:113:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x013a A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:60:0x0125, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0144, B:75:0x0148, B:53:0x00ee, B:55:0x00f4, B:77:0x0154, B:79:0x0158, B:80:0x015a), top: B:113:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0144 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:60:0x0125, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0144, B:75:0x0148, B:53:0x00ee, B:55:0x00f4, B:77:0x0154, B:79:0x0158, B:80:0x015a), top: B:113:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0148 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:60:0x0125, B:62:0x012b, B:65:0x0130, B:67:0x0134, B:69:0x013a, B:71:0x013e, B:73:0x0144, B:75:0x0148, B:53:0x00ee, B:55:0x00f4, B:77:0x0154, B:79:0x0158, B:80:0x015a), top: B:113:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0121 -> B:113:0x0125). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.lang.String r17, java.lang.String r18, boolean r19, s51 r20) {
        /*
            r16 = this;
            r0 = r20
            kw2 r1 = defpackage.kw2.a
            boolean r2 = r0 instanceof defpackage.gw2
            if (r2 == 0) goto L17
            r2 = r0
            gw2 r2 = (defpackage.gw2) r2
            int r3 = r2.q0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.q0 = r3
            goto L1e
        L17:
            gw2 r2 = new gw2
            r3 = r16
            r2.<init>(r3, r0)
        L1e:
            java.lang.Object r0 = r2.o0
            int r3 = r2.q0
            r4 = 5
            r5 = 0
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L4f
            if (r3 != r6) goto L49
            int r3 = r2.n0
            boolean r8 = r2.m0
            java.util.Iterator r9 = r2.l0
            java.lang.String r10 = r2.k0
            ea6 r11 = r2.j0
            ca6 r12 = r2.i0
            java.util.Map r13 = r2.h0
            su.happ.proxyutility.dto.ServerConfig r14 = r2.g0
            java.lang.String r15 = r2.f0
            w39.n0(r0)     // Catch: java.lang.Throwable -> L45
            r16 = r6
            r6 = r9
            r9 = r15
            goto L125
        L45:
            r0 = move-exception
            r9 = r15
            goto L183
        L49:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            bt.i(r0)
            return r7
        L4f:
            w39.n0(r0)
            if (r17 != 0) goto L62
            su.happ.proxyutility.dto.ImportResult r0 = new su.happ.proxyutility.dto.ImportResult     // Catch: java.lang.Throwable -> L5c
            m83 r1 = defpackage.m83.a     // Catch: java.lang.Throwable -> L5c
            r0.<init>(r5, r1, r7, r4)     // Catch: java.lang.Throwable -> L5c
            return r0
        L5c:
            r0 = move-exception
            r9 = r18
        L5f:
            r3 = r5
            goto L183
        L62:
            com.tencent.mmkv.MMKV r0 = c()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "SELECTED_SERVER"
            java.lang.String r0 = r0.i(r3)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L6f
            goto L70
        L6f:
            r0 = r7
        L70:
            boolean r3 = fm7.o0(r18)     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto Lb4
            if (r19 != 0) goto Lb4
            if (r0 == 0) goto L95
            kw4 r3 = defpackage.kw4.a     // Catch: java.lang.Throwable -> L5c
            su.happ.proxyutility.dto.ServerConfig r3 = defpackage.kw4.b(r0)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L95
            java.lang.String r8 = r3.getSubscriptionId()     // Catch: java.lang.Throwable -> L5c
            r9 = r18
            boolean r8 = dh3.f(r8, r9)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L8f
            goto L90
        L8f:
            r3 = r7
        L90:
            if (r3 == 0) goto L97
            goto Lb7
        L93:
            r0 = move-exception
            goto L5f
        L95:
            r9 = r18
        L97:
            com.google.gson.a r3 = yw2.c     // Catch: java.lang.Throwable -> L93
            com.tencent.mmkv.MMKV r8 = c()     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = "REMOVED_SERVER"
            java.lang.String r8 = r8.i(r10)     // Catch: java.lang.Throwable -> L93
            java.lang.Class<su.happ.proxyutility.dto.ServerConfig> r10 = su.happ.proxyutility.dto.ServerConfig.class
            r3.getClass()     // Catch: java.lang.Throwable -> L93
            yi8 r11 = new yi8     // Catch: java.lang.Throwable -> L93
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r3 = r3.c(r8, r11)     // Catch: java.lang.Throwable -> L93
            su.happ.proxyutility.dto.ServerConfig r3 = (su.happ.proxyutility.dto.ServerConfig) r3     // Catch: java.lang.Throwable -> L93
            goto Lb7
        Lb4:
            r9 = r18
            r3 = r7
        Lb7:
            if (r19 != 0) goto Lc0
            kw4 r8 = defpackage.kw4.a     // Catch: java.lang.Throwable -> L93
            java.util.Map r8 = defpackage.kw4.k(r9)     // Catch: java.lang.Throwable -> L93
            goto Lc1
        Lc0:
            r8 = r7
        Lc1:
            su.happ.proxyutility.HappApplication r10 = su.happ.proxyutility.HappApplication.M0     // Catch: java.lang.Throwable -> L93
            su.happ.proxyutility.HappApplication r10 = k32.i()     // Catch: java.lang.Throwable -> L93
            kf4 r10 = r10.d()     // Catch: java.lang.Throwable -> L93
            ya2 r11 = new ya2     // Catch: java.lang.Throwable -> L93
            r12 = 12
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L93
            r10.h(r11)     // Catch: java.lang.Throwable -> L93
            ca6 r10 = new ca6     // Catch: java.lang.Throwable -> L93
            r10.<init>()     // Catch: java.lang.Throwable -> L93
            ea6 r11 = new ea6     // Catch: java.lang.Throwable -> L93
            r11.<init>()     // Catch: java.lang.Throwable -> L93
            java.util.List r12 = fm7.s0(r17)     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L93
            r14 = r3
            r3 = r5
            r13 = r8
            r8 = r10
            r10 = r0
            r0 = r19
        Lee:
            boolean r15 = r12.hasNext()     // Catch: java.lang.Throwable -> L12e
            if (r15 == 0) goto L154
            java.lang.Object r15 = r12.next()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L12e
            java.lang.CharSequence r15 = fm7.R0(r15)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L12e
            r2.f0 = r9     // Catch: java.lang.Throwable -> L12e
            r2.g0 = r14     // Catch: java.lang.Throwable -> L12e
            r2.h0 = r13     // Catch: java.lang.Throwable -> L12e
            r2.i0 = r8     // Catch: java.lang.Throwable -> L12e
            r2.j0 = r11     // Catch: java.lang.Throwable -> L12e
            r2.k0 = r10     // Catch: java.lang.Throwable -> L12e
            r2.l0 = r12     // Catch: java.lang.Throwable -> L12e
            r2.m0 = r0     // Catch: java.lang.Throwable -> L12e
            r2.n0 = r3     // Catch: java.lang.Throwable -> L12e
            r2.q0 = r6     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r15 = r1.f(r15, r9, r2)     // Catch: java.lang.Throwable -> L12e
            r16 = r6
            c71 r6 = c71.X
            if (r15 != r6) goto L121
            return r6
        L121:
            r6 = r12
            r12 = r8
            r8 = r0
            r0 = r15
        L125:
            x83 r0 = (defpackage.x83) r0     // Catch: java.lang.Throwable -> L12e
            boolean r15 = r0 instanceof defpackage.t83     // Catch: java.lang.Throwable -> L12e
            if (r15 == 0) goto L130
            r11.X = r0     // Catch: java.lang.Throwable -> L12e
            goto L130
        L12e:
            r0 = move-exception
            goto L183
        L130:
            boolean r15 = r0 instanceof defpackage.v83     // Catch: java.lang.Throwable -> L12e
            if (r15 == 0) goto L13a
            su.happ.proxyutility.dto.ImportResult r1 = new su.happ.proxyutility.dto.ImportResult     // Catch: java.lang.Throwable -> L12e
            r1.<init>(r5, r0, r7, r4)     // Catch: java.lang.Throwable -> L12e
            return r1
        L13a:
            boolean r15 = r0 instanceof defpackage.k83     // Catch: java.lang.Throwable -> L12e
            if (r15 == 0) goto L144
            su.happ.proxyutility.dto.ImportResult r1 = new su.happ.proxyutility.dto.ImportResult     // Catch: java.lang.Throwable -> L12e
            r1.<init>(r5, r0, r7, r4)     // Catch: java.lang.Throwable -> L12e
            return r1
        L144:
            boolean r0 = r0 instanceof defpackage.w83     // Catch: java.lang.Throwable -> L12e
            if (r0 == 0) goto L14e
            int r0 = r12.X     // Catch: java.lang.Throwable -> L12e
            int r0 = r0 + 1
            r12.X = r0     // Catch: java.lang.Throwable -> L12e
        L14e:
            r0 = r8
            r8 = r12
            r12 = r6
            r6 = r16
            goto Lee
        L154:
            int r0 = r8.X     // Catch: java.lang.Throwable -> L12e
            if (r0 <= 0) goto L15a
            r11.X = r7     // Catch: java.lang.Throwable -> L12e
        L15a:
            i(r0, r14, r9, r10)     // Catch: java.lang.Throwable -> L12e
            su.happ.proxyutility.HappApplication r0 = su.happ.proxyutility.HappApplication.M0     // Catch: java.lang.Throwable -> L12e
            su.happ.proxyutility.HappApplication r0 = k32.i()     // Catch: java.lang.Throwable -> L12e
            kf4 r0 = r0.d()     // Catch: java.lang.Throwable -> L12e
            p0 r1 = new p0     // Catch: java.lang.Throwable -> L12e
            r2 = 28
            r1.<init>(r13, r8, r2)     // Catch: java.lang.Throwable -> L12e
            r0.h(r1)     // Catch: java.lang.Throwable -> L12e
            su.happ.proxyutility.dto.ImportResult r0 = new su.happ.proxyutility.dto.ImportResult     // Catch: java.lang.Throwable -> L12e
            int r1 = r8.X     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r2 = r11.X     // Catch: java.lang.Throwable -> L12e
            t83 r2 = (defpackage.t83) r2     // Catch: java.lang.Throwable -> L12e
            r4 = 2
            r0.<init>(r1, r7, r2, r4)     // Catch: java.lang.Throwable -> L12e
            qg5 r1 = new qg5     // Catch: java.lang.Throwable -> L12e
            r1.<init>(r0, r13)     // Catch: java.lang.Throwable -> L12e
            goto L1a1
        L183:
            if (r3 == 0) goto L194
            java.lang.String r1 = gv3.W(r0)
            java.lang.String r2 = "util.protection"
            boolean r1 = fm7.d0(r1, r2, r5)
            if (r1 != 0) goto L194
            r0.printStackTrace()
        L194:
            boolean r1 = r0 instanceof java.lang.InterruptedException
            if (r1 != 0) goto L1f1
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L1f1
            rj6 r1 = new rj6
            r1.<init>(r0)
        L1a1:
            boolean r0 = r1 instanceof rj6
            if (r0 != 0) goto L1e3
            qg5 r1 = (qg5) r1
            java.lang.Object r0 = r1.X
            su.happ.proxyutility.dto.ImportResult r0 = (su.happ.proxyutility.dto.ImportResult) r0
            java.lang.Object r1 = r1.Y
            java.util.Map r1 = (java.util.Map) r1
            x83 r2 = r0.getStatus()
            boolean r2 = r2 instanceof defpackage.v83
            if (r2 == 0) goto L1e2
            if (r1 == 0) goto L1dd
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1c1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1dd
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            su.happ.proxyutility.domain.sub.GuId r2 = (su.happ.proxyutility.domain.sub.GuId) r2
            java.lang.String r2 = r2.b()
            kw4 r3 = defpackage.kw4.a
            defpackage.kw4.q(r2)
            goto L1c1
        L1dd:
            kw4 r1 = defpackage.kw4.a
            defpackage.kw4.r(r9)
        L1e2:
            r1 = r0
        L1e3:
            java.lang.Throwable r0 = sj6.a(r1)
            if (r0 != 0) goto L1ea
            goto L1f0
        L1ea:
            su.happ.proxyutility.dto.ImportResult r1 = new su.happ.proxyutility.dto.ImportResult
            r0 = 7
            r1.<init>(r5, r7, r7, r0)
        L1f0:
            return r1
        L1f1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw2.d(java.lang.String, java.lang.String, boolean, s51):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:72:0x014f, B:74:0x0155, B:76:0x0158, B:79:0x015e, B:22:0x0052, B:48:0x00c0, B:50:0x00c6, B:53:0x00d2, B:55:0x00de, B:58:0x00eb, B:60:0x0100, B:62:0x010c, B:69:0x0130, B:25:0x005d, B:39:0x008e, B:42:0x0096, B:44:0x00a5), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00de A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:72:0x014f, B:74:0x0155, B:76:0x0158, B:79:0x015e, B:22:0x0052, B:48:0x00c0, B:50:0x00c6, B:53:0x00d2, B:55:0x00de, B:58:0x00eb, B:60:0x0100, B:62:0x010c, B:69:0x0130, B:25:0x005d, B:39:0x008e, B:42:0x0096, B:44:0x00a5), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014c, code lost:
    
        if (r14 == r12) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, s51 s51Var) throws Throwable {
        hw2 hw2Var;
        Throwable th;
        GuId rj6Var;
        ea6 ea6Var;
        int i;
        String str3;
        boolean z;
        ea6 ea6Var2;
        String str4;
        x83 x83Var;
        String str5 = str2;
        if (s51Var instanceof hw2) {
            hw2Var = (hw2) s51Var;
            int i2 = hw2Var.l0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hw2Var.l0 = i2 - Integer.MIN_VALUE;
            } else {
                hw2Var = new hw2(this, s51Var);
            }
        } else {
            hw2Var = new hw2(this, s51Var);
        }
        hw2 hw2Var2 = hw2Var;
        Object objP = hw2Var2.j0;
        int i3 = hw2Var2.l0;
        r83 r83Var = r83.a;
        kw2 kw2Var = a;
        w83 w83Var = w83.a;
        c71 c71Var = c71.X;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    i = hw2Var2.h0;
                    ea6 ea6Var3 = hw2Var2.g0;
                    String str6 = hw2Var2.f0;
                    w39.n0(objP);
                    ea6Var = ea6Var3;
                    str5 = str6;
                } else {
                    if (i3 == 2) {
                        z = hw2Var2.i0;
                        i = hw2Var2.h0;
                        ea6Var2 = hw2Var2.g0;
                        str4 = hw2Var2.f0;
                        w39.n0(objP);
                        x83Var = (x83) objP;
                        if (x83Var instanceof u83) {
                            return x83Var;
                        }
                        ea6Var2.X = ((u83) x83Var).a;
                        str3 = str4;
                        ea6Var = ea6Var2;
                        if (!mm7.Z((String) ea6Var.X, false, "http://") || mm7.Z((String) ea6Var.X, false, "https://")) {
                            kw4 kw4Var = kw4.a;
                            Object obj = ea6Var.X;
                            hw2Var2.f0 = null;
                            hw2Var2.g0 = null;
                            hw2Var2.h0 = i;
                            hw2Var2.i0 = z;
                            hw2Var2.l0 = 3;
                            objP = kw4Var.p((String) obj, (String) obj, false, b12.X, str3, hw2Var2);
                        } else {
                            kc6 kc6Var = i47.a;
                            EConfigType.Companion companion = EConfigType.INSTANCE;
                            String str7 = (String) ea6Var.X;
                            companion.getClass();
                            i47 i47VarA = h47.a(EConfigType.Companion.a(str7));
                            if (i47VarA != null) {
                                x83 x83VarB = i47VarA.b((String) ea6Var.X);
                                if (x83VarB instanceof j83) {
                                    ServerConfig serverConfig = ((j83) x83VarB).a;
                                    serverConfig.n(str3);
                                    kw4 kw4Var2 = kw4.a;
                                    GuId.Companion.getClass();
                                    rj6Var = new GuId(kw4.e(GuId.a(), serverConfig));
                                    return sj6.a(rj6Var) == null ? w83Var : r83Var;
                                }
                                if (!z) {
                                    return x83VarB;
                                }
                            } else if (!z) {
                                return r83Var;
                            }
                        }
                        return o83.a;
                    }
                    if (i3 != 3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = hw2Var2.i0;
                    int i4 = hw2Var2.h0;
                    w39.n0(objP);
                }
                x83 x83Var2 = (x83) objP;
                if (x83Var2 instanceof v83) {
                    return v83.a;
                }
                if (x83Var2 instanceof t83) {
                    if (!z) {
                        return (t83) x83Var2;
                    }
                    return o83.a;
                }
                return w83Var;
            }
            w39.n0(objP);
            try {
                ea6 ea6Var4 = new ea6();
                if (str != null) {
                    String str8 = !fm7.o0(str) ? str : null;
                    if (str8 != null) {
                        ea6Var4.X = str8;
                        hw2Var2.f0 = str5;
                        hw2Var2.g0 = ea6Var4;
                        hw2Var2.h0 = 0;
                        hw2Var2.l0 = 1;
                        Object objH = kw2Var.h(str8, str5, true, hw2Var2);
                        if (objH != c71Var) {
                            ea6Var = ea6Var4;
                            objP = objH;
                            i = 0;
                        }
                        return c71Var;
                    }
                }
                return m83.a;
            } catch (Throwable th2) {
                th = th2;
                i3 = 0;
                if (i3 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                    th.printStackTrace();
                }
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (!(((StateCreateProfile) objP) instanceof StateCreateProfile.Create)) {
                String str9 = (String) ea6Var.X;
                str9.getClass();
                boolean Z = mm7.Z(str9, false, "happ://");
                if (Z) {
                    String str10 = (String) ea6Var.X;
                    hw2Var2.f0 = str5;
                    hw2Var2.g0 = ea6Var;
                    hw2Var2.h0 = i;
                    hw2Var2.i0 = Z;
                    hw2Var2.l0 = 2;
                    Object objG = kw2Var.g(str10, str5, hw2Var2);
                    if (objG != c71Var) {
                        String str11 = str5;
                        z = Z;
                        objP = objG;
                        ea6Var2 = ea6Var;
                        str4 = str11;
                        x83Var = (x83) objP;
                        if (x83Var instanceof u83) {
                            return x83Var;
                        }
                        ea6Var2.X = ((u83) x83Var).a;
                        str3 = str4;
                        ea6Var = ea6Var2;
                        if (mm7.Z((String) ea6Var.X, false, "http://")) {
                        }
                        kw4 kw4Var3 = kw4.a;
                        Object obj2 = ea6Var.X;
                        hw2Var2.f0 = null;
                        hw2Var2.g0 = null;
                        hw2Var2.h0 = i;
                        hw2Var2.i0 = z;
                        hw2Var2.l0 = 3;
                        objP = kw4Var3.p((String) obj2, (String) obj2, false, b12.X, str3, hw2Var2);
                    }
                } else {
                    str3 = str5;
                    z = Z;
                    if (mm7.Z((String) ea6Var.X, false, "http://")) {
                    }
                    kw4 kw4Var4 = kw4.a;
                    Object obj3 = ea6Var.X;
                    hw2Var2.f0 = null;
                    hw2Var2.g0 = null;
                    hw2Var2.h0 = i;
                    hw2Var2.i0 = z;
                    hw2Var2.l0 = 3;
                    objP = kw4Var4.p((String) obj3, (String) obj3, false, b12.X, str3, hw2Var2);
                }
                return c71Var;
            }
            return w83Var;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(String str, String str2, s51 s51Var) {
        iw2 iw2Var;
        String rj6Var;
        if (s51Var instanceof iw2) {
            iw2Var = (iw2) s51Var;
            int i = iw2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                iw2Var = new iw2(this, s51Var);
            }
        } else {
            iw2Var = new iw2(this, s51Var);
        }
        iw2 iw2Var2 = iw2Var;
        Object objP = iw2Var2.f0;
        int i2 = iw2Var2.h0;
        w83 w83Var = w83.a;
        if (i2 == 0) {
            w39.n0(objP);
            str.getClass();
            if (!mm7.Z(str, false, "happ://")) {
                return o83.a;
            }
            EDeeplinkType eDeeplinkTypeB = ae1.b(str);
            String strX0 = fm7.x0("happ://", str);
            if (eDeeplinkTypeB == null) {
                bt.q("Required value was null.");
                return null;
            }
            String strC = ae1.c(strX0, eDeeplinkTypeB);
            int i3 = fw2.a[eDeeplinkTypeB.ordinal()];
            s83 s83Var = s83.a;
            switch (i3) {
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                    return new u83(strC);
                case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                case 3:
                case 4:
                case 5:
                case 6:
                    b12 b12VarA = ae1.a(eDeeplinkTypeB);
                    if (b12VarA == null) {
                        bt.q("Required value was null.");
                        return null;
                    }
                    String strU = i21.u(strC, b12VarA);
                    if (!mm7.Z(strU, false, "http://") && !mm7.Z(strU, false, "https://")) {
                        return new u83(strU);
                    }
                    kw4 kw4Var = kw4.a;
                    iw2Var2.h0 = 1;
                    objP = kw4Var.p(strC, str, true, b12VarA, str2, iw2Var2);
                    c71 c71Var = c71.X;
                    if (objP == c71Var) {
                        return c71Var;
                    }
                    break;
                case 7:
                    if (!strC.equals("off")) {
                        return p83.a;
                    }
                    ((MMKV) d.getValue()).p("pref_enable_rules", false);
                    return w83Var;
                case 8:
                    try {
                        ss8 ss8Var = ss8.a;
                        rj6Var = ss8.a(strC);
                        break;
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    return sj6.a(rj6Var) == null ? new k83(rj6Var) : s83Var;
                default:
                    return s83Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objP);
        }
        x83 x83Var = (x83) objP;
        if (x83Var instanceof v83) {
            return v83.a;
        }
        return x83Var instanceof t83 ? x83Var : w83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(String str, String str2, boolean z, s51 s51Var) {
        jw2 jw2Var;
        if (s51Var instanceof jw2) {
            jw2Var = (jw2) s51Var;
            int i = jw2Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw2Var.i0 = i - Integer.MIN_VALUE;
            } else {
                jw2Var = new jw2(this, s51Var);
            }
        } else {
            jw2Var = new jw2(this, s51Var);
        }
        jw2 jw2Var2 = jw2Var;
        Object objT = jw2Var2.g0;
        int i2 = jw2Var2.i0;
        if (i2 == 0) {
            w39.n0(objT);
            if (fm7.o0(str) || !mm7.Z(str, false, "happ://")) {
                return StateCreateProfile.InvalidDeeplink.INSTANCE;
            }
            vz7 vz7Var = e;
            mn6 mn6Var = (mn6) vz7Var.getValue();
            mn6Var.getClass();
            str2.getClass();
            SubRoutingState subRoutingStateQ = mn6Var.q(str2);
            if (subRoutingStateQ != null && subRoutingStateQ.e()) {
                return StateCreateProfile.Ignored.INSTANCE;
            }
            if (ae1.b(str) != EDeeplinkType.ROUTING) {
                return StateCreateProfile.InvalidDeeplink.INSTANCE;
            }
            jw2Var2.f0 = z;
            jw2Var2.i0 = 1;
            objT = ((mn6) vz7Var.getValue()).t(str, str2, new fn6[0], true, jw2Var2);
            c71 c71Var = c71.X;
            if (objT == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = jw2Var2.f0;
            w39.n0(objT);
        }
        Parcelable parcelable = (StateCreateProfile) objT;
        if (z) {
            return parcelable;
        }
        if (!(parcelable instanceof StateCreateProfile.Create) && !(parcelable instanceof StateCreateProfile.Ignored)) {
            if (parcelable instanceof StateCreateProfile.EmptyName) {
                HappApplication happApplication = HappApplication.M0;
                x79.h(k32.i(), y46.routing_settings_profile_name_empty);
                return parcelable;
            }
            if ((parcelable instanceof StateCreateProfile.InvalidDeeplink) || (parcelable instanceof StateCreateProfile.UnknownError)) {
                HappApplication happApplication2 = HappApplication.M0;
                x79.h(k32.i(), y46.routing_import_profile_main_error);
                return parcelable;
            }
            if (!(parcelable instanceof StateCreateProfile.DuplicatedName)) {
                b61.c();
                return null;
            }
            HappApplication happApplication3 = HappApplication.M0;
            x79.h(k32.i(), y46.routing_settings_profile_name_exist);
            return parcelable;
        }
        HappApplication happApplication4 = HappApplication.M0;
        Context applicationContext = k32.i().getApplicationContext();
        applicationContext.getClass();
        parcelable.getClass();
        try {
            Intent intent = new Intent();
            intent.setAction("su.happ.proxyutility.action.activity");
            intent.setPackage("su.happ.proxyutility");
            intent.putExtra("key", 123);
            intent.putExtra("content", parcelable);
            applicationContext.sendBroadcast(intent);
            return parcelable;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return parcelable;
        }
    }
}
