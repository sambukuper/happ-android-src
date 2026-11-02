package defpackage;

import io.sentry.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l00 extends u95 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(gn2 gn2Var) {
        super(true);
        this.d = (byte) 3;
        this.e = gn2Var;
    }

    @Override // defpackage.u95
    public void a() {
        switch (this.d) {
            case 1:
                ml2 ml2Var = (ml2) this.e;
                if (ml2.K(3)) {
                    Objects.toString(ml2Var);
                }
                ml2Var.d();
                break;
        }
    }

    @Override // defpackage.u95
    public final void b() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((fz0) obj).c.invoke();
                return;
            case 1:
                ml2 ml2Var = (ml2) obj;
                if (ml2.K(3)) {
                    Objects.toString(ml2Var);
                }
                l00 l00Var = ml2Var.j;
                ArrayList arrayList = ml2Var.n;
                ml2Var.i = true;
                ml2Var.A(true);
                ml2Var.i = false;
                if (ml2Var.h == null) {
                    if (l00Var.b) {
                        ml2Var.S();
                        return;
                    } else {
                        ml2Var.g.c().a();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(ml2.G(ml2Var.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            c2.m();
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = ml2Var.h.a.iterator();
                while (it3.hasNext()) {
                    qk2 qk2Var = ((cm2) it3.next()).b;
                    if (qk2Var != null) {
                        qk2Var.o0 = false;
                    }
                }
                for (fg1 fg1Var : ml2Var.g(new ArrayList(Collections.singletonList(ml2Var.h)), 0, 1)) {
                    ArrayList arrayList2 = fg1Var.c;
                    fg1Var.k(arrayList2);
                    fg1Var.c(arrayList2);
                }
                Iterator it4 = ml2Var.h.a.iterator();
                while (it4.hasNext()) {
                    qk2 qk2Var2 = ((cm2) it4.next()).b;
                    if (qk2Var2 != null && qk2Var2.I0 == null) {
                        ml2Var.h(qk2Var2).k();
                    }
                }
                ml2Var.h = null;
                ml2Var.g0();
                if (ml2.K(3)) {
                    boolean z = l00Var.b;
                    ml2Var.toString();
                    return;
                }
                return;
            case 2:
                ((zx2) obj).a(3);
                return;
            default:
                ((gn2) obj).B(this);
                return;
        }
    }

    @Override // defpackage.u95
    public void c(j00 j00Var) {
        switch (this.d) {
            case 0:
                return;
            case 1:
                ml2 ml2Var = (ml2) this.e;
                if (ml2.K(2)) {
                    Objects.toString(ml2Var);
                }
                if (ml2Var.h != null) {
                    for (fg1 fg1Var : ml2Var.g(new ArrayList(Collections.singletonList(ml2Var.h)), 0, 1)) {
                        fg1Var.getClass();
                        ArrayList arrayList = fg1Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            bw0.d0(arrayList2, ((xe7) it.next()).k);
                        }
                        List listY0 = wv0.Y0(wv0.c1(arrayList2));
                        int size = listY0.size();
                        for (int i = 0; i < size; i++) {
                            ((we7) listY0.get(i)).c(j00Var, fg1Var.a);
                        }
                    }
                    Iterator it2 = ml2Var.n.iterator();
                    if (it2.hasNext()) {
                        throw p61.k(it2);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.u95
    public void d(j00 j00Var) {
        switch (this.d) {
            case 1:
                ml2 ml2Var = (ml2) this.e;
                if (ml2.K(3)) {
                    Objects.toString(ml2Var);
                }
                ml2Var.x();
                ml2Var.y(new ll2(ml2Var), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l00(Object obj, byte b) {
        super(false);
        this.d = b;
        this.e = obj;
    }

    private final void g() {
    }

    private final void h(j00 j00Var) {
    }

    private final void i(j00 j00Var) {
    }
}
