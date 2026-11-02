package okhttp3.internal.connection;

import defpackage.aa0;
import defpackage.ba0;
import defpackage.je7;
import defpackage.sa7;
import defpackage.yd7;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lokhttp3/internal/connection/BufferedSocket;", "Lyd7;", "Lba0;", "getSource", "()Lba0;", "source", "Laa0;", "getSink", "()Laa0;", "sink", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BufferedSocket extends yd7 {
    @Override // defpackage.yd7
    /* synthetic */ void cancel();

    @Override // defpackage.yd7
    aa0 getSink();

    @Override // defpackage.yd7
    /* synthetic */ sa7 getSink();

    @Override // defpackage.yd7
    ba0 getSource();

    @Override // defpackage.yd7
    /* synthetic */ je7 getSource();
}
