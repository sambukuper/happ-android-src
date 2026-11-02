package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p84 implements c94, lg0 {
    public final ScannerActivity Y;
    public final tl0 Z;
    public final Object X = new Object();
    public boolean f0 = false;
    public xy0 g0 = null;

    public p84(ScannerActivity scannerActivity, tl0 tl0Var, dm6 dm6Var) {
        this.Y = scannerActivity;
        this.Z = tl0Var;
        g94 g94Var = scannerActivity.X;
        if (g94Var.i.compareTo(o84.f0) >= 0) {
            tl0Var.k();
        } else {
            tl0Var.w();
        }
        g94Var.a(this);
    }

    @Override // defpackage.lg0
    public final xi0 c() {
        return this.Z.X.Y;
    }

    public final void d(xy0 xy0Var) {
        synchronized (this.X) {
            try {
                if (this.g0 == null) {
                    this.g0 = xy0Var;
                } else {
                    ArrayList arrayList = new ArrayList((List) this.g0.h0);
                    arrayList.addAll((List) xy0Var.h0);
                    this.g0 = new xy0(arrayList, (List) xy0Var.Y);
                }
                synchronized (this.Z.m0) {
                }
                tl0 tl0Var = this.Z;
                List list = (List) xy0Var.Y;
                synchronized (tl0Var.m0) {
                    tl0Var.j0 = list;
                }
                synchronized (this.Z.m0) {
                }
                tl0 tl0Var2 = this.Z;
                Range range = (Range) xy0Var.Z;
                synchronized (tl0Var2.m0) {
                    tl0Var2.k0 = range;
                }
                aj0 aj0Var = (aj0) c();
                aj0Var.getClass();
                jf6 jf6VarW = g55.w(aj0Var, xy0Var);
                ((ScheduledExecutorService) xy0Var.j0).execute(new sc(jf6VarW, xy0Var, (byte) 29));
                this.Z.d((List) xy0Var.h0, jf6VarW);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d94 f() {
        ScannerActivity scannerActivity;
        synchronized (this.X) {
            scannerActivity = this.Y;
        }
        return scannerActivity;
    }

    public final List i() {
        List listUnmodifiableList;
        synchronized (this.X) {
            listUnmodifiableList = Collections.unmodifiableList(this.Z.A());
        }
        return listUnmodifiableList;
    }

    @qa5(n84.ON_DESTROY)
    public void onDestroy(d94 d94Var) {
        synchronized (this.X) {
            tl0 tl0Var = this.Z;
            tl0Var.C((ArrayList) tl0Var.A());
        }
    }

    @qa5(n84.ON_PAUSE)
    public void onPause(d94 d94Var) {
        this.Z.X.l(false);
    }

    @qa5(n84.ON_RESUME)
    public void onResume(d94 d94Var) {
        this.Z.X.l(true);
    }

    @qa5(n84.ON_START)
    public void onStart(d94 d94Var) {
        synchronized (this.X) {
            try {
                if (!this.f0) {
                    this.Z.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @qa5(n84.ON_STOP)
    public void onStop(d94 d94Var) {
        synchronized (this.X) {
            try {
                if (!this.f0) {
                    this.Z.w();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        synchronized (this.X) {
            try {
                if (this.f0) {
                    return;
                }
                onStop(this.Y);
                this.f0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this.X) {
            try {
                List listA = this.Z.A();
                this.Z.C((ArrayList) listA);
                for (hq8 hq8Var : (ArrayList) listA) {
                    if (hq8Var.n()) {
                        synchronized (hq8Var.c) {
                        }
                    }
                }
                this.g0 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        synchronized (this.X) {
            try {
                if (this.f0) {
                    this.f0 = false;
                    if (this.Y.X.i.compareTo(o84.f0) >= 0) {
                        onStart(this.Y);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
