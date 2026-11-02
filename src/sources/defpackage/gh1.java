package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gh1 implements qq8 {
    public final v06 a;
    public final pr8 b;
    public volatile wq8 c;
    public final AtomicBoolean d;

    public gh1(v06 v06Var, pr8 pr8Var) {
        v06Var.getClass();
        pr8Var.getClass();
        this.a = v06Var;
        this.b = pr8Var;
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.qq8
    public final xg1 a() {
        wq8 wq8Var = this.c;
        if (wq8Var != null) {
            return wq8Var.a();
        }
        return w51.j(this.b.f, null, new eh1(this, null, (byte) 2), 3);
    }

    @Override // defpackage.qq8
    public final Object b(uy7 uy7Var) {
        wq8 wq8Var = this.c;
        return wq8Var != null ? wq8Var.b(uy7Var) : w51.W(nr4.x(this.b.e), new eh1(this, null, (byte) 0), uy7Var);
    }

    @Override // defpackage.qq8
    public final xg1 c(gg0 gg0Var, Map map) {
        wq8 wq8Var = this.c;
        if (wq8Var != null) {
            return wq8Var.c(gg0Var, map);
        }
        return w51.j(this.b.f, null, new r0(this, (q51) null, (Object) gg0Var, (Object) map, (byte) 16), 3);
    }

    @Override // defpackage.qq8
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        w51.G(this.b.f, null, null, new l40((q51) null, (Object) this, (byte) 3), 3);
    }

    @Override // defpackage.qq8
    public final xg1 d(int i) {
        wq8 wq8Var = this.c;
        return wq8Var != null ? wq8Var.d(i) : w51.j(this.b.f, null, new fh1(this, (q51) null, i), 3);
    }

    @Override // defpackage.qq8
    public final xg1 e(List list) {
        wq8 wq8Var = this.c;
        return wq8Var != null ? wq8Var.e(list) : w51.j(this.b.f, null, new q0(this, (q51) null, list), 3);
    }

    @Override // defpackage.qq8
    public final xg1 f(LinkedHashSet linkedHashSet, boolean z) {
        wq8 wq8Var = this.c;
        return wq8Var != null ? wq8Var.f(linkedHashSet, z) : w51.j(this.b.f, null, new z81(this, (q51) null, z, linkedHashSet), 3);
    }

    @Override // defpackage.qq8
    public final xg1 g(Map map, pq8 pq8Var, k11 k11Var) {
        pq8Var.getClass();
        k11Var.getClass();
        wq8 wq8Var = this.c;
        return wq8Var != null ? wq8Var.g(map, pq8Var, k11Var) : w51.j(this.b.f, null, new pi(this, (q51) null, map, pq8Var, k11Var), 3);
    }

    @Override // defpackage.qq8
    public final xg1 h(Map map, k11 k11Var) {
        k11Var.getClass();
        wq8 wq8Var = this.c;
        if (wq8Var != null) {
            return wq8Var.h(map, k11Var);
        }
        return w51.j(this.b.f, null, new r0(this, (q51) null, (Object) map, (Object) k11Var, (byte) 15), 3);
    }

    @Override // defpackage.qq8
    public final xg1 i() {
        wq8 wq8Var = this.c;
        if (wq8Var != null) {
            return wq8Var.i();
        }
        return w51.j(this.b.f, null, new eh1(this, null, (byte) 1), 3);
    }

    public final wq8 j() {
        if (this.d.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        wq8 wq8Var = this.c;
        if (wq8Var != null) {
            return wq8Var;
        }
        wq8 wq8Var2 = (wq8) this.a.get();
        if (this.d.get()) {
            wq8Var2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        this.c = wq8Var2;
        wq8Var2.getClass();
        return wq8Var2;
    }
}
