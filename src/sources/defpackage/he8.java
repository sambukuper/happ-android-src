package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class he8 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public Transition X;
    public ViewGroup Y;

    /* JADX WARN: Code duplicated, block: B:100:0x0209  */
    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:107:0x0235  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e1 A[EDGE_INSN: B:134:0x01e1->B:90:0x01e1 BREAK  A[LOOP:1: B:19:0x0085->B:89:0x01da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        yr6 yr6Var;
        yr6 yr6Var2;
        vt vtVar;
        vt vtVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        vt vtVarO;
        int i5;
        Animator animator;
        qd8 qd8Var;
        ne8 ne8Var;
        ne8 ne8Var2;
        int i6;
        boolean z2;
        int i7;
        View view;
        ne8 ne8Var3;
        vt vtVar3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        qi4 qi4Var;
        int iH;
        int i11;
        View view6;
        boolean z3;
        Iterator it;
        Transition transition = this.X;
        ViewGroup viewGroup = this.Y;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!ie8.c.remove(viewGroup)) {
            return true;
        }
        vt vtVarB = ie8.b();
        ArrayList arrayList2 = (ArrayList) vtVarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(transition);
            transition.a(new ge8(this, vtVarB));
            i = 0;
            transition.g(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).z(viewGroup);
                }
            }
            transition.m0 = new ArrayList();
            transition.n0 = new ArrayList();
            yr6Var = transition.i0;
            yr6Var2 = transition.j0;
            vtVar = new vt((vt) yr6Var.Y);
            vtVar2 = new vt((vt) yr6Var2.Y);
            i2 = 0;
            while (true) {
                iArr = transition.l0;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = vtVar.Z - 1; i7 >= 0; i7--) {
                        view = (View) vtVar.g(i7);
                        if (view == null && transition.t(view) && (ne8Var3 = (ne8) vtVar2.remove(view)) != null && transition.t(ne8Var3.b)) {
                            transition.m0.add((ne8) vtVar.h(i7));
                            transition.n0.add(ne8Var3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    vtVar3 = (vt) yr6Var.g0;
                    vt vtVar4 = (vt) yr6Var2.g0;
                    i8 = vtVar3.Z;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) vtVar3.j(i9);
                        if (view2 == null && transition.t(view2) && (view3 = (View) vtVar4.get(vtVar3.g(i9))) != null && transition.t(view3)) {
                            ne8 ne8Var4 = (ne8) vtVar.get(view2);
                            ne8 ne8Var5 = (ne8) vtVar2.get(view3);
                            if (ne8Var4 != null && ne8Var5 != null) {
                                transition.m0.add(ne8Var4);
                                transition.n0.add(ne8Var5);
                                vtVar.remove(view2);
                                vtVar2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        qi4Var = (qi4) yr6Var.f0;
                        qi4 qi4Var2 = (qi4) yr6Var2.f0;
                        iH = qi4Var.h();
                        i11 = i;
                        while (i11 < iH) {
                            view6 = (View) qi4Var.i(i11);
                            if (view6 == null && transition.t(view6)) {
                                boolean z5 = z4;
                                View view7 = (View) qi4Var2.b(qi4Var.e(i11));
                                if (view7 == null || !transition.t(view7)) {
                                    z3 = z5;
                                } else {
                                    ne8 ne8Var6 = (ne8) vtVar.get(view6);
                                    ne8 ne8Var7 = (ne8) vtVar2.get(view7);
                                    if (ne8Var6 == null || ne8Var7 == null) {
                                        z3 = z5;
                                    } else {
                                        z3 = z5;
                                        transition.m0.add(ne8Var6);
                                        transition.n0.add(ne8Var7);
                                        vtVar.remove(view6);
                                        vtVar2.remove(view7);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) yr6Var.Z;
                    SparseArray sparseArray2 = (SparseArray) yr6Var2.Z;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && transition.t(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && transition.t(view5)) {
                            ne8 ne8Var8 = (ne8) vtVar.get(view4);
                            ne8 ne8Var9 = (ne8) vtVar2.get(view5);
                            if (ne8Var8 != null && ne8Var9 != null) {
                                transition.m0.add(ne8Var8);
                                transition.n0.add(ne8Var9);
                                vtVar.remove(view4);
                                vtVar2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
            }
            z = z4;
            for (i3 = 0; i3 < vtVar.Z; i3++) {
                ne8Var2 = (ne8) vtVar.j(i3);
                if (transition.t(ne8Var2.b)) {
                    transition.m0.add(ne8Var2);
                    transition.n0.add(null);
                }
            }
            for (i4 = 0; i4 < vtVar2.Z; i4++) {
                ne8Var = (ne8) vtVar2.j(i4);
                if (transition.t(ne8Var.b)) {
                    transition.n0.add(ne8Var);
                    transition.m0.add(null);
                }
            }
            vtVarO = Transition.o();
            int i12 = vtVarO.Z;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) vtVarO.g(i5);
                if (animator == null && (qd8Var = (qd8) vtVarO.get(animator)) != null) {
                    Transition transition2 = qd8Var.e;
                    View view8 = qd8Var.a;
                    if (view8 != null && windowId.equals(qd8Var.d)) {
                        ne8 ne8Var10 = qd8Var.c;
                        boolean z6 = z;
                        ne8 ne8VarQ = transition.q(view8, z6);
                        ne8 ne8VarM = transition.m(view8, z6);
                        if (ne8VarQ == null && ne8VarM == null) {
                            ne8VarM = (ne8) ((vt) transition.j0.Y).get(view8);
                        }
                        if ((ne8VarQ != null || ne8VarM != null) && transition2.s(ne8Var10, ne8VarM)) {
                            transition2.n().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                vtVarO.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            transition.k(viewGroup, transition.i0, transition.j0, transition.m0, transition.n0);
            transition.A();
            return true;
        }
        arrayList2 = new ArrayList();
        vtVarB.put(viewGroup, arrayList2);
        arrayList2.add(transition);
        transition.a(new ge8(this, vtVarB));
        i = 0;
        transition.g(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).z(viewGroup);
            }
        }
        transition.m0 = new ArrayList();
        transition.n0 = new ArrayList();
        yr6Var = transition.i0;
        yr6Var2 = transition.j0;
        vtVar = new vt((vt) yr6Var.Y);
        vtVar2 = new vt((vt) yr6Var2.Y);
        i2 = 0;
        while (true) {
            iArr = transition.l0;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view = (View) vtVar.g(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                vtVar3 = (vt) yr6Var.g0;
                vt vtVar5 = (vt) yr6Var2.g0;
                i8 = vtVar3.Z;
                while (i9 < i8) {
                    view2 = (View) vtVar3.j(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    qi4Var = (qi4) yr6Var.f0;
                    qi4 qi4Var3 = (qi4) yr6Var2.f0;
                    iH = qi4Var.h();
                    i11 = i;
                    while (i11 < iH) {
                        view6 = (View) qi4Var.i(i11);
                        if (view6 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) yr6Var.Z;
                SparseArray sparseArray3 = (SparseArray) yr6Var2.Z;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            z4 = z2;
            i = 0;
        }
        z = z4;
        while (i3 < vtVar.Z) {
            ne8Var2 = (ne8) vtVar.j(i3);
            if (transition.t(ne8Var2.b)) {
                transition.m0.add(ne8Var2);
                transition.n0.add(null);
            }
        }
        while (i4 < vtVar2.Z) {
            ne8Var = (ne8) vtVar2.j(i4);
            if (transition.t(ne8Var.b)) {
                transition.n0.add(ne8Var);
                transition.m0.add(null);
            }
        }
        vtVarO = Transition.o();
        int i13 = vtVarO.Z;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) vtVarO.g(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        transition.k(viewGroup, transition.i0, transition.j0, transition.m0, transition.n0);
        transition.A();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.Y;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ie8.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) ie8.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).z(viewGroup);
            }
        }
        this.X.h(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
