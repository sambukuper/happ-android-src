package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ql implements CharSequence {
    public final List X;
    public final String Y;
    public final ArrayList Z;
    public final ArrayList f0;

    static {
        xd6 xd6Var = gw6.a;
    }

    public ql(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.X = list;
        this.Y = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                pl plVar = (pl) list.get(i);
                Object obj = plVar.a;
                if (obj instanceof qe7) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(plVar);
                } else if (obj instanceof xg5) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(plVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.Z = arrayList;
        this.f0 = arrayList2;
        List listS0 = arrayList2 != null ? wv0.S0(arrayList2, new l71((byte) 8)) : null;
        if (listS0 == null || listS0.isEmpty()) {
            return;
        }
        int i2 = ((pl) wv0.r0(listS0)).c;
        uz4 uz4Var = ef3.a;
        uz4 uz4Var2 = new uz4(1);
        uz4Var2.a(i2);
        int size2 = listS0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            pl plVar2 = (pl) listS0.get(i3);
            while (true) {
                int i4 = uz4Var2.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    em7.g("IntList is empty.");
                    throw null;
                }
                int i5 = uz4Var2.a[i4 - 1];
                if (plVar2.b < i5) {
                    int i6 = plVar2.c;
                    if (i6 > i5) {
                        xc3.a("Paragraph overlap not allowed, end " + i6 + " should be less than or equal to " + i5);
                        break;
                    }
                    break;
                }
                uz4Var2.d(i4 - 1);
            }
            uz4Var2.a(plVar2.c);
        }
    }

    public final List a(int i) {
        List list = this.X;
        if (list == null) {
            return d02.X;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            pl plVar = (pl) obj;
            if ((plVar.a instanceof pa4) && rl.b(0, i, plVar.b, plVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ql b(gn2 gn2Var) {
        ol olVar = new ol(this);
        ArrayList arrayList = olVar.Z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pl plVar = (pl) gn2Var.B(((nl) arrayList.get(i)).a(Integer.MIN_VALUE));
            Object obj = plVar.a;
            arrayList.set(i, new nl(plVar.d, plVar.b, plVar.c, obj));
        }
        return olVar.e();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ql subSequence(int i, int i2) {
        if (!(i <= i2)) {
            xc3.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.Y;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        int i3 = rl.a;
        if (i > i2) {
            xc3.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.X;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                pl plVar = (pl) list.get(i4);
                int i5 = plVar.b;
                int i6 = plVar.c;
                if (rl.b(i, i2, i5, i6)) {
                    arrayList2.add(new pl(plVar.d, Math.max(i, plVar.b) - i, Math.min(i2, i6) - i, plVar.a));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new ql(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.Y.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj;
        return dh3.f(this.Y, qlVar.Y) && dh3.f(this.X, qlVar.X);
    }

    public final int hashCode() {
        int iHashCode = this.Y.hashCode() * 31;
        List list = this.X;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.Y.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.Y;
    }

    public /* synthetic */ ql(String str) {
        this(str, d02.X);
    }

    public ql(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
