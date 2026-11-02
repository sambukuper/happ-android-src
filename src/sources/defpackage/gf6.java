package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gf6 {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final HashSet d;
    public final zv7 e;
    public final aj0 f;
    public final HashMap g;

    public gf6(cj0 cj0Var, HashSet hashSet) {
        Size sizeF = hd8.f(cj0Var.s().h());
        aj0 aj0VarS = cj0Var.s();
        zv7 zv7Var = new zv7(aj0VarS, sizeF);
        this.g = new HashMap();
        this.a = sizeF;
        Rational rational = ((double) sizeF.getWidth()) / ((double) sizeF.getHeight()) > h ? ru.c : ru.a;
        sizeF.toString();
        Objects.toString(rational);
        hi5.z0("ResolutionsMerger");
        this.b = rational;
        Rational rational2 = ru.a;
        if (rational.equals(rational2)) {
            rational2 = ru.c;
        } else if (!rational.equals(ru.c)) {
            u52.j(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.c = rational2;
        this.f = aj0VarS;
        this.d = hashSet;
        this.e = zv7Var;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalH = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalH2 = h(size);
        if (rationalH.floatValue() == rationalH2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalH.floatValue() > rationalH2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalH.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalH.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean d(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final ts5 b(er8 er8Var, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair pairCreate;
        if (hd8.c(i)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size sizeF = hd8.f(rect);
            Iterator it = c(er8Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeF, sizeF);
                    break;
                }
                Size size3 = (Size) it.next();
                Size sizeF2 = hd8.f(a(size3, sizeF));
                if (!d(sizeF2, sizeF)) {
                    pairCreate = Pair.create(size3, sizeF2);
                    break;
                }
            }
            size = (Size) pairCreate.first;
            size2 = (Size) pairCreate.second;
        } else {
            Size sizeF3 = hd8.f(rect);
            List listC = c(er8Var);
            Iterator it2 = listC.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listC.iterator();
                    do {
                        if (!it3.hasNext()) {
                            size = sizeF3;
                            break;
                        }
                        size = (Size) it3.next();
                    } while (d(size, sizeF3));
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rationalH = ru.a;
                    if (!ru.a(rationalH, sizeF3)) {
                        rationalH = ru.c;
                        if (!ru.a(rationalH, sizeF3)) {
                            rationalH = h(sizeF3);
                        }
                    }
                    if (!e(rationalH, size4) && !d(size4, sizeF3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = a(sizeF3, size);
            size2 = size;
        }
        return z2 ? new ts5(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new ts5(rect, size2, size);
    }

    public final List c(er8 er8Var) {
        Rational rationalH;
        if (!this.d.contains(er8Var)) {
            u52.j(er8Var, "Invalid child config: ");
            return null;
        }
        HashMap map = this.g;
        if (map.containsKey(er8Var)) {
            List list = (List) map.get(er8Var);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList<Size> arrayListK = this.e.k(er8Var);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : arrayListK) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalH = null;
                    break;
                }
                rationalH = (Rational) it.next();
            } while (!ru.a(rationalH, size));
            if (rationalH != null) {
                Size size2 = (Size) map2.get(rationalH);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalH = h(size);
            }
            arrayList.add(size);
            map2.put(rationalH, size);
        }
        map.put(er8Var, arrayList);
        return arrayList;
    }

    public final boolean e(Rational rational, Size size) {
        Rational rational2 = this.b;
        if (rational2.equals(rational) || ru.a(rational, size)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalH = ru.a;
        if (!ru.a(rationalH, size)) {
            rationalH = ru.c;
            if (!ru.a(rationalH, size)) {
                rationalH = h(size);
            }
        }
        float fFloatValue3 = rationalH.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 < fFloatValue3;
        }
        return fFloatValue2 > fFloatValue3;
    }

    public final ArrayList f(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = ru.a;
        map.put(rational, new ArrayList());
        Rational rational2 = ru.c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (ru.a(rational3, size)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalH = h(size);
                    arrayList2.add(rationalH);
                    map.put(rationalH, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new x72(h(this.a), (byte) 2));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(ru.c) && !rational4.equals(ru.a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(g(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList g(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (ru.a(rational, size)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new rx0(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            List<Size> listC = c((er8) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listC) {
                    if (!e(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listC = arrayList3;
            }
            if (listC.isEmpty()) {
                return new ArrayList();
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listC.iterator();
                    while (it3.hasNext()) {
                        if (!d((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listC.iterator();
                    do {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                    } while (!d((Size) it4.next(), size4));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
