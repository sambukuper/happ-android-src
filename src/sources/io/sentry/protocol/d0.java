package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.q3;
import io.sentry.s5;
import io.sentry.v5;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements a2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ d0(byte b) {
        this.a = b;
    }

    public static io.sentry.rrweb.a b(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            if (strE0.equals("data")) {
                q3Var.F0();
                ConcurrentHashMap concurrentHashMap = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    if (strE1.equals("payload")) {
                        q3Var.F0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strE2 = q3Var.e0();
                            strE2.getClass();
                            switch (strE2) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapP = io.sentry.util.b.p((Map) q3Var.E0());
                                    if (concurrentHashMapP == null) {
                                        break;
                                    } else {
                                        aVar.k0 = concurrentHashMapP;
                                        break;
                                    }
                                    break;
                                case "type":
                                    aVar.g0 = q3Var.K();
                                    break;
                                case "category":
                                    aVar.h0 = q3Var.K();
                                    break;
                                case "timestamp":
                                    aVar.f0 = q3Var.nextDouble();
                                    break;
                                case "level":
                                    try {
                                        aVar.j0 = s5.valueOf(q3Var.r().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        iLogger.d(s5.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    aVar.i0 = q3Var.K();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    q3Var.z(iLogger, concurrentHashMap2, strE2);
                                    break;
                            }
                        }
                        aVar.m0 = concurrentHashMap2;
                        q3Var.j0();
                    } else if (strE1.equals("tag")) {
                        String strK = q3Var.K();
                        if (strK == null) {
                            strK = _UrlKt.FRAGMENT_ENCODE_SET;
                        }
                        aVar.Z = strK;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q3Var.z(iLogger, concurrentHashMap, strE1);
                    }
                }
                aVar.n0 = concurrentHashMap;
                q3Var.j0();
            } else if (strE0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) q3Var.y0(iLogger, new d0((byte) 10));
                io.sentry.util.b.s(cVar, _UrlKt.FRAGMENT_ENCODE_SET);
                aVar.X = cVar;
            } else if (strE0.equals("timestamp")) {
                aVar.Y = q3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                q3Var.z(iLogger, map, strE0);
            }
        }
        aVar.l0 = map;
        q3Var.j0();
        return aVar;
    }

    public static io.sentry.rrweb.g c(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            if (strE0.equals("data")) {
                q3Var.F0();
                HashMap map2 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    switch (strE1) {
                        case "x":
                            gVar.h0 = q3Var.nextFloat();
                            break;
                        case "y":
                            gVar.i0 = q3Var.nextFloat();
                            break;
                        case "id":
                            gVar.g0 = q3Var.nextInt();
                            break;
                        case "type":
                            gVar.f0 = (io.sentry.rrweb.f) q3Var.y0(iLogger, new d0((byte) 13));
                            break;
                        case "pointerType":
                            gVar.j0 = q3Var.nextInt();
                            break;
                        case "pointerId":
                            gVar.k0 = q3Var.nextInt();
                            break;
                        default:
                            if (!strE1.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                q3Var.z(iLogger, map2, strE1);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) q3Var.y0(iLogger, new d0((byte) 11));
                                io.sentry.util.b.s(dVar, _UrlKt.FRAGMENT_ENCODE_SET);
                                gVar.Z = dVar;
                                break;
                            }
                            break;
                    }
                }
                gVar.m0 = map2;
                q3Var.j0();
            } else if (strE0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) q3Var.y0(iLogger, new d0((byte) 10));
                io.sentry.util.b.s(cVar, _UrlKt.FRAGMENT_ENCODE_SET);
                gVar.X = cVar;
            } else if (strE0.equals("timestamp")) {
                gVar.Y = q3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                q3Var.z(iLogger, map, strE0);
            }
        }
        gVar.l0 = map;
        q3Var.j0();
        return gVar;
    }

    public static io.sentry.rrweb.i d(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            if (strE0.equals("data")) {
                q3Var.F0();
                HashMap map2 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    if (strE1.equals("pointerId")) {
                        iVar.f0 = q3Var.nextInt();
                    } else if (strE1.equals("positions")) {
                        iVar.g0 = q3Var.M0(iLogger, new d0((byte) 15));
                    } else if (strE1.equals("source")) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) q3Var.y0(iLogger, new d0((byte) 11));
                        io.sentry.util.b.s(dVar, _UrlKt.FRAGMENT_ENCODE_SET);
                        iVar.Z = dVar;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        q3Var.z(iLogger, map2, strE1);
                    }
                }
                iVar.i0 = map2;
                q3Var.j0();
            } else if (strE0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) q3Var.y0(iLogger, new d0((byte) 10));
                io.sentry.util.b.s(cVar, _UrlKt.FRAGMENT_ENCODE_SET);
                iVar.X = cVar;
            } else if (strE0.equals("timestamp")) {
                iVar.Y = q3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                q3Var.z(iLogger, map, strE0);
            }
        }
        iVar.h0 = map;
        q3Var.j0();
        return iVar;
    }

    public static io.sentry.rrweb.j e(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            if (strE0.equals("data")) {
                q3Var.F0();
                AbstractMap concurrentHashMap = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    switch (strE1) {
                        case "height":
                            Integer numX = q3Var.x();
                            jVar.f0 = numX != null ? numX.intValue() : 0;
                            break;
                        case "href":
                            String strK = q3Var.K();
                            if (strK == null) {
                                strK = _UrlKt.FRAGMENT_ENCODE_SET;
                            }
                            jVar.Z = strK;
                            break;
                        case "width":
                            Integer numX2 = q3Var.x();
                            jVar.g0 = numX2 != null ? numX2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap, strE1);
                            break;
                    }
                }
                q3Var.j0();
            } else if (strE0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) q3Var.y0(iLogger, new d0((byte) 10));
                io.sentry.util.b.s(cVar, _UrlKt.FRAGMENT_ENCODE_SET);
                jVar.X = cVar;
            } else if (strE0.equals("timestamp")) {
                jVar.Y = q3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                q3Var.z(iLogger, map, strE0);
            }
        }
        jVar.h0 = map;
        q3Var.j0();
        return jVar;
    }

    public static io.sentry.rrweb.l f(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            if (strE0.equals("data")) {
                q3Var.F0();
                ConcurrentHashMap concurrentHashMap = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    if (strE1.equals("payload")) {
                        q3Var.F0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strE2 = q3Var.e0();
                            strE2.getClass();
                            switch (strE2) {
                                case "description":
                                    lVar.g0 = q3Var.K();
                                    break;
                                case "endTimestamp":
                                    lVar.i0 = q3Var.nextDouble();
                                    break;
                                case "startTimestamp":
                                    lVar.h0 = q3Var.nextDouble();
                                    break;
                                case "op":
                                    lVar.f0 = q3Var.K();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapP = io.sentry.util.b.p((Map) q3Var.E0());
                                    if (concurrentHashMapP == null) {
                                        break;
                                    } else {
                                        lVar.j0 = concurrentHashMapP;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    q3Var.z(iLogger, concurrentHashMap2, strE2);
                                    break;
                            }
                        }
                        lVar.l0 = concurrentHashMap2;
                        q3Var.j0();
                    } else if (strE1.equals("tag")) {
                        String strK = q3Var.K();
                        if (strK == null) {
                            strK = _UrlKt.FRAGMENT_ENCODE_SET;
                        }
                        lVar.Z = strK;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q3Var.z(iLogger, concurrentHashMap, strE1);
                    }
                }
                lVar.m0 = concurrentHashMap;
                q3Var.j0();
            } else if (strE0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) q3Var.y0(iLogger, new d0((byte) 10));
                io.sentry.util.b.s(cVar, _UrlKt.FRAGMENT_ENCODE_SET);
                lVar.X = cVar;
            } else if (strE0.equals("timestamp")) {
                lVar.Y = q3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                q3Var.z(iLogger, map, strE0);
            }
        }
        lVar.k0 = map;
        q3Var.j0();
        return lVar;
    }

    public static io.sentry.rrweb.m g(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            byte b = 10;
            if (strE0.equals("data")) {
                q3Var.F0();
                ConcurrentHashMap concurrentHashMap = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    if (strE1.equals("payload")) {
                        q3Var.F0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strE2 = q3Var.e0();
                            strE2.getClass();
                            switch (strE2) {
                                case "duration":
                                    mVar.h0 = q3Var.nextLong();
                                    break;
                                case "segmentId":
                                    mVar.f0 = q3Var.nextInt();
                                    break;
                                case "height":
                                    Integer numX = q3Var.x();
                                    mVar.k0 = numX != null ? numX.intValue() : 0;
                                    break;
                                case "container":
                                    String strK = q3Var.K();
                                    if (strK == null) {
                                        strK = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    mVar.j0 = strK;
                                    break;
                                case "frameCount":
                                    Integer numX2 = q3Var.x();
                                    mVar.m0 = numX2 != null ? numX2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numX3 = q3Var.x();
                                    mVar.q0 = numX3 != null ? numX3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numX4 = q3Var.x();
                                    mVar.p0 = numX4 != null ? numX4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lA = q3Var.A();
                                    mVar.g0 = lA == null ? 0L : lA.longValue();
                                    break;
                                case "width":
                                    Integer numX5 = q3Var.x();
                                    mVar.l0 = numX5 != null ? numX5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numX6 = q3Var.x();
                                    mVar.o0 = numX6 != null ? numX6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strK2 = q3Var.K();
                                    if (strK2 == null) {
                                        strK2 = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    mVar.i0 = strK2;
                                    break;
                                case "frameRateType":
                                    String strK3 = q3Var.K();
                                    if (strK3 == null) {
                                        strK3 = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    mVar.n0 = strK3;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    q3Var.z(iLogger, concurrentHashMap2, strE2);
                                    break;
                            }
                        }
                        mVar.s0 = concurrentHashMap2;
                        q3Var.j0();
                    } else if (strE1.equals("tag")) {
                        String strK4 = q3Var.K();
                        if (strK4 == null) {
                            strK4 = _UrlKt.FRAGMENT_ENCODE_SET;
                        }
                        mVar.Z = strK4;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q3Var.z(iLogger, concurrentHashMap, strE1);
                    }
                }
                mVar.t0 = concurrentHashMap;
                q3Var.j0();
            } else if (strE0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) q3Var.y0(iLogger, new d0(b));
                io.sentry.util.b.s(cVar, _UrlKt.FRAGMENT_ENCODE_SET);
                mVar.X = cVar;
            } else if (strE0.equals("timestamp")) {
                mVar.Y = q3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                q3Var.z(iLogger, map, strE0);
            }
        }
        mVar.r0 = map;
        q3Var.j0();
        return mVar;
    }

    @Override // io.sentry.a2
    public final Object a(q3 q3Var, ILogger iLogger) {
        byte b = 7;
        byte b2 = 8;
        byte b3 = 6;
        switch (this.a) {
            case 0:
                e0 e0Var = new e0();
                q3Var.F0();
                ConcurrentHashMap concurrentHashMap = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE0 = q3Var.e0();
                    strE0.getClass();
                    switch (strE0) {
                        case "daemon":
                            e0Var.i0 = q3Var.m0();
                            break;
                        case "priority":
                            e0Var.Y = q3Var.x();
                            break;
                        case "held_locks":
                            HashMap mapQ = q3Var.Q(iLogger, new io.sentry.f((byte) 12));
                            if (mapQ != null) {
                                e0Var.l0 = new HashMap(mapQ);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            e0Var.X = q3Var.A();
                            break;
                        case "main":
                            e0Var.j0 = q3Var.m0();
                            break;
                        case "name":
                            e0Var.Z = q3Var.K();
                            break;
                        case "state":
                            e0Var.f0 = q3Var.K();
                            break;
                        case "crashed":
                            e0Var.g0 = q3Var.m0();
                            break;
                        case "current":
                            e0Var.h0 = q3Var.m0();
                            break;
                        case "stacktrace":
                            e0Var.k0 = (c0) q3Var.y0(iLogger, new io.sentry.clientreport.a((byte) 28));
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap, strE0);
                            break;
                    }
                }
                e0Var.m0 = concurrentHashMap;
                q3Var.j0();
                return e0Var;
            case 1:
                q3Var.F0();
                f0 f0Var = new f0(new ArrayList(), new HashMap(), new v5(h0.CUSTOM.apiName(), (byte) 1));
                ConcurrentHashMap concurrentHashMap2 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var.e0();
                    strE1.getClass();
                    switch (strE1) {
                        case "start_timestamp":
                            try {
                                Double dD0 = q3Var.d0();
                                if (dD0 != null) {
                                    f0Var.s0 = dD0;
                                }
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateL0 = q3Var.l0(iLogger);
                                if (dateL0 != null) {
                                    f0Var.s0 = Double.valueOf(dateL0.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapQ2 = q3Var.Q(iLogger, new io.sentry.clientreport.a((byte) 15));
                            if (mapQ2 != null) {
                                f0Var.v0.putAll(mapQ2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            q3Var.r();
                            break;
                        case "timestamp":
                            try {
                                Double dD1 = q3Var.d0();
                                if (dD1 != null) {
                                    f0Var.t0 = dD1;
                                }
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateL1 = q3Var.l0(iLogger);
                                if (dateL1 != null) {
                                    f0Var.t0 = Double.valueOf(dateL1.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListM0 = q3Var.M0(iLogger, new io.sentry.clientreport.a((byte) 26));
                            if (arrayListM0 != null) {
                                f0Var.u0.addAll(arrayListM0);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            q3Var.F0();
                            String strK = null;
                            AbstractMap concurrentHashMap3 = null;
                            while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strE2 = q3Var.e0();
                                strE2.getClass();
                                if (strE2.equals("source")) {
                                    strK = q3Var.K();
                                } else {
                                    if (concurrentHashMap3 == null) {
                                        concurrentHashMap3 = new ConcurrentHashMap();
                                    }
                                    q3Var.z(iLogger, concurrentHashMap3, strE2);
                                }
                            }
                            v5 v5Var = new v5(strK, (byte) 1);
                            v5Var.Z = concurrentHashMap3;
                            q3Var.j0();
                            f0Var.w0 = v5Var;
                            break;
                        case "transaction":
                            f0Var.r0 = q3Var.K();
                            break;
                        default:
                            if (io.sentry.config.a.b(f0Var, strE1, q3Var, iLogger)) {
                                break;
                            } else {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                q3Var.z(iLogger, concurrentHashMap2, strE1);
                                break;
                            }
                            break;
                    }
                }
                f0Var.x0 = concurrentHashMap2;
                q3Var.j0();
                return f0Var;
            case 2:
                q3Var.F0();
                i0 i0Var = new i0();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE3 = q3Var.e0();
                    strE3.getClass();
                    switch (strE3) {
                        case "username":
                            i0Var.Z = q3Var.K();
                            break;
                        case "id":
                            i0Var.Y = q3Var.K();
                            break;
                        case "geo":
                            q3Var.F0();
                            l lVar = new l();
                            ConcurrentHashMap concurrentHashMap5 = null;
                            while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strE4 = q3Var.e0();
                                strE4.getClass();
                                switch (strE4) {
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
                                        q3Var.z(iLogger, concurrentHashMap5, strE4);
                                        break;
                                }
                            }
                            lVar.f0 = concurrentHashMap5;
                            q3Var.j0();
                            i0Var.h0 = lVar;
                            break;
                        case "data":
                            i0Var.i0 = io.sentry.util.b.p((Map) q3Var.E0());
                            break;
                        case "name":
                            i0Var.g0 = q3Var.K();
                            break;
                        case "email":
                            i0Var.X = q3Var.K();
                            break;
                        case "ip_address":
                            i0Var.f0 = q3Var.K();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap4, strE3);
                            break;
                    }
                }
                i0Var.j0 = concurrentHashMap4;
                q3Var.j0();
                return i0Var;
            case 3:
                q3Var.F0();
                String strK2 = null;
                ArrayList arrayListM1 = null;
                HashMap map = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE5 = q3Var.e0();
                    strE5.getClass();
                    if (strE5.equals("rendering_system")) {
                        strK2 = q3Var.K();
                    } else if (strE5.equals("windows")) {
                        arrayListM1 = q3Var.M0(iLogger, new d0((byte) 4));
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        q3Var.z(iLogger, map, strE5);
                    }
                }
                q3Var.j0();
                j0 j0Var = new j0(strK2, arrayListM1);
                j0Var.Z = map;
                return j0Var;
            case 4:
                k0 k0Var = new k0();
                q3Var.F0();
                HashMap map2 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE6 = q3Var.e0();
                    strE6.getClass();
                    switch (strE6) {
                        case "rendering_system":
                            k0Var.X = q3Var.K();
                            break;
                        case "identifier":
                            k0Var.Z = q3Var.K();
                            break;
                        case "height":
                            k0Var.h0 = q3Var.d0();
                            break;
                        case "x":
                            k0Var.i0 = q3Var.d0();
                            break;
                        case "y":
                            k0Var.j0 = q3Var.d0();
                            break;
                        case "tag":
                            k0Var.f0 = q3Var.K();
                            break;
                        case "type":
                            k0Var.Y = q3Var.K();
                            break;
                        case "alpha":
                            k0Var.l0 = q3Var.d0();
                            break;
                        case "width":
                            k0Var.g0 = q3Var.d0();
                            break;
                        case "children":
                            k0Var.m0 = q3Var.M0(iLogger, this);
                            break;
                        case "visibility":
                            k0Var.k0 = q3Var.K();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            q3Var.z(iLogger, map2, strE6);
                            break;
                    }
                }
                q3Var.j0();
                k0Var.n0 = map2;
                return k0Var;
            case 5:
                q3Var.F0();
                io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE7 = q3Var.e0();
                    strE7.getClass();
                    switch (strE7) {
                        case "frames":
                            ArrayList arrayListM2 = q3Var.M0(iLogger, new io.sentry.clientreport.a((byte) 27));
                            if (arrayListM2 != null) {
                                aVar.Z = arrayListM2;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "stacks":
                            List list = (List) q3Var.y0(iLogger, new d0(b3));
                            if (list != null) {
                                aVar.Y = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "samples":
                            ArrayList arrayListM3 = q3Var.M0(iLogger, new d0(b));
                            if (arrayListM3 != null) {
                                aVar.X = arrayListM3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "thread_metadata":
                            HashMap mapQ3 = q3Var.Q(iLogger, new d0(b2));
                            if (mapQ3 != null) {
                                aVar.f0 = mapQ3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            q3Var.z(iLogger, concurrentHashMap6, strE7);
                            break;
                    }
                }
                aVar.g0 = concurrentHashMap6;
                q3Var.j0();
                return aVar;
            case 6:
                ArrayList arrayList = new ArrayList();
                q3Var.Q0();
                while (q3Var.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    q3Var.Q0();
                    while (q3Var.hasNext()) {
                        arrayList2.add(Integer.valueOf(q3Var.nextInt()));
                    }
                    q3Var.K0();
                    arrayList.add(arrayList2);
                }
                q3Var.K0();
                return arrayList;
            case 7:
                q3Var.F0();
                io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                AbstractMap map3 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE8 = q3Var.e0();
                    strE8.getClass();
                    switch (strE8) {
                        case "thread_id":
                            bVar.Z = q3Var.K();
                            break;
                        case "timestamp":
                            bVar.X = q3Var.nextDouble();
                            break;
                        case "stack_id":
                            bVar.Y = q3Var.nextInt();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            q3Var.z(iLogger, map3, strE8);
                            break;
                    }
                }
                bVar.f0 = map3;
                q3Var.j0();
                return bVar;
            case 8:
                q3Var.F0();
                io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                HashMap map4 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE9 = q3Var.e0();
                    strE9.getClass();
                    if (strE9.equals("priority")) {
                        cVar.Y = q3Var.nextInt();
                    } else if (strE9.equals("name")) {
                        cVar.X = q3Var.K();
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        q3Var.z(iLogger, map4, strE9);
                    }
                }
                cVar.Z = map4;
                q3Var.j0();
                return cVar;
            case 9:
                return b(q3Var, iLogger);
            case 10:
                return io.sentry.rrweb.c.values()[q3Var.nextInt()];
            case 11:
                return io.sentry.rrweb.d.values()[q3Var.nextInt()];
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return c(q3Var, iLogger);
            case 13:
                return io.sentry.rrweb.f.values()[q3Var.nextInt()];
            case 14:
                return d(q3Var, iLogger);
            case 15:
                q3Var.F0();
                io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                HashMap map5 = null;
                while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE10 = q3Var.e0();
                    strE10.getClass();
                    switch (strE10) {
                        case "x":
                            hVar.Y = q3Var.nextFloat();
                            break;
                        case "y":
                            hVar.Z = q3Var.nextFloat();
                            break;
                        case "id":
                            hVar.X = q3Var.nextInt();
                            break;
                        case "timeOffset":
                            hVar.f0 = q3Var.nextLong();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            q3Var.z(iLogger, map5, strE10);
                            break;
                    }
                }
                hVar.g0 = map5;
                q3Var.j0();
                return hVar;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return e(q3Var, iLogger);
            case 17:
                return f(q3Var, iLogger);
            default:
                return g(q3Var, iLogger);
        }
    }
}
