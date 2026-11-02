package defpackage;

import androidx.leanback.widget.SearchBar;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 implements Runnable {
    public final /* synthetic */ byte X;
    public final int Y;
    public final Object Z;

    public vd0(int i, nx8 nx8Var) {
        this.X = (byte) 3;
        this.Y = i;
        this.Z = nx8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        int i = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                wl7 wl7Var = (wl7) ((rb8) obj).Y;
                if (wl7Var != null) {
                    wl7Var.S(i);
                }
                break;
            case 1:
                ((wq4) obj).k1.o0(i);
                break;
            case 2:
                SearchBar searchBar = (SearchBar) obj;
                searchBar.y0.play(searchBar.z0.get(i), 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case 3:
                ((RecyclerView) obj).o0(i);
                break;
            default:
                ((i89) obj).c(i);
                break;
        }
    }

    public /* synthetic */ vd0(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }
}
