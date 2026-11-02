.class public final Lpd2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkq8;


# instance fields
.field public final a:Lkh7;

.field public b:Lqq8;

.field public volatile c:I

.field public d:Lux0;


# direct methods
.method public constructor <init>(Lqj0;Lkh7;Lpr8;Luc8;Llh4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lpd2;->a:Lkh7;

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    iput p1, p0, Lpd2;->c:I

    .line 20
    .line 21
    sget-object p0, Ldn8;->a:Ldn8;

    .line 22
    .line 23
    invoke-static {p0}, Lvr3;->a(Ljava/lang/Object;)Lux0;

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lod2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lod2;

    .line 7
    .line 8
    iget v1, v0, Lod2;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lod2;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lod2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lod2;-><init>(Lpd2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lod2;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lc71;->X:Lc71;

    .line 28
    .line 29
    iget v2, v0, Lod2;->i0:I

    .line 30
    .line 31
    const-string v3, "CXCP"

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    iget p0, v0, Lod2;->f0:I

    .line 39
    .line 40
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v3}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    iget p1, p0, Lpd2;->c:I

    .line 58
    .line 59
    iget-object p0, p0, Lpd2;->d:Lux0;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 65
    .line 66
    invoke-static {p0}, Lvr3;->a(Ljava/lang/Object;)Lux0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_1
    iput p1, v0, Lod2;->f0:I

    .line 71
    .line 72
    iput v4, v0, Lod2;->i0:I

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lrm3;->V0(Ls51;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v1, :cond_4

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_4
    move p0, p1

    .line 82
    :goto_2
    invoke-static {v3}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    new-instance p1, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 88
    .line 89
    .line 90
    return-object p1
.end method

.method public final b(Lqq8;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lpd2;->b:Lqq8;

    .line 2
    .line 3
    iget p1, p0, Lpd2;->c:I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Lpd2;->c(IZ)Lux0;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c(IZ)Lux0;
    .locals 2

    .line 1
    const-string v0, "CXCP"

    .line 2
    .line 3
    invoke-static {v0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lpd2;->b:Lqq8;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    :cond_0
    new-instance v0, Lux0;

    .line 15
    .line 16
    invoke-direct {v0}, Lux0;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lpd2;->b:Lqq8;

    .line 20
    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    iput p1, p0, Lpd2;->c:I

    .line 24
    .line 25
    iget-object v1, p0, Lpd2;->d:Lux0;

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const-string p2, "There is a new flash mode being set or camera was closed"

    .line 32
    .line 33
    invoke-static {p2, v1}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 p2, 0x0

    .line 37
    iput-object p2, p0, Lpd2;->d:Lux0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-static {v0, v1}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    iput-object v0, p0, Lpd2;->d:Lux0;

    .line 46
    .line 47
    iget-object p0, p0, Lpd2;->a:Lkh7;

    .line 48
    .line 49
    iget-object p2, p0, Lkh7;->d:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter p2

    .line 52
    :try_start_0
    iput p1, p0, Lkh7;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    monitor-exit p2

    .line 55
    invoke-virtual {p0}, Lkh7;->f()Lux0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0, v0}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    monitor-exit p2

    .line 65
    throw p0

    .line 66
    :cond_4
    const-string p0, "Camera is not active."

    .line 67
    .line 68
    invoke-static {p0, v0}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public final reset()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lpd2;->c:I

    .line 3
    .line 4
    iget-object v1, p0, Lpd2;->d:Lux0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v2, "There is a new flash mode being set or camera was closed"

    .line 9
    .line 10
    invoke-static {v2, v1}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lpd2;->d:Lux0;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v0, v1}, Lpd2;->c(IZ)Lux0;

    .line 18
    .line 19
    .line 20
    return-void
.end method
