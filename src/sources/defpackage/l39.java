package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l39 {
    public final x39 a;
    public final String b;
    public final g62 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public final List g;
    public boolean h;
    public wl6 i;

    static {
        lh4.a1("WorkContinuationImpl");
    }

    public l39(x39 x39Var, String str, g62 g62Var, List list, List list2) {
        this.a = x39Var;
        this.b = str;
        this.c = g62Var;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(((l39) it.next()).f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (g62Var == g62.X && ((g49) list.get(i)).b.u != Long.MAX_VALUE) {
                bt.q("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((g49) list.get(i)).a.toString();
            string.getClass();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static boolean b(l39 l39Var, HashSet hashSet) {
        hashSet.addAll(l39Var.e);
        HashSet hashSetC = c(l39Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetC.contains((String) it.next())) {
                return true;
            }
        }
        List list = l39Var.g;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (b((l39) it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(l39Var.e);
        return false;
    }

    public static HashSet c(l39 l39Var) {
        HashSet hashSet = new HashSet();
        List list = l39Var.g;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((l39) it.next()).e);
            }
        }
        return hashSet;
    }

    public final wl6 a() {
        if (this.h) {
            lh4 lh4VarP0 = lh4.P0();
            TextUtils.join(", ", this.e);
            lh4VarP0.getClass();
        } else {
            x39 x39Var = this.a;
            this.i = os4.u((ra) x39Var.j0.j0, "EnqueueRunnable_" + this.c.name(), (h37) x39Var.l0.Y, new v38((Object) this, (byte) 11));
        }
        return this.i;
    }
}
