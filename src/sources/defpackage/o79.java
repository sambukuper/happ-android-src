package defpackage;

import java.util.MissingResourceException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o79 {
    public static String[] a;
    public static final n97 b;
    public static final yc0 c;
    public static final yc0 d;

    static {
        n97 n97Var = new n97();
        n97Var.X = null;
        b = n97Var;
        c = new yc0((byte) 7);
        d = new yc0((byte) 6);
    }

    public static String a(String str) {
        String strReplace = str.replace('/', ':');
        String str2 = null;
        try {
            al8 al8VarV = al8.v("com/ibm/icu/impl/data/icudata", "keyTypeData", r33.f);
            try {
                al8VarV.c("typeMap").c("timezone").c(strReplace);
            } catch (MissingResourceException unused) {
                str = null;
            }
            if (str != null) {
                return str;
            }
            try {
                return al8VarV.c("typeAlias").c("timezone").getString(strReplace);
            } catch (MissingResourceException unused2) {
                str2 = str;
                return str2;
            }
        } catch (MissingResourceException unused3) {
        }
    }

    public static String b(int i, int i2, int i3, boolean z) {
        StringBuilder sb = new StringBuilder("GMT");
        if (i != 0 || i2 != 0) {
            if (z) {
                sb.append('-');
            } else {
                sb.append('+');
            }
            if (i < 10) {
                sb.append('0');
            }
            sb.append(i);
            sb.append(':');
            if (i2 < 10) {
                sb.append('0');
            }
            sb.append(i2);
            if (i3 != 0) {
                sb.append(':');
                if (i3 < 10) {
                    sb.append('0');
                }
                sb.append(i3);
            }
        }
        return sb.toString();
    }

    public static synchronized String[] c() {
        String[] strArr;
        if (a == null) {
            try {
                a = al8.v("com/ibm/icu/impl/data/icudata", "zoneinfo64", r33.f).getStringArray("Names");
            } catch (MissingResourceException unused) {
            }
        }
        strArr = a;
        if (strArr == null) {
            strArr = new String[0];
            a = strArr;
        }
        return strArr;
    }

    public static int d(String str) {
        String[] strArrC = c();
        if (strArrC.length <= 0) {
            return -1;
        }
        int length = strArrC.length;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (true) {
            int i3 = (i + length) / 2;
            if (i2 == i3) {
                return -1;
            }
            int iCompareTo = str.compareTo(strArrC[i3]);
            if (iCompareTo == 0) {
                return i3;
            }
            if (iCompareTo < 0) {
                length = i3;
            } else {
                i = i3;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    public static boolean e(String str, int[] iArr) {
        int i;
        int i2;
        int i3;
        if (str != null && str.length() > 3 && str.substring(0, 3).equalsIgnoreCase("GMT")) {
            int[] iArr2 = {3};
            if (str.charAt(3) != '-') {
                i = str.charAt(iArr2[0]) == '+' ? 1 : -1;
            }
            int i4 = iArr2[0] + 1;
            iArr2[0] = i4;
            int iD = ns8.d(str, iArr2);
            if (iArr2[0] == str.length()) {
                switch (iArr2[0] - i4) {
                    case 1:
                    case 2:
                        i2 = 0;
                        i3 = 0;
                        break;
                    case 3:
                    case 4:
                        i3 = iD % 100;
                        iD /= 100;
                        i2 = 0;
                        break;
                    case 5:
                    case 6:
                        i2 = iD % 100;
                        i3 = (iD / 100) % 100;
                        iD /= 10000;
                        break;
                }
                if (iD <= 23 && i3 <= 59 && i2 <= 59) {
                    if (iArr.length >= 1) {
                        iArr[0] = i;
                    }
                    if (iArr.length >= 2) {
                        iArr[1] = iD;
                    }
                    if (iArr.length >= 3) {
                        iArr[2] = i3;
                    }
                    if (iArr.length >= 4) {
                        iArr[3] = i2;
                    }
                    return true;
                }
            } else {
                int i5 = iArr2[0];
                int i6 = i5 - i4;
                if (i6 >= 1 && i6 <= 2 && str.charAt(i5) == ':') {
                    iArr2[0] = iArr2[0] + 1;
                    int length = str.length();
                    int i7 = iArr2[0];
                    if (length != i7) {
                        int iD2 = ns8.d(str, iArr2);
                        if (iArr2[0] - i7 == 2) {
                            int length2 = str.length();
                            int i8 = iArr2[0];
                            if (length2 <= i8) {
                                i2 = 0;
                                i3 = iD2;
                            } else if (str.charAt(i8) == ':') {
                                int i9 = iArr2[0] + 1;
                                iArr2[0] = i9;
                                int iD3 = ns8.d(str, iArr2);
                                if (iArr2[0] - i9 == 2 && str.length() <= iArr2[0]) {
                                    i3 = iD2;
                                    i2 = iD3;
                                }
                            }
                            if (iD <= 23) {
                                if (iArr.length >= 1) {
                                    iArr[0] = i;
                                }
                                if (iArr.length >= 2) {
                                    iArr[1] = iD;
                                }
                                if (iArr.length >= 3) {
                                    iArr[2] = i3;
                                }
                                if (iArr.length >= 4) {
                                    iArr[3] = i2;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
