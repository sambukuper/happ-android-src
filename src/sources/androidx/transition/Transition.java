package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import defpackage.cw8;
import defpackage.em7;
import defpackage.f03;
import defpackage.ne8;
import defpackage.pd8;
import defpackage.qd8;
import defpackage.qi4;
import defpackage.rp7;
import defpackage.u52;
import defpackage.ud8;
import defpackage.vt;
import defpackage.yr6;
import defpackage.z4;
import defpackage.zd8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] A0 = new Animator[0];
    public static final int[] B0 = {2, 1, 3, 4};
    public static final pd8 C0 = new pd8();
    public static final ThreadLocal D0 = new ThreadLocal();
    public ArrayList m0;
    public ArrayList n0;
    public zd8[] o0;
    public long y0;
    public long z0;
    public final String X = getClass().getName();
    public long Y = -1;
    public long Z = -1;
    public TimeInterpolator f0 = null;
    public final ArrayList g0 = new ArrayList();
    public final ArrayList h0 = new ArrayList();
    public yr6 i0 = new yr6((byte) 7);
    public yr6 j0 = new yr6((byte) 7);
    public TransitionSet k0 = null;
    public final int[] l0 = B0;
    public final ArrayList p0 = new ArrayList();
    public Animator[] q0 = A0;
    public int r0 = 0;
    public boolean s0 = false;
    public boolean t0 = false;
    public Transition u0 = null;
    public ArrayList v0 = null;
    public ArrayList w0 = new ArrayList();
    public PathMotion x0 = C0;

    public static void b(yr6 yr6Var, View view, ne8 ne8Var) {
        vt vtVar = (vt) yr6Var.Y;
        vt vtVar2 = (vt) yr6Var.g0;
        SparseArray sparseArray = (SparseArray) yr6Var.Z;
        qi4 qi4Var = (qi4) yr6Var.f0;
        vtVar.put(view, ne8Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = cw8.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (vtVar2.containsKey(transitionName)) {
                vtVar2.put(transitionName, null);
            } else {
                vtVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (qi4Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    qi4Var.f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) qi4Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    qi4Var.f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static vt o() {
        ThreadLocal threadLocal = D0;
        vt vtVar = (vt) threadLocal.get();
        if (vtVar != null) {
            return vtVar;
        }
        vt vtVar2 = new vt(0);
        threadLocal.set(vtVar2);
        return vtVar2;
    }

    public static boolean u(ne8 ne8Var, ne8 ne8Var2, String str) {
        Object obj = ne8Var.a.get(str);
        Object obj2 = ne8Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        I();
        vt vtVarO = o();
        for (Animator animator : this.w0) {
            if (vtVarO.containsKey(animator)) {
                I();
                if (animator != null) {
                    animator.addListener(new f03(this, vtVarO, (byte) 2));
                    long j = this.Z;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.Y;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f0;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new z4((Object) this, (byte) 8));
                    animator.start();
                }
            }
        }
        this.w0.clear();
        l();
    }

    public void B(long j, long j2) {
        long j3 = this.y0;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.t0 = false;
            v(this, em7.Y, z);
        }
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q0);
        this.q0 = A0;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ud8.b(animator, Math.min(Math.max(0L, j), ud8.a(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.q0 = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.t0 = true;
        }
        v(this, em7.Z, z);
    }

    public void C(long j) {
        this.Z = j;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.f0 = timeInterpolator;
    }

    public void F(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.x0 = C0;
        } else {
            this.x0 = pathMotion;
        }
    }

    public void H(long j) {
        this.Y = j;
    }

    public final void I() {
        if (this.r0 == 0) {
            v(this, em7.Y, false);
            this.t0 = false;
        }
        this.r0++;
    }

    public String J(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.Z != -1) {
            sb.append("dur(");
            sb.append(this.Z);
            sb.append(") ");
        }
        if (this.Y != -1) {
            sb.append("dly(");
            sb.append(this.Y);
            sb.append(") ");
        }
        if (this.f0 != null) {
            sb.append("interp(");
            sb.append(this.f0);
            sb.append(") ");
        }
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h0;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(zd8 zd8Var) {
        ArrayList arrayList = this.v0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.v0 = arrayList;
        }
        arrayList.add(zd8Var);
    }

    public void c(ne8 ne8Var) {
        ChangeBounds.K(ne8Var);
    }

    public void cancel() {
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q0);
        this.q0 = A0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.q0 = animatorArr;
        v(this, em7.f0, false);
    }

    public final void d(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            ne8 ne8Var = new ne8(view);
            if (z) {
                f(ne8Var);
            } else {
                c(ne8Var);
            }
            ne8Var.c.add(this);
            e(ne8Var);
            if (z) {
                b(this.i0, view, ne8Var);
            } else {
                b(this.j0, view, ne8Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void f(ne8 ne8Var) {
        ChangeBounds.K(ne8Var);
    }

    public final void g(ViewGroup viewGroup, boolean z) {
        h(z);
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h0;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                ne8 ne8Var = new ne8(viewFindViewById);
                if (z) {
                    f(ne8Var);
                } else {
                    c(ne8Var);
                }
                ne8Var.c.add(this);
                e(ne8Var);
                if (z) {
                    b(this.i0, viewFindViewById, ne8Var);
                } else {
                    b(this.j0, viewFindViewById, ne8Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            ne8 ne8Var2 = new ne8(view);
            if (z) {
                f(ne8Var2);
            } else {
                c(ne8Var2);
            }
            ne8Var2.c.add(this);
            e(ne8Var2);
            if (z) {
                b(this.i0, view, ne8Var2);
            } else {
                b(this.j0, view, ne8Var2);
            }
        }
    }

    public final void h(boolean z) {
        if (z) {
            ((vt) this.i0.Y).clear();
            ((SparseArray) this.i0.Z).clear();
            ((qi4) this.i0.f0).a();
        } else {
            ((vt) this.j0.Y).clear();
            ((SparseArray) this.j0.Z).clear();
            ((qi4) this.j0.f0).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.w0 = new ArrayList();
            transition.i0 = new yr6((byte) 7);
            transition.j0 = new yr6((byte) 7);
            transition.m0 = null;
            transition.n0 = null;
            transition.u0 = this;
            transition.v0 = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            u52.q(e);
            return null;
        }
    }

    public Animator j(ViewGroup viewGroup, ne8 ne8Var, ne8 ne8Var2) {
        return null;
    }

    public void k(ViewGroup viewGroup, yr6 yr6Var, yr6 yr6Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        ne8 ne8Var;
        Animator animator;
        ne8 ne8Var2;
        vt vtVarO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        n().getClass();
        int i3 = 0;
        while (i3 < size) {
            ne8 ne8Var3 = (ne8) arrayList.get(i3);
            ne8 ne8Var4 = (ne8) arrayList2.get(i3);
            if (ne8Var3 != null && !ne8Var3.c.contains(this)) {
                ne8Var3 = null;
            }
            if (ne8Var4 != null && !ne8Var4.c.contains(this)) {
                ne8Var4 = null;
            }
            if ((ne8Var3 != null || ne8Var4 != null) && (ne8Var3 == null || ne8Var4 == null || s(ne8Var3, ne8Var4))) {
                Animator animatorJ = j(viewGroup, ne8Var3, ne8Var4);
                if (animatorJ != null) {
                    String str = this.X;
                    if (ne8Var4 != null) {
                        view = ne8Var4.b;
                        String[] strArrP = p();
                        if (strArrP != null && strArrP.length > 0) {
                            ne8Var2 = new ne8(view);
                            ne8 ne8Var5 = (ne8) ((vt) yr6Var2.Y).get(view);
                            i = size;
                            if (ne8Var5 != null) {
                                int i4 = 0;
                                while (i4 < strArrP.length) {
                                    String str2 = strArrP[i4];
                                    int i5 = i3;
                                    ne8Var2.a.put(str2, ne8Var5.a.get(str2));
                                    i4++;
                                    i3 = i5;
                                    ne8Var5 = ne8Var5;
                                }
                            }
                            i2 = i3;
                            int i6 = vtVarO.Z;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorJ;
                                    break;
                                }
                                qd8 qd8Var = (qd8) vtVarO.get((Animator) vtVarO.g(i7));
                                if (qd8Var.c != null && qd8Var.a == view && qd8Var.b.equals(str) && qd8Var.c.equals(ne8Var2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorJ;
                            ne8Var2 = null;
                        }
                        animatorJ = animator;
                        ne8Var = ne8Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = ne8Var3.b;
                        ne8Var = null;
                    }
                    if (animatorJ != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        qd8 qd8Var2 = new qd8();
                        qd8Var2.a = view;
                        qd8Var2.b = str;
                        qd8Var2.c = ne8Var;
                        qd8Var2.d = windowId;
                        qd8Var2.e = this;
                        qd8Var2.f = animatorJ;
                        vtVarO.put(animatorJ, qd8Var2);
                        this.w0.add(animatorJ);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                qd8 qd8Var3 = (qd8) vtVarO.get((Animator) this.w0.get(sparseIntArray.keyAt(i8)));
                qd8Var3.f.setStartDelay(qd8Var3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void l() {
        int i = this.r0 - 1;
        this.r0 = i;
        if (i == 0) {
            v(this, em7.Z, false);
            for (int i2 = 0; i2 < ((qi4) this.i0.f0).h(); i2++) {
                View view = (View) ((qi4) this.i0.f0).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((qi4) this.j0.f0).h(); i3++) {
                View view2 = (View) ((qi4) this.j0.f0).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.t0 = true;
        }
    }

    public final ne8 m(View view, boolean z) {
        TransitionSet transitionSet = this.k0;
        if (transitionSet != null) {
            return transitionSet.m(view, z);
        }
        ArrayList arrayList = z ? this.m0 : this.n0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            ne8 ne8Var = (ne8) arrayList.get(i);
            if (ne8Var == null) {
                return null;
            }
            if (ne8Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (ne8) (z ? this.n0 : this.m0).get(i);
        }
        return null;
    }

    public final Transition n() {
        TransitionSet transitionSet = this.k0;
        return transitionSet != null ? transitionSet.n() : this;
    }

    public String[] p() {
        return null;
    }

    public final ne8 q(View view, boolean z) {
        TransitionSet transitionSet = this.k0;
        if (transitionSet != null) {
            return transitionSet.q(view, z);
        }
        return (ne8) ((vt) (z ? this.i0 : this.j0).Y).get(view);
    }

    public boolean r() {
        return !this.p0.isEmpty();
    }

    public boolean s(ne8 ne8Var, ne8 ne8Var2) {
        if (ne8Var != null && ne8Var2 != null) {
            String[] strArrP = p();
            if (strArrP != null) {
                for (String str : strArrP) {
                    if (u(ne8Var, ne8Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = ne8Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(ne8Var, ne8Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.h0;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return J(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public final void v(Transition transition, em7 em7Var, boolean z) {
        Transition transition2 = this.u0;
        if (transition2 != null) {
            transition2.v(transition, em7Var, z);
        }
        ArrayList arrayList = this.v0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.v0.size();
        zd8[] zd8VarArr = this.o0;
        if (zd8VarArr == null) {
            zd8VarArr = new zd8[size];
        }
        this.o0 = null;
        zd8[] zd8VarArr2 = (zd8[]) this.v0.toArray(zd8VarArr);
        for (int i = 0; i < size; i++) {
            zd8 zd8Var = zd8VarArr2[i];
            switch (em7Var.X) {
                case 5:
                    zd8Var.c(transition);
                    break;
                case 6:
                    zd8Var.d(transition);
                    break;
                case 7:
                    zd8Var.e(transition);
                    break;
                case 8:
                    zd8Var.a();
                    break;
                default:
                    zd8Var.f();
                    break;
            }
            zd8VarArr2[i] = null;
        }
        this.o0 = zd8VarArr2;
    }

    public void w(View view) {
        if (this.t0) {
            return;
        }
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q0);
        this.q0 = A0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.q0 = animatorArr;
        v(this, em7.g0, false);
        this.s0 = true;
    }

    public void x() {
        vt vtVarO = o();
        this.y0 = 0L;
        int i = 0;
        while (true) {
            int size = this.w0.size();
            ArrayList arrayList = this.w0;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            qd8 qd8Var = (qd8) vtVarO.get(animator);
            if (animator != null && qd8Var != null) {
                Animator animator2 = qd8Var.f;
                long j = this.Z;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.Y;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f0;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.p0.add(animator);
                this.y0 = Math.max(this.y0, ud8.a(animator));
            }
            i++;
        }
    }

    public Transition y(zd8 zd8Var) {
        Transition transition;
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            if (!arrayList.remove(zd8Var) && (transition = this.u0) != null) {
                transition.y(zd8Var);
            }
            if (this.v0.size() == 0) {
                this.v0 = null;
            }
        }
        return this;
    }

    public void z(View view) {
        if (this.s0) {
            if (!this.t0) {
                ArrayList arrayList = this.p0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q0);
                this.q0 = A0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.q0 = animatorArr;
                v(this, em7.h0, false);
            }
            this.s0 = false;
        }
    }

    public void G() {
    }

    public void D(rp7 rp7Var) {
    }

    public void e(ne8 ne8Var) {
    }
}
