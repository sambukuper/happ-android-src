package okhttp3.internal;

import java.text.Normalizer;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"normalizeNfc", _UrlKt.FRAGMENT_ENCODE_SET, "string", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _NormalizeJvmKt {
    public static final String normalizeNfc(String str) {
        str.getClass();
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        strNormalize.getClass();
        return strNormalize;
    }
}
