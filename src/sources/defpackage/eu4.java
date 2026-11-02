package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eu4 extends qw1 {
    public final byte r0;
    public final byte s0;
    public rt4 t0;
    public st4 u0;

    public eu4(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r0 = (byte) 21;
            this.s0 = (byte) 22;
        } else {
            this.r0 = (byte) 22;
            this.s0 = (byte) 21;
        }
    }

    @Override // defpackage.qw1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        kt4 kt4Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.t0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                kt4Var = (kt4) headerViewListAdapter.getWrappedAdapter();
            } else {
                kt4Var = (kt4) adapter;
                headersCount = 0;
            }
            st4 st4VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= kt4Var.getCount()) ? null : kt4Var.getItem(i);
            st4 st4Var = this.u0;
            if (st4Var != st4VarB) {
                nt4 nt4Var = kt4Var.X;
                if (st4Var != null) {
                    this.t0.c(nt4Var, st4Var);
                }
                this.u0 = st4VarB;
                if (st4VarB != null) {
                    this.t0.k(nt4Var, st4VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.r0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.s0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (kt4) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (kt4) adapter).X.c(false);
        return true;
    }

    public void setHoverListener(rt4 rt4Var) {
        this.t0 = rt4Var;
    }

    @Override // defpackage.qw1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
