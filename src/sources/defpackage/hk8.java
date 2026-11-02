package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.MissingResourceException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hk8 {
    public static final hk8 b;
    public final ef8 a;

    static {
        try {
            b = new hk8();
        } catch (IOException e) {
            throw new MissingResourceException(e.getMessage(), _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
        }
    }

    public hk8() throws IOException {
        char c;
        byte b2 = 1;
        ByteBuffer byteBufferE = b33.e(null, null, "uprops.icu", true);
        int iH = b33.h(byteBufferE, 1431335535, new s18((byte) 7));
        bv8.a(iH >>> 24, (iH >> 16) & 255, (iH >> 8) & 255, iH & 255);
        int i = byteBufferE.getInt();
        byteBufferE.getInt();
        byteBufferE.getInt();
        int i2 = byteBufferE.getInt();
        int i3 = byteBufferE.getInt();
        int i4 = byteBufferE.getInt();
        int i5 = byteBufferE.getInt();
        int i6 = byteBufferE.getInt();
        int i7 = byteBufferE.getInt();
        byteBufferE.getInt();
        byteBufferE.getInt();
        byteBufferE.getInt();
        byteBufferE.getInt();
        b33.i(12, byteBufferE);
        ef8 ef8VarF = ef8.f(byteBufferE);
        this.a = ef8VarF;
        int i8 = (i - 16) * 4;
        int i9 = ef8VarF.X.b + ef8VarF.h0;
        byte b3 = 2;
        int i10 = (i9 * 2) + 16;
        if (i10 > i8) {
            u52.s("uprops.icu: not enough bytes for main trie");
            throw null;
        }
        b33.i(i8 - i10, byteBufferE);
        b33.i((i2 - i) * 4, byteBufferE);
        if (i4 > 0) {
            ef8 ef8VarF2 = ef8.f(byteBufferE);
            int i11 = (i3 - i2) * 4;
            int i12 = ((ef8VarF2.X.b + ef8VarF2.h0) * 2) + 16;
            if (i12 > i11) {
                u52.s("uprops.icu: not enough bytes for additional-properties trie");
                throw null;
            }
            b33.i(i11 - i12, byteBufferE);
            b33.f(i5 - i3, byteBufferE);
        }
        int i13 = (i6 - i5) * 2;
        if (i13 > 0) {
            b33.d(i13, byteBufferE);
        }
        int i14 = (i7 - i6) * 4;
        int iPosition = byteBufferE.position();
        ByteOrder byteOrderOrder = byteBufferE.order();
        try {
            if (byteBufferE.remaining() < 16) {
                throw new a43("Buffer too short for a CodePointTrie header");
            }
            int i15 = byteBufferE.getInt();
            if (i15 == 862548564) {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferE.order(byteOrderOrder == byteOrder ? ByteOrder.LITTLE_ENDIAN : byteOrder);
            } else if (i15 != 1416784179) {
                throw new a43("Buffer does not contain a serialized CodePointTrie");
            }
            char c2 = byteBufferE.getChar();
            char c3 = byteBufferE.getChar();
            char c4 = byteBufferE.getChar();
            char c5 = byteBufferE.getChar();
            char c6 = byteBufferE.getChar();
            char c7 = byteBufferE.getChar();
            char c8 = 3;
            int i16 = (c2 >> 6) & 3;
            if (i16 == 0) {
                c = 1;
            } else {
                if (i16 != 1) {
                    throw new a43("CodePointTrie data header has an unsupported type");
                }
                c = 2;
            }
            int i17 = c2 & 7;
            if (i17 == 0) {
                c8 = 1;
            } else if (i17 == 1) {
                c8 = 2;
            } else if (i17 != 2) {
                throw new a43("CodePointTrie data header has an unsupported value width");
            }
            if ((c2 & '8') != 0) {
                throw new a43("CodePointTrie data header has unsupported options");
            }
            if (1 != c8) {
                throw new a43("CodePointTrie data header has a different type or value width than required");
            }
            int i18 = c4 | ((61440 & c2) << 4);
            int i19 = c6 | ((c2 & 3840) << 8);
            int i20 = c7 << '\t';
            if (byteBufferE.remaining() < (i18 * 2) + (c3 * 2)) {
                throw new a43("Buffer too short for the CodePointTrie data");
            }
            char[] cArrD = b33.d(c3, byteBufferE);
            int iB = p61.B(1);
            if (iB == 0) {
                char[] cArrD2 = b33.d(i18, byteBufferE);
                byte b4 = 0;
                if (c == 1) {
                    new dv0(cArrD, new cv0(cArrD2, b4), i20, c5, i19, (byte) 0);
                } else {
                    new fv0(cArrD, new cv0(cArrD2, b4), i20, c5, i19, (byte) 1);
                }
            } else if (iB == 1) {
                int[] iArrF = b33.f(i18, byteBufferE);
                if (c == 1) {
                    new dv0(cArrD, new cv0(iArrF, b2), i20, c5, i19, (byte) 0);
                } else {
                    new fv0(cArrD, new cv0(iArrF, b2), i20, c5, i19, (byte) 1);
                }
            } else {
                if (iB != 2) {
                    throw new AssertionError("should be unreachable");
                }
                byte[] bArr = new byte[i18];
                byteBufferE.get(bArr);
                if (c == 1) {
                    new dv0(cArrD, new cv0(bArr, b3), i20, c5, i19, (byte) 0);
                } else {
                    new fv0(cArrD, new cv0(bArr, b3), i20, c5, i19, (byte) 1);
                }
            }
            byteBufferE.order(byteOrderOrder);
            int iPosition2 = byteBufferE.position() - iPosition;
            if (iPosition2 > i14) {
                throw new a43("uprops.icu: not enough bytes for blockTrie");
            }
            b33.i(i14 - iPosition2, byteBufferE);
        } catch (Throwable th) {
            byteBufferE.order(byteOrderOrder);
            throw th;
        }
    }
}
