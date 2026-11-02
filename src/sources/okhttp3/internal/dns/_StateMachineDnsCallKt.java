package okhttp3.internal.dns;

import defpackage.gv3;
import defpackage.wv0;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/Dns$Callback;", "Lokhttp3/Dns$Call;", "call", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/io/IOException;", "exceptions", "Ldn8;", "onFailure", "(Lokhttp3/Dns$Callback;Lokhttp3/Dns$Call;Ljava/util/List;)V", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _StateMachineDnsCallKt {
    public static final void onFailure(Dns.Callback callback, Dns.Call call, List<? extends IOException> list) {
        callback.getClass();
        call.getClass();
        list.getClass();
        IOException iOException = (IOException) wv0.r0(list);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            gv3.g(iOException, list.get(i));
        }
        callback.onFailure(call, iOException);
    }
}
