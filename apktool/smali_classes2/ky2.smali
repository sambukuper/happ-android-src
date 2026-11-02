.class public final Lky2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lq15;

.field public final b:Lrh5;

.field public final c:Lrh5;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lr15;->a()Lq15;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lky2;->a:Lq15;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lky2;->b:Lrh5;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lky2;->c:Lrh5;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lby2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lky2;->b:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lky2;->c:Lrh5;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c(Lby2;Lq51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Liy2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Liy2;

    .line 7
    .line 8
    iget v1, v0, Liy2;->j0:I

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
    iput v1, v0, Liy2;->j0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Liy2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Liy2;-><init>(Lky2;Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Liy2;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Liy2;->j0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Liy2;->g0:Lo15;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v4

    .line 54
    :cond_2
    iget-object p1, v0, Liy2;->g0:Lo15;

    .line 55
    .line 56
    iget-object v1, v0, Liy2;->f0:Lby2;

    .line 57
    .line 58
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p2, p1

    .line 62
    move-object p1, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, v0, Liy2;->f0:Lby2;

    .line 68
    .line 69
    iget-object p2, p0, Lky2;->a:Lq15;

    .line 70
    .line 71
    iput-object p2, v0, Liy2;->g0:Lo15;

    .line 72
    .line 73
    iput v3, v0, Liy2;->j0:I

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne v1, v5, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    :try_start_1
    invoke-virtual {p0, p1}, Lky2;->a(Lby2;)V

    .line 83
    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    invoke-virtual {p0, p1}, Lky2;->b(Z)V

    .line 87
    .line 88
    .line 89
    new-instance v1, Ljy2;

    .line 90
    .line 91
    invoke-direct {v1, p0, v4, p1}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 92
    .line 93
    .line 94
    iput-object v4, v0, Liy2;->f0:Lby2;

    .line 95
    .line 96
    iput-object p2, v0, Liy2;->g0:Lo15;

    .line 97
    .line 98
    iput v2, v0, Liy2;->j0:I

    .line 99
    .line 100
    invoke-static {v1, v0}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 104
    if-ne p1, v5, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v5

    .line 107
    :cond_5
    move-object p1, p2

    .line 108
    :catch_0
    :goto_3
    :try_start_2
    invoke-virtual {p0, v4}, Lky2;->a(Lby2;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v3}, Lky2;->b(Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :catchall_1
    move-exception p0

    .line 116
    goto :goto_6

    .line 117
    :catchall_2
    move-exception p1

    .line 118
    move-object v6, p2

    .line 119
    move-object p2, p1

    .line 120
    move-object p1, v6

    .line 121
    goto :goto_4

    .line 122
    :catch_1
    move-object p1, p2

    .line 123
    goto :goto_3

    .line 124
    :goto_4
    invoke-virtual {p0, v4}, Lky2;->a(Lby2;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v3}, Lky2;->b(Z)V

    .line 128
    .line 129
    .line 130
    throw p2

    .line 131
    :goto_5
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 132
    .line 133
    invoke-interface {p1, v4}, Lo15;->m(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :goto_6
    invoke-interface {p1, v4}, Lo15;->m(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    throw p0
.end method
