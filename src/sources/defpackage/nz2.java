package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nz2 implements Iterable, qv3 {
    public final String[] X;

    public nz2(String[] strArr) {
        this.X = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.X;
        int length = strArr.length - 2;
        int iB = z51.B(length, 0, -2);
        if (iB > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iB) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.X[i * 2];
    }

    public final ps c() {
        ps psVar = new ps((byte) 1);
        bw0.e0(psVar.b, this.X);
        return psVar;
    }

    public final String e(int i) {
        return this.X[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nz2) {
            return Arrays.equals(this.X, ((nz2) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.X);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        qg5[] qg5VarArr = new qg5[size];
        for (int i = 0; i < size; i++) {
            qg5VarArr[i] = new qg5(b(i), e(i));
        }
        return new w1(qg5VarArr);
    }

    public final int size() {
        return this.X.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strE = e(i);
            sb.append(strB);
            sb.append(": ");
            if (ks8.o(strB)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append("\n");
        }
        return sb.toString();
    }
}
