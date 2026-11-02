package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 implements n2 {
    public String A0;
    public Date B0;
    public final HashMap C0;
    public ConcurrentHashMap E0;
    public final File X;
    public final Callable Y;
    public int Z;
    public String g0;
    public String h0;
    public String i0;
    public String j0;
    public String k0;
    public boolean l0;
    public String m0;
    public String o0;
    public String p0;
    public String q0;
    public final ArrayList r0;
    public String s0;
    public String t0;
    public String u0;
    public String v0;
    public String w0;
    public String x0;
    public String y0;
    public String z0;
    public List n0 = new ArrayList();
    public String D0 = null;
    public String f0 = Locale.getDefault().toString();

    public z3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, HashMap map) {
        this.X = file;
        this.B0 = date;
        this.m0 = str5;
        this.Y = callable;
        this.Z = i;
        String str14 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.g0 = str6 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str6;
        this.h0 = str7 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str7;
        this.k0 = str8 != null ? str8 : _UrlKt.FRAGMENT_ENCODE_SET;
        this.l0 = bool != null ? bool.booleanValue() : false;
        this.o0 = str9 != null ? str9 : "0";
        this.i0 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.j0 = "android";
        this.p0 = "android";
        this.q0 = str10 != null ? str10 : _UrlKt.FRAGMENT_ENCODE_SET;
        this.r0 = arrayList;
        this.s0 = str.isEmpty() ? "unknown" : str;
        this.t0 = str4;
        this.u0 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.v0 = str11 != null ? str11 : str14;
        this.w0 = str2;
        this.x0 = str3;
        this.y0 = io.sentry.config.a.f();
        this.z0 = str12 != null ? str12 : "production";
        this.A0 = str13;
        if (!str13.equals("normal") && !this.A0.equals("timeout") && !this.A0.equals("backgrounded")) {
            this.A0 = "normal";
        }
        this.C0 = map;
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        cVar.p("android_api_level");
        cVar.v(iLogger, Integer.valueOf(this.Z));
        cVar.p("device_locale");
        cVar.v(iLogger, this.f0);
        cVar.p("device_manufacturer");
        cVar.y(this.g0);
        cVar.p("device_model");
        cVar.y(this.h0);
        cVar.p("device_os_build_number");
        cVar.y(this.i0);
        cVar.p("device_os_name");
        cVar.y(this.j0);
        cVar.p("device_os_version");
        cVar.y(this.k0);
        cVar.p("device_is_emulator");
        cVar.z(this.l0);
        cVar.p("architecture");
        cVar.v(iLogger, this.m0);
        cVar.p("device_cpu_frequencies");
        cVar.v(iLogger, this.n0);
        cVar.p("device_physical_memory_bytes");
        cVar.y(this.o0);
        cVar.p("platform");
        cVar.y(this.p0);
        cVar.p("build_id");
        cVar.y(this.q0);
        cVar.p("transaction_name");
        cVar.y(this.s0);
        cVar.p("duration_ns");
        cVar.y(this.t0);
        cVar.p("version_name");
        cVar.y(this.v0);
        cVar.p("version_code");
        cVar.y(this.u0);
        ArrayList arrayList = this.r0;
        if (!arrayList.isEmpty()) {
            cVar.p("transactions");
            cVar.v(iLogger, arrayList);
        }
        cVar.p("transaction_id");
        cVar.y(this.w0);
        cVar.p("trace_id");
        cVar.y(this.x0);
        cVar.p("profile_id");
        cVar.y(this.y0);
        cVar.p("environment");
        cVar.y(this.z0);
        cVar.p("truncation_reason");
        cVar.y(this.A0);
        if (this.D0 != null) {
            cVar.p("sampled_profile");
            cVar.y(this.D0);
        }
        String str = ((io.sentry.vendor.gson.stream.c) cVar.Y).f0;
        cVar.s(_UrlKt.FRAGMENT_ENCODE_SET);
        cVar.p("measurements");
        cVar.v(iLogger, this.C0);
        cVar.s(str);
        cVar.p("timestamp");
        cVar.v(iLogger, this.B0);
        ConcurrentHashMap concurrentHashMap = this.E0;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                e.b(this.E0, str2, cVar, str2, iLogger);
            }
        }
        cVar.m();
    }
}
