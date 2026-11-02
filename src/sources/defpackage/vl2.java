package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vl2 {
    public i01 a;
    public ul2 b;
    public r86 c;
    public ViewPager2 d;
    public long e = -1;
    public final /* synthetic */ kk7 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vl2(kk7 kk7Var) {
        this.f = kk7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewPager2 parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return parent;
        }
        u52.r(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(boolean z) {
        int currentItem;
        qk2 qk2Var;
        kk7 kk7Var = this.f;
        List list = kk7Var.l;
        vk1 vk1Var = kk7Var.i;
        qi4 qi4Var = kk7Var.e;
        ml2 ml2Var = kk7Var.d;
        if (ml2Var.P() || this.d.getScrollState() != 0 || qi4Var.d() || list.size() == 0 || (currentItem = this.d.getCurrentItem()) >= list.size()) {
            return;
        }
        long j = currentItem;
        if ((j != this.e || z) && (qk2Var = (qk2) qi4Var.b(j)) != null && qk2Var.s()) {
            this.e = j;
            ml2Var.getClass();
            r00 r00Var = new r00(ml2Var);
            ArrayList<List> arrayList = new ArrayList();
            qk2 qk2Var2 = null;
            for (int i = 0; i < qi4Var.h(); i++) {
                long jE = qi4Var.e(i);
                qk2 qk2Var3 = (qk2) qi4Var.i(i);
                if (qk2Var3.s()) {
                    if (jE != this.e) {
                        r00Var.j(qk2Var3, o84.f0);
                        vk1Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((CopyOnWriteArrayList) vk1Var.Y).iterator();
                        if (it.hasNext()) {
                            throw p61.k(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        qk2Var2 = qk2Var3;
                    }
                    boolean z2 = jE == this.e;
                    if (qk2Var3.G0 != z2) {
                        qk2Var3.G0 = z2;
                    }
                }
            }
            if (qk2Var2 != null) {
                r00Var.j(qk2Var2, o84.g0);
                vk1Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((CopyOnWriteArrayList) vk1Var.Y).iterator();
                if (it2.hasNext()) {
                    throw p61.k(it2);
                }
                arrayList.add(arrayList3);
            }
            if (r00Var.a.isEmpty()) {
                return;
            }
            if (r00Var.g) {
                bt.i("This transaction is already being added to the back stack");
                return;
            }
            r00Var.q.B(r00Var, false);
            Collections.reverse(arrayList);
            for (List list2 : arrayList) {
                vk1Var.getClass();
                vk1.B(list2);
            }
        }
    }
}
