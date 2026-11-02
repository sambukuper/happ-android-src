package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ix6 implements v53 {
    public final v53 a;
    public final Object b = new Object();
    public boolean c;

    public ix6(v53 v53Var) {
        this.a = v53Var;
    }

    public final void a() {
        v53 v53Var;
        synchronized (this.b) {
            try {
                if (!this.c || (v53Var = this.a) == null) {
                    hi5.z0("ScreenFlashWrapper");
                } else {
                    v53Var.clear();
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
        }
    }

    @Override // defpackage.v53
    public final void clear() {
        a();
    }
}
