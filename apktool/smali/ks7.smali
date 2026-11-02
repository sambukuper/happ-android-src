.class public final synthetic Lks7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq2;


# static fields
.field public static final a:Lks7;

.field private static final descriptor:Le37;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lks7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lks7;->a:Lks7;

    .line 7
    .line 8
    new-instance v1, Lzp5;

    .line 9
    .line 10
    const-string v2, "su.happ.proxyutility.domain.sub.SubscriptionProperties.SendingDataProperties"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lzp5;-><init>(Ljava/lang/String;Ldq2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "isSendHwidEnabled"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "isSendHwidAlwaysEnabled"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lks7;->descriptor:Le37;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lms7;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p2, Lms7;->b:Z

    .line 7
    .line 8
    iget-boolean p2, p2, Lms7;->a:Z

    .line 9
    .line 10
    sget-object v0, Lks7;->descriptor:Le37;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lol7;->a(Le37;)Lol7;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, v0}, Lol7;->w(Le37;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eq p2, v2, :cond_1

    .line 25
    .line 26
    :goto_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p1, v0, v1, p2}, Lol7;->c(Le37;IZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p1, v0}, Lol7;->w(Le37;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    if-eqz p0, :cond_3

    .line 38
    .line 39
    :goto_1
    invoke-virtual {p1, v0, v2, p0}, Lol7;->c(Le37;IZ)V

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-virtual {p1, v0}, Lol7;->v(Le37;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object p0, Lks7;->descriptor:Le37;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lrd1;->t(Le37;)Lf01;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v0

    .line 10
    move v3, v1

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-eqz v2, :cond_3

    .line 14
    .line 15
    invoke-interface {p1, p0}, Lf01;->e(Le37;)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    const/4 v7, -0x1

    .line 20
    if-eq v6, v7, :cond_2

    .line 21
    .line 22
    if-eqz v6, :cond_1

    .line 23
    .line 24
    if-ne v6, v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p1, p0, v0}, Lf01;->z(Le37;I)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    or-int/lit8 v3, v3, 0x2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Lfn8;

    .line 34
    .line 35
    invoke-direct {p0, v6}, Lfn8;-><init>(I)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_1
    invoke-interface {p1, p0, v1}, Lf01;->z(Le37;I)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    or-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v2, v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-interface {p1, p0}, Lf01;->n(Le37;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lms7;

    .line 52
    .line 53
    invoke-direct {p0, v3, v4, v5}, Lms7;-><init>(IZZ)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public final c()[Low3;
    .locals 2

    .line 1
    const/4 p0, 0x2

    .line 2
    new-array p0, p0, [Low3;

    .line 3
    .line 4
    sget-object v0, Lu60;->a:Lu60;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput-object v0, p0, v1

    .line 11
    .line 12
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lks7;->descriptor:Le37;

    .line 2
    .line 3
    return-object p0
.end method
