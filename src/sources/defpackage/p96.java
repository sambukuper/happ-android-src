package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p96 {
    public int a = -1;
    public RecyclerView b;
    public j c;
    public boolean d;
    public boolean e;
    public View f;
    public final n96 g;

    public p96() {
        n96 n96Var = new n96();
        n96Var.d = -1;
        n96Var.f = false;
        n96Var.a = 0;
        n96Var.b = 0;
        n96Var.c = Integer.MIN_VALUE;
        n96Var.e = null;
        this.g = n96Var;
    }

    public PointF a(int i) {
        Object obj = this.c;
        if (obj instanceof o96) {
            return ((o96) obj).a(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    public final void b(int i, int i2) {
        PointF pointFA;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            e();
        }
        if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null) {
            float f = pointFA.x;
            if (f != 0.0f || pointFA.y != 0.0f) {
                recyclerView.i0((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        n96 n96Var = this.g;
        if (view != null) {
            this.b.getClass();
            l lVarN = RecyclerView.N(view);
            if ((lVarN != null ? lVarN.c() : -1) == this.a) {
                View view2 = this.f;
                q96 q96Var = recyclerView.k1;
                d(view2, n96Var);
                n96Var.a(recyclerView);
                e();
            } else {
                this.f = null;
            }
        }
        if (this.e) {
            q96 q96Var2 = recyclerView.k1;
            c cVar = (c) this;
            if (cVar.b.s0.I() == 0) {
                cVar.e();
            } else {
                int i3 = cVar.n;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                cVar.n = i4;
                int i5 = cVar.o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                cVar.o = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFA2 = cVar.a(cVar.a);
                    if (pointFA2 != null) {
                        float f2 = pointFA2.x;
                        if (f2 == 0.0f && pointFA2.y == 0.0f) {
                            n96Var.d = cVar.a;
                            cVar.e();
                        } else {
                            float f3 = pointFA2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFA2.x / fSqrt;
                            pointFA2.x = f4;
                            float f5 = pointFA2.y / fSqrt;
                            pointFA2.y = f5;
                            cVar.j = pointFA2;
                            cVar.n = (int) (f4 * 10000.0f);
                            cVar.o = (int) (f5 * 10000.0f);
                            int iJ = cVar.j(10000);
                            int i7 = (int) (cVar.n * 1.2f);
                            int i8 = (int) (cVar.o * 1.2f);
                            n96Var.a = i7;
                            n96Var.b = i8;
                            n96Var.c = (int) (iJ * 1.2f);
                            n96Var.e = cVar.h;
                            n96Var.f = true;
                        }
                    } else {
                        n96Var.d = cVar.a;
                        cVar.e();
                    }
                }
            }
            boolean z = n96Var.d >= 0;
            n96Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.h1.b();
            }
        }
    }

    public abstract void c();

    public abstract void d(View view, n96 n96Var);

    public final void e() {
        if (this.e) {
            this.e = false;
            c();
            this.b.k1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            j jVar = this.c;
            if (jVar.g0 == this) {
                jVar.g0 = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
