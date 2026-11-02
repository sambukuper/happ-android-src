package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eh8 {
    public final Class a;
    public final dh8[] b;
    public final int c;

    public eh8(Class cls, dh8[] dh8VarArr, int i) {
        this.a = cls;
        this.b = dh8VarArr;
        this.c = (cls.hashCode() * 31) + i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == eh8.class) {
            eh8 eh8Var = (eh8) obj;
            if (this.c == eh8Var.c && this.a == eh8Var.a) {
                dh8[] dh8VarArr = eh8Var.b;
                dh8[] dh8VarArr2 = this.b;
                int length = dh8VarArr2.length;
                if (length == dh8VarArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (Objects.equals(dh8VarArr2[i], dh8VarArr[i])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return this.a.getName().concat("<>");
    }
}
