.class public final synthetic Lgs7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq2;


# static fields
.field public static final a:Lgs7;

.field private static final descriptor:Le37;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lgs7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgs7;->a:Lgs7;

    .line 7
    .line 8
    new-instance v1, Lzp5;

    .line 9
    .line 10
    const-string v2, "su.happ.proxyutility.domain.sub.SubscriptionProperties.AutoUpdateProperties"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lzp5;-><init>(Ljava/lang/String;Ldq2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "isEnabled"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "isBlocked"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "updateInterval"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "initialDelay"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "showNotifications"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lgs7;->descriptor:Le37;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lis7;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p2, Lis7;->e:Z

    .line 7
    .line 8
    iget v0, p2, Lis7;->d:I

    .line 9
    .line 10
    iget v1, p2, Lis7;->c:I

    .line 11
    .line 12
    iget-boolean v2, p2, Lis7;->b:Z

    .line 13
    .line 14
    iget-boolean p2, p2, Lis7;->a:Z

    .line 15
    .line 16
    sget-object v3, Lgs7;->descriptor:Le37;

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Lol7;->a(Le37;)Lol7;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, v3}, Lol7;->w(Le37;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz p2, :cond_1

    .line 30
    .line 31
    :goto_0
    const/4 v4, 0x0

    .line 32
    invoke-virtual {p1, v3, v4, p2}, Lol7;->c(Le37;IZ)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p1, v3}, Lol7;->w(Le37;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    const/4 v4, 0x1

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    if-eqz v2, :cond_3

    .line 44
    .line 45
    :goto_1
    invoke-virtual {p1, v3, v4, v2}, Lol7;->c(Le37;IZ)V

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {p1, v3}, Lol7;->w(Le37;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    if-eq v1, v4, :cond_5

    .line 56
    .line 57
    :goto_2
    const/4 p2, 0x2

    .line 58
    invoke-virtual {p1, p2, v1, v3}, Lol7;->l(IILe37;)V

    .line 59
    .line 60
    .line 61
    :cond_5
    invoke-virtual {p1, v3}, Lol7;->w(Le37;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_6

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_6
    if-eq v0, v4, :cond_7

    .line 69
    .line 70
    :goto_3
    const/4 p2, 0x3

    .line 71
    invoke-virtual {p1, p2, v0, v3}, Lol7;->l(IILe37;)V

    .line 72
    .line 73
    .line 74
    :cond_7
    invoke-virtual {p1, v3}, Lol7;->w(Le37;)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_8

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_8
    if-eqz p0, :cond_9

    .line 82
    .line 83
    :goto_4
    const/4 p2, 0x4

    .line 84
    invoke-virtual {p1, v3, p2, p0}, Lol7;->c(Le37;IZ)V

    .line 85
    .line 86
    .line 87
    :cond_9
    invoke-virtual {p1, v3}, Lol7;->v(Le37;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object p0, Lgs7;->descriptor:Le37;

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
    move v4, v1

    .line 11
    move v5, v4

    .line 12
    move v6, v5

    .line 13
    move v7, v6

    .line 14
    move v8, v7

    .line 15
    move v9, v8

    .line 16
    :goto_0
    if-eqz v2, :cond_6

    .line 17
    .line 18
    invoke-interface {p1, p0}, Lf01;->e(Le37;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v3, v10, :cond_5

    .line 24
    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    if-eq v3, v0, :cond_3

    .line 28
    .line 29
    const/4 v10, 0x2

    .line 30
    if-eq v3, v10, :cond_2

    .line 31
    .line 32
    const/4 v10, 0x3

    .line 33
    if-eq v3, v10, :cond_1

    .line 34
    .line 35
    const/4 v9, 0x4

    .line 36
    if-ne v3, v9, :cond_0

    .line 37
    .line 38
    invoke-interface {p1, p0, v9}, Lf01;->z(Le37;I)Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    or-int/lit8 v4, v4, 0x10

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p0, Lfn8;

    .line 46
    .line 47
    invoke-direct {p0, v3}, Lfn8;-><init>(I)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_1
    invoke-interface {p1, p0, v10}, Lf01;->r(Le37;I)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    or-int/lit8 v4, v4, 0x8

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-interface {p1, p0, v10}, Lf01;->r(Le37;I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    or-int/lit8 v4, v4, 0x4

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-interface {p1, p0, v0}, Lf01;->z(Le37;I)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    or-int/lit8 v4, v4, 0x2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-interface {p1, p0, v1}, Lf01;->z(Le37;I)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    or-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    move v2, v1

    .line 80
    goto :goto_0

    .line 81
    :cond_6
    invoke-interface {p1, p0}, Lf01;->n(Le37;)V

    .line 82
    .line 83
    .line 84
    new-instance v3, Lis7;

    .line 85
    .line 86
    invoke-direct/range {v3 .. v9}, Lis7;-><init>(IZZIIZ)V

    .line 87
    .line 88
    .line 89
    return-object v3
.end method

.method public final c()[Low3;
    .locals 3

    .line 1
    const/4 p0, 0x5

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
    sget-object v1, Lnf3;->a:Lnf3;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    aput-object v1, p0, v2

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    aput-object v1, p0, v2

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    aput-object v0, p0, v1

    .line 22
    .line 23
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lgs7;->descriptor:Le37;

    .line 2
    .line 3
    return-object p0
.end method
