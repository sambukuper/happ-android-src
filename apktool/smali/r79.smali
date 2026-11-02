.class public final Lr79;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkq8;


# instance fields
.field public final a:Lp79;

.field public final b:F

.field public final c:F

.field public final d:Lvz7;

.field public final e:Lvz7;

.field public f:Z

.field public g:Lqq8;

.field public h:Lux0;


# direct methods
.method public constructor <init>(Lp79;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr79;->a:Lp79;

    .line 5
    .line 6
    invoke-interface {p1}, Lp79;->c()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lr79;->b:F

    .line 11
    .line 12
    invoke-interface {p1}, Lp79;->a()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Lr79;->c:F

    .line 17
    .line 18
    new-instance p1, Lq79;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, p0, v0}, Lq79;-><init>(Lr79;B)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lvz7;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lr79;->d:Lvz7;

    .line 30
    .line 31
    new-instance p1, Lq79;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-direct {p1, p0, v0}, Lq79;-><init>(Lr79;B)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lvz7;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lr79;->e:Lvz7;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Ls79;ZZ)Lxb4;
    .locals 3

    .line 1
    const-string v0, "Job.asListenableFuture"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lux0;

    .line 7
    .line 8
    invoke-direct {v1}, Lux0;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lr79;->h:Lux0;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const-string p2, "Cancelled due to another zoom value being set."

    .line 18
    .line 19
    invoke-static {p2, v2}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v1, v2}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    iput-object v1, p0, Lr79;->h:Lux0;

    .line 27
    .line 28
    invoke-static {}, Ls08;->c()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iget-object v2, p0, Lr79;->e:Lvz7;

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Lyz4;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Lqc4;->j(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Lyz4;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Lyz4;->k(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-object p1, p0, Lr79;->g:Lqq8;

    .line 56
    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    iget-object p0, p0, Lr79;->a:Lp79;

    .line 60
    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    invoke-interface {p0, p1}, Lp79;->p(Lqq8;)Lxg1;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-interface {p0, p1}, Lp79;->m(Lqq8;)Lxg1;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    :goto_2
    invoke-static {p0, v1}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    const-string p0, "Camera is not active."

    .line 77
    .line 78
    invoke-static {p0, v1}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 79
    .line 80
    .line 81
    :goto_3
    new-instance p0, Lqd0;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lif6;

    .line 87
    .line 88
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lqd0;->c:Lif6;

    .line 92
    .line 93
    new-instance p1, Lud0;

    .line 94
    .line 95
    invoke-direct {p1, p0}, Lud0;-><init>(Lqd0;)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Lqd0;->b:Lud0;

    .line 99
    .line 100
    const-class p2, Lo61;

    .line 101
    .line 102
    iput-object p2, p0, Lqd0;->a:Ljava/lang/Object;

    .line 103
    .line 104
    :try_start_0
    new-instance p2, Ly0;

    .line 105
    .line 106
    const/16 p3, 0x13

    .line 107
    .line 108
    invoke-direct {p2, p0, p3}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p2}, Lrm3;->D(Lgn2;)Lgq1;

    .line 112
    .line 113
    .line 114
    iput-object v0, p0, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :catch_0
    move-exception p0

    .line 118
    invoke-virtual {p1, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 119
    .line 120
    .line 121
    :goto_4
    invoke-static {p1}, Lvr3;->P(Lxb4;)Lxb4;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method

.method public final b(Lqq8;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lr79;->g:Lqq8;

    .line 2
    .line 3
    iget-object p1, p0, Lr79;->e:Lvz7;

    .line 4
    .line 5
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lyz4;

    .line 10
    .line 11
    invoke-virtual {p1}, Lqc4;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ls79;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lr79;->d:Lvz7;

    .line 20
    .line 21
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ls79;

    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Lr79;->f:Z

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move v0, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v0, v1

    .line 39
    :goto_0
    invoke-virtual {p0, p1, v2, v0}, Lr79;->a(Ls79;ZZ)Lxb4;

    .line 40
    .line 41
    .line 42
    iput-boolean v1, p0, Lr79;->f:Z

    .line 43
    .line 44
    return-void
.end method

.method public final reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr79;->d:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls79;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p0, v0, v1, v1}, Lr79;->a(Ls79;ZZ)Lxb4;

    .line 11
    .line 12
    .line 13
    return-void
.end method
