package io.sentry;

import defpackage.pc6;
import defpackage.x43;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.BuildConfig;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ f(byte b) {
        this.a = b;
    }

    public static w4 b(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        w4 w4Var = new w4();
        w4Var.Z = false;
        ConcurrentHashMap concurrentHashMap = null;
        w4Var.f0 = null;
        w4Var.X = false;
        w4Var.Y = null;
        w4Var.k0 = false;
        w4Var.g0 = null;
        w4Var.h0 = false;
        w4Var.i0 = false;
        w4Var.o0 = y3.MANUAL;
        w4Var.j0 = 0;
        w4Var.l0 = true;
        w4Var.m0 = false;
        w4Var.n0 = true;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            switch (strE0) {
                case "is_enable_app_start_profiling":
                    Boolean boolM0 = q3Var.m0();
                    if (boolM0 != null) {
                        w4Var.l0 = boolM0.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "trace_sampled":
                    Boolean boolM1 = q3Var.m0();
                    if (boolM1 != null) {
                        w4Var.Z = boolM1.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profiling_traces_dir_path":
                    String strK = q3Var.K();
                    if (strK != null) {
                        w4Var.g0 = strK;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_continuous_profiling_enabled":
                    Boolean boolM2 = q3Var.m0();
                    if (boolM2 != null) {
                        w4Var.i0 = boolM2.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_profiling_enabled":
                    Boolean boolM3 = q3Var.m0();
                    if (boolM3 != null) {
                        w4Var.h0 = boolM3.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_start_profiler_on_app_start":
                    Boolean boolM4 = q3Var.m0();
                    if (boolM4 != null) {
                        w4Var.m0 = boolM4.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_sampled":
                    Boolean boolM5 = q3Var.m0();
                    if (boolM5 != null) {
                        w4Var.X = boolM5.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_lifecycle":
                    String strK2 = q3Var.K();
                    if (strK2 != null) {
                        try {
                            w4Var.o0 = y3.valueOf(strK2);
                        } catch (IllegalArgumentException unused) {
                            iLogger.h(s5.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strK2), new Object[0]);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "continuous_profile_sampled":
                    Boolean boolM6 = q3Var.m0();
                    if (boolM6 != null) {
                        w4Var.k0 = boolM6.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profiling_traces_hz":
                    Integer numX = q3Var.x();
                    if (numX != null) {
                        w4Var.j0 = numX.intValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "trace_sample_rate":
                    Double dD0 = q3Var.d0();
                    if (dD0 != null) {
                        w4Var.f0 = dD0;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "enable_legacy_profiling":
                    Boolean boolM7 = q3Var.m0();
                    if (boolM7 != null) {
                        w4Var.n0 = boolM7.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_sample_rate":
                    Double dD1 = q3Var.d0();
                    if (dD1 != null) {
                        w4Var.Y = dD1;
                        break;
                    } else {
                        break;
                    }
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q3Var.z(iLogger, concurrentHashMap, strE0);
                    break;
            }
        }
        w4Var.p0 = concurrentHashMap;
        q3Var.j0();
        return w4Var;
    }

    public static f7 c(q3 q3Var, ILogger iLogger) {
        q3Var.F0();
        io.sentry.protocol.w wVar = null;
        h7 h7Var = null;
        String strR = null;
        ConcurrentHashMap concurrentHashMap = null;
        h7 h7Var2 = null;
        String strR2 = null;
        j7 j7Var = null;
        String strR3 = null;
        ConcurrentHashMap concurrentHashMapP = null;
        Map map = null;
        while (q3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strE0 = q3Var.e0();
            strE0.getClass();
            switch (strE0) {
                case "span_id":
                    h7Var = new h7(q3Var.r());
                    break;
                case "parent_span_id":
                    h7Var2 = (h7) q3Var.y0(iLogger, new f((byte) 23));
                    break;
                case "description":
                    strR2 = q3Var.r();
                    break;
                case "origin":
                    strR3 = q3Var.r();
                    break;
                case "status":
                    j7Var = (j7) q3Var.y0(iLogger, new f((byte) 24));
                    break;
                case "op":
                    strR = q3Var.r();
                    break;
                case "data":
                    map = (Map) q3Var.E0();
                    break;
                case "tags":
                    concurrentHashMapP = io.sentry.util.b.p((Map) q3Var.E0());
                    break;
                case "trace_id":
                    wVar = new io.sentry.protocol.w(q3Var.r());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q3Var.z(iLogger, concurrentHashMap, strE0);
                    break;
            }
        }
        if (wVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            iLogger.e(s5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (h7Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            iLogger.e(s5.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strR == null) {
            strR = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        f7 f7Var = new f7(wVar, h7Var, strR, h7Var2);
        f7Var.h0 = strR2;
        f7Var.i0 = j7Var;
        f7Var.k0 = strR3;
        if (concurrentHashMapP != null) {
            f7Var.j0 = concurrentHashMapP;
        }
        if (map != null) {
            f7Var.l0 = map;
        }
        f7Var.m0 = concurrentHashMap;
        q3Var.j0();
        return f7Var;
    }

    public static IllegalStateException d(String str, ILogger iLogger) {
        String strP = pc6.p("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strP);
        iLogger.e(s5.ERROR, strP, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException e(String str, ILogger iLogger) {
        String strP = pc6.p("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strP);
        iLogger.e(s5.ERROR, strP, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.a2
    public final Object a(q3 q3Var, ILogger iLogger) {
        byte b;
        byte b2;
        ArrayList arrayList;
        q3 q3Var2 = q3Var;
        byte b3 = 17;
        byte b4 = 11;
        byte b5 = 10;
        switch (this.a) {
            case 0:
                char c = 4;
                String strK = null;
                char c2 = 3;
                q3Var2.F0();
                Date date = new Date();
                ConcurrentHashMap concurrentHashMap = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                s5 s5VarValueOf = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE0 = q3Var2.e0();
                    strE0.getClass();
                    switch (strE0.hashCode()) {
                        case -1008619738:
                            b = strE0.equals("origin") ? (byte) 0 : (byte) -1;
                            break;
                        case 3076010:
                            b = strE0.equals("data") ? (byte) 1 : (byte) -1;
                            break;
                        case 3575610:
                            b = strE0.equals("type") ? (byte) 2 : (byte) -1;
                            break;
                        case 50511102:
                            b = strE0.equals("category") ? c2 : (byte) -1;
                            break;
                        case 55126294:
                            b = strE0.equals("timestamp") ? c : (byte) -1;
                            break;
                        case 102865796:
                            b = strE0.equals("level") ? (byte) 5 : (byte) -1;
                            break;
                        case 954925063:
                            b = strE0.equals("message") ? (byte) 6 : (byte) -1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            strK3 = q3Var.K();
                            continue;
                            q3Var2 = q3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 1:
                            ConcurrentHashMap concurrentHashMapP = io.sentry.util.b.p((Map) q3Var.E0());
                            if (concurrentHashMapP == null) {
                                continue;
                            } else if (!concurrentHashMapP.isEmpty()) {
                                concurrentHashMap = concurrentHashMapP;
                            }
                            q3Var2 = q3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 2:
                            strK = q3Var.K();
                            continue;
                            q3Var2 = q3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 3:
                            strK2 = q3Var.K();
                            continue;
                            q3Var2 = q3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 4:
                            Date dateL0 = q3Var.l0(iLogger);
                            if (dateL0 != null) {
                                date = dateL0;
                            } else {
                                continue;
                            }
                            q3Var2 = q3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 5:
                            try {
                                s5VarValueOf = s5.valueOf(q3Var2.r().toUpperCase(Locale.ROOT));
                            } catch (Exception e) {
                                iLogger.d(s5.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strK4 = q3Var2.K();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            q3Var2.z(iLogger, concurrentHashMap2, strE0);
                            break;
                    }
                    q3Var2 = q3Var;
                    c = 4;
                    c2 = 3;
                }
                g gVar = new g(date);
                gVar.f0 = strK4;
                gVar.g0 = strK;
                if (concurrentHashMap != null) {
                    gVar.h0 = concurrentHashMap;
                }
                gVar.i0 = strK2;
                gVar.j0 = strK3;
                gVar.k0 = s5VarValueOf;
                gVar.l0 = concurrentHashMap2;
                q3Var.j0();
                return gVar;
            case 1:
                byte b6 = 1;
                q3Var2.F0();
                io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
                w3 w3Var = new w3(wVar, wVar, null, new HashMap(), Double.valueOf(0.0d), s6.empty());
                ConcurrentHashMap concurrentHashMap3 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE1 = q3Var2.e0();
                    strE1.getClass();
                    switch (strE1.hashCode()) {
                        case -1840434063:
                            b2 = strE1.equals("debug_meta") ? (byte) 0 : (byte) -1;
                            break;
                        case -362243017:
                            b2 = strE1.equals("measurements") ? b6 : (byte) -1;
                            break;
                        case -309425751:
                            b2 = strE1.equals("profile") ? (byte) 2 : (byte) -1;
                            break;
                        case -85904877:
                            b2 = strE1.equals("environment") ? (byte) 3 : (byte) -1;
                            break;
                        case 55126294:
                            b2 = strE1.equals("timestamp") ? (byte) 4 : (byte) -1;
                            break;
                        case 178573617:
                            b2 = strE1.equals("profiler_id") ? (byte) 5 : (byte) -1;
                            break;
                        case 351608024:
                            b2 = strE1.equals("version") ? (byte) 6 : (byte) -1;
                            break;
                        case 831846208:
                            b2 = strE1.equals("content_type") ? (byte) 7 : (byte) -1;
                            break;
                        case 1090594823:
                            b2 = strE1.equals(BuildConfig.BUILD_TYPE) ? (byte) 8 : (byte) -1;
                            break;
                        case 1102774726:
                            b2 = strE1.equals("client_sdk") ? (byte) 9 : (byte) -1;
                            break;
                        case 1874684019:
                            b2 = strE1.equals("platform") ? (byte) 10 : (byte) -1;
                            break;
                        case 1953158756:
                            b2 = strE1.equals("sampled_profile") ? b4 : (byte) -1;
                            break;
                        case 2005113901:
                            b2 = strE1.equals("chunk_id") ? (byte) 12 : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            io.sentry.protocol.f fVar = (io.sentry.protocol.f) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 8));
                            if (fVar != null) {
                                w3Var.X = fVar;
                            }
                            break;
                        case 1:
                            HashMap mapQ = q3Var2.Q(iLogger, new io.sentry.clientreport.a((byte) 2));
                            if (mapQ != null) {
                                w3Var.g0.putAll(mapQ);
                            }
                            break;
                        case 2:
                            io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) q3Var2.y0(iLogger, new io.sentry.protocol.d0((byte) 5));
                            if (aVar != null) {
                                w3Var.p0 = aVar;
                            }
                            break;
                        case 3:
                            String strK5 = q3Var2.K();
                            if (strK5 != null) {
                                w3Var.j0 = strK5;
                            }
                            break;
                        case 4:
                            Double dD0 = q3Var2.d0();
                            if (dD0 != null) {
                                w3Var.l0 = dD0.doubleValue();
                            }
                            break;
                        case 5:
                            io.sentry.protocol.w wVar2 = (io.sentry.protocol.w) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                            if (wVar2 != null) {
                                w3Var.Y = wVar2;
                            }
                            break;
                        case 6:
                            String strK6 = q3Var2.K();
                            if (strK6 != null) {
                                w3Var.k0 = strK6;
                            }
                            break;
                        case 7:
                            String strK7 = q3Var2.K();
                            if (strK7 != null) {
                                w3Var.m0 = strK7;
                            }
                            break;
                        case 8:
                            String strK8 = q3Var2.K();
                            if (strK8 != null) {
                                w3Var.i0 = strK8;
                            }
                            break;
                        case 9:
                            io.sentry.protocol.u uVar = (io.sentry.protocol.u) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 21));
                            if (uVar != null) {
                                w3Var.f0 = uVar;
                            }
                            break;
                        case 10:
                            String strK9 = q3Var2.K();
                            if (strK9 != null) {
                                w3Var.h0 = strK9;
                            }
                            break;
                        case 11:
                            String strK10 = q3Var2.K();
                            if (strK10 != null) {
                                w3Var.o0 = strK10;
                            }
                            break;
                        case FileClientSessionCache.MAX_SIZE /* 12 */:
                            io.sentry.protocol.w wVar3 = (io.sentry.protocol.w) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                            if (wVar3 != null) {
                                w3Var.Z = wVar3;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            q3Var2.z(iLogger, concurrentHashMap3, strE1);
                            break;
                    }
                    b4 = 11;
                    b6 = 1;
                }
                w3Var.q0 = concurrentHashMap3;
                q3Var2.j0();
                return w3Var;
            case 2:
                q3Var2.F0();
                x3 x3Var = new x3(io.sentry.protocol.w.Y);
                ConcurrentHashMap concurrentHashMap4 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE2 = q3Var2.e0();
                    strE2.getClass();
                    if (strE2.equals("profiler_id")) {
                        io.sentry.protocol.w wVar4 = (io.sentry.protocol.w) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                        if (wVar4 != null) {
                            x3Var.X = wVar4;
                        }
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        q3Var2.z(iLogger, concurrentHashMap4, strE2);
                    }
                }
                x3Var.Y = concurrentHashMap4;
                q3Var2.j0();
                return x3Var;
            case 3:
                q3Var2.F0();
                File file = new File("dummy");
                Date date2 = new Date();
                ArrayList arrayList2 = new ArrayList();
                io.sentry.protocol.w wVar5 = io.sentry.protocol.w.Y;
                z3 z3Var = new z3(file, date2, arrayList2, _UrlKt.FRAGMENT_ENCODE_SET, wVar5.a(), new f7(wVar5, h7.Y, "op", null).X.a(), "0", 0, _UrlKt.FRAGMENT_ENCODE_SET, new o0((byte) 1), null, null, null, null, null, null, null, null, "normal", new HashMap());
                ConcurrentHashMap concurrentHashMap5 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE3 = q3Var2.e0();
                    strE3.getClass();
                    switch (strE3) {
                        case "device_manufacturer":
                            String strK11 = q3Var2.K();
                            if (strK11 == null) {
                                break;
                            } else {
                                z3Var.g0 = strK11;
                                break;
                            }
                            break;
                        case "android_api_level":
                            Integer numX = q3Var2.x();
                            if (numX == null) {
                                break;
                            } else {
                                z3Var.Z = numX.intValue();
                                break;
                            }
                            break;
                        case "build_id":
                            String strK12 = q3Var2.K();
                            if (strK12 == null) {
                                break;
                            } else {
                                z3Var.q0 = strK12;
                                break;
                            }
                            break;
                        case "device_locale":
                            String strK13 = q3Var2.K();
                            if (strK13 == null) {
                                break;
                            } else {
                                z3Var.f0 = strK13;
                                break;
                            }
                            break;
                        case "profile_id":
                            String strK14 = q3Var2.K();
                            if (strK14 == null) {
                                break;
                            } else {
                                z3Var.y0 = strK14;
                                break;
                            }
                            break;
                        case "device_os_build_number":
                            String strK15 = q3Var2.K();
                            if (strK15 == null) {
                                break;
                            } else {
                                z3Var.i0 = strK15;
                                break;
                            }
                            break;
                        case "device_model":
                            String strK16 = q3Var2.K();
                            if (strK16 == null) {
                                break;
                            } else {
                                z3Var.h0 = strK16;
                                break;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolM0 = q3Var2.m0();
                            if (boolM0 == null) {
                                break;
                            } else {
                                z3Var.l0 = boolM0.booleanValue();
                                break;
                            }
                            break;
                        case "duration_ns":
                            String strK17 = q3Var2.K();
                            if (strK17 == null) {
                                break;
                            } else {
                                z3Var.t0 = strK17;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapQ2 = q3Var2.Q(iLogger, new io.sentry.clientreport.a((byte) 2));
                            if (mapQ2 == null) {
                                break;
                            } else {
                                z3Var.C0.putAll(mapQ2);
                                break;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strK18 = q3Var2.K();
                            if (strK18 == null) {
                                break;
                            } else {
                                z3Var.o0 = strK18;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) q3Var2.E0();
                            if (list == null) {
                                break;
                            } else {
                                z3Var.n0 = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strK19 = q3Var2.K();
                            if (strK19 == null) {
                                break;
                            } else {
                                z3Var.u0 = strK19;
                                break;
                            }
                            break;
                        case "version_name":
                            String strK20 = q3Var2.K();
                            if (strK20 == null) {
                                break;
                            } else {
                                z3Var.v0 = strK20;
                                break;
                            }
                            break;
                        case "environment":
                            String strK21 = q3Var2.K();
                            if (strK21 == null) {
                                break;
                            } else {
                                z3Var.z0 = strK21;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateL1 = q3Var.l0(iLogger);
                            if (dateL1 == null) {
                                break;
                            } else {
                                z3Var.B0 = dateL1;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strK22 = q3Var2.K();
                            if (strK22 == null) {
                                break;
                            } else {
                                z3Var.s0 = strK22;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strK23 = q3Var2.K();
                            if (strK23 == null) {
                                break;
                            } else {
                                z3Var.j0 = strK23;
                                break;
                            }
                            break;
                        case "architecture":
                            String strK24 = q3Var2.K();
                            if (strK24 == null) {
                                break;
                            } else {
                                z3Var.m0 = strK24;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strK25 = q3Var2.K();
                            if (strK25 == null) {
                                break;
                            } else {
                                z3Var.w0 = strK25;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strK26 = q3Var2.K();
                            if (strK26 == null) {
                                break;
                            } else {
                                z3Var.k0 = strK26;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strK27 = q3Var2.K();
                            if (strK27 == null) {
                                break;
                            } else {
                                z3Var.A0 = strK27;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strK28 = q3Var2.K();
                            if (strK28 == null) {
                                break;
                            } else {
                                z3Var.x0 = strK28;
                                break;
                            }
                            break;
                        case "platform":
                            String strK29 = q3Var2.K();
                            if (strK29 == null) {
                                break;
                            } else {
                                z3Var.p0 = strK29;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strK30 = q3Var2.K();
                            if (strK30 == null) {
                                break;
                            } else {
                                z3Var.D0 = strK30;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListM0 = q3Var2.M0(iLogger, new f((byte) 4));
                            if (arrayListM0 == null) {
                                break;
                            } else {
                                z3Var.r0.addAll(arrayListM0);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            q3Var2.z(iLogger, concurrentHashMap5, strE3);
                            break;
                    }
                }
                z3Var.E0 = concurrentHashMap5;
                q3Var2.j0();
                return z3Var;
            case 4:
                q3Var2.F0();
                a4 a4Var = new a4(n3.a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap6 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE4 = q3Var2.e0();
                    strE4.getClass();
                    switch (strE4) {
                        case "relative_start_ns":
                            Long lA = q3Var2.A();
                            if (lA == null) {
                                break;
                            } else {
                                a4Var.f0 = lA;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lA2 = q3Var2.A();
                            if (lA2 == null) {
                                break;
                            } else {
                                a4Var.g0 = lA2;
                                break;
                            }
                            break;
                        case "id":
                            String strK31 = q3Var2.K();
                            if (strK31 == null) {
                                break;
                            } else {
                                a4Var.X = strK31;
                                break;
                            }
                            break;
                        case "name":
                            String strK32 = q3Var2.K();
                            if (strK32 == null) {
                                break;
                            } else {
                                a4Var.Z = strK32;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strK33 = q3Var2.K();
                            if (strK33 == null) {
                                break;
                            } else {
                                a4Var.Y = strK33;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lA3 = q3Var2.A();
                            if (lA3 == null) {
                                break;
                            } else {
                                a4Var.i0 = lA3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lA4 = q3Var2.A();
                            if (lA4 == null) {
                                break;
                            } else {
                                a4Var.h0 = lA4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            q3Var2.z(iLogger, concurrentHashMap6, strE4);
                            break;
                    }
                }
                a4Var.j0 = concurrentHashMap6;
                q3Var2.j0();
                return a4Var;
            case 5:
                f4 f4Var = new f4();
                q3Var2.F0();
                HashMap map = null;
                Integer numX2 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE5 = q3Var2.e0();
                    strE5.getClass();
                    if (strE5.equals("segment_id")) {
                        numX2 = q3Var2.x();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        q3Var2.z(iLogger, map, strE5);
                    }
                }
                q3Var2.j0();
                q3Var2.L(true);
                List list2 = (List) q3Var2.E0();
                q3Var2.L(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            io.sentry.util.i iVar = new io.sentry.util.i(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str.equals("type")) {
                                    io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                    int i = e4.b[cVar.ordinal()];
                                    if (i == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map3.get("source");
                                        if (num != null) {
                                            io.sentry.rrweb.d dVar = io.sentry.rrweb.d.values()[num.intValue()];
                                            int i2 = e4.a[dVar.ordinal()];
                                            if (i2 == 1) {
                                                arrayList.add(io.sentry.protocol.d0.c(iVar, iLogger));
                                            } else if (i2 != 2) {
                                                iLogger.h(s5.DEBUG, "Unsupported rrweb incremental snapshot type %s", dVar);
                                            } else {
                                                arrayList.add(io.sentry.protocol.d0.d(iVar, iLogger));
                                            }
                                        }
                                    } else if (i == 2) {
                                        arrayList.add(io.sentry.protocol.d0.e(iVar, iLogger));
                                    } else if (i != 3) {
                                        iLogger.h(s5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                    } else {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map4.get("tag");
                                        if (str2 != null) {
                                            switch (str2) {
                                                case "performanceSpan":
                                                    arrayList.add(io.sentry.protocol.d0.f(iVar, iLogger));
                                                    break;
                                                case "video":
                                                    arrayList.add(io.sentry.protocol.d0.g(iVar, iLogger));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(io.sentry.protocol.d0.b(iVar, iLogger));
                                                    break;
                                                default:
                                                    iLogger.h(s5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                f4Var.X = numX2;
                f4Var.Y = arrayList;
                f4Var.Z = map;
                return f4Var;
            case 6:
                return b(q3Var, iLogger);
            case 7:
                q3Var2.F0();
                io.sentry.protocol.u uVar2 = null;
                l7 l7Var = null;
                Date dateL2 = null;
                HashMap map5 = null;
                io.sentry.protocol.w wVar6 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE6 = q3Var2.e0();
                    strE6.getClass();
                    switch (strE6) {
                        case "sdk":
                            uVar2 = (io.sentry.protocol.u) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 21));
                            break;
                        case "trace":
                            l7Var = (l7) q3Var2.y0(iLogger, new f((byte) 25));
                            break;
                        case "event_id":
                            wVar6 = (io.sentry.protocol.w) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                            break;
                        case "sent_at":
                            dateL2 = q3Var.l0(iLogger);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            q3Var2.z(iLogger, map5, strE6);
                            break;
                    }
                }
                c5 c5Var = new c5(wVar6, uVar2, l7Var);
                c5Var.f0 = dateL2;
                c5Var.g0 = map5;
                q3Var2.j0();
                return c5Var;
            case 8:
                q3Var2.F0();
                Integer numX3 = null;
                HashMap map6 = null;
                r5 r5Var = null;
                int iNextInt = 0;
                String strK34 = null;
                String strK35 = null;
                String strK36 = null;
                String strK37 = null;
                Integer numX4 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE7 = q3Var2.e0();
                    strE7.getClass();
                    switch (strE7) {
                        case "item_count":
                            numX4 = q3Var2.x();
                            break;
                        case "meta_length":
                            numX3 = q3Var2.x();
                            break;
                        case "length":
                            iNextInt = q3Var2.nextInt();
                            break;
                        case "filename":
                            strK35 = q3Var2.K();
                            break;
                        case "attachment_type":
                            strK36 = q3Var2.K();
                            break;
                        case "type":
                            r5Var = (r5) q3Var2.y0(iLogger, new f(b5));
                            break;
                        case "content_type":
                            strK34 = q3Var2.K();
                            break;
                        case "platform":
                            strK37 = q3Var2.K();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            q3Var2.z(iLogger, map6, strE7);
                            break;
                    }
                }
                if (r5Var == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    iLogger.e(s5.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                i5 i5Var = new i5(r5Var, iNextInt, null, strK34, strK35, strK36, strK37, numX4, numX3 != null ? new x43(numX3, (byte) 4) : null);
                i5Var.l0 = map6;
                q3Var2.j0();
                return i5Var;
            case 9:
                q3Var2.F0();
                j5 j5Var = new j5();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE8 = q3Var2.e0();
                    strE8.getClass();
                    switch (strE8) {
                        case "fingerprint":
                            List list3 = (List) q3Var2.E0();
                            if (list3 == null) {
                                break;
                            } else {
                                j5Var.y0 = list3;
                                break;
                            }
                            break;
                        case "threads":
                            q3Var2.F0();
                            q3Var2.e0();
                            j5Var.u0 = new k2(q3Var2.M0(iLogger, new io.sentry.protocol.d0((byte) 0)));
                            q3Var2.j0();
                            break;
                        case "logger":
                            j5Var.t0 = q3Var2.K();
                            break;
                        case "timestamp":
                            Date dateL3 = q3Var.l0(iLogger);
                            if (dateL3 == null) {
                                break;
                            } else {
                                j5Var.r0 = dateL3;
                                break;
                            }
                            break;
                        case "level":
                            j5Var.w0 = (s5) q3Var2.y0(iLogger, new f(b4));
                            break;
                        case "message":
                            j5Var.s0 = (io.sentry.protocol.p) q3Var2.y0(iLogger, new io.sentry.clientreport.a(b3));
                            break;
                        case "modules":
                            j5Var.A0 = io.sentry.util.b.p((Map) q3Var2.E0());
                            break;
                        case "exception":
                            q3Var2.F0();
                            q3Var2.e0();
                            j5Var.v0 = new k2(q3Var2.M0(iLogger, new io.sentry.clientreport.a((byte) 22)));
                            q3Var2.j0();
                            break;
                        case "transaction":
                            j5Var.x0 = q3Var2.K();
                            break;
                        default:
                            if (!io.sentry.config.a.b(j5Var, strE8, q3Var2, iLogger)) {
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                q3Var2.z(iLogger, concurrentHashMap7, strE8);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                j5Var.z0 = concurrentHashMap7;
                q3Var2.j0();
                return j5Var;
            case 10:
                return r5.valueOfLabel(q3Var2.r().toLowerCase(Locale.ROOT));
            case 11:
                return s5.valueOf(q3Var2.r().toUpperCase(Locale.ROOT));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                t5 t5Var = new t5();
                q3Var2.F0();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE9 = q3Var2.e0();
                    strE9.getClass();
                    switch (strE9) {
                        case "package_name":
                            t5Var.Z = q3Var2.K();
                            break;
                        case "thread_id":
                            t5Var.g0 = q3Var2.A();
                            break;
                        case "address":
                            t5Var.Y = q3Var2.K();
                            break;
                        case "class_name":
                            t5Var.f0 = q3Var2.K();
                            break;
                        case "type":
                            t5Var.X = q3Var2.nextInt();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            q3Var2.z(iLogger, concurrentHashMap8, strE9);
                            break;
                    }
                }
                t5Var.h0 = concurrentHashMap8;
                q3Var2.j0();
                return t5Var;
            case 13:
                q3Var2.F0();
                Double dD1 = null;
                String strK38 = null;
                HashMap map7 = null;
                w5 w5Var = null;
                HashMap mapQ3 = null;
                Integer numX5 = null;
                h7 h7Var = null;
                io.sentry.protocol.w wVar7 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE10 = q3Var2.e0();
                    strE10.getClass();
                    switch (strE10) {
                        case "span_id":
                            h7Var = (h7) q3Var2.y0(iLogger, new f((byte) 23));
                            break;
                        case "severity_number":
                            numX5 = q3Var2.x();
                            break;
                        case "body":
                            strK38 = q3Var2.K();
                            break;
                        case "timestamp":
                            dD1 = q3Var2.d0();
                            break;
                        case "level":
                            w5Var = (w5) q3Var2.y0(iLogger, new f((byte) 16));
                            break;
                        case "attributes":
                            mapQ3 = q3Var2.Q(iLogger, new f((byte) 14));
                            break;
                        case "trace_id":
                            wVar7 = (io.sentry.protocol.w) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                            break;
                        default:
                            if (map7 == null) {
                                map7 = new HashMap();
                            }
                            q3Var2.z(iLogger, map7, strE10);
                            break;
                    }
                }
                q3Var2.j0();
                if (wVar7 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                    iLogger.e(s5.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (dD1 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                    iLogger.e(s5.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                    throw illegalStateException3;
                }
                if (strK38 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
                    iLogger.e(s5.ERROR, "Missing required field \"body\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (w5Var == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
                    iLogger.e(s5.ERROR, "Missing required field \"level\"", illegalStateException5);
                    throw illegalStateException5;
                }
                u5 u5Var = new u5();
                u5Var.X = wVar7;
                u5Var.Z = dD1;
                u5Var.f0 = strK38;
                u5Var.g0 = w5Var;
                u5Var.i0 = mapQ3;
                u5Var.h0 = numX5;
                u5Var.Y = h7Var;
                u5Var.j0 = map7;
                return u5Var;
            case 14:
                q3Var2.F0();
                Object objE0 = null;
                HashMap map8 = null;
                String strK39 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE11 = q3Var2.e0();
                    strE11.getClass();
                    if (strE11.equals("type")) {
                        strK39 = q3Var2.K();
                    } else if (strE11.equals("value")) {
                        objE0 = q3Var2.E0();
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        q3Var2.z(iLogger, map8, strE11);
                    }
                }
                q3Var2.j0();
                if (strK39 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
                    iLogger.e(s5.ERROR, "Missing required field \"type\"", illegalStateException6);
                    throw illegalStateException6;
                }
                io.sentry.protocol.n nVar = new io.sentry.protocol.n();
                nVar.Y = strK39;
                if (objE0 == null || !strK39.equals("string")) {
                    nVar.Z = objE0;
                } else {
                    nVar.Z = objE0.toString();
                }
                nVar.f0 = map8;
                return nVar;
            case 15:
                q3Var2.F0();
                HashMap map9 = null;
                ArrayList arrayListM1 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE12 = q3Var2.e0();
                    strE12.getClass();
                    if (strE12.equals("items")) {
                        arrayListM1 = q3Var2.M0(iLogger, new f((byte) 13));
                    } else {
                        if (map9 == null) {
                            map9 = new HashMap();
                        }
                        q3Var2.z(iLogger, map9, strE12);
                    }
                }
                q3Var2.j0();
                if (arrayListM1 != null) {
                    v5 v5Var = new v5(arrayListM1, (byte) 0);
                    v5Var.Z = map9;
                    return v5Var;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
                iLogger.e(s5.ERROR, "Missing required field \"items\"", illegalStateException7);
                throw illegalStateException7;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return w5.valueOf(q3Var2.r().toUpperCase(Locale.ROOT));
            case 17:
                q3Var2.F0();
                Double dD2 = null;
                String strK40 = null;
                HashMap map10 = null;
                String strK41 = null;
                Double dD3 = null;
                io.sentry.protocol.w wVar8 = null;
                HashMap mapQ4 = null;
                h7 h7Var2 = null;
                String strK42 = null;
                while (true) {
                    HashMap map11 = map10;
                    if (q3Var2.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        q3Var2.j0();
                        if (wVar8 == null) {
                            IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"trace_id\"");
                            iLogger.e(s5.ERROR, "Missing required field \"trace_id\"", illegalStateException8);
                            throw illegalStateException8;
                        }
                        if (dD2 == null) {
                            IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"timestamp\"");
                            iLogger.e(s5.ERROR, "Missing required field \"timestamp\"", illegalStateException9);
                            throw illegalStateException9;
                        }
                        if (strK40 == null) {
                            IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"type\"");
                            iLogger.e(s5.ERROR, "Missing required field \"type\"", illegalStateException10);
                            throw illegalStateException10;
                        }
                        if (strK41 == null) {
                            IllegalStateException illegalStateException11 = new IllegalStateException("Missing required field \"name\"");
                            iLogger.e(s5.ERROR, "Missing required field \"name\"", illegalStateException11);
                            throw illegalStateException11;
                        }
                        if (dD3 == null) {
                            IllegalStateException illegalStateException12 = new IllegalStateException("Missing required field \"value\"");
                            iLogger.e(s5.ERROR, "Missing required field \"value\"", illegalStateException12);
                            throw illegalStateException12;
                        }
                        y5 y5Var = new y5();
                        y5Var.X = wVar8;
                        y5Var.Z = dD2;
                        y5Var.f0 = strK41;
                        y5Var.h0 = strK40;
                        y5Var.i0 = dD3;
                        y5Var.j0 = mapQ4;
                        y5Var.Y = h7Var2;
                        y5Var.g0 = strK42;
                        y5Var.k0 = map11;
                        return y5Var;
                    }
                    String strE13 = q3Var2.e0();
                    strE13.getClass();
                    switch (strE13) {
                        case "span_id":
                            h7Var2 = (h7) q3Var2.y0(iLogger, new f((byte) 23));
                            break;
                        case "name":
                            strK41 = q3Var2.K();
                            break;
                        case "type":
                            strK40 = q3Var2.K();
                            break;
                        case "unit":
                            strK42 = q3Var2.K();
                            break;
                        case "timestamp":
                            dD2 = q3Var2.d0();
                            break;
                        case "value":
                            dD3 = q3Var2.d0();
                            break;
                        case "attributes":
                            mapQ4 = q3Var2.Q(iLogger, new f((byte) 14));
                            break;
                        case "trace_id":
                            wVar8 = (io.sentry.protocol.w) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                            break;
                        default:
                            HashMap map12 = map11 == null ? new HashMap() : map11;
                            q3Var2.z(iLogger, map12, strE13);
                            map10 = map12;
                            continue;
                            break;
                    }
                    map10 = map11;
                }
                break;
            case 18:
                q3Var2.F0();
                HashMap map13 = null;
                ArrayList arrayListM2 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE14 = q3Var2.e0();
                    strE14.getClass();
                    if (strE14.equals("items")) {
                        arrayListM2 = q3Var2.M0(iLogger, new f(b3));
                    } else {
                        if (map13 == null) {
                            map13 = new HashMap();
                        }
                        q3Var2.z(iLogger, map13, strE14);
                    }
                }
                q3Var2.j0();
                if (arrayListM2 != null) {
                    z5 z5Var = new z5(arrayListM2);
                    z5Var.Y = map13;
                    return z5Var;
                }
                IllegalStateException illegalStateException13 = new IllegalStateException("Missing required field \"items\"");
                iLogger.e(s5.ERROR, "Missing required field \"items\"", illegalStateException13);
                throw illegalStateException13;
            case 19:
                u6 u6Var = new u6();
                q3Var2.F0();
                t6 t6Var = null;
                Date dateL4 = null;
                HashMap map14 = null;
                io.sentry.protocol.w wVar9 = null;
                Date dateL5 = null;
                List list4 = null;
                String strK43 = null;
                List list5 = null;
                List list6 = null;
                List list7 = null;
                Integer numX6 = null;
                while (true) {
                    HashMap map15 = map14;
                    if (q3Var2.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        q3Var2.j0();
                        if (strK43 != null) {
                            u6Var.s0 = strK43;
                        }
                        if (t6Var != null) {
                            u6Var.t0 = t6Var;
                        }
                        if (numX6 != null) {
                            u6Var.v0 = numX6.intValue();
                        }
                        if (dateL4 != null) {
                            u6Var.w0 = dateL4;
                        }
                        u6Var.u0 = wVar9;
                        u6Var.x0 = dateL5;
                        u6Var.y0 = list4;
                        u6Var.z0 = list5;
                        u6Var.A0 = list6;
                        u6Var.B0 = list7;
                        u6Var.C0 = map15;
                        return u6Var;
                    }
                    String strE15 = q3Var2.e0();
                    strE15.getClass();
                    switch (strE15) {
                        case "segment_names":
                            list7 = (List) q3Var2.E0();
                            map14 = map15;
                            break;
                        case "replay_id":
                            wVar9 = (io.sentry.protocol.w) q3Var2.y0(iLogger, new io.sentry.clientreport.a((byte) 23));
                            map14 = map15;
                            break;
                        case "replay_start_timestamp":
                            dateL5 = q3Var.l0(iLogger);
                            map14 = map15;
                            break;
                        case "type":
                            strK43 = q3Var2.K();
                            map14 = map15;
                            break;
                        case "urls":
                            list4 = (List) q3Var2.E0();
                            map14 = map15;
                            break;
                        case "timestamp":
                            dateL4 = q3Var.l0(iLogger);
                            map14 = map15;
                            break;
                        case "error_ids":
                            list5 = (List) q3Var2.E0();
                            map14 = map15;
                            break;
                        case "trace_ids":
                            list6 = (List) q3Var2.E0();
                            map14 = map15;
                            break;
                        case "replay_type":
                            t6Var = (t6) q3Var2.y0(iLogger, new f((byte) 20));
                            map14 = map15;
                            break;
                        case "segment_id":
                            numX6 = q3Var2.x();
                            map14 = map15;
                            break;
                        default:
                            if (!io.sentry.config.a.b(u6Var, strE15, q3Var2, iLogger)) {
                                HashMap map16 = map15 == null ? new HashMap() : map15;
                                q3Var2.z(iLogger, map16, strE15);
                                map14 = map16;
                                break;
                            } else {
                                map14 = map15;
                                break;
                            }
                            break;
                    }
                }
                break;
            case 20:
                return t6.valueOf(q3Var2.r().toUpperCase(Locale.ROOT));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                q3Var2.F0();
                ConcurrentHashMap concurrentHashMap9 = null;
                boolean z = false;
                Integer numX7 = null;
                c7 c7VarValueOf = null;
                Date dateL6 = null;
                Date dateL7 = null;
                String strK44 = null;
                String str3 = null;
                Boolean boolM1 = null;
                Long lA5 = null;
                Double dD4 = null;
                String strK45 = null;
                String strK46 = null;
                String strK47 = null;
                String strK48 = null;
                String strK49 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE16 = q3Var2.e0();
                    strE16.getClass();
                    switch (strE16) {
                        case "duration":
                            dD4 = q3Var2.d0();
                            break;
                        case "started":
                            dateL6 = q3Var.l0(iLogger);
                            break;
                        case "errors":
                            numX7 = q3Var2.x();
                            break;
                        case "status":
                            String strA = io.sentry.util.q.a(q3Var2.K());
                            if (strA == null) {
                                break;
                            } else {
                                c7VarValueOf = c7.valueOf(strA);
                                break;
                            }
                            break;
                        case "did":
                            strK44 = q3Var2.K();
                            break;
                        case "seq":
                            lA5 = q3Var2.A();
                            break;
                        case "sid":
                            String strK50 = q3Var2.K();
                            if (strK50 != null && (strK50.length() == 36 || strK50.length() == 32)) {
                                str3 = strK50;
                                break;
                            } else {
                                iLogger.h(s5.ERROR, "%s sid is not valid.", strK50);
                                break;
                            }
                            break;
                        case "init":
                            boolM1 = q3Var2.m0();
                            break;
                        case "timestamp":
                            dateL7 = q3Var.l0(iLogger);
                            break;
                        case "attrs":
                            q3Var2.F0();
                            while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strE17 = q3Var2.e0();
                                strE17.getClass();
                                switch (strE17) {
                                    case "environment":
                                        strK47 = q3Var2.K();
                                        break;
                                    case "release":
                                        strK48 = q3Var2.K();
                                        break;
                                    case "ip_address":
                                        strK45 = q3Var2.K();
                                        break;
                                    case "user_agent":
                                        strK46 = q3Var2.K();
                                        break;
                                    default:
                                        q3Var2.v();
                                        break;
                                }
                            }
                            q3Var2.j0();
                            break;
                        case "abnormal_mechanism":
                            strK49 = q3Var2.K();
                            break;
                        case "non_terminating_unhandled_error":
                            Boolean boolM2 = q3Var2.m0();
                            if (boolM2 != null && boolM2.booleanValue()) {
                                z = true;
                                break;
                            } else {
                                z = false;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            q3Var2.z(iLogger, concurrentHashMap9, strE16);
                            break;
                    }
                }
                if (c7VarValueOf == null) {
                    throw d("status", iLogger);
                }
                if (dateL6 == null) {
                    throw d("started", iLogger);
                }
                if (numX7 == null) {
                    throw d("errors", iLogger);
                }
                if (strK48 == null) {
                    throw d(BuildConfig.BUILD_TYPE, iLogger);
                }
                d7 d7Var = new d7(c7VarValueOf, dateL6, dateL7, numX7.intValue(), strK44, str3, boolM1, lA5, dD4, strK45, strK46, strK47, strK48, strK49);
                d7Var.q0 = z;
                d7Var.s0 = concurrentHashMap9;
                q3Var2.j0();
                return d7Var;
            case 22:
                return c(q3Var, iLogger);
            case 23:
                return new h7(q3Var2.r());
            case 24:
                return j7.valueOf(q3Var2.r().toUpperCase(Locale.ROOT));
            case 25:
                q3Var2.F0();
                String strK51 = null;
                String strK52 = null;
                io.sentry.protocol.w wVar10 = null;
                String strK53 = null;
                String strK54 = null;
                String strK55 = null;
                io.sentry.protocol.w wVar11 = null;
                String strK56 = null;
                ConcurrentHashMap concurrentHashMap10 = null;
                String strK57 = null;
                String strR = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE18 = q3Var2.e0();
                    strE18.getClass();
                    switch (strE18) {
                        case "replay_id":
                            wVar11 = new io.sentry.protocol.w(q3Var2.r());
                            break;
                        case "user_id":
                            strK53 = q3Var2.K();
                            break;
                        case "environment":
                            strK51 = q3Var2.K();
                            break;
                        case "sample_rand":
                            strK56 = q3Var2.K();
                            break;
                        case "sample_rate":
                            strK54 = q3Var2.K();
                            break;
                        case "release":
                            strK57 = q3Var2.K();
                            break;
                        case "trace_id":
                            wVar10 = new io.sentry.protocol.w(q3Var2.r());
                            break;
                        case "sampled":
                            strK55 = q3Var2.K();
                            break;
                        case "public_key":
                            strR = q3Var2.r();
                            break;
                        case "transaction":
                            strK52 = q3Var2.K();
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            q3Var2.z(iLogger, concurrentHashMap10, strE18);
                            break;
                    }
                }
                if (wVar10 == null) {
                    throw e("trace_id", iLogger);
                }
                if (strR == null) {
                    throw e("public_key", iLogger);
                }
                l7 l7Var2 = new l7(wVar10, strR, strK57, strK51, strK53, strK52, strK54, strK55, wVar11, strK56);
                l7Var2.m0 = concurrentHashMap10;
                q3Var2.j0();
                return l7Var2;
            default:
                q3Var2.F0();
                io.sentry.protocol.w wVar12 = null;
                String strK58 = null;
                String strK59 = null;
                String strK60 = null;
                HashMap map17 = null;
                while (q3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strE19 = q3Var2.e0();
                    strE19.getClass();
                    switch (strE19) {
                        case "comments":
                            strK60 = q3Var2.K();
                            break;
                        case "name":
                            strK58 = q3Var2.K();
                            break;
                        case "email":
                            strK59 = q3Var2.K();
                            break;
                        case "event_id":
                            wVar12 = new io.sentry.protocol.w(q3Var2.r());
                            break;
                        default:
                            if (map17 == null) {
                                map17 = new HashMap();
                            }
                            q3Var2.z(iLogger, map17, strE19);
                            break;
                    }
                }
                q3Var2.j0();
                if (wVar12 != null) {
                    q7 q7Var = new q7(wVar12, strK58, strK59, strK60);
                    q7Var.g0 = map17;
                    return q7Var;
                }
                IllegalStateException illegalStateException14 = new IllegalStateException("Missing required field \"event_id\"");
                iLogger.e(s5.ERROR, "Missing required field \"event_id\"", illegalStateException14);
                throw illegalStateException14;
        }
    }
}
