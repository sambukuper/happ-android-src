package defpackage;

import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ta implements rz {
    public final AndroidComposeView a;
    public final xz b;
    public final AutofillId c;

    public ta(AndroidComposeView androidComposeView, xz xzVar) {
        this.a = androidComposeView;
        this.b = xzVar;
        androidComposeView.setImportantForAutofill(1);
        vz vzVarE = mn7.e(androidComposeView);
        AutofillId autofillId = vzVarE != null ? (AutofillId) vzVarE.a : null;
        if (autofillId == null) {
            throw p61.j("Required value was null.");
        }
        this.c = autofillId;
    }
}
