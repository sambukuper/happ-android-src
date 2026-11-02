package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pq implements Runnable {
    public final /* synthetic */ byte X;
    public final int Y;
    public final Object Z;
    public final /* synthetic */ Object f0;

    public pq(kb4 kb4Var, int i, xb4 xb4Var) {
        this.X = (byte) 3;
        this.f0 = kb4Var;
        this.Y = i;
        this.Z = xb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        qd0 qd0Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        su5 su5Var;
        byte b = this.X;
        Object obj = this.Z;
        int i = this.Y;
        Object obj2 = this.f0;
        switch (b) {
            case 0:
                tq.d((TextView) obj, (Typeface) obj2, i);
                return;
            case 1:
                int i2 = BottomSheetBehavior.p0;
                ((BottomSheetBehavior) obj2).Q((View) obj, i, false);
                return;
            case 2:
                vi3 vi3Var = (vi3) obj;
                l lVar = vi3Var.e;
                yi3 yi3Var = (yi3) obj2;
                RecyclerView recyclerView = yi3Var.r;
                if (recyclerView == null || !recyclerView.y0 || vi3Var.k || lVar.b() == -1) {
                    return;
                }
                d96 itemAnimator = yi3Var.r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList7 = yi3Var.p;
                    int size = arrayList7.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((vi3) arrayList7.get(i3)).l) {
                        }
                    }
                    yi3Var.m.j(lVar, i);
                    return;
                }
                yi3Var.r.post(this);
                return;
            case 3:
                kb4 kb4Var = (kb4) obj2;
                xb4 xb4Var = (xb4) obj;
                boolean z = kb4Var.Z;
                AtomicInteger atomicInteger = kb4Var.f0;
                ArrayList arrayList8 = kb4Var.Y;
                xb4 xb4Var2 = kb4Var.g0;
                if (xb4Var2.isDone() || arrayList8 == null) {
                    mb6.s("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    mb6.s("Tried to set value from future which is not done", xb4Var.isDone());
                    arrayList8.set(i, vr3.E(xb4Var));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    mb6.s("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        if (arrayList6 != null) {
                            qd0Var = kb4Var.h0;
                            arrayList2 = new ArrayList(arrayList6);
                            qd0Var.b(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z) {
                        kb4Var.cancel(false);
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    mb6.s("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList5 != null) {
                            qd0Var = kb4Var.h0;
                            arrayList2 = new ArrayList(arrayList5);
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e) {
                    if (z) {
                        kb4Var.h0.d(e.getCause());
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    mb6.s("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList4 != null) {
                            qd0Var = kb4Var.h0;
                            arrayList2 = new ArrayList(arrayList4);
                        }
                        return;
                    }
                    return;
                } catch (Error e2) {
                    kb4Var.h0.d(e2);
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    mb6.s("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList3 != null) {
                            qd0Var = kb4Var.h0;
                            arrayList2 = new ArrayList(arrayList3);
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e3) {
                    if (z) {
                        kb4Var.h0.d(e3);
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    mb6.s("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            qd0Var = kb4Var.h0;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    mb6.s("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList9 = kb4Var.Y;
                        if (arrayList9 != null) {
                            kb4Var.h0.b(new ArrayList(arrayList9));
                        } else {
                            mb6.s(null, xb4Var2.isDone());
                        }
                    }
                }
            default:
                wu5 wu5Var = (wu5) obj2;
                AtomicLong atomicLong = wu5Var.f0;
                atomicLong.lazySet(atomicLong.get() + ((long) i));
                su5 su5Var2 = (su5) obj;
                sa4 sa4Var = wu5Var.Z;
                if (sa4Var.b(su5Var2) && su5Var2 != (su5Var = sa4Var.Y)) {
                    su5 su5Var3 = su5Var2.Y;
                    su5 su5Var4 = su5Var2.Z;
                    if (su5Var3 == null) {
                        sa4Var.X = su5Var4;
                    } else {
                        su5Var3.Z = su5Var4;
                        su5Var2.Y = null;
                    }
                    if (su5Var4 == null) {
                        sa4Var.Y = su5Var3;
                        su5Var = su5Var3;
                    } else {
                        su5Var4.Y = su5Var3;
                        su5Var2.Z = null;
                    }
                    sa4Var.Y = su5Var2;
                    if (su5Var == null) {
                        sa4Var.X = su5Var2;
                    } else {
                        su5Var.Z = su5Var2;
                        su5Var2.Y = su5Var;
                    }
                }
                wu5Var.e();
                return;
        }
    }

    public /* synthetic */ pq(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.f0 = obj;
        this.Z = obj2;
        this.Y = i;
    }

    public pq(TextView textView, Typeface typeface, int i) {
        this.X = (byte) 0;
        this.Z = textView;
        this.f0 = typeface;
        this.Y = i;
    }
}
