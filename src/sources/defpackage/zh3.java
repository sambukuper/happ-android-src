package defpackage;

import java.io.ByteArrayInputStream;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zh3 extends ResponseBody {
    public final String X;
    public final ResponseBody Y;

    public zh3(String str, ResponseBody responseBody) {
        this.X = str;
        this.Y = responseBody;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public final long getContentLength() {
        return this.X.length();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getMediaType() {
        return this.Y.getMediaType();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public final ba0 getBodySource() {
        byte[] bytes = this.X.getBytes(iq0.a);
        bytes.getClass();
        return new j76(dh3.Q(new ByteArrayInputStream(bytes)));
    }
}
