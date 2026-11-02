package defpackage;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class wv0 extends bw0 {
    public static Object A0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        em7.g("List is empty.");
        return null;
    }

    public static Object B0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable C0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList D0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && dh3.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List E0(Iterable iterable, Iterable iterable2) {
        iterable2.getClass();
        Collection collectionF0 = bw0.f0(iterable2);
        if (collectionF0.isEmpty()) {
            return Y0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionF0.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList F0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return H0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        bw0.d0(arrayList, iterable);
        bw0.d0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList G0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return I0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        bw0.d0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList H0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            bw0.d0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList I0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object J0(Collection collection) {
        l66 l66Var = m66.X;
        collection.getClass();
        if (collection.isEmpty()) {
            em7.g("Collection is empty.");
            return null;
        }
        Collection collection2 = collection;
        int iG = m66.Y.g(collection.size());
        boolean z = collection2 instanceof List;
        if (z) {
            return ((List) collection2).get(iG);
        }
        qb qbVar = new qb((byte) 2, iG);
        if (z) {
            List list = (List) collection2;
            if (iG >= 0 && iG < list.size()) {
                return list.get(iG);
            }
            qbVar.B(Integer.valueOf(iG));
            throw null;
        }
        if (iG < 0) {
            qbVar.B(Integer.valueOf(iG));
            throw null;
        }
        int i = 0;
        for (Object obj : collection2) {
            int i2 = i + 1;
            if (iG == i) {
                return obj;
            }
            i = i2;
        }
        qbVar.B(Integer.valueOf(iG));
        throw null;
    }

    public static final int K0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbL = ie2.l("Element index ", i, " must be in range [");
        sbL.append(new kf3(0, list.size() - 1, 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public static final int L0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbL = ie2.l("Position index ", i, " must be in range [");
        sbL.append(new kf3(0, list.size(), 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public static List M0(List list) {
        if (list.size() <= 1) {
            return Y0(list);
        }
        List listA1 = a1(list);
        Collections.reverse(listA1);
        return listA1;
    }

    public static Object N0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return O0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            em7.g("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        bt.q("Collection has more than one element.");
        return null;
    }

    public static Object O0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            em7.g("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        bt.q("List has more than one element.");
        return null;
    }

    public static Object P0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object Q0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List R0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listA1 = a1(iterable);
            aw0.b0(listA1);
            return listA1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Y0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return eu.X(array);
    }

    public static List S0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List listA1 = a1(iterable);
            aw0.c0(listA1, comparator);
            return listA1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Y0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static LinkedHashSet T0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionF0 = bw0.f0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!collectionF0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static List U0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return d02.X;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return Y0(iterable);
            }
            if (i == 1) {
                return i21.K(q0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return i21.P(arrayList);
    }

    public static List V0(int i, List list) {
        list.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return d02.X;
        }
        int size = list.size();
        if (i >= size) {
            return Y0(list);
        }
        if (i == 1) {
            return i21.K(A0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void W0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] X0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List Y0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return i21.P(a1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d02.X;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return i21.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList Z0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List a1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        W0(iterable, arrayList);
        return arrayList;
    }

    public static Set b1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        W0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set c1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return w45.U(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(aq4.G(collection.size()));
                W0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            W0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : w45.U(linkedHashSet2.iterator().next());
            }
        }
        return m02.X;
    }

    public static gu d1(Iterable iterable) {
        iterable.getClass();
        return new gu(new o7((Object) iterable, (byte) 19), (byte) 1);
    }

    public static ArrayList e1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(xv0.Z(iterable, 10), xv0.Z(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new qg5(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static hu l0(Iterable iterable) {
        iterable.getClass();
        return new hu(iterable, (byte) 1);
    }

    public static boolean m0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    i21.X();
                    throw null;
                }
                if (dh3.f(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List n0(Iterable iterable) {
        iterable.getClass();
        return Y0(b1(iterable));
    }

    public static List o0(Iterable iterable, int i) {
        ArrayList arrayList;
        iterable.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return Y0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return d02.X;
            }
            if (size == 1) {
                return i21.K(z0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return i21.P(arrayList);
    }

    public static List p0(int i, List list) {
        list.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested element count ", i, " is less than zero."));
            return null;
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return U0(list, size);
    }

    public static Object q0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return r0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        em7.g("Collection is empty.");
        return null;
    }

    public static Object r0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        em7.g("List is empty.");
        return null;
    }

    public static Object s0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object t0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object u0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static LinkedHashSet v0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionF0 = bw0.f0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionF0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void w0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, gn2 gn2Var) throws IOException {
        iterable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                z39.e(appendable, obj, gn2Var);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void x0(Iterable iterable, Appendable appendable, String str, String str2, String str3, gn2 gn2Var, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
        String str6 = (i & 8) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str3;
        if ((i & 64) != 0) {
            gn2Var = null;
        }
        w0(iterable, appendable, str4, str5, str6, -1, "...", gn2Var);
    }

    public static String y0(Iterable iterable, CharSequence charSequence, String str, String str2, gn2 gn2Var, int i) throws IOException {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        String str4 = (i & 4) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
        int i2 = (i & 8) != 0 ? -1 : 5;
        if ((i & 32) != 0) {
            gn2Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        w0(iterable, sb, charSequence2, str3, str4, i2, "...", gn2Var);
        return sb.toString();
    }

    public static Object z0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return A0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            em7.g("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
