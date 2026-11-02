package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qt3 implements w15 {
    public static final List d;
    public final String[] a;
    public final Set b;
    public final ArrayList c;

    static {
        String strY0 = wv0.y0(i21.L('k', 'o', 't', 'l', 'i', 'n'), _UrlKt.FRAGMENT_ENCODE_SET, null, null, null, 62);
        List listL = i21.L(strY0.concat("/Any"), strY0.concat("/Nothing"), strY0.concat("/Unit"), strY0.concat("/Throwable"), strY0.concat("/Number"), strY0.concat("/Byte"), strY0.concat("/Double"), strY0.concat("/Float"), strY0.concat("/Int"), strY0.concat("/Long"), strY0.concat("/Short"), strY0.concat("/Boolean"), strY0.concat("/Char"), strY0.concat("/CharSequence"), strY0.concat("/String"), strY0.concat("/Comparable"), strY0.concat("/Enum"), strY0.concat("/Array"), strY0.concat("/ByteArray"), strY0.concat("/DoubleArray"), strY0.concat("/FloatArray"), strY0.concat("/IntArray"), strY0.concat("/LongArray"), strY0.concat("/ShortArray"), strY0.concat("/BooleanArray"), strY0.concat("/CharArray"), strY0.concat("/Cloneable"), strY0.concat("/Annotation"), strY0.concat("/collections/Iterable"), strY0.concat("/collections/MutableIterable"), strY0.concat("/collections/Collection"), strY0.concat("/collections/MutableCollection"), strY0.concat("/collections/List"), strY0.concat("/collections/MutableList"), strY0.concat("/collections/Set"), strY0.concat("/collections/MutableSet"), strY0.concat("/collections/Map"), strY0.concat("/collections/MutableMap"), strY0.concat("/collections/Map.Entry"), strY0.concat("/collections/MutableMap.MutableEntry"), strY0.concat("/collections/Iterator"), strY0.concat("/collections/MutableIterator"), strY0.concat("/collections/ListIterator"), strY0.concat("/collections/MutableListIterator"));
        d = listL;
        gu guVarD1 = wv0.d1(listL);
        int iG = aq4.G(xv0.Z(guVarD1, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        Iterator it = guVarD1.iterator();
        while (true) {
            rw1 rw1Var = (rw1) it;
            if (!rw1Var.Y.hasNext()) {
                return;
            }
            pb3 pb3Var = (pb3) rw1Var.next();
            linkedHashMap.put((String) pb3Var.b, Integer.valueOf(pb3Var.a));
        }
    }

    public qt3(ku3 ku3Var, String[] strArr) {
        strArr.getClass();
        List list = ku3Var.Z;
        Set setC1 = list.isEmpty() ? m02.X : wv0.c1(list);
        List<ju3> list2 = ku3Var.Y;
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (ju3 ju3Var : list2) {
            int i = ju3Var.Z;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(ju3Var);
            }
        }
        arrayList.trimToSize();
        this.a = strArr;
        this.b = setC1;
        this.c = arrayList;
    }

    @Override // defpackage.w15
    public final String a(int i) {
        return getString(i);
    }

    @Override // defpackage.w15
    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // defpackage.w15
    public final String getString(int i) {
        String strReplace;
        ju3 ju3Var = (ju3) this.c.get(i);
        int i2 = ju3Var.Y;
        if ((i2 & 4) == 4) {
            Object obj = ju3Var.g0;
            if (obj instanceof String) {
                strReplace = (String) obj;
            } else {
                jb0 jb0Var = (jb0) obj;
                String strR = jb0Var.r();
                if (jb0Var.h()) {
                    ju3Var.g0 = strR;
                }
                strReplace = strR;
            }
        } else if ((i2 & 2) == 2) {
            List list = d;
            int size = list.size();
            int i3 = ju3Var.f0;
            if (i3 < 0 || i3 >= size) {
                strReplace = this.a[i];
            } else {
                strReplace = (String) list.get(i3);
            }
        } else {
            strReplace = this.a[i];
        }
        if (ju3Var.i0.size() >= 2) {
            List list2 = ju3Var.i0;
            list2.getClass();
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strReplace.length()) {
                strReplace = strReplace.substring(num.intValue(), num2.intValue());
            }
        }
        if (ju3Var.k0.size() >= 2) {
            List list3 = ju3Var.k0;
            list3.getClass();
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            strReplace.getClass();
            strReplace = strReplace.replace((char) num3.intValue(), (char) num4.intValue());
            strReplace.getClass();
        }
        iu3 iu3Var = ju3Var.h0;
        if (iu3Var == null) {
            iu3Var = iu3.NONE;
        }
        int iOrdinal = iu3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                strReplace.getClass();
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                if (strReplace.length() >= 2) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            }
        }
        strReplace.getClass();
        return strReplace;
    }
}
