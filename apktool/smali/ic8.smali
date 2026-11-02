.class public final Lic8;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public g0:B

.field public final synthetic h0:Ljc8;

.field public final synthetic i0:Lrf0;

.field public final synthetic j0:Lf15;


# direct methods
.method public constructor <init>(Ljc8;Lrf0;Lf15;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lic8;->h0:Ljc8;

    .line 2
    .line 3
    iput-object p2, p0, Lic8;->i0:Lrf0;

    .line 4
    .line 5
    iput-object p3, p0, Lic8;->j0:Lf15;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq51;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lic8;->m(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lic8;

    .line 8
    .line 9
    sget-object p1, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lic8;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final m(Lq51;)Lq51;
    .locals 3

    .line 1
    new-instance v0, Lic8;

    .line 2
    .line 3
    iget-object v1, p0, Lic8;->i0:Lrf0;

    .line 4
    .line 5
    iget-object v2, p0, Lic8;->j0:Lf15;

    .line 6
    .line 7
    iget-object p0, p0, Lic8;->h0:Ljc8;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lic8;-><init>(Ljc8;Lrf0;Lf15;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lic8;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lf15;->Z:Lf15;

    .line 5
    .line 6
    iget-object v3, p0, Lic8;->j0:Lf15;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, Lic8;->h0:Ljc8;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v5, :cond_0

    .line 15
    .line 16
    if-ne v0, v4, :cond_1

    .line 17
    .line 18
    :cond_0
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :try_start_1
    iget-boolean p1, v6, Ljc8;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    iget-object v0, p0, Lic8;->i0:Lrf0;

    .line 36
    .line 37
    sget-object v7, Lc71;->X:Lc71;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    :try_start_2
    iput-byte v5, p0, Lic8;->g0:B

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Lrf0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v7, :cond_4

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    new-instance p1, Lym7;

    .line 51
    .line 52
    const/16 v5, 0x8

    .line 53
    .line 54
    invoke-direct {p1, v0, v1, v5}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 55
    .line 56
    .line 57
    iput-byte v4, p0, Lic8;->g0:B

    .line 58
    .line 59
    new-instance v0, Lva8;

    .line 60
    .line 61
    const-wide/16 v4, 0x5dc

    .line 62
    .line 63
    invoke-direct {v0, v4, v5, p0}, Lva8;-><init>(JLs51;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, p1}, La28;->t(Lva8;Lrn2;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    if-ne p0, v7, :cond_4

    .line 71
    .line 72
    :goto_0
    return-object v7

    .line 73
    :cond_4
    :goto_1
    if-eq v3, v2, :cond_5

    .line 74
    .line 75
    invoke-virtual {v6}, Ljc8;->a()V

    .line 76
    .line 77
    .line 78
    :cond_5
    sget-object p0, Ldn8;->a:Ldn8;

    .line 79
    .line 80
    return-object p0

    .line 81
    :goto_2
    if-eq v3, v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v6}, Ljc8;->a()V

    .line 84
    .line 85
    .line 86
    :cond_6
    throw p0
.end method
