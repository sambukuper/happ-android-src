package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import defpackage.x21;
import io.sentry.b4;
import io.sentry.j5;
import io.sentry.k2;
import io.sentry.s5;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements k0 {
    public final /* synthetic */ byte a;
    public final SentryAndroidOptions b;

    public /* synthetic */ a0(SentryAndroidOptions sentryAndroidOptions, byte b) {
        this.a = b;
        this.b = sentryAndroidOptions;
    }

    public static String g(int i) {
        if (i == 100) {
            return "foreground";
        }
        if (i == 125) {
            return "foreground_service";
        }
        if (i == 200) {
            return "visible";
        }
        if (i == 230) {
            return "perceptible";
        }
        if (i == 300) {
            return "service";
        }
        if (i == 325) {
            return "top_sleeping";
        }
        if (i == 350) {
            return "cant_save_state";
        }
        if (i != 400) {
            return i != 1000 ? "unknown" : "gone";
        }
        return "cached";
    }

    @Override // io.sentry.android.core.k0
    public final boolean a(ApplicationExitInfo applicationExitInfo) {
        String description;
        switch (this.a) {
            case 0:
                return applicationExitInfo.getReason() == 6;
            default:
                int reason = applicationExitInfo.getReason();
                if (reason == 17) {
                    return true;
                }
                return reason == 13 && (description = applicationExitInfo.getDescription()) != null && description.contains("MemoryLimiter:");
        }
    }

    @Override // io.sentry.android.core.k0
    public final Long b() {
        switch (this.a) {
            case 0:
                return io.sentry.android.core.cache.b.j(this.b, "last_anr_report", "ANR");
            default:
                return io.sentry.android.core.cache.b.j(this.b, "last_memory_limiter_report", "MemoryLimiter");
        }
    }

    @Override // io.sentry.android.core.k0
    public final String c() {
        switch (this.a) {
            case 0:
                return "ANR";
            default:
                return "MemoryLimiter process death";
        }
    }

    @Override // io.sentry.android.core.k0
    public final boolean d() {
        switch (this.a) {
            case 0:
                return this.b.isReportHistoricalAnrs();
            default:
                return this.b.isReportHistoricalMemoryLimiterExits();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.android.core.k0
    public final io.sentry.n e(ApplicationExitInfo applicationExitInfo, boolean z) {
        b4 b4Var;
        byte[] bArr;
        String str;
        byte b = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        switch (b) {
            case 0:
                long timestamp = applicationExitInfo.getTimestamp();
                boolean z2 = applicationExitInfo.getImportance() != 100;
                try {
                    InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                    try {
                        if (traceInputStream == 0) {
                            b4Var = new b4(b0.NO_DUMP);
                            if (traceInputStream != 0) {
                                traceInputStream = traceInputStream;
                                traceInputStream.close();
                                traceInputStream = traceInputStream;
                            }
                        } else {
                            byte[] bArrR = io.sentry.config.a.r(traceInputStream);
                            traceInputStream.close();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrR)));
                                try {
                                    ArrayList arrayList = new ArrayList();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line != null) {
                                            io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                            aVar.a = line;
                                            arrayList.add(aVar);
                                        } else {
                                            x21 x21Var = new x21(arrayList);
                                            io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(sentryAndroidOptions, z2);
                                            bVar.d(x21Var);
                                            ArrayList arrayList2 = bVar.f;
                                            ArrayList arrayList3 = new ArrayList(bVar.e.values());
                                            io.sentry.protocol.c cVar = (io.sentry.protocol.c) bVar.g.Y;
                                            if (arrayList2.isEmpty()) {
                                                b4Var = new b4(b0.NO_DUMP);
                                                bufferedReader.close();
                                                traceInputStream = bufferedReader;
                                            } else {
                                                b4 b4Var2 = new b4(b0.DUMP, bArrR, arrayList2, arrayList3, cVar);
                                                bufferedReader.close();
                                                b4Var = b4Var2;
                                                traceInputStream = bufferedReader;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to parse ANR thread dump", th3);
                                b0 b0Var = b0.ERROR;
                                b4Var = new b4(b0Var, bArrR);
                                traceInputStream = b0Var;
                            }
                        }
                        traceInputStream = traceInputStream;
                        break;
                    } catch (Throwable th4) {
                        if (traceInputStream == 0) {
                            throw th4;
                        }
                        try {
                            traceInputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to read ANR thread dump", th6);
                    b4Var = new b4(b0.NO_DUMP);
                }
                b0 b0Var2 = (b0) b4Var.b;
                if (b0Var2 == b0.NO_DUMP) {
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                    return null;
                }
                z zVar = new z(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
                io.sentry.n0 n0VarF = io.sentry.util.b.f(zVar);
                j5 j5Var = new j5();
                if (b0Var2 == b0.ERROR) {
                    io.sentry.protocol.p pVar = new io.sentry.protocol.p();
                    pVar.X = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                    j5Var.s0 = pVar;
                } else if (b0Var2 == b0.DUMP) {
                    j5Var.u0 = new k2((ArrayList) b4Var.d);
                    ArrayList arrayList4 = (ArrayList) b4Var.a;
                    if (arrayList4 != null) {
                        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                        fVar.b(arrayList4);
                        j5Var.p0 = fVar;
                    }
                    io.sentry.protocol.c cVar2 = (io.sentry.protocol.c) b4Var.e;
                    if (cVar2 != null) {
                        j5Var.Y.l(cVar2, "art");
                    }
                }
                j5Var.w0 = s5.FATAL;
                j5Var.r0 = new Date(timestamp);
                if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) b4Var.c) != null) {
                    n0VarF.f = new io.sentry.a("thread-dump.txt", "text/plain", bArr);
                }
                return new io.sentry.n(j5Var, n0VarF, zVar, (byte) 1);
            default:
                long timestamp2 = applicationExitInfo.getTimestamp();
                a1 a1Var = new a1(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp2, z);
                io.sentry.n0 n0VarF2 = io.sentry.util.b.f(a1Var);
                int importance = applicationExitInfo.getImportance();
                if (importance == 100) {
                    str = "visible";
                } else if (importance == 125) {
                    str = "not_visible";
                } else if (importance == 200) {
                    str = "visible";
                } else if (importance == 230 || importance == 300) {
                    str = "not_visible";
                } else if (importance == 325) {
                    str = "visible";
                } else if (importance == 350 || importance == 1000) {
                    str = "not_visible";
                } else {
                    str = "cached";
                }
                io.sentry.protocol.p pVar2 = new io.sentry.protocol.p();
                String str2 = "Android process killed by MemoryLimiter (importance: " + g(importance) + ")";
                pVar2.X = str2;
                j5 j5Var2 = new j5();
                j5Var2.w0 = s5.FATAL;
                j5Var2.j0 = "java";
                j5Var2.r0 = new Date(timestamp2);
                j5Var2.s0 = pVar2;
                io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                oVar.X = z ? "AppExitInfo" : "HistoricalAppExitInfo";
                oVar.Y = applicationExitInfo.getDescription();
                oVar.f0 = Boolean.FALSE;
                oVar.i0 = Boolean.TRUE;
                HashMap map = new HashMap();
                map.put("process_importance", importance + " (" + g(importance) + ")");
                map.put("memory_limit_class", str);
                oVar.h0 = new HashMap(map);
                io.sentry.protocol.v vVar = new io.sentry.protocol.v();
                vVar.X = "MemoryLimitExceeded";
                vVar.Y = str2;
                vVar.Z = "io.sentry.android.core";
                vVar.h0 = oVar;
                j5Var2.h(Collections.singletonList(vVar));
                j5Var2.i(Arrays.asList("memory-limiter", "process_importance:" + importance));
                return new io.sentry.n(j5Var2, n0VarF2, a1Var, (byte) 1);
        }
    }

    @Override // io.sentry.android.core.k0
    public final void f(long j) {
        byte b = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        switch (b) {
            case 0:
                io.sentry.android.core.cache.b.l(sentryAndroidOptions, Long.valueOf(j), "last_anr_report", "ANR");
                break;
            default:
                io.sentry.android.core.cache.b.l(sentryAndroidOptions, Long.valueOf(j), "last_memory_limiter_report", "MemoryLimiter");
                break;
        }
    }
}
