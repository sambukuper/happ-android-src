package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import defpackage.cw8;
import defpackage.d94;
import defpackage.dx3;
import defpackage.g94;
import defpackage.ge6;
import defpackage.ie6;
import defpackage.o84;
import defpackage.vj8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Ld94;", "Ldx3;", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ComponentActivity extends Activity implements d94, dx3 {
    public final g94 X = new g94(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (cw8.d(decorView, keyEvent)) {
            return true;
        }
        return vj8.z(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (cw8.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.dx3
    public final boolean g(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public g94 getX() {
        return this.X;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = ie6.Y;
        ge6.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        g94 g94Var = this.X;
        g94Var.c("setCurrentState");
        g94Var.e(o84.Z);
        super.onSaveInstanceState(bundle);
    }
}
