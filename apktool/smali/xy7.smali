.class public final Lxy7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lm51;

.field public static final b:Lvl8;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm51;

    .line 2
    .line 3
    invoke-direct {v0}, Lm51;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxy7;->a:Lm51;

    .line 7
    .line 8
    sget-object v0, Ltp1;->b:Lvl8;

    .line 9
    .line 10
    sput-object v0, Lxy7;->b:Lvl8;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Ls61;ZLrn2;)Lwy7;
    .locals 9

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Le71;->f0:Le71;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Le71;->X:Le71;

    .line 7
    .line 8
    :goto_0
    sget-object v0, Lxy7;->a:Lm51;

    .line 9
    .line 10
    invoke-static {v0, p0, p1, p2}, Lw51;->i(Lb71;Ls61;Le71;Lrn2;)Lyg1;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance p0, Lwy7;

    .line 15
    .line 16
    invoke-direct {p0, v3}, Lwy7;-><init>(Lyg1;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lal5;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/16 v8, 0x15

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    const-class v4, Lxg1;

    .line 26
    .line 27
    const-string v5, "await"

    .line 28
    .line 29
    const-string v6, "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 30
    .line 31
    invoke-direct/range {v1 .. v8}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Ltu6;

    .line 35
    .line 36
    sget-object p2, Lb02;->X:Lb02;

    .line 37
    .line 38
    sget-object v0, Lxy7;->b:Lvl8;

    .line 39
    .line 40
    if-ne v0, p2, :cond_1

    .line 41
    .line 42
    new-instance p2, Leh3;

    .line 43
    .line 44
    invoke-direct {p2, p0, v1}, Leh3;-><init>(Lwy7;Lal5;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p2, Lfh3;

    .line 49
    .line 50
    invoke-direct {p2, p0, v0, v1}, Lfh3;-><init>(Lwy7;Ls61;Lal5;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-static {p2}, Lmb6;->H(Lq51;)Lq51;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v0, Lc71;->X:Lc71;

    .line 58
    .line 59
    invoke-direct {p1, p2, v0}, Ltu6;-><init>(Lq51;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p2, Ldn8;->a:Ldn8;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ltu6;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object p0
.end method
