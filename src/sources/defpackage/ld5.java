package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ld5 implements s55 {
    public final String a;
    public final b11 b;
    public final ArrayList c;

    public ld5(String str, b11 b11Var) {
        this.a = str;
        this.b = b11Var;
        gb4 gb4VarR = i21.r();
        x97.e(gb4VarR, b11Var);
        gb4 gb4VarJ = i21.j(gb4VarR);
        ArrayList arrayList = new ArrayList(xv0.Z(gb4VarJ, 10));
        ListIterator listIterator = gb4VarJ.listIterator(0);
        while (true) {
            o03 o03Var = (o03) listIterator;
            if (!o03Var.hasNext()) {
                break;
            } else {
                arrayList.add(((z82) o03Var.next()).c());
            }
        }
        List<i1> listY0 = wv0.Y0(wv0.b1(arrayList));
        ArrayList arrayList2 = new ArrayList(xv0.Z(listY0, 10));
        for (i1 i1Var : listY0) {
            i1Var.getClass();
            Object objB = i1Var.b();
            if (objB == null) {
                em7.h("The field '", i1Var.c(), "' does not define a default value");
                throw null;
            }
            arrayList2.add(new kd5(i1Var.a(), objB));
        }
        this.c = arrayList2;
    }

    @Override // defpackage.qj2
    public final rj2 a() {
        rj2 rj2VarA = this.b.a();
        ArrayList<kd5> arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        for (kd5 kd5Var : arrayList) {
            arrayList2.add(new sx0(kd5Var.b, new d0(1, kd5Var.a, bx5.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 26)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        byte b = 1;
        ag8 ag8Var = ag8.a;
        ds5 q11Var = zIsEmpty ? ag8Var : arrayList2.size() == 1 ? (ds5) wv0.O0(arrayList2) : new q11(arrayList2);
        boolean z = q11Var instanceof ag8;
        String str = this.a;
        return z ? new c11(str) : new c11(i21.L(new qg5(new d0(1, q11Var, ds5.class, "test", "test(Ljava/lang/Object;)Z", 0, (byte) 27), new c11(str)), new qg5(new d0(1, ag8Var, ag8.class, "test", "test(Ljava/lang/Object;)Z", 0, (byte) 28), rj2VarA)), b);
    }

    @Override // defpackage.qj2
    public final li5 b() {
        li5 li5VarB = this.b.b();
        li5 li5VarB2 = new q21(this.a).b();
        boolean zIsEmpty = this.c.isEmpty();
        d02 d02Var = d02.X;
        return new li5(d02Var, i21.L(li5VarB, pu.l(i21.L(li5VarB2, new li5(zIsEmpty ? d02Var : i21.K(new ul8(new vj2(this, (byte) 21))), d02Var)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ld5)) {
            return false;
        }
        ld5 ld5Var = (ld5) obj;
        return this.a.equals(ld5Var.a) && this.b.equals(ld5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
