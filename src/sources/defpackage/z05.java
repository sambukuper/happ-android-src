package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z05 implements r85 {
    public int X;
    public boolean Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;

    public boolean a(int i, int i2) {
        ix4 ix4Var = (ix4) ((j05) this.f0).g(this.X + i);
        ix4 ix4Var2 = (ix4) ((j05) this.g0).g(this.X + i2);
        return dh3.f(ix4Var, ix4Var2) || ix4Var.getClass() == ix4Var2.getClass();
    }

    public void b() {
        synchronized (this.Z) {
            try {
                if (this.Y) {
                    return;
                }
                this.Y = true;
                og7 og7Var = (og7) this.h0;
                q51 q51Var = null;
                if (og7Var != null) {
                    og7Var.m(null);
                }
                this.h0 = null;
                w51.G((b71) this.f0, null, null, new l40((Object) this, q51Var, (byte) 20), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r85
    public void c(Executor executor, n85 n85Var) {
        ai7 ai7Var;
        synchronized (this.Z) {
            ai7 ai7Var2 = (ai7) ((HashMap) this.g0).remove(n85Var);
            if (ai7Var2 != null) {
                ai7Var2.Z.set(false);
                ((CopyOnWriteArraySet) this.h0).remove(ai7Var2);
            }
            ai7Var = new ai7((AtomicReference) this.f0, executor, n85Var);
            ((HashMap) this.g0).put(n85Var, ai7Var);
            ((CopyOnWriteArraySet) this.h0).add(ai7Var);
        }
        ai7Var.a(0);
    }

    @Override // defpackage.r85
    public void i(n85 n85Var) {
        synchronized (this.Z) {
            ai7 ai7Var = (ai7) ((HashMap) this.g0).remove(n85Var);
            if (ai7Var != null) {
                ai7Var.Z.set(false);
                ((CopyOnWriteArraySet) this.h0).remove(ai7Var);
            }
        }
    }
}
