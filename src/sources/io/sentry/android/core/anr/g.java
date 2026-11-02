package io.sentry.android.core.anr;

import io.sentry.util.q;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {
    public final StackTraceElement[] X;
    public final long Y;

    public g(long j, StackTraceElement[] stackTraceElementArr) {
        this.Y = j;
        this.X = stackTraceElementArr;
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(1);
        dataOutputStream.writeLong(this.Y);
        StackTraceElement[] stackTraceElementArr = this.X;
        dataOutputStream.writeInt(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            Charset charset = q.a;
            String str = _UrlKt.FRAGMENT_ENCODE_SET;
            if (className == null) {
                className = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            dataOutputStream.writeUTF(className);
            String methodName = stackTraceElement.getMethodName();
            if (methodName == null) {
                methodName = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            dataOutputStream.writeUTF(methodName);
            String fileName = stackTraceElement.getFileName();
            dataOutputStream.writeBoolean(fileName == null);
            if (fileName != null) {
                str = fileName;
            }
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeInt(stackTraceElement.getLineNumber());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.Y, ((g) obj).Y);
    }
}
