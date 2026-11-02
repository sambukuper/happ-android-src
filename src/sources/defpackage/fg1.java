package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fg1 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public fg1(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final fg1 i(ViewGroup viewGroup, ml2 ml2Var) {
        viewGroup.getClass();
        ml2Var.getClass();
        ml2Var.J().getClass();
        Object tag = viewGroup.getTag(t36.special_effects_controller_view_tag);
        if (tag instanceof fg1) {
            return (fg1) tag;
        }
        fg1 fg1Var = new fg1(viewGroup);
        viewGroup.setTag(t36.special_effects_controller_view_tag, fg1Var);
        return fg1Var;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z;
        we7 we7Var;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                xe7 xe7Var = (xe7) it.next();
                if (!xe7Var.k.isEmpty()) {
                    ArrayList arrayList2 = xe7Var.k;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                            we7Var = (we7) it2.next();
                            we7Var.getClass();
                        } while (we7Var instanceof dg1);
                    } else {
                        break;
                    }
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                bw0.d0(arrayList3, ((xe7) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(xe7 xe7Var) {
        xe7Var.getClass();
        if (xe7Var.i) {
            xe7Var.a.a(xe7Var.c.O(), this.a);
            xe7Var.i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        ze7 ze7Var;
        we5 we5Var;
        Object obj;
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ze7Var = ze7.Z;
            we5Var = ze7.X;
            obj = null;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            xe7 xe7Var = (xe7) next;
            View view = xe7Var.c.J0;
            view.getClass();
            we5Var.getClass();
            if (we5.d(view) == ze7Var && xe7Var.a != ze7Var) {
                break;
            }
        }
        xe7 xe7Var2 = (xe7) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            xe7 xe7Var3 = (xe7) objPrevious;
            View view2 = xe7Var3.c.J0;
            view2.getClass();
            we5Var.getClass();
            if (we5.d(view2) != ze7Var && xe7Var3.a == ze7Var) {
                obj = objPrevious;
                break;
            }
        }
        xe7 xe7Var4 = (xe7) obj;
        if (ml2.K(2)) {
            Objects.toString(xe7Var2);
            Objects.toString(xe7Var4);
        }
        ArrayList<bg1> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        qk2 qk2Var = ((xe7) wv0.A0(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nk2 nk2Var = ((xe7) it2.next()).c.M0;
            nk2 nk2Var2 = qk2Var.M0;
            nk2Var.b = nk2Var2.b;
            nk2Var.c = nk2Var2.c;
            nk2Var.d = nk2Var2.d;
            nk2Var.e = nk2Var2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            byte b = 0;
            if (!it3.hasNext()) {
                break;
            }
            xe7 xe7Var5 = (xe7) it3.next();
            arrayList2.add(new bg1(xe7Var5, z));
            arrayList3.add(new eg1(xe7Var5));
            xe7Var5.d.add(new yf1(this, xe7Var5, b));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((eg1) obj2).w0()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((eg1) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((eg1) it5.next()).getClass();
        }
        ArrayList<bg1> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            bw0.d0(arrayList7, ((xe7) ((bg1) it6.next()).X).k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        boolean z2 = false;
        for (bg1 bg1Var : arrayList2) {
            Context context = this.a.getContext();
            xe7 xe7Var6 = (xe7) bg1Var.X;
            context.getClass();
            mj0 mj0VarF0 = bg1Var.F0(context);
            if (mj0VarF0 != null) {
                if (((AnimatorSet) mj0VarF0.Z) == null) {
                    arrayList6.add(bg1Var);
                } else {
                    qk2 qk2Var2 = xe7Var6.c;
                    if (xe7Var6.k.isEmpty()) {
                        if (xe7Var6.a == ze7.f0) {
                            xe7Var6.i = false;
                        }
                        xe7Var6.j.add(new dg1(bg1Var));
                        z2 = true;
                    } else if (ml2.K(2)) {
                        Objects.toString(qk2Var2);
                    }
                }
            }
        }
        for (bg1 bg1Var2 : arrayList6) {
            xe7 xe7Var7 = (xe7) bg1Var2.X;
            qk2 qk2Var3 = xe7Var7.c;
            if (zIsEmpty) {
                if (!z2) {
                    xe7Var7.j.add(new ag1(bg1Var2));
                } else if (ml2.K(2)) {
                    Objects.toString(qk2Var3);
                }
            } else if (ml2.K(2)) {
                Objects.toString(qk2Var3);
            }
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bw0.d0(arrayList2, ((xe7) it.next()).k);
        }
        List listY0 = wv0.Y0(wv0.c1(arrayList2));
        int size = listY0.size();
        for (int i = 0; i < size; i++) {
            ((we7) listY0.get(i)).b(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((xe7) arrayList.get(i2));
        }
        List listY1 = wv0.Y0(arrayList);
        int size3 = listY1.size();
        for (int i3 = 0; i3 < size3; i3++) {
            xe7 xe7Var = (xe7) listY1.get(i3);
            if (xe7Var.k.isEmpty()) {
                xe7Var.b();
            }
        }
    }

    public final void d(ze7 ze7Var, ye7 ye7Var, wl2 wl2Var) {
        synchronized (this.b) {
            try {
                xe7 xe7VarF = f(wl2Var.c);
                if (xe7VarF == null) {
                    qk2 qk2Var = wl2Var.c;
                    xe7VarF = (qk2Var.o0 || qk2Var.n0) ? g(qk2Var) : null;
                }
                if (xe7VarF != null) {
                    xe7VarF.d(ze7Var, ye7Var);
                    return;
                }
                xe7 xe7Var = new xe7(ze7Var, ye7Var, wl2Var);
                this.b.add(xe7Var);
                xe7Var.d.add(new yf1(this, xe7Var, (byte) 1));
                xe7Var.d.add(new yf1(this, xe7Var, (byte) 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            h();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<xe7> arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    xe7 xe7Var = (xe7) it.next();
                    if (this.b.isEmpty() || !xe7Var.c.o0) {
                        z = false;
                    }
                    xe7Var.g = z;
                }
                for (xe7 xe7Var2 : arrayList) {
                    if (this.d) {
                        if (ml2.K(2)) {
                            Objects.toString(xe7Var2);
                        }
                        xe7Var2.b();
                    } else {
                        if (ml2.K(2)) {
                            Objects.toString(xe7Var2);
                        }
                        xe7Var2.a(this.a);
                    }
                    this.d = false;
                    if (!xe7Var2.f) {
                        this.c.add(xe7Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    l();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    b(arrayList2, this.e);
                    boolean zJ = j(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        if (!((xe7) it2.next()).c.o0) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zJ) {
                        z = false;
                    }
                    this.d = z;
                    if (!z2) {
                        k(arrayList2);
                        c(arrayList2);
                    } else if (zJ) {
                        k(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            a((xe7) arrayList2.get(i));
                        }
                    }
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final xe7 f(qk2 qk2Var) {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            xe7 xe7Var = (xe7) next;
            if (xe7Var.c.equals(qk2Var) && !xe7Var.e) {
                return (xe7) next;
            }
        }
        next = null;
        return (xe7) next;
    }

    public final xe7 g(qk2 qk2Var) {
        Object next;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            xe7 xe7Var = (xe7) next;
            if (xe7Var.c.equals(qk2Var) && !xe7Var.e) {
                return (xe7) next;
            }
        }
        next = null;
        return (xe7) next;
    }

    public final void h() {
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                k(this.b);
                ArrayList<xe7> arrayList = new ArrayList(this.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((xe7) it.next()).g = false;
                }
                for (xe7 xe7Var : arrayList) {
                    if (ml2.K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(xe7Var);
                    }
                    xe7Var.a(this.a);
                }
                ArrayList<xe7> arrayList2 = new ArrayList(this.b);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((xe7) it2.next()).g = false;
                }
                for (xe7 xe7Var2 : arrayList2) {
                    if (ml2.K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(xe7Var2);
                    }
                    xe7Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xe7 xe7Var = (xe7) arrayList.get(i);
            wl2 wl2Var = xe7Var.l;
            qk2 qk2Var = wl2Var.c;
            if (!xe7Var.h) {
                xe7Var.h = true;
                ye7 ye7Var = xe7Var.b;
                if (ye7Var == ye7.Y) {
                    View viewFindFocus = qk2Var.J0.findFocus();
                    if (viewFindFocus != null) {
                        qk2Var.g().k = viewFindFocus;
                        if (ml2.K(2)) {
                            viewFindFocus.toString();
                            qk2Var.toString();
                        }
                    }
                    View viewO = xe7Var.c.O();
                    if (viewO.getParent() == null) {
                        if (ml2.K(2)) {
                            qk2Var.toString();
                            viewO.toString();
                        }
                        wl2Var.b();
                        viewO.setAlpha(0.0f);
                    }
                    if (viewO.getAlpha() == 0.0f && viewO.getVisibility() == 0) {
                        if (ml2.K(2)) {
                            viewO.toString();
                        }
                        viewO.setVisibility(4);
                    }
                    nk2 nk2Var = qk2Var.M0;
                    viewO.setAlpha(nk2Var == null ? 1.0f : nk2Var.j);
                    ml2.K(2);
                } else if (ye7Var == ye7.Z) {
                    View viewO2 = qk2Var.O();
                    if (ml2.K(2)) {
                        Objects.toString(viewO2.findFocus());
                        viewO2.toString();
                        qk2Var.toString();
                    }
                    viewO2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bw0.d0(arrayList2, ((xe7) it.next()).k);
        }
        List listY0 = wv0.Y0(wv0.c1(arrayList2));
        int size2 = listY0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            we7 we7Var = (we7) listY0.get(i2);
            we7Var.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!we7Var.a) {
                we7Var.d(viewGroup);
            }
            we7Var.a = true;
        }
    }

    public final void l() {
        for (xe7 xe7Var : this.b) {
            if (xe7Var.b == ye7.Y) {
                int visibility = xe7Var.c.O().getVisibility();
                ze7.X.getClass();
                xe7Var.d(we5.l(visibility), ye7.X);
            }
        }
    }
}
