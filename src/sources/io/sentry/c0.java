package io.sentry;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public final i1 a;
    public final ILogger b;
    public final long c;
    public final k7 d;

    public c0(i1 i1Var, ILogger iLogger, long j, int i) {
        this.a = i1Var;
        this.b = iLogger;
        this.c = j;
        this.d = new k7(new j(i));
    }

    public boolean a(String str) {
        return str.endsWith(".envelope");
    }

    public abstract void b(File file, n0 n0Var);
}
