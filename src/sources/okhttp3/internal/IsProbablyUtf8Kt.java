package okhttp3.internal;

import defpackage.ba0;
import defpackage.i90;
import defpackage.j76;
import java.io.EOFException;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lba0;", _UrlKt.FRAGMENT_ENCODE_SET, "codePointLimit", _UrlKt.FRAGMENT_ENCODE_SET, "isProbablyUtf8", "(Lba0;J)Z", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IsProbablyUtf8Kt {
    public static final boolean isProbablyUtf8(ba0 ba0Var, long j) {
        ba0Var.getClass();
        try {
            j76 j76VarPeek = ba0Var.peek();
            for (long j2 = 0; j2 < j && !j76VarPeek.F(); j2++) {
                j76VarPeek.T0(1L);
                i90 i90Var = j76VarPeek.Y;
                byte bU = i90Var.u(0L);
                if ((bU & 224) == 192) {
                    j76VarPeek.T0(2L);
                } else if ((bU & 240) == 224) {
                    j76VarPeek.T0(3L);
                } else if ((bU & 248) == 240) {
                    j76VarPeek.T0(4L);
                }
                int iA0 = i90Var.a0();
                if (Character.isISOControl(iA0) && !Character.isWhitespace(iA0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(ba0 ba0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return isProbablyUtf8(ba0Var, j);
    }
}
