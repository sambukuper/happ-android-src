package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w75 implements ki5 {
    public final List a;
    public final int b;
    public final boolean c;

    public w75(List list) {
        boolean z;
        this.a = list;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer numB = ((n75) it.next()).b();
            if (numB != null) {
                iIntValue = numB.intValue();
            }
            i2 += iIntValue;
        }
        this.b = i2;
        List list2 = this.a;
        if (list2.isEmpty()) {
            z = false;
            break;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((n75) it2.next()).b() == null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        this.c = z;
        List list3 = this.a;
        if (!list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer numB2 = ((n75) it3.next()).b();
                if ((numB2 != null ? numB2.intValue() : Integer.MAX_VALUE) <= 0) {
                    bt.q("Failed requirement.");
                    throw null;
                }
            }
        }
        List list4 = this.a;
        if (!list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                if (((n75) it4.next()).b() == null && (i = i + 1) < 0) {
                    i21.W();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((n75) obj).b() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((n75) it5.next()).b);
        }
        em7.h("At most one variable-length numeric field in a row is allowed, but got several: ", arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.");
        throw null;
    }

    @Override // defpackage.ki5
    public final Object a(h61 h61Var, String str, int i) {
        int i2 = this.b;
        if (i + i2 > str.length()) {
            return new fi5(i, new tb2(this, (byte) 26));
        }
        ca6 ca6Var = new ca6();
        while (ca6Var.X + i < str.length() && du7.d(str.charAt(ca6Var.X + i))) {
            ca6Var.X++;
        }
        if (ca6Var.X < i2) {
            return new fi5(i, new a23((Object) ca6Var, (Object) this, (byte) 10));
        }
        List list = this.a;
        int size = list.size();
        final int i3 = 0;
        while (i3 < size) {
            Integer numB = ((n75) list.get(i3)).b();
            int iIntValue = (numB != null ? numB.intValue() : (ca6Var.X - i2) + 1) + i;
            final o75 o75VarA = ((n75) list.get(i3)).a(str, i, iIntValue, h61Var);
            if (o75VarA != null) {
                final String string = str.subSequence(i, iIntValue).toString();
                return new fi5(i, new dn2() { // from class: v75
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        StringBuilder sbP = p61.p("Can not interpret the string '", string, "' as ");
                        sbP.append(((n75) this.a.get(i3)).b);
                        sbP.append(": ");
                        sbP.append(o75VarA.k0());
                        return sbP.toString();
                    }
                });
            }
            i3++;
            i = iIntValue;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        List<n75> list = this.a;
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        for (n75 n75Var : list) {
            Integer numB = n75Var.b();
            arrayList.add((numB == null ? "at least one digit" : numB + " digits") + " for " + n75Var.b);
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
