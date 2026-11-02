package io.sentry.android.core;

import io.sentry.s6;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements io.sentry.c1 {
    public final s6 a;
    public final long b;

    public o1(s6 s6Var, long j) {
        this.a = s6Var;
        this.b = j;
    }

    @Override // io.sentry.c1
    public final void g(String str) {
        io.sentry.cache.a.d(this.a, Long.toString(this.b), ".options-cache", "app-last-update-time.json");
    }

    @Override // io.sentry.c1
    public final void a(Map map) {
    }

    @Override // io.sentry.c1
    public final void b(io.sentry.protocol.u uVar) {
    }

    @Override // io.sentry.c1
    public final void c(String str) {
    }

    @Override // io.sentry.c1
    public final void d(Double d) {
    }

    @Override // io.sentry.c1
    public final void e(String str) {
    }

    @Override // io.sentry.c1
    public final void f(String str) {
    }
}
