package defpackage;

import android.os.Build;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t96 implements Runnable {
    public int X;
    public int Y;
    public OverScroller Z;
    public Interpolator f0;
    public boolean g0;
    public boolean h0;
    public final /* synthetic */ RecyclerView i0;

    public t96(RecyclerView recyclerView) {
        this.i0 = recyclerView;
        wi3 wi3Var = RecyclerView.M1;
        this.f0 = wi3Var;
        this.g0 = false;
        this.h0 = false;
        this.Z = new OverScroller(recyclerView.getContext(), wi3Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.i0;
        recyclerView.setScrollState(2);
        this.Y = 0;
        this.X = 0;
        Interpolator interpolator = this.f0;
        wi3 wi3Var = RecyclerView.M1;
        if (interpolator != wi3Var) {
            this.f0 = wi3Var;
            this.Z = new OverScroller(recyclerView.getContext(), wi3Var);
        }
        this.Z.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.g0) {
            this.h0 = true;
            return;
        }
        RecyclerView recyclerView = this.i0;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = cw8.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.i0;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.M1;
        }
        if (this.f0 != interpolator) {
            this.f0 = interpolator;
            this.Z = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.Y = 0;
        this.X = 0;
        recyclerView.setScrollState(2);
        this.Z.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.i0;
        int[] iArr = recyclerView.w1;
        if (recyclerView.s0 == null) {
            recyclerView.removeCallbacks(this);
            this.Z.abortAnimation();
            return;
        }
        this.h0 = false;
        this.g0 = true;
        recyclerView.p();
        OverScroller overScroller = this.Z;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.X;
            int i7 = currY - this.Y;
            this.X = currX;
            this.Y = currY;
            int iO = RecyclerView.o(i6, recyclerView.O0, recyclerView.Q0, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i7, recyclerView.P0, recyclerView.R0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.w1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.r0 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.i0(iO, iO2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iO - i8;
                int i11 = iO2 - i9;
                c cVar = recyclerView.s0.g0;
                if (cVar != null && !cVar.d && cVar.e) {
                    int iB = recyclerView.k1.b();
                    if (iB == 0) {
                        cVar.e();
                    } else if (cVar.a >= iB) {
                        cVar.a = iB - 1;
                        cVar.b(i8, i9);
                    } else {
                        cVar.b(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iO;
                i2 = iO2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.v0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.w1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.x(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            c cVar2 = recyclerView.s0.g0;
            if ((cVar2 == null || !cVar2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.z();
                        if (recyclerView.O0.isFinished()) {
                            recyclerView.O0.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.A();
                        if (recyclerView.Q0.isFinished()) {
                            recyclerView.Q0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.P0.isFinished()) {
                            recyclerView.P0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.R0.isFinished()) {
                            recyclerView.R0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.K1) {
                    xr0 xr0Var = recyclerView.j1;
                    int[] iArr4 = (int[]) xr0Var.e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    xr0Var.d = 0;
                }
            } else {
                b();
                rp2 rp2Var = recyclerView.i1;
                if (rp2Var != null) {
                    rp2Var.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                a96.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        c cVar3 = recyclerView.s0.g0;
        if (cVar3 != null && cVar3.d) {
            cVar3.b(0, 0);
        }
        this.g0 = false;
        if (!this.h0) {
            recyclerView.setScrollState(0);
            recyclerView.s0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = cw8.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
