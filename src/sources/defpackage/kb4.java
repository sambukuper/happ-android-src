package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kb4 implements xb4 {
    public ArrayList X;
    public ArrayList Y;
    public final boolean Z;
    public final AtomicInteger f0;
    public final xb4 g0 = u15.u(new q02(this, (byte) 17));
    public qd0 h0;

    public kb4(ArrayList arrayList, boolean z, dp1 dp1Var) {
        this.X = arrayList;
        this.Y = new ArrayList(arrayList.size());
        this.Z = z;
        this.f0 = new AtomicInteger(arrayList.size());
        a(new xb(this, (byte) 16), dp1.a());
        if (this.X.isEmpty()) {
            this.h0.b(new ArrayList(this.Y));
            return;
        }
        for (int i = 0; i < this.X.size(); i++) {
            this.Y.add(null);
        }
        ArrayList arrayList2 = this.X;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            xb4 xb4Var = (xb4) arrayList2.get(i2);
            xb4Var.a(new pq(this, i2, xb4Var), dp1Var);
        }
    }

    @Override // defpackage.xb4
    public final void a(Runnable runnable, Executor executor) {
        this.g0.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((xb4) it.next()).cancel(z);
            }
        }
        return this.g0.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<xb4> arrayList = this.X;
        xb4 xb4Var = this.g0;
        if (arrayList != null && !xb4Var.isDone()) {
            loop0: for (xb4 xb4Var2 : arrayList) {
                while (!xb4Var2.isDone()) {
                    try {
                        xb4Var2.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.Z) {
                            return (List) xb4Var.get();
                        }
                    }
                }
            }
        }
        return (List) xb4Var.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g0.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.g0.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.g0.get(j, timeUnit);
    }
}
