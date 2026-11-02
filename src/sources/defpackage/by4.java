package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class by4 extends BaseAdapter {
    public static final int f0 = tr8.c(null).getMaximum(4);
    public static final int g0 = (tr8.c(null).getMaximum(7) + tr8.c(null).getMaximum(5)) - 1;
    public final ay4 X;
    public lr Y;
    public final bd0 Z;

    public by4(ay4 ay4Var, bd0 bd0Var) {
        this.X = ay4Var;
        this.Z = bd0Var;
        throw null;
    }

    public final int a(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int b(int i) {
        do {
            i--;
            if (i < c()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int c() {
        int firstDayOfWeek = this.Z.g0;
        ay4 ay4Var = this.X;
        Calendar calendar = ay4Var.X;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + ay4Var.f0 : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < c() || i > f()) {
            return null;
        }
        int iC = (i - c()) + 1;
        Calendar calendarA = tr8.a(this.X.X);
        calendarA.set(5, iC);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final boolean e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= this.Z.Z.X;
        }
        return false;
    }

    public final int f() {
        return (c() + this.X.g0) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return g0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.X.f0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.Y == null) {
            this.Y = new lr(context, (byte) 14);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(s46.mtrl_calendar_day, viewGroup, false);
        }
        int iC = i - c();
        if (iC >= 0) {
            ay4 ay4Var = this.X;
            if (iC >= ay4Var.g0) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(ay4Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iC + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        tr8.b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
