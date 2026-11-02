package okhttp3.internal.idn;

import defpackage.gn2;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "index", "read14BitInt", "(Ljava/lang/String;I)I", "position", "limit", "Lkotlin/Function1;", "compare", "binarySearch", "(IILgn2;)I", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IdnaMappingTableKt {
    public static final int binarySearch(int i, int i2, gn2 gn2Var) {
        gn2Var.getClass();
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) / 2;
            int iIntValue = ((Number) gn2Var.B(Integer.valueOf(i4))).intValue();
            if (iIntValue < 0) {
                i3 = i4 - 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i = i4 + 1;
            }
        }
        return (-i) - 1;
    }

    public static final int read14BitInt(String str, int i) {
        str.getClass();
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }
}
