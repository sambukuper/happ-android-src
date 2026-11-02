package io.sentry.android.core.internal.modules;

import defpackage.aw0;
import defpackage.d02;
import defpackage.dh3;
import defpackage.dt7;
import defpackage.fm7;
import defpackage.iq0;
import defpackage.mm7;
import defpackage.nw3;
import defpackage.o76;
import defpackage.oc;
import defpackage.s91;
import defpackage.t21;
import defpackage.u15;
import defpackage.wv0;
import io.sentry.a0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.ndk.b;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.capture.k;
import io.sentry.android.replay.d0;
import io.sentry.android.replay.g0;
import io.sentry.android.replay.i;
import io.sentry.android.replay.l;
import io.sentry.android.replay.m;
import io.sentry.android.replay.o;
import io.sentry.android.replay.z;
import io.sentry.cache.g;
import io.sentry.f4;
import io.sentry.f7;
import io.sentry.i1;
import io.sentry.internal.modules.f;
import io.sentry.n0;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.w;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t2;
import io.sentry.t6;
import io.sentry.u6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ a(b bVar, f7 f7Var) {
        this.X = (byte) 1;
        this.Y = f7Var;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x034a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [int] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19, types: [io.sentry.android.replay.f] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r31v0, types: [io.sentry.t6] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        File file;
        Throwable th;
        Object objH;
        Object objValueOf;
        String str;
        boolean z;
        boolean zF;
        ?? r7;
        Object obj;
        LinkedList linkedList;
        List list;
        Field field;
        byte b = this.X;
        Throwable th2 = null;
        ?? fVar = 0;
        byte b2 = 1;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                ((f) obj2).a();
                return;
            case 1:
                f7 f7Var = (f7) obj2;
                NativeScope.nativeSetTrace(f7Var.X.a(), f7Var.Y.a());
                return;
            case 2:
                ReplayIntegration replayIntegration = (ReplayIntegration) obj2;
                SentryAndroidOptions sentryAndroidOptions = replayIntegration.f0;
                if (sentryAndroidOptions == null) {
                    dh3.T("options");
                    throw null;
                }
                g gVarFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    SentryAndroidOptions sentryAndroidOptions2 = replayIntegration.f0;
                    if (sentryAndroidOptions2 == null) {
                        dh3.T("options");
                        throw null;
                    }
                    String str2 = (String) gVarFindPersistingScopeObserver.j(sentryAndroidOptions2, "replay.json", String.class);
                    if (str2 != null) {
                        w wVar = new w(str2);
                        if (wVar.equals(w.Y)) {
                            replayIntegration.a0(_UrlKt.FRAGMENT_ENCODE_SET);
                            return;
                        }
                        SentryAndroidOptions sentryAndroidOptions3 = replayIntegration.f0;
                        if (sentryAndroidOptions3 == null) {
                            dh3.T("options");
                            throw null;
                        }
                        String cacheDirPath = sentryAndroidOptions3.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            sentryAndroidOptions3.getLogger().h(s5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            String cacheDirPath2 = sentryAndroidOptions3.getCacheDirPath();
                            cacheDirPath2.getClass();
                            file = new File(cacheDirPath2, "replay_" + wVar);
                            file.mkdirs();
                        }
                        File file2 = new File(file, ".ongoing_segment");
                        boolean zExists = file2.exists();
                        d02 d02Var = d02.X;
                        if (zExists) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), iq0.a), 8192);
                            try {
                                Iterator it = ((t21) dt7.c(bufferedReader)).iterator();
                                while (it.hasNext()) {
                                    Throwable th3 = th2;
                                    List listF0 = fm7.F0((String) it.next(), new String[]{"="}, 2);
                                    linkedHashMap.put((String) listF0.get(0), (String) listF0.get(1));
                                    th2 = th3;
                                }
                                th = th2;
                                bufferedReader.close();
                                String str3 = (String) linkedHashMap.get("config.height");
                                Object objB0 = str3 != null ? mm7.b0(str3) : th;
                                String str4 = (String) linkedHashMap.get("config.width");
                                ?? B0 = str4 != null ? mm7.b0(str4) : th;
                                String str5 = (String) linkedHashMap.get("config.frame-rate");
                                ?? B1 = str5 != null ? mm7.b0(str5) : th;
                                String str6 = (String) linkedHashMap.get("config.bit-rate");
                                ?? B2 = str6 != null ? mm7.b0(str6) : th;
                                String str7 = (String) linkedHashMap.get("segment.id");
                                ?? B3 = str7 != null ? mm7.b0(str7) : th;
                                try {
                                    String str8 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str8 == null) {
                                        str8 = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    objH = io.sentry.config.a.h(str8);
                                } catch (Throwable unused) {
                                    objH = th;
                                }
                                try {
                                    String str9 = (String) linkedHashMap.get("replay.type");
                                    if (str9 == null) {
                                        str9 = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    objValueOf = t6.valueOf(str9);
                                } catch (Throwable unused2) {
                                    objValueOf = th;
                                }
                                if (objB0 == null || B0 == 0 || B1 == 0 || B2 == 0 || B3 == 0) {
                                    str = "options";
                                } else {
                                    ?? r18 = objB0;
                                    str = "options";
                                    if (B3.intValue() != -1 && objH != null && objValueOf != null) {
                                        d0 d0Var = new d0(B0.intValue(), r18.intValue(), 1.0f, 1.0f, B1.intValue(), B2.intValue());
                                        l lVar = new l(sentryAndroidOptions3, wVar);
                                        File fileM = lVar.m();
                                        if (fileM != null) {
                                            fileM.listFiles(new a0(lVar, (byte) 1));
                                        }
                                        ArrayList arrayList = lVar.j0;
                                        if (arrayList.isEmpty()) {
                                            sentryAndroidOptions3.getLogger().h(s5.DEBUG, "No frames found for replay: %s, deleting the replay", wVar);
                                            io.sentry.util.b.g(file);
                                        } else {
                                            if (arrayList.size() > 1) {
                                                z = false;
                                                aw0.c0(arrayList, new i((byte) 0));
                                            } else {
                                                z = false;
                                            }
                                            String str10 = (String) linkedHashMap.get("replay.flushed");
                                            if (str10 != null) {
                                                zF = dh3.f(str10.equals("true") ? Boolean.TRUE : str10.equals("false") ? Boolean.FALSE : th, Boolean.TRUE);
                                            } else {
                                                zF = z;
                                            }
                                            t6 t6Var = t6.SESSION;
                                            ?? IntValue = (objValueOf == t6Var || zF) ? B3.intValue() : z;
                                            ?? date = objValueOf == t6Var ? objH : new Date(((m) wv0.r0(arrayList)).b);
                                            long time = (((m) wv0.A0(arrayList)).b - date.getTime()) + ((long) (XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax / B1.intValue()));
                                            String str11 = (String) linkedHashMap.get("replay.recording");
                                            if (str11 != null) {
                                                f4 f4Var = (f4) sentryAndroidOptions3.getSerializer().b(new StringReader(str11), f4.class);
                                                if (f4Var != null) {
                                                    list = f4Var.Y;
                                                } else {
                                                    obj = th;
                                                }
                                                if (obj != null) {
                                                    List list2 = f4Var.Y;
                                                    list2.getClass();
                                                    linkedList = new LinkedList(list2);
                                                } else {
                                                    r7 = th;
                                                }
                                                if (r7 == 0) {
                                                    obj = list;
                                                    obj = list;
                                                    r7 = linkedList;
                                                    r7 = d02Var;
                                                }
                                            } else {
                                                obj = list;
                                                obj = list;
                                                r7 = linkedList;
                                                r7 = d02Var;
                                            }
                                            obj = list;
                                            obj = list;
                                            r7 = linkedList;
                                            fVar = new io.sentry.android.replay.f(d0Var, lVar, date, IntValue, time, objValueOf, (String) linkedHashMap.get("replay.screen-at-start"), wv0.S0(r7, new i((byte) 1)));
                                        }
                                    }
                                    fVar = th;
                                }
                                sentryAndroidOptions3.getLogger().h(s5.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", wVar);
                                io.sentry.util.b.g(file);
                                fVar = th;
                                break;
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    oc.h(bufferedReader, th4);
                                    throw th5;
                                }
                            }
                        } else {
                            sentryAndroidOptions3.getLogger().h(s5.DEBUG, "No ongoing segment found for replay: %s", wVar);
                            io.sentry.util.b.g(file);
                            th = null;
                            str = "options";
                        }
                        if (fVar == 0) {
                            replayIntegration.a0(_UrlKt.FRAGMENT_ENCODE_SET);
                            return;
                        }
                        SentryAndroidOptions sentryAndroidOptions4 = replayIntegration.f0;
                        if (sentryAndroidOptions4 == null) {
                            dh3.T(str);
                            throw th;
                        }
                        Object objJ = gVarFindPersistingScopeObserver.j(sentryAndroidOptions4, "breadcrumbs.json", List.class);
                        ?? r21 = objJ instanceof List ? (List) objJ : th;
                        i1 i1Var = replayIntegration.g0;
                        SentryAndroidOptions sentryAndroidOptions5 = replayIntegration.f0;
                        if (sentryAndroidOptions5 == null) {
                            dh3.T(str);
                            throw th;
                        }
                        long j = fVar.e;
                        Date date2 = fVar.c;
                        int i = fVar.d;
                        d0 d0Var2 = fVar.a;
                        k kVarA = h.a(i1Var, sentryAndroidOptions5, j, date2, wVar, i, d0Var2.b, d0Var2.a, fVar.f, fVar.b, d0Var2.e, d0Var2.f, fVar.g, r21, new LinkedList(fVar.h), d02Var, d02Var);
                        if (kVarA instanceof io.sentry.android.replay.capture.i) {
                            n0 n0VarF = io.sentry.util.b.f(new o());
                            io.sentry.android.replay.capture.i iVar = (io.sentry.android.replay.capture.i) kVarA;
                            i1 i1Var2 = replayIntegration.g0;
                            if (i1Var2 != null) {
                                u6 u6Var = iVar.a;
                                n0VarF.h = iVar.b;
                                i1Var2.r(u6Var, n0VarF);
                            }
                        }
                        replayIntegration.a0(str2);
                        return;
                    }
                }
                replayIntegration.a0(_UrlKt.FRAGMENT_ENCODE_SET);
                return;
            case 3:
                io.sentry.android.replay.a0 a0Var = (io.sentry.android.replay.a0) obj2;
                if (a0Var.X.get()) {
                    return;
                }
                try {
                    Object value = g0.b.getValue();
                    if (value == null || (field = (Field) g0.c.getValue()) == null) {
                        return;
                    }
                    Object obj3 = field.get(value);
                    obj3.getClass();
                    ArrayList arrayList2 = (ArrayList) obj3;
                    io.sentry.util.a aVar = a0Var.Y;
                    aVar.g();
                    try {
                        z zVar = a0Var.f0;
                        zVar.addAll(arrayList2);
                        u15.h(aVar, null);
                        field.set(value, zVar);
                        return;
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            u15.h(aVar, th6);
                            throw th7;
                        }
                    }
                } catch (Throwable unused3) {
                    return;
                }
            case 4:
                c cVar = (c) obj2;
                l lVar2 = cVar.h;
                if (lVar2 != null) {
                    lVar2.close();
                }
                cVar.k.set(0L);
                cVar.m(null);
                w wVar2 = w.Y;
                wVar2.getClass();
                io.sentry.android.replay.capture.a aVar2 = cVar.m;
                nw3 nw3Var = c.u[3];
                aVar2.getClass();
                nw3Var.getClass();
                Object andSet = aVar2.b.getAndSet(wVar2);
                if (dh3.f(andSet, wVar2)) {
                    return;
                }
                o76 o76Var = new o76(andSet, wVar2, aVar2.d, b2);
                c cVar2 = aVar2.c;
                s6 s6Var = cVar2.a;
                if (s6Var.getThreadChecker().c()) {
                    cVar2.e.submit(new io.sentry.android.replay.util.h(new t2(o76Var, b2), "CaptureStrategy.runInBackground"));
                    return;
                }
                try {
                    o76Var.invoke();
                    return;
                } catch (Throwable th8) {
                    s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th8);
                    return;
                }
            default:
                s91 s91Var = (s91) obj2;
                Iterator it2 = ((CopyOnWriteArrayList) s91Var.g0).iterator();
                while (it2.hasNext()) {
                    ((io.sentry.transport.o) it2.next()).p(s91Var);
                }
                return;
        }
    }

    public /* synthetic */ a(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
