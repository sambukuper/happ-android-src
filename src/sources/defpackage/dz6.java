package defpackage;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dz6 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SearchView Y;

    public /* synthetic */ dz6(SearchView searchView, byte b) {
        this.X = b;
        this.Y = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        SearchView searchView = this.Y;
        switch (b) {
            case 0:
                searchView.s();
                break;
            default:
                e81 e81Var = searchView.U0;
                if (e81Var instanceof lw7) {
                    e81Var.b(null);
                }
                break;
        }
    }
}
