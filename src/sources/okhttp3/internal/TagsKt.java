package okhttp3.internal;

import defpackage.dn2;
import defpackage.zu3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {_UrlKt.FRAGMENT_ENCODE_SET, "T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "Lzu3;", "type", "Lkotlin/Function0;", "compute", "computeIfAbsent", "(Ljava/util/concurrent/atomic/AtomicReference;Lzu3;Ldn2;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TagsKt {
    public static final <T> T computeIfAbsent(AtomicReference<Tags> atomicReference, zu3 zu3Var, dn2 dn2Var) {
        atomicReference.getClass();
        zu3Var.getClass();
        dn2Var.getClass();
        T t = null;
        while (true) {
            Tags tags = atomicReference.get();
            T t2 = (T) tags.get(zu3Var);
            if (t2 != null) {
                return t2;
            }
            if (t == null) {
                t = (T) dn2Var.invoke();
            }
            Tags tagsPlus = tags.plus(zu3Var, t);
            while (!atomicReference.compareAndSet(tags, tagsPlus)) {
                if (atomicReference.get() != tags) {
                }
            }
            return t;
        }
    }
}
