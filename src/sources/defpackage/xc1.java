package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xc1 extends BaseAdapter {
    public static final int f0;
    public final Calendar X;
    public final int Y;
    public final int Z;

    static {
        f0 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public xc1() {
        Calendar calendarC = tr8.c(null);
        this.X = calendarC;
        this.Y = calendarC.getMaximum(7);
        this.Z = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.Y;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.Y;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.Z;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(s46.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.Z;
        int i3 = this.Y;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.X;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f0, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(h56.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public xc1(int i) {
        Calendar calendarC = tr8.c(null);
        this.X = calendarC;
        this.Y = calendarC.getMaximum(7);
        this.Z = i;
    }
}
