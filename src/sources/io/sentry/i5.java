package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 implements n2 {
    public final String X;
    public final Integer Y;
    public final String Z;
    public final String f0;
    public final r5 g0;
    public final int h0;
    public final Callable i0;
    public final String j0;
    public final Callable k0;
    public HashMap l0;

    public i5(r5 r5Var, int i, Callable callable, String str, String str2, String str3, String str4, Integer num, Callable callable2) {
        io.sentry.util.b.s(r5Var, "type is required");
        this.g0 = r5Var;
        this.X = str;
        this.h0 = i;
        this.Z = str2;
        this.i0 = callable;
        this.j0 = str3;
        this.f0 = str4;
        this.Y = num;
        this.k0 = callable2;
    }

    public final int a() {
        Callable callable = this.i0;
        if (callable == null) {
            return this.h0;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.n2
    public final void serialize(r3 r3Var, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) r3Var;
        cVar.k();
        String str = this.X;
        if (str != null) {
            cVar.p("content_type");
            cVar.y(str);
        }
        String str2 = this.Z;
        if (str2 != null) {
            cVar.p("filename");
            cVar.y(str2);
        }
        cVar.p("type");
        cVar.v(iLogger, this.g0);
        String str3 = this.j0;
        if (str3 != null) {
            cVar.p("attachment_type");
            cVar.y(str3);
        }
        String str4 = this.f0;
        if (str4 != null) {
            cVar.p("platform");
            cVar.y(str4);
        }
        Integer num = this.Y;
        if (num != null) {
            cVar.p("item_count");
            cVar.x(num);
        }
        cVar.p("length");
        cVar.u(a());
        Integer num2 = null;
        Callable callable = this.k0;
        if (callable != null) {
            try {
                num2 = (Integer) callable.call();
            } catch (Throwable unused) {
            }
        }
        if (num2 != null) {
            cVar.p("meta_length");
            cVar.x(num2);
        }
        HashMap map = this.l0;
        if (map != null) {
            for (String str5 : map.keySet()) {
                e.a(this.l0, str5, cVar, str5, iLogger);
            }
        }
        cVar.m();
    }

    public i5(r5 r5Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        this(r5Var, -1, callable, str, str2, str3, str4, num, null);
    }

    public i5(r5 r5Var, Callable callable, String str, String str2, String str3) {
        this(r5Var, callable, str, str2, str3, null, null);
    }
}
