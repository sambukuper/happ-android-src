package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z7 extends ArrayAdapter {
    public final /* synthetic */ byte X = 1;

    public /* synthetic */ z7(Context context, int i) {
        super(context, i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        switch (this.X) {
            case 1:
                int count = super.getCount();
                return count > 0 ? count - 1 : count;
            default:
                return super.getCount();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        switch (this.X) {
            case 0:
                return i;
            default:
                return super.getItemId(i);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        switch (this.X) {
            case 0:
                return true;
            default:
                return super.hasStableIds();
        }
    }

    public /* synthetic */ z7(Context context, int i, int i2, Object[] objArr) {
        super(context, i, i2, objArr);
    }
}
