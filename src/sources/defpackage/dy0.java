package defpackage;

import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ComponentActivity Y;

    public /* synthetic */ dy0(ComponentActivity componentActivity, byte b) {
        this.X = b;
        this.Y = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ComponentActivity componentActivity = this.Y;
        switch (b) {
            case 0:
                int i = ComponentActivity.x0;
                componentActivity.invalidateOptionsMenu();
                break;
            default:
                ComponentActivity.l(componentActivity);
                break;
        }
    }
}
