package okhttp3.internal.dns;

import defpackage.bt;
import defpackage.dn2;
import defpackage.ka8;
import defpackage.la8;
import defpackage.qg5;
import defpackage.qx0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0001H$¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010\u001f¨\u0006&"}, d2 = {"Lokhttp3/internal/dns/MemoryCache;", _UrlKt.FRAGMENT_ENCODE_SET, "K", "V", "Lla8;", "timeSource", _UrlKt.FRAGMENT_ENCODE_SET, "maxSize", "<init>", "(Lla8;I)V", "Lqx0;", "now", "value", "lastRequestedAt", "(Lqx0;Ljava/lang/Object;)Lqx0;", "key", "Lkotlin/Function0;", "computeValue", "computeIfAbsent", "(Ljava/lang/Object;Ldn2;)Ljava/lang/Object;", "Ldn8;", "evictAll", "()V", "count", "evict", "(I)V", "Lla8;", "getTimeSource", "()Lla8;", "I", "getMaxSize", "()I", "Ljava/util/concurrent/ConcurrentHashMap;", "entries", "Ljava/util/concurrent/ConcurrentHashMap;", "getSize", "size", "NewestFirst", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MemoryCache<K, V> {
    private final ConcurrentHashMap<K, V> entries;
    private final int maxSize;
    private final la8 timeSource;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002&\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00020\u0001j\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\n\u001a\u00020\t2\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/dns/MemoryCache$NewestFirst;", "Ljava/util/Comparator;", "Lqg5;", "Lqx0;", "Lkotlin/Comparator;", "<init>", "()V", "o1", "o2", _UrlKt.FRAGMENT_ENCODE_SET, "compare", "(Lqg5;Lqg5;)I", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NewestFirst implements Comparator<qg5> {
        public static final NewestFirst INSTANCE = new NewestFirst();

        private NewestFirst() {
        }

        @Override // java.util.Comparator
        public int compare(qg5 o1, qg5 o2) {
            o1.getClass();
            o2.getClass();
            return ((ka8) ((qx0) o2.X)).compareTo((qx0) o1.X);
        }
    }

    public MemoryCache(la8 la8Var, int i) {
        la8Var.getClass();
        this.timeSource = la8Var;
        this.maxSize = i;
        this.entries = new ConcurrentHashMap<>();
        if (i >= 0) {
            return;
        }
        bt.q("Failed requirement.");
        throw null;
    }

    public final V computeIfAbsent(K key, dn2 computeValue) {
        key.getClass();
        computeValue.getClass();
        if (this.maxSize == 0) {
            return (V) computeValue.invoke();
        }
        V v = this.entries.get(key);
        if (v != null) {
            return v;
        }
        V v2 = (V) computeValue.invoke();
        V vPutIfAbsent = this.entries.putIfAbsent(key, v2);
        if (vPutIfAbsent != null) {
            return vPutIfAbsent;
        }
        int size = this.entries.size();
        int i = this.maxSize;
        int i2 = size - i;
        if (i2 >= i) {
            evict(i2);
        }
        return v2;
    }

    public final void evict(int count) {
        ka8 ka8VarF0 = this.timeSource.F0();
        PriorityQueue priorityQueue = new PriorityQueue(count + 1, NewestFirst.INSTANCE);
        Iterator<Map.Entry<K, V>> it = this.entries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            next.getClass();
            Map.Entry<K, V> entry = next;
            V value = entry.getValue();
            value.getClass();
            qx0 qx0VarLastRequestedAt = lastRequestedAt(ka8VarF0, value);
            if (qx0VarLastRequestedAt == null) {
                it.remove();
                count--;
            } else {
                priorityQueue.add(new qg5(qx0VarLastRequestedAt, entry));
            }
            if (priorityQueue.size() > count) {
                priorityQueue.poll();
            }
        }
        Iterator it2 = priorityQueue.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) ((qg5) it2.next()).Y;
            this.entries.remove(entry2.getKey(), entry2.getValue());
        }
    }

    public final void evictAll() {
        this.entries.clear();
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final int getSize() {
        return this.entries.size();
    }

    public final la8 getTimeSource() {
        return this.timeSource;
    }

    public abstract qx0 lastRequestedAt(qx0 now, V value);
}
