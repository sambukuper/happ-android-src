package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class id3 extends InputConnectionWrapper {
    public final /* synthetic */ kd3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id3(InputConnection inputConnection, kd3 kd3Var) {
        super(inputConnection, false);
        this.a = kd3Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        q02 q02Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            q02Var = new q02(new ld3(inputContentInfo), (byte) 9);
        }
        if (this.a.j(q02Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
