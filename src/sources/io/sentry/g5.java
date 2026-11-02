package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g5 implements Callable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ o1 b;
    public final /* synthetic */ w3 c;
    public final /* synthetic */ File d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g5(o1 o1Var, w3 w3Var, AtomicReference atomicReference, File file) {
        this.b = o1Var;
        this.c = w3Var;
        this.e = atomicReference;
        this.d = file;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0058 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() throws io.sentry.exception.c {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.g5.call():java.lang.Object");
    }

    public /* synthetic */ g5(File file, w3 w3Var, f1 f1Var, o1 o1Var) {
        this.d = file;
        this.c = w3Var;
        this.e = f1Var;
        this.b = o1Var;
    }
}
