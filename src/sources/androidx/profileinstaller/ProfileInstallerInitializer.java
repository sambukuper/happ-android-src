package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.g55;
import defpackage.kk;
import defpackage.rc3;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements rc3 {
    @Override // defpackage.rc3
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new kk(this, context.getApplicationContext()));
        return new g55((byte) 8);
    }

    @Override // defpackage.rc3
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
