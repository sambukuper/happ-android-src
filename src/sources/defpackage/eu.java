package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class eu extends dh3 {
    public static Float A0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static byte[] B0(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static char C0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            em7.g("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        bt.q("Array has more than one element.");
        return (char) 0;
    }

    public static Object D0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            em7.g("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        bt.q("Array has more than one element.");
        return null;
    }

    public static Object E0(Object[] objArr) {
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static byte[] F0(byte[] bArr, kf3 kf3Var) {
        kf3Var.getClass();
        return kf3Var.isEmpty() ? new byte[0] : j0(kf3Var.X, kf3Var.Y + 1, bArr);
    }

    public static int[] G0(int[] iArr, kf3 kf3Var) {
        kf3Var.getClass();
        if (kf3Var.isEmpty()) {
            return new int[0];
        }
        int i = kf3Var.X;
        int i2 = kf3Var.Y + 1;
        dh3.n(i2, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i, i2);
        iArrCopyOfRange.getClass();
        return iArrCopyOfRange;
    }

    public static List H0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final void I0(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List J0(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return d02.X;
        }
        if (length == 1) {
            return i21.K(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List K0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return d02.X;
        }
        if (length == 1) {
            return i21.K(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static Set L0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return m02.X;
        }
        if (length == 1) {
            return w45.U(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(aq4.G(objArr.length));
        I0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList M0(Object[] objArr, List list) {
        objArr.getClass();
        list.getClass();
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(xv0.Z(list, 10), length));
        int i = 0;
        for (Object obj : list) {
            if (i >= length) {
                break;
            }
            arrayList.add(new qg5(objArr[i], obj));
            i++;
        }
        return arrayList;
    }

    public static ArrayList N0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new qg5(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static Iterable W(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? d02.X : new gu(objArr, (byte) 0);
    }

    public static List X(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static u27 Y(Object[] objArr) {
        return objArr.length == 0 ? l02.a : new hu(objArr, (byte) 0);
    }

    public static boolean Z(Object obj, Object[] objArr) {
        objArr.getClass();
        return v0(obj, objArr) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static boolean a0(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0014 A[RETURN] */
    public static boolean b0(long[] jArr, long j) {
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            if (j == jArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static boolean c0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!c0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof ck8) && (obj2 instanceof ck8)) {
                            if (!Arrays.equals(((ck8) obj).X, ((ck8) obj2).X)) {
                            }
                        } else if ((obj instanceof el8) && (obj2 instanceof el8)) {
                            if (!Arrays.equals(((el8) obj).X, ((el8) obj2).X)) {
                            }
                        } else if ((obj instanceof mk8) && (obj2 instanceof mk8)) {
                            if (!Arrays.equals(((mk8) obj).X, ((mk8) obj2).X)) {
                            }
                        } else if ((obj instanceof uk8) && (obj2 instanceof uk8)) {
                            if (!Arrays.equals(((uk8) obj).X, ((uk8) obj2).X)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void d0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void e0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void f0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void g0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void h0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        e0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void i0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        g0(objArr, objArr2, 0, i, i2);
    }

    public static byte[] j0(int i, int i2, byte[] bArr) {
        bArr.getClass();
        dh3.n(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] k0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        dh3.n(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static List l0(int i, Object[] objArr) {
        if (i < 0) {
            em7.c(ie2.h("Requested element count ", i, " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            em7.c(ie2.h("Requested element count ", length, " is less than zero."));
            return null;
        }
        if (length == 0) {
            return d02.X;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return K0(objArr);
        }
        if (length == 1) {
            return i21.K(objArr[length2 - 1]);
        }
        List listAsList = Arrays.asList(k0(objArr, length2 - length, length2));
        listAsList.getClass();
        return listAsList;
    }

    public static void m0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void o0(int[] iArr, int i) {
        int length = iArr.length;
        iArr.getClass();
        Arrays.fill(iArr, 0, length, i);
    }

    public static void p0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList q0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object r0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        em7.g("Array is empty.");
        return null;
    }

    public static int s0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer t0(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object u0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int v0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void w0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, gn2 gn2Var) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            z39.e(sb, obj, gn2Var);
        }
        sb.append(charSequence3);
    }

    public static String x0(Object[] objArr, String str, String str2, String str3, gn2 gn2Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
        String str6 = (i & 4) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str3;
        if ((i & 32) != 0) {
            gn2Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        w0(objArr, sb, str4, str5, str6, "...", gn2Var);
        return sb.toString();
    }

    public static Object y0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        em7.g("Array is empty.");
        return null;
    }

    public static int z0(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }
}
