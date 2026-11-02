package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b32 {
    public final f97 a;
    public final String b;
    public final String c;
    public final List d;
    public final ArrayList e;
    public final List f;
    public final List g;
    public final boolean h;
    public final ch3 i;

    public b32(f97 f97Var, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, ch3 ch3Var) {
        str.getClass();
        list.getClass();
        this.a = f97Var;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arrayList;
        this.f = list2;
        this.g = list3;
        this.h = z;
        this.i = ch3Var;
        if (f97Var != f97.Z || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            kp5.h(oi0.o(sb, str, '\''));
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
        sb2.append(f97Var);
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list2.isEmpty();
        sb2.append(", kotlinParameterTypes.isEmpty(): ");
        sb2.append(zIsEmpty);
        sb2.append(",typeParameters.isEmpty(): ");
        sb2.append(zIsEmpty2);
        sb2.append(", javaParameterTypesIfFunction.isEmpty(): ");
        sb2.append(zIsEmpty3);
        sb2.append(".For member: '");
        sb2.append(str);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final boolean equals(Object obj) {
        List list;
        ww3 ww3VarG;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b32) {
            b32 b32Var = (b32) obj;
            List list2 = b32Var.d;
            List list3 = b32Var.f;
            String str = b32Var.b;
            ArrayList arrayList = b32Var.e;
            ch3 ch3Var = b32Var.i;
            ch3 ch3Var2 = this.i;
            boolean zEquals = ch3Var2.equals(ch3Var);
            String str2 = this.b;
            if (!zEquals) {
                kp5.h(pc6.p("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                return false;
            }
            f97 f97Var = b32Var.a;
            f97 f97Var2 = this.a;
            if (f97Var2 == f97Var && this.h == b32Var.h) {
                ArrayList arrayList2 = this.e;
                if (arrayList2.size() == arrayList.size()) {
                    if (ch3Var2.equals(z22.i) && f97Var2 == f97.X) {
                        if (dh3.f(this.c, b32Var.c)) {
                            List list4 = this.f;
                            if (list4.size() == list3.size()) {
                                if (list4.size() != arrayList2.size()) {
                                    StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                    sb.append(list4.size());
                                    sb.append(") and kotlinParameterTypes.size (");
                                    sb.append(arrayList2.size());
                                    sb.append(") must be equal for member '");
                                    kp5.h(oi0.o(sb, str2, '\''));
                                    return false;
                                }
                                int size = list4.size();
                                for (int i = 0; i < size; i++) {
                                    Type type = (Type) this.g.get(i);
                                    Class cls = (Class) list4.get(i);
                                    Type type2 = (Type) b32Var.g.get(i);
                                    Class cls2 = (Class) list3.get(i);
                                    TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                    boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                    TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                    boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                    if (z || z2) {
                                        if (cls.isPrimitive() == cls2.isPrimitive() && wl7.l(y72.a((pw3) arrayList2.get(i), str2), y72.a((pw3) arrayList.get(i), str))) {
                                        }
                                    } else if (dh3.f(cls, cls2)) {
                                    }
                                }
                                return true;
                            }
                        }
                    } else if (dh3.f(str2, str) && (ww3VarG = y72.g((list = this.d), list2)) != null) {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            rw3 rw3Var = (rw3) list.get(i2);
                            rw3 rw3Var2 = (rw3) list2.get(i2);
                            if (rw3Var.getUpperBounds().size() == rw3Var2.getUpperBounds().size()) {
                                List upperBounds = rw3Var.getUpperBounds();
                                ArrayList arrayList3 = new ArrayList(xv0.Z(upperBounds, 10));
                                Iterator it = upperBounds.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(ww3VarG.c((pw3) it.next(), str2));
                                }
                                ArrayList<qg5> arrayListE1 = wv0.e1(wv0.S0(arrayList3, new x72(str2, (byte) 0)), wv0.S0(rw3Var2.getUpperBounds(), new x72(str, (byte) 0)));
                                if (!arrayListE1.isEmpty()) {
                                    for (qg5 qg5Var : arrayListE1) {
                                        if (!wl7.l((pw3) qg5Var.X, (pw3) qg5Var.Y)) {
                                        }
                                    }
                                }
                            }
                        }
                        int size3 = arrayList2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            if (wl7.l(ww3VarG.c((pw3) arrayList2.get(i3), str2), (pw3) arrayList.get(i3))) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean zEquals = this.i.equals(z22.i);
        f97 f97Var = this.a;
        boolean z = zEquals && f97Var == f97.X;
        boolean z2 = this.h;
        ArrayList arrayList = this.e;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{f97Var, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.b});
            }
            b61.c();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.c;
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return Arrays.hashCode(new Object[]{f97Var, numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.a + ", name=" + this.b + ", jvmNameIfFunction=" + this.c + ", typeParameters=" + this.d + ", kotlinParameterTypes=" + this.e + ", javaParameterTypesIfFunction=" + this.f + ", javaGenericParameterTypesIfFunction=" + this.g + ", isStatic=" + this.h + ", equalityMode=" + this.i + ')';
    }
}
