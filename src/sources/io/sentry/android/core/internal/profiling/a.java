package io.sentry.android.core.internal.profiling;

import io.sentry.a5;
import io.sentry.profiling.c;
import io.sentry.protocol.w;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final w a;
    public final a5 b;
    public volatile a5 c = null;
    public c d = c.UNKNOWN;

    public a(w wVar, a5 a5Var) {
        this.a = wVar;
        this.b = a5Var;
    }

    public final synchronized void a(c cVar) {
        if (this.d == c.NOT_RECORDED) {
            return;
        }
        this.d = cVar;
    }
}
