package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public uc2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i = dm7.a;
        if (str == null || str.trim().isEmpty()) {
            bt.i("ApplicationId must be set.");
            throw null;
        }
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static uc2 a(Context context) {
        xd6 xd6Var = new xd6(context);
        String strT = xd6Var.t("google_app_id");
        if (TextUtils.isEmpty(strT)) {
            return null;
        }
        return new uc2(strT, xd6Var.t("google_api_key"), xd6Var.t("firebase_database_url"), xd6Var.t("ga_trackingId"), xd6Var.t("gcm_defaultSenderId"), xd6Var.t("google_storage_bucket"), xd6Var.t("recaptcha_site_key"), xd6Var.t("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uc2)) {
            return false;
        }
        uc2 uc2Var = (uc2) obj;
        return Objects.equals(this.b, uc2Var.b) && Objects.equals(this.a, uc2Var.a) && Objects.equals(this.c, uc2Var.c) && Objects.equals(this.d, uc2Var.d) && Objects.equals(this.e, uc2Var.e) && Objects.equals(this.f, uc2Var.f) && Objects.equals(this.g, uc2Var.g) && Objects.equals(this.h, uc2Var.h);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        e93 e93Var = new e93(this);
        e93Var.a(this.b, "applicationId");
        e93Var.a(this.a, "apiKey");
        e93Var.a(this.c, "databaseUrl");
        e93Var.a(this.e, "gcmSenderId");
        e93Var.a(this.f, "storageBucket");
        e93Var.a(this.g, "recaptchaSiteKey");
        e93Var.a(this.h, "projectId");
        return e93Var.toString();
    }
}
