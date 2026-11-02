package okhttp3.internal.connection;

import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"reorderForHappyEyeballs", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "addresses", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InetAddressOrderKt {
    public static final List<Route> reorderForHappyEyeballs(List<Route> list) {
        list.getClass();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((Route) obj).socketAddress().getAddress() instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        return (arrayList3.isEmpty() || arrayList4.isEmpty()) ? list : _UtilCommonKt.interleave(arrayList3, arrayList4);
    }
}
