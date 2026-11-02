package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jv2 implements Callable {
    public final /* synthetic */ Runnable a;

    public jv2(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.run();
        return null;
    }
}
