package io.sentry.clientreport;

import defpackage.pc6;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.h7;
import io.sentry.j7;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.g;
import io.sentry.protocol.g0;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.q3;
import io.sentry.s5;
import io.sentry.t5;
import io.sentry.x3;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ a(byte b) {
        this.a = b;
    }

    public static io.sentry.protocol.a b(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            switch (strE0) {
                case "split_names":
                    List list = (List) q3Var.E0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.o0 = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    aVar.Z = q3Var.K();
                    break;
                case "start_type":
                    aVar.l0 = q3Var.K();
                    break;
                case "view_names":
                    List list2 = (List) q3Var.E0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.k0 = list2;
                        break;
                    }
                    break;
                case "app_version":
                    aVar.h0 = q3Var.K();
                    break;
                case "in_foreground":
                    aVar.m0 = q3Var.m0();
                    break;
                case "build_type":
                    aVar.f0 = q3Var.K();
                    break;
                case "app_identifier":
                    aVar.X = q3Var.K();
                    break;
                case "app_start_time":
                    aVar.Y = q3Var.l0(iLogger);
                    break;
                case "permissions":
                    aVar.j0 = io.sentry.util.b.p((Map) q3Var.E0());
                    break;
                case "app_name":
                    aVar.g0 = q3Var.K();
                    break;
                case "app_build":
                    aVar.i0 = q3Var.K();
                    break;
                case "is_split_apks":
                    aVar.n0 = q3Var.m0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q3Var.z(iLogger, concurrentHashMap, strE0);
                    break;
            }
        }
        aVar.p0 = concurrentHashMap;
        q3Var.j0();
        return aVar;
    }

    public static io.sentry.protocol.e c(q3 q3Var, ILogger iLogger) {
        byte b;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        q3Var.F0();
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            byte b2 = 11;
            switch (strE0) {
                case "device":
                    b = 0;
                    break;
                case "spring":
                    b = 1;
                    break;
                case "response":
                    b = 2;
                    break;
                case "profile":
                    b = 3;
                    break;
                case "feedback":
                    b = 4;
                    break;
                case "os":
                    b = 5;
                    break;
                case "app":
                    b = 6;
                    break;
                case "art":
                    b = 7;
                    break;
                case "gpu":
                    b = 8;
                    break;
                case "flags":
                    b = 9;
                    break;
                case "trace":
                    b = 10;
                    break;
                case "browser":
                    b = 11;
                    break;
                case "runtime":
                    b = 12;
                    break;
                default:
                    b = -1;
                    break;
            }
            ArrayList arrayList = null;
            switch (b) {
                case 0:
                    eVar.q(d(q3Var, iLogger));
                    break;
                case 1:
                    q3Var.F0();
                    g0 g0Var = new g0();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strE1 = q3Var.e0();
                        strE1.getClass();
                        if (strE1.equals("active_profiles")) {
                            List list = (List) q3Var.E0();
                            if (list != null) {
                                String[] strArr = new String[list.size()];
                                list.toArray(strArr);
                                g0Var.X = strArr;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap, strE1);
                        }
                    }
                    g0Var.Y = concurrentHashMap;
                    q3Var.j0();
                    eVar.w(g0Var);
                    break;
                case 2:
                    q3Var.F0();
                    s sVar = new s();
                    ConcurrentHashMap concurrentHashMap2 = null;
                    while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strE2 = q3Var.e0();
                        strE2.getClass();
                        switch (strE2) {
                            case "status_code":
                                sVar.Z = q3Var.x();
                                break;
                            case "data":
                                sVar.g0 = q3Var.E0();
                                break;
                            case "headers":
                                Map map = (Map) q3Var.E0();
                                if (map != null) {
                                    sVar.Y = io.sentry.util.b.p(map);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "cookies":
                                sVar.X = q3Var.K();
                                break;
                            case "body_size":
                                sVar.f0 = q3Var.A();
                                break;
                            default:
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                q3Var.z(iLogger, concurrentHashMap2, strE2);
                                break;
                        }
                    }
                    sVar.h0 = concurrentHashMap2;
                    q3Var.j0();
                    eVar.u(sVar);
                    break;
                case 3:
                    q3Var.F0();
                    x3 x3Var = new x3(w.Y);
                    ConcurrentHashMap concurrentHashMap3 = null;
                    while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strE3 = q3Var.e0();
                        strE3.getClass();
                        if (strE3.equals("profiler_id")) {
                            w wVar = (w) q3Var.y0(iLogger, new a((byte) 23));
                            if (wVar != null) {
                                x3Var.X = wVar;
                            }
                        } else {
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap3, strE3);
                        }
                    }
                    x3Var.Y = concurrentHashMap3;
                    q3Var.j0();
                    eVar.l(x3Var, "profile");
                    break;
                case 4:
                    eVar.l(e(q3Var, iLogger), "feedback");
                    break;
                case 5:
                    eVar.t(g(q3Var, iLogger));
                    break;
                case 6:
                    eVar.o(b(q3Var, iLogger));
                    break;
                case 7:
                    q3Var.F0();
                    io.sentry.protocol.c cVar = new io.sentry.protocol.c();
                    ConcurrentHashMap concurrentHashMap4 = null;
                    while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strE4 = q3Var.e0();
                        strE4.getClass();
                        switch (strE4) {
                            case "gc.total_time":
                                cVar.Y = q3Var.d0();
                                break;
                            case "memory.free_until_gc":
                                cVar.j0 = q3Var.A();
                                break;
                            case "gc.blocking_time":
                                cVar.f0 = q3Var.d0();
                                break;
                            case "gc.waiting_time":
                                cVar.h0 = q3Var.d0();
                                break;
                            case "memory.free_until_oome":
                                cVar.k0 = q3Var.A();
                                break;
                            case "memory.total":
                                cVar.l0 = q3Var.A();
                                break;
                            case "gc.pre_oome_count":
                                cVar.g0 = q3Var.A();
                                break;
                            case "memory.free":
                                cVar.i0 = q3Var.A();
                                break;
                            case "gc.blocking_count":
                                cVar.Z = q3Var.A();
                                break;
                            case "gc.total_count":
                                cVar.X = q3Var.A();
                                break;
                            case "memory.max":
                                cVar.m0 = q3Var.A();
                                break;
                            default:
                                if (concurrentHashMap4 == null) {
                                    concurrentHashMap4 = new ConcurrentHashMap();
                                }
                                q3Var.z(iLogger, concurrentHashMap4, strE4);
                                break;
                        }
                    }
                    cVar.n0 = concurrentHashMap4;
                    q3Var.j0();
                    eVar.l(cVar, "art");
                    break;
                case 8:
                    eVar.s(f(q3Var, iLogger));
                    break;
                case 9:
                    q3Var.F0();
                    ConcurrentHashMap concurrentHashMap5 = null;
                    while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strE5 = q3Var.e0();
                        strE5.getClass();
                        if (strE5.equals("values")) {
                            arrayList = q3Var.M0(iLogger, new a(b2));
                        } else {
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap5, strE5);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    j jVar = new j(arrayList);
                    jVar.Y = concurrentHashMap5;
                    q3Var.j0();
                    eVar.r(jVar);
                    break;
                case 10:
                    eVar.x(io.sentry.f.c(q3Var, iLogger));
                    break;
                case 11:
                    q3Var.F0();
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    ConcurrentHashMap concurrentHashMap6 = null;
                    while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strE6 = q3Var.e0();
                        strE6.getClass();
                        if (strE6.equals("name")) {
                            dVar.X = q3Var.K();
                        } else if (strE6.equals("version")) {
                            dVar.Y = q3Var.K();
                        } else {
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap6, strE6);
                        }
                    }
                    dVar.Z = concurrentHashMap6;
                    q3Var.j0();
                    eVar.p(dVar);
                    break;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    q3Var.F0();
                    y yVar = new y();
                    ConcurrentHashMap concurrentHashMap7 = null;
                    while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strE7 = q3Var.e0();
                        strE7.getClass();
                        switch (strE7) {
                            case "raw_description":
                                yVar.Z = q3Var.K();
                                break;
                            case "name":
                                yVar.X = q3Var.K();
                                break;
                            case "version":
                                yVar.Y = q3Var.K();
                                break;
                            default:
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                q3Var.z(iLogger, concurrentHashMap7, strE7);
                                break;
                        }
                    }
                    yVar.f0 = concurrentHashMap7;
                    q3Var.j0();
                    eVar.v(yVar);
                    break;
                default:
                    Object objE0 = q3Var.E0();
                    if (objE0 != null) {
                        eVar.l(objE0, strE0);
                    }
                    break;
            }
        }
        q3Var.j0();
        return eVar;
    }

    public static h d(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        h hVar = new h();
        ConcurrentHashMap concurrentHashMap = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            byte b = 10;
            switch (strE0) {
                case "timezone":
                    hVar.B0 = q3Var.I(iLogger);
                    break;
                case "boot_time":
                    if (q3Var.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                        break;
                    } else {
                        hVar.A0 = q3Var.l0(iLogger);
                        break;
                    }
                    break;
                case "simulator":
                    hVar.n0 = q3Var.m0();
                    break;
                case "manufacturer":
                    hVar.Y = q3Var.K();
                    break;
                case "processor_count":
                    hVar.G0 = q3Var.x();
                    break;
                case "orientation":
                    hVar.m0 = (g) q3Var.y0(iLogger, new a(b));
                    break;
                case "battery_temperature":
                    hVar.F0 = q3Var.w0();
                    break;
                case "family":
                    hVar.f0 = q3Var.K();
                    break;
                case "locale":
                    hVar.D0 = q3Var.K();
                    break;
                case "online":
                    hVar.l0 = q3Var.m0();
                    break;
                case "battery_level":
                    hVar.j0 = q3Var.w0();
                    break;
                case "model_id":
                    hVar.h0 = q3Var.K();
                    break;
                case "screen_density":
                    hVar.y0 = q3Var.w0();
                    break;
                case "screen_dpi":
                    hVar.z0 = q3Var.x();
                    break;
                case "free_memory":
                    hVar.p0 = q3Var.A();
                    break;
                case "id":
                    hVar.C0 = q3Var.K();
                    break;
                case "name":
                    hVar.X = q3Var.K();
                    break;
                case "low_memory":
                    hVar.r0 = q3Var.m0();
                    break;
                case "archs":
                    List list = (List) q3Var.E0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        hVar.i0 = strArr;
                        break;
                    }
                    break;
                case "brand":
                    hVar.Z = q3Var.K();
                    break;
                case "model":
                    hVar.g0 = q3Var.K();
                    break;
                case "cpu_description":
                    hVar.I0 = q3Var.K();
                    break;
                case "processor_frequency":
                    hVar.H0 = q3Var.d0();
                    break;
                case "connection_type":
                    hVar.E0 = q3Var.K();
                    break;
                case "chipset":
                    hVar.J0 = q3Var.K();
                    break;
                case "screen_width_pixels":
                    hVar.w0 = q3Var.x();
                    break;
                case "external_storage_size":
                    hVar.u0 = q3Var.A();
                    break;
                case "storage_size":
                    hVar.s0 = q3Var.A();
                    break;
                case "usable_memory":
                    hVar.q0 = q3Var.A();
                    break;
                case "memory_size":
                    hVar.o0 = q3Var.A();
                    break;
                case "charging":
                    hVar.k0 = q3Var.m0();
                    break;
                case "external_free_storage":
                    hVar.v0 = q3Var.A();
                    break;
                case "free_storage":
                    hVar.t0 = q3Var.A();
                    break;
                case "screen_height_pixels":
                    hVar.x0 = q3Var.x();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q3Var.z(iLogger, concurrentHashMap, strE0);
                    break;
            }
        }
        hVar.K0 = concurrentHashMap;
        q3Var.j0();
        return hVar;
    }

    public static k e(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        w wVar = null;
        w wVar2 = null;
        String strK4 = null;
        HashMap map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            switch (strE0) {
                case "associated_event_id":
                    wVar = new w(q3Var.r());
                    break;
                case "replay_id":
                    wVar2 = new w(q3Var.r());
                    break;
                case "url":
                    strK4 = q3Var.K();
                    break;
                case "name":
                    strK3 = q3Var.K();
                    break;
                case "contact_email":
                    strK2 = q3Var.K();
                    break;
                case "message":
                    strK = q3Var.K();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    q3Var.z(iLogger, map, strE0);
                    break;
            }
        }
        q3Var.j0();
        if (strK == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
            iLogger.e(s5.ERROR, "Missing required field \"message\"", illegalStateException);
            throw illegalStateException;
        }
        k kVar = new k(strK);
        kVar.Y = strK2;
        kVar.Z = strK3;
        kVar.f0 = wVar;
        kVar.g0 = wVar2;
        kVar.h0 = strK4;
        kVar.i0 = map;
        return kVar;
    }

    public static m f(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        m mVar = new m();
        ConcurrentHashMap concurrentHashMap = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            switch (strE0) {
                case "npot_support":
                    mVar.k0 = q3Var.K();
                    break;
                case "vendor_id":
                    mVar.Z = q3Var.K();
                    break;
                case "multi_threaded_rendering":
                    mVar.i0 = q3Var.m0();
                    break;
                case "id":
                    mVar.Y = q3Var.x();
                    break;
                case "name":
                    mVar.X = q3Var.K();
                    break;
                case "vendor_name":
                    mVar.f0 = q3Var.K();
                    break;
                case "version":
                    mVar.j0 = q3Var.K();
                    break;
                case "api_type":
                    mVar.h0 = q3Var.K();
                    break;
                case "memory_size":
                    mVar.g0 = q3Var.x();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q3Var.z(iLogger, concurrentHashMap, strE0);
                    break;
            }
        }
        mVar.l0 = concurrentHashMap;
        q3Var.j0();
        return mVar;
    }

    public static q g(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        q qVar = new q();
        ConcurrentHashMap concurrentHashMap = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            switch (strE0) {
                case "rooted":
                    qVar.h0 = q3Var.m0();
                    break;
                case "raw_description":
                    qVar.Z = q3Var.K();
                    break;
                case "name":
                    qVar.X = q3Var.K();
                    break;
                case "build":
                    qVar.f0 = q3Var.K();
                    break;
                case "version":
                    qVar.Y = q3Var.K();
                    break;
                case "kernel_version":
                    qVar.g0 = q3Var.K();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q3Var.z(iLogger, concurrentHashMap, strE0);
                    break;
            }
        }
        qVar.i0 = concurrentHashMap;
        q3Var.j0();
        return qVar;
    }

    public static IllegalStateException h(String str, ILogger iLogger) {
        String strP = pc6.p("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strP);
        iLogger.e(s5.ERROR, strP, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(String str, ILogger iLogger) {
        String strP = pc6.p("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strP);
        iLogger.e(s5.ERROR, strP, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(String str, ILogger iLogger) {
        String strP = pc6.p("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strP);
        iLogger.e(s5.ERROR, strP, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.a2
    public final Object a(q3 q3Var, ILogger iLogger) {
        Double dValueOf;
        byte b = 7;
        byte b2 = 3;
        byte b3 = 1;
        Boolean boolM0 = null;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                q3Var.F0();
                Date dateL0 = null;
                HashMap map = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE0 = q3Var.e0();
                    strE0.getClass();
                    if (strE0.equals("discarded_events")) {
                        arrayList.addAll(q3Var.M0(iLogger, new a(b3)));
                    } else if (strE0.equals("timestamp")) {
                        dateL0 = q3Var.l0(iLogger);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        q3Var.z(iLogger, map, strE0);
                    }
                }
                q3Var.j0();
                if (dateL0 == null) {
                    throw h("timestamp", iLogger);
                }
                if (arrayList.isEmpty()) {
                    throw h("discarded_events", iLogger);
                }
                b bVar = new b(dateL0, arrayList);
                bVar.Z = map;
                return bVar;
            case 1:
                q3Var.F0();
                String strK = null;
                String strK2 = null;
                Long lA = null;
                HashMap map2 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    switch (strE1) {
                        case "quantity":
                            lA = q3Var.A();
                            break;
                        case "reason":
                            strK = q3Var.K();
                            break;
                        case "category":
                            strK2 = q3Var.K();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            q3Var.z(iLogger, map2, strE1);
                            break;
                    }
                }
                q3Var.j0();
                if (strK == null) {
                    throw i("reason", iLogger);
                }
                if (strK2 == null) {
                    throw i("category", iLogger);
                }
                if (lA == null) {
                    throw i("quantity", iLogger);
                }
                e eVar = new e(strK, strK2, lA);
                eVar.f0 = map2;
                return eVar;
            case 2:
                q3Var.F0();
                io.sentry.profilemeasurements.a aVar = new io.sentry.profilemeasurements.a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE2 = q3Var.e0();
                    strE2.getClass();
                    if (strE2.equals("values")) {
                        ArrayList arrayListM0 = q3Var.M0(iLogger, new a(b2));
                        if (arrayListM0 != null) {
                            aVar.Z = arrayListM0;
                        }
                    } else if (strE2.equals("unit")) {
                        String strK3 = q3Var.K();
                        if (strK3 != null) {
                            aVar.Y = strK3;
                        }
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q3Var.z(iLogger, concurrentHashMap, strE2);
                    }
                }
                aVar.X = concurrentHashMap;
                q3Var.j0();
                return aVar;
            case 3:
                q3Var.F0();
                io.sentry.profilemeasurements.b bVar2 = new io.sentry.profilemeasurements.b(0L, 0, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE3 = q3Var.e0();
                    strE3.getClass();
                    switch (strE3) {
                        case "elapsed_since_start_ns":
                            String strK4 = q3Var.K();
                            if (strK4 != null) {
                                bVar2.Z = strK4;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "timestamp":
                            try {
                                dValueOf = q3Var.d0();
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateL1 = q3Var.l0(iLogger);
                                dValueOf = dateL1 != null ? Double.valueOf(dateL1.getTime() / 1000.0d) : null;
                            }
                            if (dValueOf != null) {
                                bVar2.Y = dValueOf.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "value":
                            Double dD0 = q3Var.d0();
                            if (dD0 != null) {
                                bVar2.f0 = dD0.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap2, strE3);
                            break;
                    }
                }
                bVar2.X = concurrentHashMap2;
                q3Var.j0();
                return bVar2;
            case 4:
                return b(q3Var, iLogger);
            case 5:
                q3Var.F0();
                io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE4 = q3Var.e0();
                    strE4.getClass();
                    if (strE4.equals("name")) {
                        dVar.X = q3Var.K();
                    } else if (strE4.equals("version")) {
                        dVar.Y = q3Var.K();
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        q3Var.z(iLogger, concurrentHashMap3, strE4);
                    }
                }
                dVar.Z = concurrentHashMap3;
                q3Var.j0();
                return dVar;
            case 6:
                return c(q3Var, iLogger);
            case 7:
                DebugImage debugImage = new DebugImage();
                q3Var.F0();
                AbstractMap map3 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE5 = q3Var.e0();
                    strE5.getClass();
                    switch (strE5) {
                        case "debug_file":
                            debugImage.debugFile = q3Var.K();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = q3Var.K();
                            break;
                        case "image_size":
                            debugImage.imageSize = q3Var.A();
                            break;
                        case "code_file":
                            debugImage.codeFile = q3Var.K();
                            break;
                        case "arch":
                            debugImage.arch = q3Var.K();
                            break;
                        case "type":
                            debugImage.type = q3Var.K();
                            break;
                        case "uuid":
                            debugImage.uuid = q3Var.K();
                            break;
                        case "debug_id":
                            debugImage.debugId = q3Var.K();
                            break;
                        case "code_id":
                            debugImage.codeId = q3Var.K();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            q3Var.z(iLogger, map3, strE5);
                            break;
                    }
                }
                q3Var.j0();
                debugImage.setUnknown(map3);
                return debugImage;
            case 8:
                io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                q3Var.F0();
                HashMap map4 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE6 = q3Var.e0();
                    strE6.getClass();
                    if (strE6.equals("images")) {
                        fVar.Y = q3Var.M0(iLogger, new a(b));
                    } else if (strE6.equals("sdk_info")) {
                        fVar.X = (t) q3Var.y0(iLogger, new a((byte) 20));
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        q3Var.z(iLogger, map4, strE6);
                    }
                }
                q3Var.j0();
                fVar.Z = map4;
                return fVar;
            case 9:
                return d(q3Var, iLogger);
            case 10:
                return g.valueOf(q3Var.r().toUpperCase(Locale.ROOT));
            case 11:
                q3Var.F0();
                String strK5 = null;
                ConcurrentHashMap concurrentHashMap4 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE7 = q3Var.e0();
                    strE7.getClass();
                    if (strE7.equals("result")) {
                        boolM0 = q3Var.m0();
                    } else if (strE7.equals("flag")) {
                        strK5 = q3Var.K();
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        q3Var.z(iLogger, concurrentHashMap4, strE7);
                    }
                }
                if (strK5 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    iLogger.e(s5.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (boolM0 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    iLogger.e(s5.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                i iVar = new i(strK5, boolM0.booleanValue());
                iVar.Z = concurrentHashMap4;
                q3Var.j0();
                return iVar;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return e(q3Var, iLogger);
            case 13:
                q3Var.F0();
                l lVar = new l();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE8 = q3Var.e0();
                    strE8.getClass();
                    switch (strE8) {
                        case "region":
                            lVar.Z = q3Var.K();
                            break;
                        case "city":
                            lVar.X = q3Var.K();
                            break;
                        case "country_code":
                            lVar.Y = q3Var.K();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap5, strE8);
                            break;
                    }
                }
                lVar.f0 = concurrentHashMap5;
                q3Var.j0();
                return lVar;
            case 14:
                return f(q3Var, iLogger);
            case 15:
                q3Var.F0();
                Number number = null;
                String strK6 = null;
                AbstractMap concurrentHashMap6 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE9 = q3Var.e0();
                    strE9.getClass();
                    if (strE9.equals("unit")) {
                        strK6 = q3Var.K();
                    } else if (strE9.equals("value")) {
                        number = (Number) q3Var.E0();
                    } else {
                        if (concurrentHashMap6 == null) {
                            concurrentHashMap6 = new ConcurrentHashMap();
                        }
                        q3Var.z(iLogger, concurrentHashMap6, strE9);
                    }
                }
                q3Var.j0();
                if (number != null) {
                    n nVar = new n(number, strK6);
                    nVar.f0 = concurrentHashMap6;
                    return nVar;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"value\"");
                iLogger.e(s5.ERROR, "Missing required field \"value\"", illegalStateException3);
                throw illegalStateException3;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                o oVar = new o();
                q3Var.F0();
                HashMap map5 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE10 = q3Var.e0();
                    strE10.getClass();
                    switch (strE10) {
                        case "description":
                            oVar.Y = q3Var.K();
                            break;
                        case "exception_id":
                            oVar.j0 = q3Var.x();
                            break;
                        case "data":
                            oVar.h0 = io.sentry.util.b.p((Map) q3Var.E0());
                            break;
                        case "meta":
                            oVar.g0 = io.sentry.util.b.p((Map) q3Var.E0());
                            break;
                        case "type":
                            oVar.X = q3Var.K();
                            break;
                        case "handled":
                            oVar.f0 = q3Var.m0();
                            break;
                        case "synthetic":
                            oVar.i0 = q3Var.m0();
                            break;
                        case "is_exception_group":
                            oVar.l0 = q3Var.m0();
                            break;
                        case "help_link":
                            oVar.Z = q3Var.K();
                            break;
                        case "parent_id":
                            oVar.k0 = q3Var.x();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            q3Var.z(iLogger, map5, strE10);
                            break;
                    }
                }
                q3Var.j0();
                oVar.m0 = map5;
                return oVar;
            case 17:
                q3Var.F0();
                p pVar = new p();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE11 = q3Var.e0();
                    strE11.getClass();
                    switch (strE11) {
                        case "params":
                            List list = (List) q3Var.E0();
                            if (list != null) {
                                pVar.Z = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "message":
                            pVar.Y = q3Var.K();
                            break;
                        case "formatted":
                            pVar.X = q3Var.K();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap7, strE11);
                            break;
                    }
                }
                pVar.f0 = concurrentHashMap7;
                q3Var.j0();
                return pVar;
            case 18:
                return g(q3Var, iLogger);
            case 19:
                q3Var.F0();
                r rVar = new r();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE12 = q3Var.e0();
                    strE12.getClass();
                    switch (strE12) {
                        case "fragment":
                            rVar.l0 = q3Var.K();
                            break;
                        case "method":
                            rVar.Y = q3Var.K();
                            break;
                        case "env":
                            Map map6 = (Map) q3Var.E0();
                            if (map6 != null) {
                                rVar.i0 = io.sentry.util.b.p(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            rVar.X = q3Var.K();
                            break;
                        case "data":
                            rVar.f0 = q3Var.E0();
                            break;
                        case "other":
                            Map map7 = (Map) q3Var.E0();
                            if (map7 != null) {
                                rVar.k0 = io.sentry.util.b.p(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map8 = (Map) q3Var.E0();
                            if (map8 != null) {
                                rVar.h0 = io.sentry.util.b.p(map8);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            rVar.g0 = q3Var.K();
                            break;
                        case "body_size":
                            rVar.j0 = q3Var.A();
                            break;
                        case "query_string":
                            rVar.Z = q3Var.K();
                            break;
                        case "api_target":
                            rVar.m0 = q3Var.K();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap8, strE12);
                            break;
                    }
                }
                rVar.n0 = concurrentHashMap8;
                q3Var.j0();
                return rVar;
            case 20:
                t tVar = new t();
                q3Var.F0();
                HashMap map9 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE13 = q3Var.e0();
                    strE13.getClass();
                    switch (strE13) {
                        case "sdk_name":
                            tVar.X = q3Var.K();
                            break;
                        case "version_patchlevel":
                            tVar.f0 = q3Var.x();
                            break;
                        case "version_major":
                            tVar.Y = q3Var.x();
                            break;
                        case "version_minor":
                            tVar.Z = q3Var.x();
                            break;
                        default:
                            if (map9 == null) {
                                map9 = new HashMap();
                            }
                            q3Var.z(iLogger, map9, strE13);
                            break;
                    }
                }
                q3Var.j0();
                tVar.g0 = map9;
                return tVar;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                q3Var.F0();
                String strR = null;
                String strR2 = null;
                HashMap map10 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE14 = q3Var.e0();
                    strE14.getClass();
                    switch (strE14) {
                        case "name":
                            strR = q3Var.r();
                            break;
                        case "version":
                            strR2 = q3Var.r();
                            break;
                        case "packages":
                            ArrayList arrayListM1 = q3Var.M0(iLogger, new a((byte) 24));
                            if (arrayListM1 != null) {
                                arrayList2.addAll(arrayListM1);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "integrations":
                            List list2 = (List) q3Var.E0();
                            if (list2 != null) {
                                arrayList3.addAll(list2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            q3Var.z(iLogger, map10, strE14);
                            break;
                    }
                }
                q3Var.j0();
                if (strR == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.e(s5.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strR2 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                    iLogger.e(s5.ERROR, "Missing required field \"version\"", illegalStateException5);
                    throw illegalStateException5;
                }
                u uVar = new u(strR, strR2);
                uVar.Z = new CopyOnWriteArraySet(arrayList2);
                uVar.f0 = new CopyOnWriteArraySet(arrayList3);
                uVar.g0 = map10;
                return uVar;
            case 22:
                v vVar = new v();
                q3Var.F0();
                HashMap map11 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE15 = q3Var.e0();
                    strE15.getClass();
                    switch (strE15) {
                        case "thread_id":
                            vVar.f0 = q3Var.A();
                            break;
                        case "module":
                            vVar.Z = q3Var.K();
                            break;
                        case "type":
                            vVar.X = q3Var.K();
                            break;
                        case "value":
                            vVar.Y = q3Var.K();
                            break;
                        case "mechanism":
                            vVar.h0 = (o) q3Var.y0(iLogger, new a((byte) 16));
                            break;
                        case "stacktrace":
                            vVar.g0 = (c0) q3Var.y0(iLogger, new a((byte) 28));
                            break;
                        default:
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            q3Var.z(iLogger, map11, strE15);
                            break;
                    }
                }
                q3Var.j0();
                vVar.i0 = map11;
                return vVar;
            case 23:
                return new w(q3Var.r());
            case 24:
                q3Var.F0();
                String strR3 = null;
                String strR4 = null;
                HashMap map12 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE16 = q3Var.e0();
                    strE16.getClass();
                    if (strE16.equals("name")) {
                        strR3 = q3Var.r();
                    } else if (strE16.equals("version")) {
                        strR4 = q3Var.r();
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        q3Var.z(iLogger, map12, strE16);
                    }
                }
                q3Var.j0();
                if (strR3 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.e(s5.ERROR, "Missing required field \"name\"", illegalStateException6);
                    throw illegalStateException6;
                }
                if (strR4 != null) {
                    x xVar = new x(strR3, strR4);
                    xVar.Z = map12;
                    return xVar;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"version\"");
                iLogger.e(s5.ERROR, "Missing required field \"version\"", illegalStateException7);
                throw illegalStateException7;
            case 25:
                q3Var.F0();
                y yVar = new y();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE17 = q3Var.e0();
                    strE17.getClass();
                    switch (strE17) {
                        case "raw_description":
                            yVar.Z = q3Var.K();
                            break;
                        case "name":
                            yVar.X = q3Var.K();
                            break;
                        case "version":
                            yVar.Y = q3Var.K();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap9, strE17);
                            break;
                    }
                }
                yVar.f0 = concurrentHashMap9;
                q3Var.j0();
                return yVar;
            case 26:
                q3Var.F0();
                ConcurrentHashMap concurrentHashMap10 = null;
                Map map13 = null;
                HashMap map14 = null;
                Double dValueOf2 = null;
                Double dValueOf3 = null;
                w wVar = null;
                h7 h7Var = null;
                h7 h7Var2 = null;
                String strK7 = null;
                String strK8 = null;
                j7 j7Var = null;
                String strK9 = null;
                Map map15 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE18 = q3Var.e0();
                    strE18.getClass();
                    switch (strE18) {
                        case "span_id":
                            h7Var = new h7(q3Var.r());
                            break;
                        case "parent_span_id":
                            h7Var2 = (h7) q3Var.y0(iLogger, new io.sentry.f((byte) 23));
                            break;
                        case "description":
                            strK8 = q3Var.K();
                            break;
                        case "start_timestamp":
                            try {
                                dValueOf2 = q3Var.d0();
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateL2 = q3Var.l0(iLogger);
                                dValueOf2 = dateL2 == null ? null : Double.valueOf(dateL2.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "origin":
                            strK9 = q3Var.K();
                            break;
                        case "status":
                            j7Var = (j7) q3Var.y0(iLogger, new io.sentry.f((byte) 24));
                            break;
                        case "measurements":
                            map14 = q3Var.Q(iLogger, new a((byte) 15));
                            break;
                        case "op":
                            strK7 = q3Var.K();
                            break;
                        case "data":
                            map15 = (Map) q3Var.E0();
                            break;
                        case "tags":
                            map13 = (Map) q3Var.E0();
                            break;
                        case "timestamp":
                            try {
                                dValueOf3 = q3Var.d0();
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateL3 = q3Var.l0(iLogger);
                                dValueOf3 = dateL3 == null ? null : Double.valueOf(dateL3.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "trace_id":
                            wVar = new w(q3Var.r());
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap10, strE18);
                            break;
                    }
                }
                if (dValueOf2 == null) {
                    throw j("start_timestamp", iLogger);
                }
                if (wVar == null) {
                    throw j("trace_id", iLogger);
                }
                if (h7Var == null) {
                    throw j("span_id", iLogger);
                }
                if (strK7 == null) {
                    throw j("op", iLogger);
                }
                if (map13 == null) {
                    map13 = new HashMap();
                }
                Map map16 = map13;
                if (map14 == null) {
                    map14 = new HashMap();
                }
                z zVar = new z(dValueOf2, dValueOf3, wVar, h7Var, h7Var2, strK7, strK8, j7Var, strK9, map16, map14, map15);
                zVar.o0 = concurrentHashMap10;
                q3Var.j0();
                return zVar;
            case 27:
                a0 a0Var = new a0();
                q3Var.F0();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE19 = q3Var.e0();
                    strE19.getClass();
                    switch (strE19) {
                        case "post_context":
                            a0Var.Y = (List) q3Var.E0();
                            break;
                        case "image_addr":
                            a0Var.q0 = q3Var.K();
                            break;
                        case "in_app":
                            a0Var.m0 = q3Var.m0();
                            break;
                        case "raw_function":
                            a0Var.w0 = q3Var.K();
                            break;
                        case "lineno":
                            a0Var.i0 = q3Var.x();
                            break;
                        case "module":
                            a0Var.h0 = q3Var.K();
                            break;
                        case "native":
                            a0Var.o0 = q3Var.m0();
                            break;
                        case "symbol":
                            a0Var.u0 = q3Var.K();
                            break;
                        case "package":
                            a0Var.n0 = q3Var.K();
                            break;
                        case "filename":
                            a0Var.f0 = q3Var.K();
                            break;
                        case "symbol_addr":
                            a0Var.r0 = q3Var.K();
                            break;
                        case "lock":
                            a0Var.x0 = (t5) q3Var.y0(iLogger, new io.sentry.f((byte) 12));
                            break;
                        case "vars":
                            a0Var.Z = (Map) q3Var.E0();
                            break;
                        case "colno":
                            a0Var.j0 = q3Var.x();
                            break;
                        case "instruction_addr":
                            a0Var.s0 = q3Var.K();
                            break;
                        case "pre_context":
                            a0Var.X = (List) q3Var.E0();
                            break;
                        case "addr_mode":
                            a0Var.t0 = q3Var.K();
                            break;
                        case "context_line":
                            a0Var.l0 = q3Var.K();
                            break;
                        case "function":
                            a0Var.g0 = q3Var.K();
                            break;
                        case "abs_path":
                            a0Var.k0 = q3Var.K();
                            break;
                        case "platform":
                            a0Var.p0 = q3Var.K();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap11, strE19);
                            break;
                    }
                }
                a0Var.v0 = concurrentHashMap11;
                q3Var.j0();
                return a0Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                c0 c0Var = new c0();
                q3Var.F0();
                ConcurrentHashMap concurrentHashMap12 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE20 = q3Var.e0();
                    strE20.getClass();
                    switch (strE20) {
                        case "frames":
                            c0Var.X = q3Var.M0(iLogger, new a((byte) 27));
                            break;
                        case "instruction_addr_adjustment":
                            c0Var.f0 = (b0) q3Var.y0(iLogger, new a((byte) 29));
                            break;
                        case "registers":
                            c0Var.Y = io.sentry.util.b.p((Map) q3Var.E0());
                            break;
                        case "snapshot":
                            c0Var.Z = q3Var.m0();
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap12, strE20);
                            break;
                    }
                }
                c0Var.g0 = concurrentHashMap12;
                q3Var.j0();
                return c0Var;
            default:
                return b0.valueOf(q3Var.r().toUpperCase(Locale.ROOT));
        }
    }
}
