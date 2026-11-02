package defpackage;

import androidx.recyclerview.widget.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iv {
    public static final hv h = new hv();
    public final wl6 a;
    public final dq b;
    public final hv c;
    public final CopyOnWriteArrayList d;
    public List e;
    public List f;
    public int g;

    public iv(f fVar, nr4 nr4Var) {
        ExecutorService executorServiceNewFixedThreadPool;
        wl6 wl6Var = new wl6((Object) fVar, (byte) 5);
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
        this(wl6Var, new dq((Object) executorServiceNewFixedThreadPool, (Object) nr4Var, (byte) 19));
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            eb4 eb4Var = ((db4) it.next()).a;
        }
    }

    public final void b(List list) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            return;
        }
        wl6 wl6Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            wl6Var.w(0, size);
            a();
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.Y).execute(new gv(this, list2, list, i));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        wl6Var.o(0, list.size());
        a();
    }

    public iv(wl6 wl6Var, dq dqVar) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.EMPTY_LIST;
        this.a = wl6Var;
        this.b = dqVar;
        this.c = h;
    }
}
