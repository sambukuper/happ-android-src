package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u16 {
    public static final byte[] e = {42};
    public static final List f = i21.K("*");
    public static final u16 g = new u16();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listE0 = fm7.E0(str, new char[]{'.'});
        return dh3.f(wv0.A0(listE0), _UrlKt.FRAGMENT_ENCODE_SET) ? wv0.p0(1, listE0) : listE0;
    }

    public final String a(String str) {
        String strJ;
        String strJ2;
        String strJ3;
        List listE0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listC = c(unicode);
        List listE1 = d02.X;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        lo5 lo5Var = lo5.a;
                        lo5.a.getClass();
                        lo5.i("Failed to read public suffix list", 5, e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            bt.i("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listC.get(i);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strJ = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                dh3.T("publicSuffixListBytes");
                throw null;
            }
            strJ = nr4.j(bArr2, bArr, i2);
            if (strJ != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strJ2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strJ2 = null;
                break;
            }
            bArr3[i3] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                dh3.T("publicSuffixListBytes");
                throw null;
            }
            strJ2 = nr4.j(bArr4, bArr3, i3);
            if (strJ2 != null) {
                break;
            }
            i3++;
        }
        if (strJ2 == null) {
            strJ3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strJ3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                dh3.T("publicSuffixExceptionListBytes");
                throw null;
            }
            strJ3 = nr4.j(bArr5, bArr, i5);
            if (strJ3 != null) {
                break;
            }
            i5++;
        }
        if (strJ3 != null) {
            listE0 = fm7.E0("!".concat(strJ3), new char[]{'.'});
        } else if (strJ == null && strJ2 == null) {
            listE0 = f;
        } else {
            List listE2 = strJ != null ? fm7.E0(strJ, new char[]{'.'}) : listE1;
            if (strJ2 != null) {
                listE1 = fm7.E0(strJ2, new char[]{'.'});
            }
            listE0 = listE2.size() > listE1.size() ? listE2 : listE1;
        }
        if (listC.size() == listE0.size() && ((String) listE0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listE0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listE0.size();
        } else {
            size = listC.size();
            size2 = listE0.size() + 1;
        }
        return w27.j0(w27.f0(new hu(c(str), (byte) 1), size - size2), ".", null, 62);
    }

    public final void b() {
        try {
            InputStream resourceAsStream = u16.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                j76 j76Var = new j76(new dv2(dh3.Q(resourceAsStream)));
                try {
                    byte[] bArrD0 = j76Var.D0(j76Var.readInt());
                    byte[] bArrD1 = j76Var.D0(j76Var.readInt());
                    j76Var.close();
                    synchronized (this) {
                        this.c = bArrD0;
                        this.d = bArrD1;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(j76Var, th);
                        throw th2;
                    }
                }
            }
            this.b.countDown();
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
