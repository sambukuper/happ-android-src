package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class j75 extends i75 {
    @Override // defpackage.i75, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
