package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends TimerTask {
    public final /* synthetic */ ArrayList X;
    public final /* synthetic */ w Y;

    public u(w wVar, ArrayList arrayList) {
        this.Y = wVar;
        this.X = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.X.clear();
        t3 t3Var = new t3(this.Y.g.getDateProvider().a().d());
        Iterator it = this.Y.d.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).a(t3Var);
        }
        for (v vVar : this.Y.c.values()) {
            long j = t3Var.g;
            synchronized (vVar.a) {
                vVar.a.add(t3Var);
            }
            s1 s1Var = vVar.b;
            if (s1Var != null && j > vVar.c + 30000000000L) {
                this.X.add(s1Var);
            }
        }
        Iterator it2 = this.X.iterator();
        while (it2.hasNext()) {
            this.Y.f((s1) it2.next());
        }
    }
}
