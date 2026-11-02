package okhttp3.internal;

import defpackage.ge1;
import defpackage.zu3;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/Tags;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "T", "Lzu3;", "key", "value", "plus", "(Lzu3;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lzu3;)Ljava/lang/Object;", "Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/LinkedTags;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Tags {
    public /* synthetic */ Tags(ge1 ge1Var) {
        this();
    }

    public abstract <T> T get(zu3 key);

    public abstract <T> Tags plus(zu3 key, T value);

    private Tags() {
    }
}
