package okhttp3.internal.platform;

import android.content.Context;
import defpackage.d02;
import defpackage.rc3;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lrc3;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lokhttp3/internal/platform/Platform;", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformInitializer implements rc3 {
    @Override // defpackage.rc3
    public Platform create(Context context) {
        context.getClass();
        PlatformRegistry.INSTANCE.setApplicationContext(context);
        return Platform.INSTANCE.get();
    }

    @Override // defpackage.rc3
    public List<Class<rc3>> dependencies() {
        return d02.X;
    }
}
