package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b38 {
    public static final char[] j = new char[0];
    public final m90 a;
    public int b;
    public ArrayList c;
    public boolean d;
    public int e;
    public char[] f;
    public int g;
    public String h;
    public char[] i;

    public b38(m90 m90Var) {
        this.a = m90Var;
    }

    public static void a(int i, int i2) {
        throw new IllegalStateException("TextBuffer overrun: size reached (" + (((long) i) + ((long) i2)) + ") exceeds maximum of 2147483647");
    }

    public final void b(int i, int i2, String str) {
        if (this.b >= 0) {
            h(i2);
        }
        this.h = null;
        this.i = null;
        char[] cArr = this.f;
        int length = cArr.length;
        int i3 = this.g;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.g += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            f();
            int iMin = Math.min(this.f.length, i2);
            int i6 = i + iMin;
            str.getChars(i, i6, this.f, 0);
            this.g += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public final void c(char[] cArr, int i, int i2) {
        if (this.b >= 0) {
            h(i2);
        }
        this.h = null;
        this.i = null;
        char[] cArr2 = this.f;
        int length = cArr2.length;
        int i3 = this.g;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.g += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            f();
            int iMin = Math.min(this.f.length, i2);
            System.arraycopy(cArr, i, this.f, 0, iMin);
            this.g += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final char[] d() {
        int length;
        int i;
        char[] charArray = this.i;
        if (charArray == null) {
            String str = this.h;
            if (str != null) {
                charArray = str.toCharArray();
            } else {
                int i2 = this.b;
                char[] cArr = j;
                if (i2 < 0) {
                    if (i2 >= 0) {
                        length = 0;
                    } else if (charArray != null) {
                        length = charArray.length;
                    } else {
                        length = str != null ? str.length() : this.e + this.g;
                    }
                    if (length < 1) {
                        if (length < 0) {
                            a(this.e, this.g);
                            throw null;
                        }
                        charArray = cArr;
                    } else {
                        charArray = new char[length];
                        ArrayList arrayList = this.c;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i3 = 0; i3 < size; i3++) {
                                char[] cArr2 = (char[]) this.c.get(i3);
                                int length2 = cArr2.length;
                                System.arraycopy(cArr2, 0, charArray, i, length2);
                                i += length2;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.f, 0, charArray, i, this.g);
                    }
                } else {
                    charArray = cArr;
                }
            }
            this.i = charArray;
        }
        return charArray;
    }

    public final String e() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        char[] cArr = this.i;
        if (cArr != null) {
            String str2 = new String(cArr);
            this.h = str2;
            return str2;
        }
        if (this.b >= 0) {
            this.h = _UrlKt.FRAGMENT_ENCODE_SET;
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i = this.e;
        int i2 = this.g;
        if (i == 0) {
            if (i2 == 0) {
                this.h = _UrlKt.FRAGMENT_ENCODE_SET;
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            String str3 = new String(this.f, 0, i2);
            this.h = str3;
            return str3;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            a(i, i2);
            throw null;
        }
        StringBuilder sb = new StringBuilder(i3);
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr2 = (char[]) this.c.get(i4);
                sb.append(cArr2, 0, cArr2.length);
            }
        }
        sb.append(this.f, 0, this.g);
        String string = sb.toString();
        this.h = string;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r1
  0x0026: PHI (r1v4 int) = (r1v2 int), (r1v3 int) binds: [B:8:0x0024, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void f() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        char[] cArr = this.f;
        this.d = true;
        arrayList.add(cArr);
        int length = this.e + cArr.length;
        this.e = length;
        if (length < 0) {
            a(length - cArr.length, cArr.length);
            throw null;
        }
        this.g = 0;
        int length2 = cArr.length;
        int i = length2 + (length2 >> 1);
        int i2 = 500;
        if (i < 500) {
            i = i2;
        } else {
            i2 = DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i > 65536) {
                i = i2;
            }
        }
        this.f = new char[i];
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v9 int) = (r1v7 int), (r1v8 int) binds: [B:8:0x0025, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public final char[] g() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        this.d = true;
        arrayList.add(this.f);
        int length = this.f.length;
        int i = this.e + length;
        this.e = i;
        if (i < 0) {
            a(i - length, length);
            throw null;
        }
        this.g = 0;
        int i2 = length + (length >> 1);
        int i3 = 500;
        if (i2 < 500) {
            i2 = i3;
        } else {
            i3 = DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i2 > 65536) {
                i2 = i3;
            }
        }
        char[] cArr = new char[i2];
        this.f = cArr;
        return cArr;
    }

    public final void h(int i) {
        char[] cArr;
        this.b = -1;
        char[] cArr2 = this.f;
        if (cArr2 == null || i > cArr2.length) {
            m90 m90Var = this.a;
            if (m90Var != null) {
                int i2 = m90.d[2];
                if (i < i2) {
                    i = i2;
                }
                cArr = (char[]) m90Var.b.getAndSet(2, null);
                if (cArr == null || cArr.length < i) {
                    cArr = new char[i];
                }
            } else {
                cArr = new char[Math.max(i, 500)];
            }
            this.f = cArr;
        }
        this.e = 0;
        this.g = 0;
    }

    public final String toString() {
        try {
            return e();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }
}
