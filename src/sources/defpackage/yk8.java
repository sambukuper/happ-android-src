package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.MissingResourceException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yk8 {
    public static final f08 c = new f08((byte) 8);
    public static final yk8 d;
    public final int[] a;
    public final String b;

    static {
        try {
            d = new yk8();
        } catch (IOException e) {
            MissingResourceException missingResourceException = new MissingResourceException("Could not construct UPropertyAliases. Missing pnames.icu", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
            missingResourceException.initCause(e);
            throw missingResourceException;
        }
    }

    public yk8() throws IOException {
        ByteBuffer byteBufferE = b33.e(null, null, "pnames.icu", true);
        b33.h(byteBufferE, 1886282093, c);
        int i = byteBufferE.getInt() / 4;
        if (i < 8) {
            u52.s("pnames.icu: not enough indexes");
            throw null;
        }
        int[] iArr = new int[i];
        iArr[0] = i * 4;
        for (int i2 = 1; i2 < i; i2++) {
            iArr[i2] = byteBufferE.getInt();
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        this.a = b33.f((i4 - i3) / 4, byteBufferE);
        int i5 = iArr[2];
        byteBufferE.get(new byte[i5 - i4]);
        int i6 = iArr[3] - i5;
        StringBuilder sb = new StringBuilder(i6);
        for (int i7 = 0; i7 < i6; i7++) {
            sb.append((char) byteBufferE.get());
        }
        this.b = sb.toString();
    }
}
