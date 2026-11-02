package okhttp3;

import defpackage.iq0;
import defpackage.kb0;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lokhttp3/Credentials;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "basic", _UrlKt.FRAGMENT_ENCODE_SET, "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String username, String password, Charset charset) {
        username.getClass();
        password.getClass();
        charset.getClass();
        String str = username + ':' + password;
        kb0 kb0Var = kb0.f0;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return "Basic ".concat(new kb0(bytes).a());
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = iq0.e;
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2) {
        str.getClass();
        str2.getClass();
        return basic$default(str, str2, null, 4, null);
    }
}
