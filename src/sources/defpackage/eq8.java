package defpackage;

import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class eq8 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(int i, String str, boolean z) {
        int i2;
        int i3;
        str.getClass();
        jf3 it = x97.a0(0, i).iterator();
        while (true) {
            jf3 jf3Var = it;
            if (!jf3Var.Z) {
                return str;
            }
            jf3Var.nextInt();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            StringBuilder sb = new StringBuilder(str.length());
            CharsetDecoder charsetDecoderOnUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith("�").onUnmappableCharacter(CodingErrorAction.REPORT);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
            for (int i4 = 0; i4 < str.length(); i4 = i2) {
                i2 = i4 + 1;
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%') {
                    byte b = 0;
                    for (int i5 = 0; i5 < 2; i5++) {
                        try {
                            if (i2 >= str.length()) {
                                throw new URISyntaxException(str, "Unexpected end of string", i2);
                            }
                            char cCharAt2 = str.charAt(i2);
                            i2++;
                            if ('0' <= cCharAt2 && cCharAt2 < ':') {
                                i3 = cCharAt2 - '0';
                            } else if ('a' > cCharAt2 || cCharAt2 >= 'g') {
                                i3 = ('A' > cCharAt2 || cCharAt2 >= 'G') ? -1 : cCharAt2 - '7';
                            } else {
                                i3 = cCharAt2 - 'W';
                            }
                            if (i3 < 0) {
                                charsetDecoderOnUnmappableCharacter.getClass();
                                byteBufferAllocate.getClass();
                                qp7.d(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
                                sb.append((char) 65533);
                                break;
                            }
                            b = (byte) ((b * 16) + i3);
                        } catch (URISyntaxException unused) {
                            charsetDecoderOnUnmappableCharacter.getClass();
                            byteBufferAllocate.getClass();
                            qp7.d(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
                            sb.append((char) 65533);
                        }
                    }
                    byteBufferAllocate.put(b);
                } else if (cCharAt != '+') {
                    charsetDecoderOnUnmappableCharacter.getClass();
                    byteBufferAllocate.getClass();
                    qp7.d(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
                    sb.append(cCharAt);
                } else {
                    charsetDecoderOnUnmappableCharacter.getClass();
                    byteBufferAllocate.getClass();
                    qp7.d(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
                    sb.append(z ? ' ' : '+');
                }
            }
            charsetDecoderOnUnmappableCharacter.getClass();
            byteBufferAllocate.getClass();
            qp7.d(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
            str = sb.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eq8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return -2115558354;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "UriDecoder";
    }
}
