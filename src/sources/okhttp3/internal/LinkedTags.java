package okhttp3.internal;

import defpackage.gn2;
import defpackage.w27;
import defpackage.wv0;
import defpackage.zc1;
import defpackage.zu3;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/LinkedTags;", _UrlKt.FRAGMENT_ENCODE_SET, "K", "Lokhttp3/internal/Tags;", "Lzu3;", "key", "value", "next", "<init>", "(Lzu3;Ljava/lang/Object;Lokhttp3/internal/Tags;)V", "T", "plus", "(Lzu3;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lzu3;)Ljava/lang/Object;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lzu3;", "Ljava/lang/Object;", "Lokhttp3/internal/Tags;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LinkedTags<K> extends Tags {
    private final zu3 key;
    private final Tags next;
    private final K value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(zu3 zu3Var, K k, Tags tags) {
        super(null);
        zu3Var.getClass();
        k.getClass();
        tags.getClass();
        this.key = zu3Var;
        this.value = k;
        this.next = tags;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedTags toString$lambda$0(LinkedTags linkedTags) {
        linkedTags.getClass();
        Tags tags = linkedTags.next;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(LinkedTags linkedTags) {
        linkedTags.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(linkedTags.key);
        sb.append('=');
        sb.append(linkedTags.value);
        return sb.toString();
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(zu3 key) {
        key.getClass();
        return key.equals(this.key) ? (T) zc1.M(key).cast(this.value) : (T) this.next.get(key);
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(zu3 key, T value) {
        key.getClass();
        boolean zEquals = key.equals(this.key);
        Tags tags = this.next;
        if (!zEquals) {
            Tags tagsPlus = tags.plus(key, null);
            if (tagsPlus != this.next) {
                this = new LinkedTags<>(this.key, this.value, tagsPlus);
            }
            tags = this;
        }
        return value != null ? new LinkedTags(key, value, tags) : tags;
    }

    public String toString() {
        final byte b = 0;
        List listM0 = wv0.M0(w27.n0(w27.i0(this, new gn2() { // from class: okhttp3.internal.a
            @Override // defpackage.gn2
            public final Object B(Object obj) {
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (b) {
                    case 0:
                        return LinkedTags.toString$lambda$0(linkedTags);
                    default:
                        return LinkedTags.toString$lambda$1(linkedTags);
                }
            }
        })));
        final byte b2 = 1;
        return wv0.y0(listM0, null, "{", "}", new gn2() { // from class: okhttp3.internal.a
            @Override // defpackage.gn2
            public final Object B(Object obj) {
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (b2) {
                    case 0:
                        return LinkedTags.toString$lambda$0(linkedTags);
                    default:
                        return LinkedTags.toString$lambda$1(linkedTags);
                }
            }
        }, 25);
    }
}
