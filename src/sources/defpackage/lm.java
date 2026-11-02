package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lm {
    public static final lm X;
    public static final lm Y;
    public static final lm Z;
    public static final lm f0;
    public static final lm g0;
    public static final lm h0;
    public static final lm i0;
    public static final /* synthetic */ lm[] j0;

    static {
        lm lmVar = new lm("Paragraph", 0);
        X = lmVar;
        lm lmVar2 = new lm("Span", 1);
        Y = lmVar2;
        lm lmVar3 = new lm("VerbatimTts", 2);
        Z = lmVar3;
        lm lmVar4 = new lm("Url", 3);
        f0 = lmVar4;
        lm lmVar5 = new lm("Link", 4);
        g0 = lmVar5;
        lm lmVar6 = new lm("Clickable", 5);
        h0 = lmVar6;
        lm lmVar7 = new lm("String", 6);
        i0 = lmVar7;
        j0 = new lm[]{lmVar, lmVar2, lmVar3, lmVar4, lmVar5, lmVar6, lmVar7};
    }

    public static lm valueOf(String str) {
        return (lm) Enum.valueOf(lm.class, str);
    }

    public static lm[] values() {
        return (lm[]) j0.clone();
    }
}
