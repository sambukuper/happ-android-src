package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i97 implements s55 {
    public final c30 a;
    public final Set b;

    public i97(c30 c30Var) {
        this.a = c30Var;
        gb4 gb4VarR = i21.r();
        x97.e(gb4VarR, c30Var);
        gb4 gb4VarJ = i21.j(gb4VarR);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = gb4VarJ.listIterator(0);
        while (true) {
            o03 o03Var = (o03) listIterator;
            if (!o03Var.hasNext()) {
                break;
            }
            e95 e95VarD = ((z82) o03Var.next()).c().d();
            if (e95VarD != null) {
                arrayList.add(e95VarD);
            }
        }
        Set setC1 = wv0.c1(arrayList);
        this.b = setC1;
        if (setC1.isEmpty()) {
            bt.q("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // defpackage.qj2
    public final rj2 a() {
        return new j97(this.a.a.a(), new h97(this));
    }

    @Override // defpackage.qj2
    public final li5 b() {
        return pu.l(i21.L(new li5(i21.K(new c97(new b1(this, (byte) 20), "sign for " + this.b)), d02.X), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i97) {
            return this.a.equals(((i97) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
