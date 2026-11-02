package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c57 implements d57 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final d57 b;

    public c57(d57 d57Var) {
        this.b = d57Var;
    }

    @Override // defpackage.d57
    public final void a(f57 f57Var) {
        if (this.a.get()) {
            return;
        }
        this.b.a(f57Var);
    }

    public final void b() {
        this.a.set(true);
    }
}
