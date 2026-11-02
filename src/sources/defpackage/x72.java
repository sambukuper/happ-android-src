package defpackage;

import android.util.Rational;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x72 implements Comparator {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ x72(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String name;
        String name2;
        byte b = this.X;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                String str = (String) obj3;
                lv3 lv3VarM = ((pw3) obj).M();
                if (lv3VarM == null) {
                    kp5.s(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (!(lv3VarM instanceof zu3)) {
                    if (lv3VarM instanceof rw3) {
                        name = ((rw3) lv3VarM).f0;
                    } else {
                        cls = lv3VarM.getClass();
                    }
                    kp5.q(yb6.a.b(cls), "Unknown upper bound classifier: ");
                    return 0;
                }
                name = zc1.M((zu3) lv3VarM).getName();
                lv3 lv3VarM2 = ((pw3) obj2).M();
                if (lv3VarM2 == null) {
                    kp5.s(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (lv3VarM2 instanceof zu3) {
                    name2 = zc1.M((zu3) lv3VarM2).getName();
                } else {
                    if (!(lv3VarM2 instanceof rw3)) {
                        cls = lv3VarM2.getClass();
                        kp5.q(yb6.a.b(cls), "Unknown upper bound classifier: ");
                        return 0;
                    }
                    name2 = ((rw3) lv3VarM2).f0;
                }
                return dh3.m(name, name2);
            case 1:
                t14 t14Var = (t14) obj;
                gn2 gn2Var = (gn2) obj3;
                t14Var.getClass();
                String string = gn2Var.B(t14Var).toString();
                t14 t14Var2 = (t14) obj2;
                t14Var2.getClass();
                return dh3.m(string, gn2Var.B(t14Var2).toString());
            case 2:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
            case 3:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                LayoutNode layoutNode = ((y07) obj).c;
                LayoutNode layoutNode2 = ((y07) obj2).c;
                return layoutNode.A() == layoutNode2.A() ? dh3.k(layoutNode.x(), layoutNode2.x()) : Float.compare(layoutNode.A(), layoutNode2.A());
            case 4:
                int iCompare2 = ((x72) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((y07) obj).f).compareTo(Integer.valueOf(((y07) obj2).f));
            default:
                ArrayList arrayList = ((cl7) obj3).i0;
                Iterator it = ((al7) obj).l.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(arrayList.indexOf((fl0) it.next()));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(arrayList.indexOf((fl0) it.next()));
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((al7) obj2).l.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(arrayList.indexOf((fl0) it2.next()));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(arrayList.indexOf((fl0) it2.next()));
                            if (numValueOf3.compareTo(numValueOf4) > 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return numValueOf.compareTo(numValueOf3);
                    }
                }
                bt.n();
                return 0;
        }
    }
}
