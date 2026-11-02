package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class br1 {
    public static final br1 b = new br1(d02.X);
    public final List a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public br1(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final qg5 a(br1 br1Var) {
        br1Var.getClass();
        List list = this.a;
        int size = list.size();
        List list2 = br1Var.a;
        int size2 = list2.size();
        br1 br1Var2 = b;
        if (size < size2) {
            return new qg5(br1Var2, Boolean.FALSE);
        }
        int size3 = list.size() - list2.size();
        List listSubList = list.subList(size3, list.size());
        int size4 = listSubList.size();
        for (int i = 0; i < size4; i++) {
            ss8 ss8Var = ss8.a;
            byte[] bArr = (byte[]) listSubList.get(i);
            byte[] bArr2 = (byte[]) list2.get(i);
            bArr.getClass();
            bArr2.getClass();
            if (bArr.length == bArr2.length) {
                int length = bArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = bArr[i2] & 255;
                    if (65 <= i3 && i3 < 91) {
                        i3 += 32;
                    }
                    int i4 = bArr2[i2] & 255;
                    if (65 <= i4 && i4 < 91) {
                        i4 += 32;
                    }
                    if (i3 == i4) {
                    }
                }
            }
            return new qg5(br1Var2, Boolean.FALSE);
        }
        return new qg5(new br1(list.subList(0, size3)), Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br1)) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        List list2 = ((br1) obj).a;
        if (size != list2.size()) {
            return false;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Iterator it = this.a.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + Arrays.hashCode((byte[]) it.next());
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (this.a.isEmpty()) {
            return ".";
        }
        return wv0.y0(this.a, ".", (String) null, (String) null, new h80((byte) 16), 30);
    }
}
