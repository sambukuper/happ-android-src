.class public final synthetic Lds7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq2;


# static fields
.field public static final a:Lds7;

.field private static final descriptor:Le37;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lds7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lds7;->a:Lds7;

    .line 7
    .line 8
    new-instance v1, Lzp5;

    .line 9
    .line 10
    const-string v2, "su.happ.proxyutility.domain.sub.SubscriptionProperties.AutoConnectProperties"

    .line 11
    .line 12
    const/4 v3, 0x2

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
    const-string v0, "connectType"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lds7;->descriptor:Le37;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lfs7;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Lfs7;->b:Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 7
    .line 8
    iget-boolean p2, p2, Lfs7;->a:Z

    .line 9
    .line 10
    sget-object v0, Lds7;->descriptor:Le37;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lol7;->a(Le37;)Lol7;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v1, Lfs7;->c:[Lg44;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lol7;->w(Le37;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    :goto_0
    const/4 v2, 0x0

    .line 28
    invoke-virtual {p1, v0, v2, p2}, Lol7;->c(Le37;IZ)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1, v0}, Lol7;->w(Le37;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    sget-object p2, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;->LAST_USED:Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 39
    .line 40
    if-eq p0, p2, :cond_3

    .line 41
    .line 42
    :goto_1
    const/4 p2, 0x1

    .line 43
    aget-object v1, v1, p2

    .line 44
    .line 45
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Low3;

    .line 50
    .line 51
    invoke-virtual {p1, v0, p2, v1, p0}, Lol7;->q(Le37;ILow3;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p1, v0}, Lol7;->v(Le37;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object p0, Lds7;->descriptor:Le37;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lrd1;->t(Le37;)Lf01;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lfs7;->c:[Lg44;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v1

    .line 13
    move v5, v2

    .line 14
    move v6, v5

    .line 15
    :goto_0
    if-eqz v4, :cond_3

    .line 16
    .line 17
    invoke-interface {p1, p0}, Lf01;->e(Le37;)I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const/4 v8, -0x1

    .line 22
    if-eq v7, v8, :cond_2

    .line 23
    .line 24
    if-eqz v7, :cond_1

    .line 25
    .line 26
    if-ne v7, v1, :cond_0

    .line 27
    .line 28
    aget-object v7, v0, v1

    .line 29
    .line 30
    invoke-interface {v7}, Lg44;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Low3;

    .line 35
    .line 36
    invoke-interface {p1, p0, v1, v7, v3}, Lf01;->q(Le37;ILow3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 41
    .line 42
    or-int/lit8 v5, v5, 0x2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p0, Lfn8;

    .line 46
    .line 47
    invoke-direct {p0, v7}, Lfn8;-><init>(I)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_1
    invoke-interface {p1, p0, v2}, Lf01;->z(Le37;I)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    or-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v4, v2

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-interface {p1, p0}, Lf01;->n(Le37;)V

    .line 61
    .line 62
    .line 63
    new-instance p0, Lfs7;

    .line 64
    .line 65
    invoke-direct {p0, v5, v6, v3}, Lfs7;-><init>(IZLsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public final c()[Low3;
    .locals 3

    .line 1
    sget-object p0, Lfs7;->c:[Lg44;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [Low3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, Lu60;->a:Lu60;

    .line 8
    .line 9
    aput-object v2, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aget-object p0, p0, v1

    .line 13
    .line 14
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    aput-object p0, v0, v1

    .line 19
    .line 20
    return-object v0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lds7;->descriptor:Le37;

    .line 2
    .line 3
    return-object p0
.end method
