package io.sentry;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l7 implements n2 {
    public final io.sentry.protocol.w X;
    public final String Y;
    public final String Z;
    public final String f0;
    public final String g0;
    public final String h0;
    public final String i0;
    public final String j0;
    public final String k0;
    public final io.sentry.protocol.w l0;
    public ConcurrentHashMap m0;

    public l7(io.sentry.protocol.w wVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.w wVar2, String str8) {
        this.X = wVar;
        this.Y = str;
        this.Z = str2;
        this.f0 = str3;
        this.g0 = str4;
        this.h0 = str5;
        this.i0 = str6;
        this.k0 = str7;
        this.l0 = wVar2;
        this.j0 = str8;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("trace_id");
        cVar.v(iLogger, this.X);
        cVar.p("public_key");
        cVar.y(this.Y);
        String str = this.Z;
        if (str != null) {
            cVar.p(BuildConfig.BUILD_TYPE);
            cVar.y(str);
        }
        String str2 = this.f0;
        if (str2 != null) {
            cVar.p("environment");
            cVar.y(str2);
        }
        String str3 = this.g0;
        if (str3 != null) {
            cVar.p("user_id");
            cVar.y(str3);
        }
        String str4 = this.h0;
        if (str4 != null) {
            cVar.p("transaction");
            cVar.y(str4);
        }
        String str5 = this.i0;
        if (str5 != null) {
            cVar.p("sample_rate");
            cVar.y(str5);
        }
        String str6 = this.j0;
        if (str6 != null) {
            cVar.p("sample_rand");
            cVar.y(str6);
        }
        String str7 = this.k0;
        if (str7 != null) {
            cVar.p("sampled");
            cVar.y(str7);
        }
        io.sentry.protocol.w wVar = this.l0;
        if (wVar != null) {
            cVar.p("replay_id");
            cVar.v(iLogger, wVar);
        }
        ConcurrentHashMap concurrentHashMap = this.m0;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                e.b(this.m0, str8, cVar, str8, iLogger);
            }
        }
        cVar.m();
    }
}
