.class public final Luc8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkq8;


# instance fields
.field public final a:Lkh7;

.field public b:Lqq8;

.field public final c:Z

.field public d:Ltc8;

.field public final e:Lyz4;

.field public final f:Z

.field public final g:I

.field public final h:Lyz4;

.field public i:Lux0;

.field public j:Lux0;


# direct methods
.method public constructor <init>(Lqj0;Lkh7;Lpr8;)V
    .locals 3

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Luc8;->a:Lkh7;

    .line 14
    .line 15
    invoke-static {p1}, Lu70;->Y(Lqj0;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iput-boolean p2, p0, Luc8;->c:Z

    .line 20
    .line 21
    new-instance p2, Lyz4;

    .line 22
    .line 23
    const/4 p3, 0x0

    .line 24
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p2, v0}, Lqc4;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, Luc8;->e:Lyz4;

    .line 32
    .line 33
    sget-object p2, Ljj0;->h:Lij0;

    .line 34
    .line 35
    iget-object p1, p1, Lqj0;->b:Ljj0;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    const/16 v1, 0x23

    .line 47
    .line 48
    if-lt p2, v1, :cond_0

    .line 49
    .line 50
    invoke-static {p1}, Lnn;->f(Ljj0;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    move p3, v0

    .line 57
    :cond_0
    iput-boolean p3, p0, Luc8;->f:Z

    .line 58
    .line 59
    if-lt p2, v1, :cond_1

    .line 60
    .line 61
    invoke-static {p1}, Lnn;->d(Ljj0;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    :cond_1
    iput v0, p0, Luc8;->g:I

    .line 66
    .line 67
    if-lt p2, v1, :cond_2

    .line 68
    .line 69
    invoke-static {p1}, Lnn;->e(Ljj0;)I

    .line 70
    .line 71
    .line 72
    :cond_2
    new-instance p1, Lyz4;

    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-direct {p1, p2}, Lqc4;-><init>(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Luc8;->h:Lyz4;

    .line 82
    .line 83
    return-void
.end method

.method public static a(Luc8;ZI)Lux0;
    .locals 6

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Luc8;->a:Lkh7;

    .line 10
    .line 11
    const-string v2, "CXCP"

    .line 12
    .line 13
    invoke-static {v2}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    new-instance v2, Lux0;

    .line 17
    .line 18
    invoke-direct {v2}, Lux0;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-boolean v3, p0, Luc8;->c:Z

    .line 22
    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string p1, "No flash unit"

    .line 28
    .line 29
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p0}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 33
    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_1
    iget-object v3, p0, Luc8;->b:Lqq8;

    .line 38
    .line 39
    if-eqz v3, :cond_b

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Luc8;->c(I)V

    .line 42
    .line 43
    .line 44
    iget-object v4, p0, Luc8;->i:Lux0;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    if-eqz p2, :cond_3

    .line 48
    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    const-string p2, "There is a new enableTorch being set"

    .line 52
    .line 53
    invoke-static {p2, v4}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iput-object v5, p0, Luc8;->i:Lux0;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    if-eqz v4, :cond_4

    .line 60
    .line 61
    invoke-static {v2, v4}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    iput-object v2, p0, Luc8;->i:Lux0;

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    :cond_5
    iget-object p2, v1, Lkh7;->d:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter p2

    .line 75
    :try_start_0
    iput-object v5, v1, Lkh7;->k:Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    monitor-exit p2

    .line 78
    invoke-virtual {v1}, Lkh7;->f()Lux0;

    .line 79
    .line 80
    .line 81
    sget-object p2, Ls7;->b:Ljava/util/List;

    .line 82
    .line 83
    invoke-virtual {v1}, Lkh7;->e()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-static {p2}, Li21;->z(I)Ls7;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-eqz p2, :cond_6

    .line 92
    .line 93
    iget p2, p2, Ls7;->a:I

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    invoke-static {}, Lhi5;->m0()Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_7

    .line 101
    .line 102
    invoke-virtual {v1}, Lkh7;->e()I

    .line 103
    .line 104
    .line 105
    :cond_7
    move p2, v0

    .line 106
    :goto_2
    if-eqz p1, :cond_a

    .line 107
    .line 108
    if-ne p1, v0, :cond_8

    .line 109
    .line 110
    iget-object p1, p0, Luc8;->h:Lyz4;

    .line 111
    .line 112
    invoke-virtual {p1}, Lqc4;->d()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz p1, :cond_9

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-virtual {p0, p1}, Luc8;->d(I)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    iget p1, p0, Luc8;->g:I

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Luc8;->d(I)V

    .line 131
    .line 132
    .line 133
    :cond_9
    :goto_3
    invoke-interface {v3}, Lqq8;->a()Lxg1;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    goto :goto_4

    .line 138
    :cond_a
    invoke-interface {v3, p2}, Lqq8;->d(I)Lxg1;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :goto_4
    new-instance p1, Lb58;

    .line 143
    .line 144
    const/4 p2, 0x5

    .line 145
    invoke-direct {p1, p2}, Lb58;-><init>(B)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance p2, Lsn;

    .line 152
    .line 153
    const/4 v0, 0x3

    .line 154
    invoke-direct {p2, p0, v2, p1, v0}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 155
    .line 156
    .line 157
    check-cast p0, Lrm3;

    .line 158
    .line 159
    invoke-virtual {p0, p2}, Lrm3;->D(Lgn2;)Lgq1;

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :catchall_0
    move-exception p0

    .line 164
    monitor-exit p2

    .line 165
    throw p0

    .line 166
    :cond_b
    const-string p0, "Camera is not active."

    .line 167
    .line 168
    invoke-static {p0, v2}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 169
    .line 170
    .line 171
    :goto_5
    return-object v2
.end method


# virtual methods
.method public final b(Lqq8;)V
    .locals 1

    .line 1
    iput-object p1, p0, Luc8;->b:Lqq8;

    .line 2
    .line 3
    iget-object p1, p0, Luc8;->d:Ltc8;

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Luc8;->e:Lyz4;

    .line 8
    .line 9
    invoke-virtual {p1}, Lqc4;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v0, 0x1

    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 27
    :goto_1
    const/4 p1, 0x4

    .line 28
    invoke-static {p0, v0, p1}, Luc8;->a(Luc8;ZI)Lux0;

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method public final c(I)V
    .locals 1

    .line 1
    new-instance v0, Ltc8;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ltc8;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Luc8;->d:Ltc8;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {}, Ls08;->c()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object p0, p0, Luc8;->e:Lyz4;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lqc4;->j(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lyz4;->k(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final d(I)V
    .locals 3

    .line 1
    new-instance v0, Lux0;

    .line 2
    .line 3
    invoke-direct {v0}, Lux0;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x23

    .line 9
    .line 10
    if-lt v1, v2, :cond_3

    .line 11
    .line 12
    iget-boolean v1, p0, Luc8;->f:Z

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    iget-object v1, p0, Luc8;->j:Lux0;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-string v2, "There is a new torch strength being set"

    .line 23
    .line 24
    invoke-static {v2, v1}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    iput-object v1, p0, Luc8;->j:Lux0;

    .line 29
    .line 30
    :cond_1
    iput-object v0, p0, Luc8;->j:Lux0;

    .line 31
    .line 32
    new-instance v1, Lpy7;

    .line 33
    .line 34
    const/16 v2, 0x9

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, Lpy7;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lrm3;->D(Lgn2;)Lgq1;

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p1}, Lnn;->g(Ljava/util/LinkedHashMap;I)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Luc8;->b:Lqq8;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    sget-object p1, Loq8;->b:Lk11;

    .line 55
    .line 56
    invoke-interface {p0, v1, p1}, Lqq8;->h(Ljava/util/Map;Lk11;)Lxg1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-static {p0, v0}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    const-string p0, "Camera is not active."

    .line 67
    .line 68
    invoke-static {p0, v0}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 73
    .line 74
    const-string p1, "Configuring torch strength is not supported on the device."

    .line 75
    .line 76
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p0}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final reset()V
    .locals 3

    .line 1
    iget-object v0, p0, Luc8;->i:Lux0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "There is a new enableTorch being set"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Luc8;->i:Lux0;

    .line 12
    .line 13
    iget-object v1, p0, Luc8;->j:Lux0;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v2, "There is a new torch strength being set"

    .line 18
    .line 19
    invoke-static {v2, v1}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-object v0, p0, Luc8;->j:Lux0;

    .line 23
    .line 24
    iget-object v1, p0, Luc8;->d:Ltc8;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p0, v1}, Luc8;->c(I)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-static {p0, v1, v2}, Luc8;->a(Luc8;ZI)Lux0;

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Luc8;->d:Ltc8;

    .line 37
    .line 38
    :cond_2
    return-void
.end method
