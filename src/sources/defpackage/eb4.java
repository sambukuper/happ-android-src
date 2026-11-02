package defpackage;

import androidx.recyclerview.widget.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eb4 extends f {
    public final iv c;

    public eb4(nr4 nr4Var) {
        ExecutorService executorServiceNewFixedThreadPool;
        db4 db4Var = new db4(this);
        wl6 wl6Var = new wl6((Object) this, (byte) 5);
        synchronized (nr4.b) {
            try {
                executorServiceNewFixedThreadPool = nr4.c;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    nr4.c = executorServiceNewFixedThreadPool;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iv ivVar = new iv(wl6Var, new dq((Object) executorServiceNewFixedThreadPool, (Object) nr4Var, (byte) 19));
        this.c = ivVar;
        ivVar.d.add(db4Var);
    }

    @Override // androidx.recyclerview.widget.f
    public int a() {
        return this.c.f.size();
    }
}
