package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rj0 {
    public final r91 a;
    public final int b;
    public final Object c;
    public boolean d;

    public rj0(r91 r91Var) {
        this.a = r91Var;
        qv qvVar = tj0.a;
        qvVar.getClass();
        this.b = qv.b.incrementAndGet(qvVar);
        this.c = new Object();
    }

    public final jl0 a() {
        jl0 jl0Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            jl0Var = (jl0) this.a.z.get();
        }
        return jl0Var;
    }

    public final zh0 b() {
        zh0 zh0Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            zh0Var = (zh0) this.a.x.get();
        }
        return zh0Var;
    }

    public final qi0 c(hi0 hi0Var, ni0 ni0Var) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) vi0.b(hi0Var.a)));
            return (qi0) new q91(this.a.c, new dq((Object) hi0Var, (Object) ni0Var, (byte) 27)).s.get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.b;
    }
}
