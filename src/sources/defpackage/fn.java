package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import android.media.session.MediaSessionManager;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fn {
    public static /* synthetic */ SessionConfiguration a(int i, ArrayList arrayList, Executor executor, hb hbVar) {
        return new SessionConfiguration(i, arrayList, executor, hbVar);
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo b(int i, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, -1, i);
    }
}
