package defpackage;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgo3;", "Lho3;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class go3 extends ho3 {
    public go3(String str, String str2) {
        super(str.concat((str2 == null || fm7.o0(str2)) ? _UrlKt.FRAGMENT_ENCODE_SET : "\n".concat(str2)));
    }
}
