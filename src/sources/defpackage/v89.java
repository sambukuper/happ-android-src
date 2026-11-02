package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v89 extends b99 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ GoogleApiActivity Y;

    public v89(Intent intent, GoogleApiActivity googleApiActivity) {
        this.X = intent;
        this.Y = googleApiActivity;
    }

    @Override // defpackage.b99
    public final void a() {
        Intent intent = this.X;
        if (intent != null) {
            this.Y.startActivityForResult(intent, 2);
        }
    }
}
