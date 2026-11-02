package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import defpackage.bt;
import defpackage.cn5;
import defpackage.cw8;
import defpackage.f66;
import defpackage.r26;
import defpackage.xb;
import defpackage.z51;
import defpackage.zz2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class DatePicker extends Picker {
    public static final int[] H0 = {5, 2, 1};
    public int A0;
    public final SimpleDateFormat B0;
    public final zz2 C0;
    public final Calendar D0;
    public final Calendar E0;
    public final Calendar F0;
    public final Calendar G0;
    public String u0;
    public cn5 v0;
    public cn5 w0;
    public cn5 x0;
    public int y0;
    public int z0;

    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        this.B0 = simpleDateFormat;
        Locale locale = Locale.getDefault();
        getContext().getResources();
        this.C0 = new zz2(locale);
        this.G0 = z51.z(this.G0, locale);
        this.D0 = z51.z(this.D0, (Locale) this.C0.Y);
        this.E0 = z51.z(this.E0, (Locale) this.C0.Y);
        this.F0 = z51.z(this.F0, (Locale) this.C0.Y);
        cn5 cn5Var = this.v0;
        if (cn5Var != null) {
            cn5Var.d = (String[]) this.C0.Z;
            a(this.y0, cn5Var);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66.lbDatePicker);
        cw8.m(this, context, f66.lbDatePicker, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(f66.lbDatePicker_android_minDate);
            String string2 = typedArrayObtainStyledAttributes.getString(f66.lbDatePicker_android_maxDate);
            String string3 = typedArrayObtainStyledAttributes.getString(f66.lbDatePicker_datePickerFormat);
            typedArrayObtainStyledAttributes.recycle();
            this.G0.clear();
            boolean zIsEmpty = TextUtils.isEmpty(string);
            Calendar calendar = this.G0;
            if (zIsEmpty) {
                calendar.set(1900, 0, 1);
            } else {
                try {
                    calendar.setTime(simpleDateFormat.parse(string));
                } catch (ParseException unused) {
                    this.G0.set(1900, 0, 1);
                }
            }
            this.D0.setTimeInMillis(this.G0.getTimeInMillis());
            this.G0.clear();
            boolean zIsEmpty2 = TextUtils.isEmpty(string2);
            Calendar calendar2 = this.G0;
            if (zIsEmpty2) {
                calendar2.set(2100, 0, 1);
            } else {
                try {
                    calendar2.setTime(this.B0.parse(string2));
                } catch (ParseException unused2) {
                    this.G0.set(2100, 0, 1);
                }
            }
            this.E0.setTimeInMillis(this.G0.getTimeInMillis());
            setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(DateFormat.getDateFormatOrder(context)) : string3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void g(int i, int i2, int i3) {
        if (this.F0.get(1) == i && this.F0.get(2) == i3 && this.F0.get(5) == i2) {
            return;
        }
        this.F0.set(i, i2, i3);
        boolean zBefore = this.F0.before(this.D0);
        Calendar calendar = this.F0;
        if (zBefore) {
            calendar.setTimeInMillis(this.D0.getTimeInMillis());
        } else if (calendar.after(this.E0)) {
            this.F0.setTimeInMillis(this.E0.getTimeInMillis());
        }
        post(new xb(this, (byte) 3));
    }

    public long getDate() {
        return this.F0.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.u0;
    }

    public long getMaxDate() {
        return this.E0.getTimeInMillis();
    }

    public long getMinDate() {
        return this.D0.getTimeInMillis();
    }

    public void setDate(long j) {
        this.G0.setTimeInMillis(j);
        g(this.G0.get(1), this.G0.get(2), this.G0.get(5));
    }

    public void setDatePickerFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(DateFormat.getDateFormatOrder(getContext()));
        }
        if (TextUtils.equals(this.u0, str)) {
            return;
        }
        this.u0 = str;
        zz2 zz2Var = this.C0;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern((Locale) zz2Var.Y, str);
        if (TextUtils.isEmpty(bestDateTimePattern)) {
            bestDateTimePattern = "MM/dd/yyyy";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        boolean z = false;
        char c = 0;
        for (int i = 0; i < bestDateTimePattern.length(); i++) {
            char cCharAt = bestDateTimePattern.charAt(i);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (!z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 6) {
                                sb.append(cCharAt);
                                break;
                            } else {
                                if (cCharAt == cArr[i2]) {
                                    if (cCharAt == c) {
                                        break;
                                    }
                                    arrayList.add(sb.toString());
                                    sb.setLength(0);
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        sb.append(cCharAt);
                    }
                    c = cCharAt;
                } else if (z) {
                    z = false;
                } else {
                    sb.setLength(0);
                    z = true;
                }
            }
        }
        arrayList.add(sb.toString());
        if (arrayList.size() != str.length() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + str.length() + " + 1");
        }
        setSeparators(arrayList);
        this.w0 = null;
        this.v0 = null;
        this.x0 = null;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        String upperCase = str.toUpperCase((Locale) zz2Var.Y);
        ArrayList arrayList2 = new ArrayList(3);
        for (int i3 = 0; i3 < upperCase.length(); i3++) {
            char cCharAt2 = upperCase.charAt(i3);
            if (cCharAt2 == 'D') {
                if (this.w0 != null) {
                    bt.q("datePicker format error");
                    return;
                }
                cn5 cn5Var = new cn5();
                this.w0 = cn5Var;
                arrayList2.add(cn5Var);
                this.w0.e = "%02d";
                this.z0 = i3;
            } else if (cCharAt2 != 'M') {
                if (cCharAt2 != 'Y') {
                    bt.q("datePicker format error");
                    return;
                }
                if (this.x0 != null) {
                    bt.q("datePicker format error");
                    return;
                }
                cn5 cn5Var2 = new cn5();
                this.x0 = cn5Var2;
                arrayList2.add(cn5Var2);
                this.A0 = i3;
                this.x0.e = "%d";
            } else {
                if (this.v0 != null) {
                    bt.q("datePicker format error");
                    return;
                }
                cn5 cn5Var3 = new cn5();
                this.v0 = cn5Var3;
                arrayList2.add(cn5Var3);
                this.v0.d = (String[]) zz2Var.Z;
                this.y0 = i3;
            }
        }
        setColumns(arrayList2);
        post(new xb(this, (byte) 3));
    }

    public void setMaxDate(long j) {
        this.G0.setTimeInMillis(j);
        if (this.G0.get(1) != this.E0.get(1) || this.G0.get(6) == this.E0.get(6)) {
            this.E0.setTimeInMillis(j);
            if (this.F0.after(this.E0)) {
                this.F0.setTimeInMillis(this.E0.getTimeInMillis());
            }
            post(new xb(this, (byte) 3));
        }
    }

    public void setMinDate(long j) {
        this.G0.setTimeInMillis(j);
        if (this.G0.get(1) != this.D0.get(1) || this.G0.get(6) == this.D0.get(6)) {
            this.D0.setTimeInMillis(j);
            if (this.F0.before(this.D0)) {
                this.F0.setTimeInMillis(this.D0.getTimeInMillis());
            }
            post(new xb(this, (byte) 3));
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r26.datePickerStyle);
    }
}
