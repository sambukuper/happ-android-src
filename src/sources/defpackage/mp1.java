package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lmp1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mp1 extends Exception {
    public final Throwable X;

    public mp1(Throwable th, u61 u61Var, s61 s61Var) {
        super("Coroutine dispatcher " + u61Var + " threw an exception, context = " + s61Var, th);
        this.X = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.X;
    }
}
