package defpackage;

import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import com.google.android.material.progressindicator.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tf7 {
    public static final mx1 p = new mx1(1);
    public static final mx1 q = new mx1(2);
    public static final mx1 r = new mx1(3);
    public static final mx1 s = new mx1(4);
    public static final mx1 t = new mx1(5);
    public static final mx1 u = new mx1(6);
    public static final mx1 v = new mx1(0);
    public final Object d;
    public final ys0 e;
    public float j;
    public uf7 m;
    public float n;
    public boolean o;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public final float g = Float.MAX_VALUE;
    public final float h = -3.4028235E38f;
    public long i = 0;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public tf7(Object obj, ys0 ys0Var) {
        this.d = obj;
        this.e = ys0Var;
        if (ys0Var == s || ys0Var == t || ys0Var == u) {
            this.j = 0.1f;
        } else if (ys0Var == v) {
            this.j = 0.00390625f;
        } else if (ys0Var == q || ys0Var == r) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static lk c() {
        ThreadLocal threadLocal = lk.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new lk(new dq((byte) 12)));
        }
        return (lk) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        uf7 uf7Var = this.m;
        if (uf7Var == null) {
            uf7Var = new uf7(f);
            this.m = uf7Var;
        }
        uf7Var.i = f;
        g();
    }

    public final void b(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f = false;
        lk lkVarC = c();
        lkVarC.a.remove(this);
        ArrayList arrayList2 = lkVarC.b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            lkVarC.f = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                a aVar = ((g20) arrayList.get(i)).a;
                if (aVar.getProgressDrawable() != null && aVar.getProgressDrawable().getLevel() == 10000) {
                    h20 h20Var = aVar.r0;
                    if (aVar.getVisibility() != 0) {
                        aVar.removeCallbacks(aVar.q0);
                    } else {
                        aVar.removeCallbacks(h20Var);
                        long jUptimeMillis = SystemClock.uptimeMillis() - aVar.k0;
                        long j = aVar.j0;
                        if (jUptimeMillis >= j) {
                            h20Var.run();
                        } else {
                            aVar.postDelayed(h20Var, j - jUptimeMillis);
                        }
                    }
                }
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d(float f) {
        if (f > 0.0f) {
            this.j = f;
        } else {
            bt.q("Minimum visible change must be positive.");
        }
    }

    public final void e(float f) {
        this.e.U(this.d, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                ((vd8) arrayList.get(i)).getClass();
                throw null;
            }
            i++;
        }
    }

    public final void f() {
        if (this.m.b <= 0.0d) {
            u52.k("Spring animations can only come to an end when there is damping");
        } else {
            if (!c().b()) {
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            if (this.f) {
                this.o = true;
            }
        }
    }

    public final void g() {
        uf7 uf7Var = this.m;
        if (uf7Var == null) {
            u52.k("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double d = (float) uf7Var.i;
        float f = this.g;
        if (d > f) {
            u52.k("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f2 = this.h;
        if (d < f2) {
            u52.k("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.j * 0.75f);
        uf7Var.d = dAbs;
        uf7Var.e = dAbs * 62.5d;
        if (!c().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.E(this.d);
        }
        float f3 = this.b;
        if (f3 > f || f3 < f2) {
            bt.q("Starting value need to be in between min value and max value");
        } else {
            c().a(this);
        }
    }
}
