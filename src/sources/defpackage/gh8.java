package defpackage;

import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gh8 implements Serializable {
    public static final String[] g0;
    public static final dh8[] h0;
    public static final gh8 i0;
    public final String[] X;
    public final dh8[] Y;
    public final String[] Z;
    public final int f0;

    static {
        String[] strArr = new String[0];
        g0 = strArr;
        dh8[] dh8VarArr = new dh8[0];
        h0 = dh8VarArr;
        i0 = new gh8(strArr, dh8VarArr, null);
    }

    public gh8(String[] strArr, dh8[] dh8VarArr, String[] strArr2) {
        strArr = strArr == null ? g0 : strArr;
        this.X = strArr;
        dh8VarArr = dh8VarArr == null ? h0 : dh8VarArr;
        this.Y = dh8VarArr;
        if (strArr.length == dh8VarArr.length) {
            this.Z = strArr2;
            this.f0 = Arrays.hashCode(dh8VarArr);
        } else {
            StringBuilder sb = new StringBuilder("Mismatching names (");
            sb.append(strArr.length);
            sb.append("), types (");
            bt.q(oi0.n(sb, dh8VarArr.length, ")"));
            throw null;
        }
    }

    public static gh8 a(dh8 dh8Var, Class cls) {
        TypeVariable[] typeParameters;
        if (cls == Collection.class) {
            typeParameters = fh8.b;
        } else if (cls == List.class) {
            typeParameters = fh8.d;
        } else if (cls == ArrayList.class) {
            typeParameters = fh8.e;
        } else if (cls == AbstractList.class) {
            typeParameters = fh8.a;
        } else if (cls == Iterable.class) {
            typeParameters = fh8.c;
        } else {
            TypeVariable[] typeVariableArr = fh8.a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 1) {
            return new gh8(new String[]{typeParameters[0].getName()}, new dh8[]{dh8Var}, null);
        }
        em7.b(length, cls.getName(), " with 1 type parameter: class expects ");
        return null;
    }

    public static gh8 b(Class cls, dh8 dh8Var, dh8 dh8Var2) {
        TypeVariable[] typeParameters;
        if (cls == Map.class) {
            typeParameters = fh8.f;
        } else if (cls == HashMap.class) {
            typeParameters = fh8.g;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = fh8.h;
        } else {
            TypeVariable[] typeVariableArr = fh8.a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 2) {
            return new gh8(new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, new dh8[]{dh8Var, dh8Var2}, null);
        }
        em7.b(length, cls.getName(), " with 2 type parameters: class expects ");
        return null;
    }

    public static gh8 c(Class cls, dh8[] dh8VarArr) {
        String[] strArr;
        int length = dh8VarArr.length;
        if (length == 1) {
            return a(dh8VarArr[0], cls);
        }
        if (length == 2) {
            return b(cls, dh8VarArr[0], dh8VarArr[1]);
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = g0;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == dh8VarArr.length) {
            return new gh8(strArr, dh8VarArr, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with ");
        sb.append(dh8VarArr.length);
        sb.append(" type parameter");
        sb.append(dh8VarArr.length == 1 ? _UrlKt.FRAGMENT_ENCODE_SET : "s");
        sb.append(": class expects ");
        sb.append(strArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public final dh8 d(int i) {
        if (i < 0) {
            return null;
        }
        dh8[] dh8VarArr = this.Y;
        if (i >= dh8VarArr.length) {
            return null;
        }
        dh8 dh8Var = dh8VarArr[i];
        return dh8Var == null ? uh8.u0 : dh8Var;
    }

    public final List e() {
        dh8[] dh8VarArr = this.Y;
        if (dh8VarArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        List listAsList = Arrays.asList(dh8VarArr);
        if (!listAsList.contains(null)) {
            return listAsList;
        }
        ArrayList arrayList = new ArrayList(listAsList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null) {
                arrayList.set(i, uh8.u0);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!it0.o(gh8.class, obj)) {
            return false;
        }
        gh8 gh8Var = (gh8) obj;
        return this.f0 == gh8Var.f0 && Arrays.equals(this.Y, gh8Var.Y);
    }

    public final boolean f() {
        return this.Y.length == 0;
    }

    public final int hashCode() {
        return this.f0;
    }

    public final String toString() {
        dh8[] dh8VarArr = this.Y;
        if (dh8VarArr.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder("<");
        int length = dh8VarArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            dh8 dh8Var = dh8VarArr[i];
            if (dh8Var == null) {
                sb.append("?");
            } else {
                StringBuilder sb2 = new StringBuilder(40);
                dh8Var.B0(sb2);
                sb.append(sb2.toString());
            }
        }
        sb.append('>');
        return sb.toString();
    }
}
