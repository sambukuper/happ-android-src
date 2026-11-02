package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 implements s55 {
    public final b11 a;
    public final ArrayList b;

    public z8(b11 b11Var, ArrayList arrayList) {
        this.a = b11Var;
        this.b = arrayList;
    }

    @Override // defpackage.qj2
    public final rj2 a() {
        return this.a.a();
    }

    @Override // defpackage.qj2
    public final li5 b() {
        gb4 gb4VarR = i21.r();
        gb4VarR.add(this.a.b());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            gb4VarR.add(((qj2) it.next()).b());
        }
        return new li5(d02.X, i21.j(gb4VarR));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return this.a.equals(z8Var.a) && this.b.equals(z8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
