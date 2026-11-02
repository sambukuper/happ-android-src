package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kk7 extends f {
    public final g94 c;
    public final ml2 d;
    public final qi4 e;
    public final qi4 f;
    public final qi4 g;
    public vl2 h;
    public final vk1 i;
    public boolean j;
    public boolean k;
    public final List l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kk7(j2 j2Var, FragmentActivity fragmentActivity) {
        j2Var.getClass();
        ml2 ml2VarN = fragmentActivity.n();
        g94 g94Var = ((ComponentActivity) fragmentActivity).X;
        this.e = new qi4((Object) null);
        this.f = new qi4((Object) null);
        this.g = new qi4((Object) null);
        vk1 vk1Var = new vk1((byte) 11, false);
        vk1Var.Y = new CopyOnWriteArrayList();
        this.i = vk1Var;
        this.j = false;
        this.k = false;
        this.d = ml2VarN;
        this.c = g94Var;
        if (((f) this).a.a()) {
            bt.i("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        ((f) this).b = true;
        this.l = j2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            bt.i("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        return this.l.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(RecyclerView recyclerView) {
        mb6.n(this.h == null);
        vl2 vl2Var = new vl2(this);
        this.h = vl2Var;
        ViewPager2 viewPager2A = vl2.a(recyclerView);
        vl2Var.d = viewPager2A;
        i01 i01Var = new i01(vl2Var, (byte) 1);
        vl2Var.a = i01Var;
        ((ArrayList) viewPager2A.h0.b).add(i01Var);
        ul2 ul2Var = new ul2(vl2Var, (byte) 0);
        vl2Var.b = ul2Var;
        ((f) this).a.registerObserver(ul2Var);
        r86 r86Var = new r86(vl2Var, (byte) 4);
        vl2Var.c = r86Var;
        this.c.a(r86Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(l lVar, int i) {
        Bundle bundle;
        fm2 fm2Var = (fm2) lVar;
        long j = ((l) fm2Var).e;
        FrameLayout frameLayout = (FrameLayout) ((l) fm2Var).a;
        int id = frameLayout.getId();
        Long lO = o(id);
        qi4 qi4Var = this.g;
        if (lO != null && lO.longValue() != j) {
            q(lO.longValue());
            qi4Var.g(lO.longValue());
        }
        qi4Var.f(j, Integer.valueOf(id));
        long j2 = i;
        qi4 qi4Var2 = this.e;
        if (qi4Var2.c(j2) < 0) {
            ld6 ld6Var = (ld6) this.l.get(i);
            ld6Var.getClass();
            rk7 rk7Var = new rk7();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("story", ld6Var);
            rk7Var.Q(bundle2);
            pk2 pk2Var = (pk2) this.f.b(j2);
            if (((qk2) rk7Var).v0 != null) {
                bt.i("Fragment already added");
                return;
            }
            if (pk2Var == null || (bundle = pk2Var.X) == null) {
                bundle = null;
            }
            ((qk2) rk7Var).Y = bundle;
            qi4Var2.f(j2, rk7Var);
        }
        if (frameLayout.isAttachedToWindow()) {
            p(fm2Var);
        }
        n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(RecyclerView recyclerView) {
        vl2 vl2Var = this.h;
        vl2Var.getClass();
        ViewPager2 viewPager2A = vl2.a(recyclerView);
        ((ArrayList) viewPager2A.h0.b).remove(vl2Var.a);
        kk7 kk7Var = vl2Var.f;
        ((f) kk7Var).a.unregisterObserver(vl2Var.b);
        kk7Var.c.f(vl2Var.c);
        vl2Var.d = null;
        this.h = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(l lVar) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(l lVar) {
        p((fm2) lVar);
        n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(l lVar) {
        Long lO = o(((FrameLayout) ((l) ((fm2) lVar)).a).getId());
        if (lO != null) {
            q(lO.longValue());
            this.g.g(lO.longValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m(long j) {
        return j >= 0 && j < ((long) this.l.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        qi4 qi4Var;
        qi4 qi4Var2;
        qk2 qk2Var;
        View view;
        if (!this.k || this.d.P()) {
            return;
        }
        bu buVar = new bu(0);
        int i = 0;
        while (true) {
            qi4Var = this.e;
            int iH = qi4Var.h();
            qi4Var2 = this.g;
            if (i >= iH) {
                break;
            }
            long jE = qi4Var.e(i);
            if (!m(jE)) {
                buVar.add(Long.valueOf(jE));
                qi4Var2.g(jE);
            }
            i++;
        }
        if (!this.j) {
            this.k = false;
            for (int i2 = 0; i2 < qi4Var.h(); i2++) {
                long jE2 = qi4Var.e(i2);
                if (qi4Var2.c(jE2) < 0 && ((qk2Var = (qk2) qi4Var.b(jE2)) == null || (view = qk2Var.J0) == null || view.getParent() == null)) {
                    buVar.add(Long.valueOf(jE2));
                }
            }
        }
        qt qtVar = new qt(buVar);
        while (qtVar.hasNext()) {
            q(((Long) qtVar.next()).longValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long o(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            qi4 qi4Var = this.g;
            if (i2 >= qi4Var.h()) {
                return lValueOf;
            }
            if (((Integer) qi4Var.i(i2)).intValue() == i) {
                if (lValueOf != null) {
                    bt.i("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(qi4Var.e(i2));
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(fm2 fm2Var) {
        qk2 qk2Var = (qk2) this.e.b(((l) fm2Var).e);
        if (qk2Var == null) {
            bt.i("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ((l) fm2Var).a;
        View view = qk2Var.J0;
        if (!qk2Var.s() && view != null) {
            bt.i("Design assumption violated.");
            return;
        }
        boolean zS = qk2Var.s();
        ml2 ml2Var = this.d;
        if (zS && view == null) {
            mj0 mj0Var = new mj0(this, qk2Var, frameLayout);
            mj0 mj0Var2 = ml2Var.o;
            mj0Var2.getClass();
            ((CopyOnWriteArrayList) mj0Var2.Z).add(new cl2(mj0Var));
            return;
        }
        if (qk2Var.s() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                l(view, frameLayout);
                return;
            }
            return;
        }
        if (qk2Var.s()) {
            l(view, frameLayout);
            return;
        }
        if (ml2Var.P()) {
            if (ml2Var.J) {
                return;
            }
            this.c.a(new jf1(this, fm2Var));
            return;
        }
        mj0 mj0Var3 = new mj0(this, qk2Var, frameLayout);
        mj0 mj0Var4 = ml2Var.o;
        mj0Var4.getClass();
        ((CopyOnWriteArrayList) mj0Var4.Z).add(new cl2(mj0Var3));
        vk1 vk1Var = this.i;
        vk1Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) vk1Var.Y).iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        try {
            if (qk2Var.G0) {
                qk2Var.G0 = false;
            }
            r00 r00Var = new r00(ml2Var);
            r00Var.g(0, qk2Var, "f" + ((l) fm2Var).e, 1);
            r00Var.j(qk2Var, o84.f0);
            if (r00Var.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            r00Var.q.B(r00Var, false);
            this.h.b(false);
            vk1.B(arrayList);
        } catch (Throwable th) {
            vk1.B(arrayList);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(long j) {
        qk2 qk2Var;
        ViewParent parent;
        qi4 qi4Var = this.e;
        qk2 qk2Var2 = (qk2) qi4Var.b(j);
        if (qk2Var2 == null) {
            return;
        }
        View view = qk2Var2.J0;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zM = m(j);
        qi4 qi4Var2 = this.f;
        if (!zM) {
            qi4Var2.g(j);
        }
        if (!qk2Var2.s()) {
            qi4Var.g(j);
            return;
        }
        ml2 ml2Var = this.d;
        if (ml2Var.P()) {
            this.k = true;
            return;
        }
        boolean zS = qk2Var2.s();
        vk1 vk1Var = this.i;
        if (zS && m(j)) {
            vk1Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) vk1Var.Y).iterator();
            if (it.hasNext()) {
                throw p61.k(it);
            }
            wl2 wl2Var = (wl2) ((HashMap) ml2Var.c.Z).get(qk2Var2.g0);
            if (wl2Var == null || (qk2Var = wl2Var.c) != qk2Var2) {
                ml2Var.f0(new IllegalStateException(ie2.i("Fragment ", qk2Var2, " is not currently in the FragmentManager")));
                throw null;
            }
            pk2 pk2Var = qk2Var.X > -1 ? new pk2(wl2Var.o()) : null;
            vk1.B(arrayList);
            qi4Var2.f(j, pk2Var);
        }
        vk1Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) vk1Var.Y).iterator();
        if (it2.hasNext()) {
            throw p61.k(it2);
        }
        try {
            r00 r00Var = new r00(ml2Var);
            r00Var.i(qk2Var2);
            if (r00Var.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            r00Var.q.B(r00Var, false);
            qi4Var.g(j);
            vk1.B(arrayList2);
        } catch (Throwable th) {
            vk1.B(arrayList2);
            throw th;
        }
    }
}
