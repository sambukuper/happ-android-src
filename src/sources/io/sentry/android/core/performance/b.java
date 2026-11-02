package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.a5;
import io.sentry.q1;
import io.sentry.x1;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public a5 b = null;
    public a5 c = null;
    public q1 d = null;
    public q1 e = null;

    public b(String str) {
        this.a = str;
    }

    public static q1 a(q1 q1Var, String str, a5 a5Var) {
        q1 q1VarD = q1Var.d(str, a5Var, x1.SENTRY);
        q1VarD.j(Long.valueOf(io.sentry.android.core.internal.util.f.d(Looper.getMainLooper().getThread())), "thread.id");
        q1VarD.j("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        q1VarD.j(bool, "ui.contributes_to_ttid");
        q1VarD.j(bool, "ui.contributes_to_ttfd");
        return q1VarD;
    }
}
